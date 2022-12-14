package player;

/**
 * Race class.
 * Instance of the race. In order to save the stats of the race that is being played. 
 * 
 * @author Camilo Jené Conde <cjeneconde@gmail.com>
 * @version 0.0.1
 */
public abstract class Race {
    /**
     * Base attack of the race.
     */
    private int attack;

    /**
     * Base defense of the race.
     */
    private int defense;

    /**
     * Base agility of the race.
     */
    private int agility;

    /**
     * Base attack speed of the race.
     */
    private int attackSpeed;

    /**
     * Base critic of the race.
     */
    private int criticalAttack;

    /**
     * 
     * @param a
     * @param df
     * @param ag
     * @param as
     * @param ca
     */
    public Race (int a, int df, int ag, int as, int ca) {
        setAgility(ag);
        setAttack(a);
        setDefense(df);
        setAttackSpeed(as);
        setCriticalAttack(ca);
    }

    
    /** 
     * @param agility
     */
    public void setAgility(int agility) {
        this.agility = agility;
    }

    
    /** 
     * @param attack
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    
    /** 
     * @param attack_speed
     */
    public void setAttackSpeed(int attack_speed) {
        this.attackSpeed = attack_speed;
    }

    
    /** 
     * @param critical_attack
     */
    public void setCriticalAttack(int critical_attack) {
        this.criticalAttack = critical_attack;
    }

    
    /** 
     * @param defense
     */
    public void setDefense(int defense) {
        this.defense = defense;
    }

    
    /** 
     * @return int
     */
    public int getAgility() {
        return agility;
    }

    
    /** 
     * @return int
     */
    public int getAttack() {
        return attack;
    }

    
    /** 
     * @return int
     */
    public int getAttackSpeed() {
        return attackSpeed;
    }

    
    /** 
     * @return int
     */
    public int getCriticalAttack() {
        return criticalAttack;
    }

    
    /** 
     * @return int
     */
    public int getDefense() {
        return defense;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "\nAttack: " + getAttack() + "\nDefense: " + getDefense() + "\nAgility: " 
            + getAgility() + "\nAttack speed: " + getAttackSpeed() + "\nCritic attack: " + getCriticalAttack();
    }

}
