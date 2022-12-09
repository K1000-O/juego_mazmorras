package player;

/**
 * Player class.
 * Instance of the player. In order to save the info of the person that is playing, we use a non variable ID. 
 * 
 * @author Camilo Jené Conde <cjeneconde@gmail.com>
 * @version 0.0.1
 */
public class Player {
    /**
     * Contant ID.
     */
    private final int ID;

    /**
     * Name of the player using the game.
     */
    private String name;

    /**
     * Count of the number of players playing (there can be more than one).
     */
    private static int numPlayers = 0;

    /**
     * Player constructor.
     * 
     * @param name name of the player.
     */
    public Player(String name) {
        setName(name);
        this.ID = numPlayers++;
    }

    /**
     * Setter of the name.
     * 
     * @param name name of the player.
     */
    private void setName(String name) {
        this.name = name;
    }

    /**
     * Getter of the name variable.
     * 
     * @return String name of the player.
     */
    public String getName() {
        return name;
    }

    /**
     * Getter of the ID.
     * 
     * @return ID unique ID from the player.
     */
    public int getID() {
        return ID;
    }

    /**
     * Override method toString in order to print the data of the class.
     */
    @Override
    public String toString() {
        return "Player info:\n  ID -->" + getID() + "\n  Nombre: " + getName();
    }
}
