package player.race;

/**
 * Human class.
 * First type of race abailable on the game.
 * 
 * Humans have rule over the kingdom since they had memories... But the ancient rulers
 * wanted their power back. After the great war, Humans had to rebuild all the reign.
 * 
 * The great war changed everything... Old friendships became new enemies, old wealth
 * is now buried six feet underground, old deals are now new war declarations.
 * 
 * Standard race, with standard stats. It's the easiest one but also the
 * most homogeneous race.
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
