package game;

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
        Game game = Game.getInstance("prueba.dat");

        System.out.println(game);
    }
}