package player.race.classes;

/**
 * {@code ClassType} class.
 * <p>
 * The {@code ClassType} indicates what path has chosen the player to follow. 
 * Depending on what the {@link player.Player player} has chosen, the stats
 * will variates.
 * <p>  
 * All the diferent classes that can be chosen are:
 * <blockquote>
 *      -  {@link Ranged Ranged}<p>
 *      -  {@link Warrior Warrior}<p>
 *      -  {@link Wizard Wizard}<p>
 *      -  {@link Assassin Assassin}
 * </blockquote>
 * Each class type has different atributes and habilities.    
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

    public ClassType(int eA, int eD, int eAg, int eAS, int eCA) {
        this.extraAttack = eA;
        this.extraDefense = eD;
        this.extraAgility = eAg;
        this.extraAttackSpeed = eAS;
        this.extraCriticalAttack = eCA;
    }

    public int getExtraAttack() {
        return extraAttack;
    }

    public int getExtraDefense() {
        return extraDefense;
    }

    public int getExtraAgility() {
        return extraAgility;
    }

    public int getExtraAttackSpeed() {
        return extraAttackSpeed;
    }

    public int getExtraCriticalAttack() {
        return extraCriticalAttack;
    }
    
    public abstract int levelUp();
}
