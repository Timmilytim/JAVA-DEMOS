package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbPractice{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/account";
        String username = "root";
        String password = "";
        try(Connection conn = DriverManager.getConnection(url,username,password)){
            Statement state = conn.createStatement();
            System.out.println("Database Connected Successfully");

//            HOW TO CREATE A TABLE
            String createTable = "CREATE TABLE IF NOT EXISTS users(id INTEGER, name TEXT, email TEXT, password TEXT)";
            state.execute(createTable);
            System.out.println("Table created successfully...");

//            HOW TO INSERT RECORDS INTO THE TABLE
            String insert = "INSERT INTO users VALUES(2,'Timmy', 'timmy@gmail.com', '4231')";
            state.execute(insert);
            System.out.println("Record inserted..");

            state.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
