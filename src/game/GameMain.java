package game;

import player.Player;

/**
 * Main class of the game. Everything starts from here.
 * 
 * 
 * @author Camilo Jené Conde < cjeneconde@gmail.com >
 * @version 0.0.1
 */
public class GameMain {

    
    /** 
     * Main method where all the action happends.
     * 
     * @param args Arguments introduced through the terminal.
     */
    public static void main (String ... args) {
        String name = "prueba1.dat";
        Game game = Game.getInstance();

        start();
        
        while(true) {
            game = update(game);
        }
    }

    /**
     * Method used to start the game.
     * We load the game saves and after that we choose to load a game or create a new one.
     * 
     */
    private static Game start() {
        Game game = Game.getInstance();

        return game;
    }

    /**
     * Method used to update on each click of the game.
     * 
     * Algorithm:
     *      -   save the actual instance of the game.
     *      -   ...
     * 
     * @param game actual instance of the game.
     * @return Game the new instance of the game.
     */
    private static Game update(Game game) {
        game.saveGame();

        return game;
    }
}