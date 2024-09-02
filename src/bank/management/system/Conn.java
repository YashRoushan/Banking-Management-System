package bank.management.system;
import java.sql.*;
// 1) Register the driver
// 2) Create connection
// 3) Create statement
// 4) Execute Query
// 5) Close connection
public class Conn {

    Connection c;
    Statement s;
    public Conn(){
        try{
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root",null );
            s = c.createStatement();

        } catch (Exception e){
            System.out.println(e);
        }
    }
}
