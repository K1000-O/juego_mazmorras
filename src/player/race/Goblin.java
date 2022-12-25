package player.race;

/**
 * Goblin class.
 * Second type of race abailable on the game.
 * 
 * On the past, the goblins made good pair with the humans when they had to recolect 
 * huge extensions of loot. After the great war, they became enemies.
 * 
 * Now, the goblins wander through the kingdom stealing and looting everything they can.
 * 
 * Their little armour let them move with a high speed but makes them very vulnerable
 * to large fights.
 * 
 * @author Camilo Jené Conde <cjeneconde@gmail.com>
 * @version 0.0.1
 */
public class Goblin extends Race{

    /**
     * Goblin constructar. Calls the Race constructor to save the data.
     * 
     * Base stats:
     *      -   Attack: 2.
     *      -   Defense: 2.
     *      -   Agility: 7.
     *      -   Attack speed: 5.
     *      -   Critical attack: 2 --> 5(first attack from behind).
     */
    public Goblin() {
        super(2, 2, 7, 5, 2);
    }
}
