package sample;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {

    public static  Connection databaseConnection(){  // method to establish a connection with localhost databases

        Connection myConnection = null;

            try {

                    Class.forName("com.mysql.cj.jdbc.Driver");   // driver used for establishing connection
                    myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject","root","");  // URL of the database and username and password



            } catch (Exception e){

            }



            return myConnection;
    }



}
