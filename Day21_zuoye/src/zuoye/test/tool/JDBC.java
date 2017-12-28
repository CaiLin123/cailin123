package zuoye.test.tool;

import java.io.FileReader;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBC {
    static {
        Properties ps = new Properties();
        try {
            ps.load(new FileReader("src/jdbc.properties"));
            String driverName = ps.getProperty("driverName");
            url = ps.getProperty("url");
            database = ps.getProperty("database");
            user = ps.getProperty("user");
            possword = ps.getProperty("possword");

            Class.forName(driverName);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }


    private static String url;
    private static String database;
    private static String user;
    private static String possword;



    public static void execute() throws SQLException {

        DriverManager.getConnection(url,user,possword);





    }







}
