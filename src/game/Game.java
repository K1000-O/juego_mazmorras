package game;

import java.io.*;
import java.util.*;

import player.Player;

/**
 * {@code Game} class.
 * <p>
 * On this class we will do everything needed to make the game work in perfect conditions.
 * Actions like: save the game, load the game, create enemies o allies, etc. will be done on this class.
 * <p>
 * There will be a {@code savings.txt} file where we save the name of the save files.
 * <p>
 * To start correctly the game we need:
 * <blockquote><pre>
 * GameCreation:
 *      Game game = Game.getInstance();
 *      if (!save) {
 *          createNewGame();
 *      } else {
 *          loadGame();
 *      }
 * </pre></blockquote>
 * <p>
 * The class {@code Game} includes a reference to the {@link player.Player player} that
 * is in control of the main character of the story.
 * <p>
 * We also have a {@link java.util.HashMap HashMap} where we save the savings we already made. Later on we will 
 * use it to make the list on the front-end.
 * 
 * @author Camilo Jené Conde <cjeneconde@gmail.com>
 * @version 0.0.1
 */
public class Game implements Serializable {
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

    private String saveFile;

    /**
     * Game constructor. Charges de savings names and the load game.
     */
    private Game() {
        try {
            /**
             * Load of the savings.
             */
            setSavings();
        } catch (FileNotFoundException e) {
            System.err.println(">> DEBUG: savings file not found. Creating...");
            File f = new File("./data/savings.txt");
            
            try {
                f.createNewFile();
            } catch (IOException ioe){
                System.err.println(">> ERROR: saving file couldn't be created (I/O error ocurred).");
                ioe.printStackTrace();
            }
        }
    }

    /**
     * Method that returns the instance of the Singleton DP. 
     * 
     * @return instance Singleton instance.
     */
    public static Game getInstance() {
        if (Game.INSTANCE == null) 
            Game.INSTANCE = new Game();
        
        return Game.INSTANCE;
    }

    /**
     * Setter of the player that is playing this game.
     * 
     * @param player player instance of the game.
     */
    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public Map<Integer, String> getSavings() {
        return savings;
    }

    /**
     * Method that creates an empty game.
     * 
     * @param name name of the file to create.
     */
    public boolean createNewGame(String name) {
        /* Crearemos el juego. */
        int size = savings.size();

        savings.put(size, name);

        saveFile = name;

        /*
        * Save design ==> num || file_name.
        */
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter("./data/savings.txt", true));

            pw.println(size + ":" + name);
        } catch (IOException e) {
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
    public Game loadGame(String name) throws FileNotFoundException {
        /* Aquí cargaremos el juego a la hora de crear la instancia. */
        if (!savings.values().stream().anyMatch(x -> x.equals(name)))
            return null;
        /**
         * Load of the game.
         */
        ObjectInputStream in = null;
        Game game = null;
        try {
            in = new ObjectInputStream(new FileInputStream("./data/" + name));
            
            game = (Game)in.readObject();
            System.out.println(game.getPlayer());
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException();
        } catch (Exception e) {
            System.err.println(">> ERROR: object Game couldn't be load properly.");
            e.printStackTrace();
        } finally {
            try {
                if (in != null)
                    in.close();
            } catch (IOException e) {
                System.err.println(">> ERROR: file not closed (3).");
                e.printStackTrace();
            }
        }

        return game;
    }

    /**
     * This method is in charged of loading the game on the correct data file.
     * 
     */
    public boolean saveGame() {
        /* Aquí guardaremos el juego. */

        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("./data/" + saveFile));
            
            out.writeObject(this);

            out.flush();
        } catch (FileNotFoundException e) {
            System.err.println(">> ERROR: game save file (" + saveFile + ") not found.");
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println(">> ERROR: object Game couldn't be serialized properly.");
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                System.err.println(">> ERROR: file not closed (3).");
                e.printStackTrace();
            }
        }

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
            System.out.println(">> ERROR: savings.txt doesn't exists.");
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