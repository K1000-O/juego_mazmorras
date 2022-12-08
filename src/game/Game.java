package game;

/**
 * Game class.
 * On this package we will do everything needed to make the game work in perfect conditions.
 * Actions like: save the game, load the game, create enemies o allies, etc. will be done on this class.
 * 
 * @author Camilo Jené Conde <cjeneconde@gmail.com>
 * @version 0.0.1
 */
public class Game {
    /**
     * Instance variable in order to implement the Singleton design pattern.
     */
    private static Game instance;
    
    // private Player player;

    /**
     * Game constructor.
     */
    private Game() {

    }

    /**
     * Method that returns the instance of the Singleton DP. 
     * 
     * @return instance Singleton instance.
     */
    public static Game getInstance() {
        if (Game.instance == null) return new Game();
        else return Game.instance;
    }

    /**
     * Method that prints evrything needed from the Game class.
     */
    @Override public String toString() {
        return "Esta es la clase Game.";
    }
}