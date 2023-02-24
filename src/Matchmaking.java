import java.util.ArrayList;

/**
 * The Matchmaker pairs the client with all other users in the database depending on certain attributes.
 *
 * @author Aidan Eiler
 */
public class Matchmaking {

    ArrayList<String> info = new ArrayList<>();

    /**
     * Algorithm which compares a user's attributes (stats, location, etc.) to everyone else in the database. The results are then added to info.
     * Data is cleared from info if there is anything present.
     *
     * @param user
     * @throws java.sql.SQLException
     *
     */
    public void match_make(String user) throws java.sql.SQLException{
        info = new ArrayList<>();
        DatabaseManager DBM = new DatabaseManager();
        //process stuff
        Messenger messenger = new Messenger();
        //messenger.create_text();
    }

}
