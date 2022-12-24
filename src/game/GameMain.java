package game;

import java.io.FileNotFoundException;

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
        Game game = Game.getInstance(name);

        
        try {
            game = game.loadGame(name);
        } catch (Exception e) {
            game.saveGame(name);
        }
        

        Player player = new Player("Camilo Jene 2", null);

        if (game.getPlayer() == null) game.setPlayer(player);

        System.out.println(game.getPlayer());

        game.saveGame(name);

        System.out.println(game);
    }
}