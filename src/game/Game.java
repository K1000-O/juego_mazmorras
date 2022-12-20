package game;

import java.io.*;
import java.util.*;

import player.Player;

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
    private static Game INSTANCE;
    
    /**
     * Instance of the player playing the game.
     */
    private Player player;

    /**
     * Saving instances. We will be able to save up to four different games.
     */
    private Map<Integer, String> savings = new HashMap<>();

    /**
     * Game constructor.
     */
    private Game(String name) {
        try {
            loadGame(name);
        } catch (FileNotFoundException e) {
            try {
                createGame(name);
            } catch (FileNotFoundException eCreateGame) {
                System.err.println(">> ERROR: file wasn't found.");
		        eCreateGame.printStackTrace();
            }
        }
    }

    /**
     * Method that returns the instance of the Singleton DP. 
     * 
     * @return instance Singleton instance.
     */
    public static Game getInstance(String name) {
        if (Game.INSTANCE == null) 
            Game.INSTANCE = new Game(name);
        
        return Game.INSTANCE;
    }

    /**
     * Method that creates an empty game.
     * 
     * @param name name of the file to create.
     */
    private boolean createGame(String name) throws FileNotFoundException {
        /* Crearemos el juego. */
        int size = savings.size();

        savings.put(size, name);

        /*
        * Save design ==> num || file_name.
        */
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter("./data/savings.txt", true));

            pw.println(size + ":" + name);
        } catch (Exception e) {
            System.err.println(">> ERROR: saving file name couldn't be written down (I/O error ocurred).");
		    e.printStackTrace();
        } finally {
            try {
                if (pw != null)
                    pw.close();
            } catch (Exception e) {
                System.err.println(">> ERROR: file not closed (2).");
		        e.printStackTrace();
            }
        }

        /* Crear el fichero. */
        try {
            File f = new File("./data/" + name);

            if (f.createNewFile())
                return true;
            else
                System.err.println(">> ERROR: file already exists."); // Meter sobreescribir?
        } catch (IOException e) {
            System.err.println(">> ERROR: file couldn't be created (I/O error ocurred).");
		    e.printStackTrace();
        }

        return false;
    }

    /**
     * This method is in charged of loading the game if exists the file data.
     * 
     * @param name name of the file to load.
     */
    private void loadGame(String name) throws FileNotFoundException {
        /* Aquí cargaremos el juego a la hora de crear la instancia. */

        /**
         * Load of the savings.
         */
        setSavings();

        throw new FileNotFoundException();
    }

    /**
     * This method is in charged of loading the game on the correct data file.
     * 
     * @param name name of the file where we save the game.
     */
    public boolean saveGame(String name) {
        /* Aquí guardaremos el juego. */

        // ObjectOutputStream save = null;

        // try {
        //     save = new ObjectOutputStream(new FileOutputStream("/data/" + name));
        // } catch (IOException e) {
            // System.err.println("Error on the saving of the game.");
			// return false;
        // } finally {
        //     if (save != null) {
        //         try {
        //             save.close();
        //         } catch (IOException e) {
		// 			System.err.println("Error al cerrar el archivo.");
		// 			e.printStackTrace();
        //         }
        //     }
        // }

        return false;
    }


    /**
     * Method that prints evrything needed from the Game class.
     */
    @Override public String toString() {
        return "Esta es la clase Game. Savings: " + savings;
    }

    /**
     * Method used to read the savings on the load method.
     * 
     * @throws FileNotFoundException
     */
    private void setSavings() throws FileNotFoundException{
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(new File("./data/savings.txt")));

            /* Leemos el fichero y guardamos los savings. */
            String line;
            while ((line = br.readLine()) != null) {
                String[] lineAux = line.split(":");
                
                savings.put(Integer.parseInt(lineAux[0]), lineAux[1]); // We know that the written line sintaxis is --> int: String.
            }
        } catch (FileNotFoundException e) {
            System.out.println(">> ERROR: savings.txt doesn't exists.\n Creating savings.txt...\n");
            throw new FileNotFoundException();
        } catch (IOException ioe){
            System.err.println(">> ERROR: saving file couldn't be readen (I/O error ocurred).");
		    ioe.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (Exception e) {
                System.err.println(">> ERROR: file not closed (1).");
		        e.printStackTrace();
            }
        }
    }
}