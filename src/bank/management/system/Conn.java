package bank.management.system;

import java.sql.*;

public class Conn {
    Connection connection;
    Statement statement;
    Conn(){

        try{
            connection= DriverManager.getConnection("url","root", "password");
            statement=connection.createStatement();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
