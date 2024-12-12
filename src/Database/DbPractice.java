package Database;

import java.sql.*;

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
//            String insert = "INSERT INTO users VALUES(3,'Dammy', 'dammy@gmail.com', '4531')";
//            state.execute(insert);
//            System.out.println("Record inserted..");

//            HOW TO READ THE RECORDS FROM THE DATABASE
            String getResult = "SELECT * FROM users";
            state.execute(getResult);

            ResultSet resultSet = state.getResultSet();
            while (resultSet.next()){
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String pass = resultSet.getString("password");
                System.out.println(name +", "+ email+ ", "+ pass);
            }

//            HOW TO UPDATE RECORDS ON THE TABLE
            String update = "UPDATE users SET name = 'Faith' WHERE id = 3";
            state.execute(update);
            System.out.println("Record updated successfully...");

//            HOW TO DELETE A RECORD ON THE TABLE
            String delete = "DELETE FROM users WHERE id = 3";
            state.execute(delete);
            System.out.println("Record deleted...");

            state.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
