import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    String url="jdbc:mysql://localhost:3306/myDataBase";
    String username="root";
    String password="passCode";

    Statement statement=null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");

       Connection connection = DriverManager.getConnection(url, username, password);

        statement=connection.createStatement();
       ResultSet resultSet = statement.executeQuery("Select * from Employee");
       while(resultSet.next()){
           System.out.println(resultSet.getString(1)+resultSet.getString(2)+resultSet.getString(3)+resultSet.getInt(4));
       connection.close();
       }
    }catch (Exception e) {
        throw new RuntimeException(e);
    }
}
}