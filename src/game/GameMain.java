package game;

import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.*;

import player.Player;

/**
 * Main class of the game. Everything starts from here.
 * 
 * 
 * @author Camilo Jené Conde < cjeneconde@gmail.com >
 * @version 0.0.1
 */
public class GameMain {
    private static JFrame gameWindow;
    private static Game game;
    
    /** 
     * Main method where all the action happends.
     * 
     * @param args Arguments introduced through the terminal.
     */
    public static void main (String ... args) {        
        Scanner leer = new Scanner(System.in);
        Player player = new Player("Camilo Jene 2", null);
        start();

        String name = leer.nextLine();
        leer.close();

        if (game.getSavings().containsValue(name))
            try {
                game.loadGame(name);
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        else {
            game.createNewGame(name);
            game.setPlayer(player);
        }

        System.out.println(game);
        
        game.saveGame();


        // while(true) {
        //     game = update(game);
        // }
    }

    /**
     * Method used to start the game.
     * We load the game saves and after that we choose to load a game or create a new one.
     * 
     */
    private static void start() {
        game = Game.getInstance();
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
    private static void update() {
        game.saveGame();
    }

    private static void createGameWindow() {
        gameWindow = new JFrame("Mazmorras");
        
        gameWindow.pack(); // Empacamos para centrar la ventana.

        gameWindow.setSize(1000, 780);
        gameWindow.setLocationRelativeTo(null);

        gameWindow.setResizable(false);
    }
}
