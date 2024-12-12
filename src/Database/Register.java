package Database;

import java.sql.*;
import java.util.Scanner;

public class Register {
    public static DbConnector dbConnector = new DbConnector("jdbc:mysql://localhost:3306/register", "root", "");
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        THIS IS THE MAIN METHOD
        addList();
    }

    // Methods
    public static void addList(){
        try(Connection conn = DriverManager.getConnection(dbConnector.url, dbConnector.username, dbConnector.password)){
            Statement state = conn.createStatement();
            try {
                PreparedStatement prep = conn.prepareStatement("INSERT INTO users(name, gender, email, phone)VALUES(?,?,?,?)");
                System.out.print("Enter your name: ");
                prep.setString(1,sc.next());

                System.out.print("Enter your gender: ");
                prep.setString(2, sc.next());

                System.out.print("Enter your email: ");
                prep.setString(3, sc.next());

                System.out.print("Enter your phone: ");
                prep.setString(4, sc.next());

                prep.execute();
                System.out.println("Record inserted successfully");

            }catch (SQLIntegrityConstraintViolationException s){
                s.printStackTrace();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }


}
