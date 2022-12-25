package player.race;

/**
 * Human class.
 * First type of race abailable on the game. 
 * 
 * @author Camilo Jené Conde <cjeneconde@gmail.com>
 * @version 0.0.1
 */
public class Human extends Race {

    /**
     * Human constructar. Calls the Race constructor to save the data.
     * 
     * Base stats:
     *      -   Attack: 5.
     *      -   Defense: 5.
     *      -   Agility: 2.
     *      -   Attack speed: 2.
     *      -   Critical attack: 3.
     */
    public Human() {
        super(5, 5, 2, 3, 3);
    }
}
