import java.sql.*;

/**
 * The DatabaseManager (DBM) is responsible for directly communicating with the MySQL database to generate queries and update information to the database.
 *
 * @author Aidan Eiler
 */
public class DatabaseManager {

    /**
     * Instantiates DatabaseManager object when parameters aren't given. Defaults to the "beefbuddies" DB with root perms and default password (863998).
     * Connection is opened automatically
     *
     * @throws java.sql.SQLException
     */

    private Connection connection;

    public DatabaseManager() throws java.sql.SQLException {
        String url = "jdbc:mysql://localhost:3306/beefbuddies";
        String user = "root";
        String password = "863998";
        connection = DriverManager.getConnection(url, user, password);
    }

    /**
     * Instantiates DatabaseManager object.
     *
     * @param database_name
     * @param user can be root
     * @param password
     * @throws java.sql.SQLException
     */
    public DatabaseManager(String database_name, String user, String password) throws java.sql.SQLException {
        String url = "jdbc:mysql://localhost:3306/" + database_name;
        connection = DriverManager.getConnection(url, user, password);
        Statement stmt = connection.createStatement();
    }

    /* FOR TESTING
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/beefbuddies";
        String user = "root";
        String password = "863998";
        connection = DriverManager.getConnection(url, user, password);

        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT User, Host FROM mysql.user;");
        System.out.print(rs);
        connection.close(); //closes connection

    }//end main
    */

    /**
     * Sends query to MySQL database
     *
     * @param query update that will be sent to database in the MySQL rendition of the SQL language standard
     * @returns SQL query (TODO)
     * @throws java.sql.SQLException
     */
    public String query(String query) throws java.sql.SQLException {
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        return null;
        //TODO: PROCESS RESULTSET
    }

    /**
     * Sends query to MySQL database
     *
     * @param update update that will be sent to database in the MySQL rendition of the SQL language standard
     * @throws java.sql.SQLException
     */
    public void update(String update) throws java.sql.SQLException {
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(update);
        //TODO: PROCESS RESULTSET
    }
}