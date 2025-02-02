package Utils;
import java.sql.*;
public class DataSource {
    private Connection con;

    private String url="jdbc:mysql://localhost:3306/projetEsprit";
    private String user="root";
    private String pass="";


    private static DataSource data;

    public DataSource() {
        try{
            con = DriverManager.getConnection(url,user,pass);
            System.out.println(con);
            System.out.println("Connection established");
        }catch(Exception e){

        }
    }

    public Connection getConn() {
        return con;
    }

    public static DataSource getDataSource() {
        if (data == null) {
            data = new DataSource();
        }return data;
    }




}
