package player.race.classes;

/**
 * ClassType class.
 * Used to determinate the type of character class that we can choose:
 *      -  Ranged
 *      -  Warrior
 *      -  Mage
 *      -  Assassin
 * 
 * Each class type has different atributes.    
 * 
 * @author Camilo Jené Conde <cjeneconde@gmail.com>
 * @version 0.0.1
 */
public abstract class ClassType {
    private int extraAttack;
    private int extraDefense;
    private int extraAgility;
    private int extraAttackSpeed;
    private int extraCriticalAttack;

    public ClassType() {

    }
    
    public abstract int levelUp();
}
