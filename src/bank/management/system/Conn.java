package bank.management.system;

import java.sql.*;

public class Conn {
    Connection connection;
    Statement statement;
    Conn(){

        try{
            connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bankSystem","root", "mysql202411");
            statement=connection.createStatement();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
