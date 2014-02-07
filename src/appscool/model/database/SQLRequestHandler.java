/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appscool.model.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author khadre
 */
public class SQLRequestHandler {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/appscool_db";

   //  Database credentials
    static final String USER = "root";
    static final String PASS = "root";

    public SQLRequestHandler() {
        // create database here

        Connection conn = null;
        Statement stmt = null;
        try{
        //STEP 2: Register JDBC driver
        Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");

      //STEP 4: Execute a query
      System.out.println("Inserting records into the table...");
      stmt = conn.createStatement();

      String sql = "INSERT INTO\n" +
            "personne (nom, prenom, date_de_nais, lieu_de_nais, sex, num_carte_id, adresse, email, tel_fix, tel_port)\n" +
            "VALUES ('sonko', 'amadou', '2000-10-02', 'dakar', 'm', '04', 'adresse dakar', 'email@njaccaar.com', '0101010101', "
              + "'0202020202');";
      stmt.executeUpdate(sql);
      
      System.out.println("Inserted records into the table...");

   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
    }

    public void insert() {

    }

    public void delete() {

    }

    public void create() {

    }

    public void update() {

    }

}
