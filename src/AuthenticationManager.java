/**
 * The AuthenticationManager is responsible for registering new users, as well as validating the credentials of existing users. It also keeps track of who is the client.
 *
 * @author Aidan Eiler
 */
public class AuthenticationManager {

    private String active_user;

    /**
     * Registers a new user to the database
     *
     * @param username
     * @param password
     * @return whether their credentials satisfies the registration requirments (TODO)
     * @throws java.sql.SQLException
     */
    public boolean register(String username, String password) throws java.sql.SQLException{
        DatabaseManager DBM = new DatabaseManager();
        return false;
    }

    /**
     * Validates whether the credentials from the user matches what's in the database
     *
     * @param username
     * @param password
     * @return whether the credentials they provide match the credentials of the user account they're trying to log into (TODO)
     * @throws java.sql.SQLException
     */
    public boolean validate(String username, String password) throws java.sql.SQLException{
        DatabaseManager DBM = new DatabaseManager();
        return false;
    }

    /**
     * Returns active_user, aka the client
     *
     * @return
     */
    public String get_user(){
        return active_user;
    }
}
