$(document).ready(function (){
    $("tr #idCliente").click(function (e){
        e.preventDefault();
        var cod=$(this).parent().find('#idCliente').val();

        swal({
                title: "Are you sure?",
                text: "You will not be able to recover this imaginary file!",
                type: "warning",
                showCancelButton: true,
                confirmButtonClass: "btn-danger",
                confirmButtonText: "Yes, delete it!",
                cancelButtonText: "No, cancel plx!",
                closeOnConfirm: false,
                closeOnCancel: false
            },
            function(isConfirm) {
                if (isConfirm) {
                    deleteUser(cod);
                    swal("Eliminado!", "Your imaginary file has been deleted.", "success");
                } else {
                    swal("Cancelado", "Your imaginary file is safe :)", "error");
                }
            });
    });

    function deleteUser(cod){
        var url = "accountControl?action=delete&idCliente=" + cod;
        console.log("Eliminado")
        $.ajax({
           type: 'post',
           url: url,
            async: true,
            success:function (r){

            }
        });
    }
});