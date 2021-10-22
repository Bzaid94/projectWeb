package com.miumg.project.manager;

import com.miumg.project.model.LoginEntity;
import com.miumg.project.model.PersonalDocumentEntity;
import com.miumg.project.sql.ConnectionDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BancoExecutionManager {
    Connection connection;

    public BancoExecutionManager(){
        ConnectionDatabase connectionDatabase = new ConnectionDatabase();
        connection = connectionDatabase.getConnection();
    }

    public List<PersonalDocumentEntity> clientList(){
        PreparedStatement preparedStatement;
        ResultSet resultSet;

        List<PersonalDocumentEntity> list= new ArrayList<>();

        try {
            preparedStatement = connection.prepareStatement("SELECT profileId, firstName, secondName, firstLastName, secondLastName, dpi FROM personalDocument");
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                Integer profileId = resultSet.getInt("profileId");
                String firstName = resultSet.getString("firstName");
                String secondName = resultSet.getString("secondName");
                String firstLastName = resultSet.getString("firstLastName");
                String secondLastName = resultSet.getString("secondLastName");
                String dpi = resultSet.getString("dpi");

                PersonalDocumentEntity cliente = new PersonalDocumentEntity(profileId, firstName, secondName, firstLastName, secondLastName, dpi);
                list.add(cliente);
            }
            return list;

        }catch (SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public PersonalDocumentEntity showClient(Integer _idCliente){
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        PersonalDocumentEntity cliente = null;

        try {
            preparedStatement = connection.prepareStatement("SELECT profileId, firstName, secondName, firstLastName, secondLastName, dpi FROM personalDocument WHERE profileId=?");
            preparedStatement.setInt(1, _idCliente);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                Integer profileId = resultSet.getInt("profileId");
                String firstName = resultSet.getString("firstName");
                String secondName = resultSet.getString("secondName");
                String firstLastName = resultSet.getString("firstLastName");
                String secondLastName = resultSet.getString("secondLastName");
                String dpi = resultSet.getString("dpi");

                cliente = new PersonalDocumentEntity(profileId, firstName, secondName, dpi, firstLastName, secondLastName);
            }
            return cliente;

        }catch (SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }

    public boolean insertClient(PersonalDocumentEntity cliente){
        PreparedStatement preparedStatement;

        try {
            preparedStatement = connection.prepareStatement("INSERT INTO personalDocument (firstName, secondName, firstLastName, secondLastName, dpi) VALUES (?,?,?,?,?)");
            preparedStatement.setString(1, cliente.getFirstName());
            preparedStatement.setString(2, cliente.getSecondName());
            preparedStatement.setString(3, cliente.getFirstLastName());
            preparedStatement.setString(4, cliente.getSecondLastName());
            preparedStatement.setString(5, cliente.getDpi());
            preparedStatement.execute();
            return true;

        }catch (SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean modifyClient(PersonalDocumentEntity cliente){
        PreparedStatement preparedStatement;

        try {
            preparedStatement = connection.prepareStatement("UPDATE personalDocument SET firstName=?, secondName=?, firstLastName=?, secondLastName=?, dpi=? WHERE profileId=?");
            preparedStatement.setString(1, cliente.getFirstName());
            preparedStatement.setString(2, cliente.getSecondName());
            preparedStatement.setString(3, cliente.getFirstLastName());
            preparedStatement.setString(4, cliente.getSecondLastName());
            preparedStatement.setString(5, cliente.getDpi());
            preparedStatement.setInt(6, cliente.getProfileId());
            preparedStatement.execute();
            return true;

        }catch (SQLException e){
            System.out.println(e.toString());
            return false;
        }
    }

    public boolean deleteClient(int _idCliente){
        PreparedStatement preparedStatement;

        try {
            preparedStatement = connection.prepareStatement("DELETE FROM personalDocument WHERE profileId=?");
            preparedStatement.setInt(1, _idCliente);
            preparedStatement.execute();
            return true;

        }catch (SQLException e){
            System.out.println(e.toString());
            return false;
        }
    }

    public LoginEntity startSession(String userName, String passAsign){
        LoginEntity loginEntity = null;
        PreparedStatement preparedStatement;
        ResultSet resultSet;

        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM login WHERE userName=? AND passAsign=?");
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, passAsign);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                loginEntity = new LoginEntity();
                loginEntity.setUserName(resultSet.getString("userName"));
                loginEntity.setPassAsign(resultSet.getString("passAsign"));
            }

            return loginEntity;

        }catch (SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
