import java.sql.*;

public class DBConnection {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "root");
        Statement stm = con.createStatement();
        ResultSet result = stm.executeQuery("select * from eproduct");
        while(result.next()){
            System.out.println(result.getString("name"));
        }
        con.close();
    }
}
