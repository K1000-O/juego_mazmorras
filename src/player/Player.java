package player;

import java.io.Serializable;

import player.race.Race;

/**
 * Player class.
 * Instance of the player. In order to save the info of the person that is playing, we use a non variable ID.
 * Order of the position in the game ==> N, E, S, W.
 * 
 * @author Camilo Jené Conde <cjeneconde@gmail.com>
 * @version 0.0.1
 */
public class Player implements Serializable {
    /**
     * Contant ID.
     */
    private final int ID;

    /**
     * Name of the player using the game.
     */
    private String name;

    /**
     * Race of the player. U can't change it.
     */
    private final Race race;

    /**
     * Count of the number of players playing (there can be more than one).
     */
    private static int numPlayers = 0;

    /**
     * Player position on the game.
     */
    private int north = -1;
    private int east = -1;
    private int south = -1;
    private int west = -1;

    /**
     * Acual level of the player.
     */
    private int level = 0;

    /**
     * Player constructor.
     * 
     * @param name name of the player.
     */
    public Player(String name, Race race) {
        setName(name);
        setRace(race);
        this.ID = numPlayers++;
    }

    /**
     * Setter of the name.
     * 
     * @param name name of the player.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter of the player's race.
     * 
     * @param race player's race.
     */
    private void setRace(Race race) {
        this.race = race;
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
     * Getter of the level of the player.
     * 
     * @return int player's level.
     */
    public int getLevel() {
        return level;
    }

    /**
     * Getter of the player's race.
     *
     * @return race player's race.
     */
    public Race getRace() {
        return race;
    }

    << must comment >>
    public int getNorth() {
        return north;
    }

    public int getEast() {
        return east;
    }

    public int getSouth() {
        return south;
    }

    public int getWest() {
        return west;
    }

    /**
     * Method that levels up the character.
     */
    public void levelUp() {
        race.levelUp();
        level++;
    }

    /**
     * Override method toString in order to print the data of the class.
     */
    @Override
    public String toString() {
        return "Player info:\n  ID -->" + getID() + "\n  Nombre: " + getName() + "\n Level: " + getLevel();
    }
}
