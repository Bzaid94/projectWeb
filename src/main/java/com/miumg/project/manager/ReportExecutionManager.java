package com.miumg.project.manager;

import com.miumg.project.sql.ConnectionDatabase;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReportExecutionManager {
    Connection connection;

    public ReportExecutionManager(){
        ConnectionDatabase connectionDatabase = new ConnectionDatabase();
        connection = connectionDatabase.getConnection();
    }

    public boolean createdReport(HttpServletResponse response){
        PreparedStatement preparedStatement;
        ResultSet resultSet;

        try {
            StringBuilder stringBuilder = new StringBuilder();
            OutputStream outputStream = response.getOutputStream();

            preparedStatement = connection.prepareStatement("SELECT * FROM personalDocument JOIN producto ON producto.productId = personalDocument.profileId");
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                stringBuilder.append(resultSet.getString("firstName"));
                stringBuilder.append(",");
                stringBuilder.append(resultSet.getString("secondName"));
                stringBuilder.append(",");
                stringBuilder.append(resultSet.getString("firstLastName"));
                stringBuilder.append(",");
                stringBuilder.append(resultSet.getString("secondLastName"));
                stringBuilder.append(",");
                stringBuilder.append(resultSet.getString("dpi"));
                stringBuilder.append(",");
                stringBuilder.append(resultSet.getString("product"));
                stringBuilder.append(",");
                stringBuilder.append(resultSet.getString("amount"));
                stringBuilder.append(",");
                stringBuilder.append(resultSet.getString("currency"));
                stringBuilder.append("\r\n");
            }

            outputStream.write(stringBuilder.toString().getBytes());
            outputStream.flush();
            outputStream.close();
            return true;

        }catch (SQLException | IOException e){
            System.out.println(e.getMessage());
        }
        return false;
    }
}
