import java.sql.SQLException;

/**
 * The Messenger is responsible for getting and sending text information to the database including
 *
 * @author Aidan Eiler
 */
public class Messenger extends DatabaseManager {
    public Messenger() throws SQLException {
        super();
    }

    public Messenger(String database_name, String user, String password) throws SQLException {
        super(database_name, user, password);
    }

    /**
     * Creates a text message that's then stored to the database
     *
     * @param text message contents
     * @throws java.sql.SQLException
     */
    public void create_text(String text) throws java.sql.SQLException {
        AuthenticationManager AUTHManager = new AuthenticationManager();
        //query(AUTHManager.get_user());
    }

    public void get_history() throws java.sql.SQLException{
        //query();
        //TODO Determine which datatype to return message history
    }
}