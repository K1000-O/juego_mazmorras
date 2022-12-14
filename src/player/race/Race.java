package player.race;

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
     * Race class constructor. We receive the base stats and save them on the final variables.
     * 
     * @param a base attack.
     * @param df defense base stat.
     * @param ag agility base stat.
     * @param as attack speed base stat.
     * @param ca critic base stat.
     */
    public Race (int a, int df, int ag, int as, int ca) {
        setAgility(ag);
        setAttack(a);
        setDefense(df);
        setAttackSpeed(as);
        setCriticalAttack(ca);
    }

    
    /** 
     * Setter of the agility variable. 
     * 
     * @param agility agility of the race.
     */
    public void setAgility(int agility) {
        this.agility = agility;
    }

    
    /** 
     * Setter of the attack variable. 
     * 
     * @param attack attack of the race.
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    
    /** 
     * Setter of the attack_speed variable. 
     * 
     * @param attack_speed attack_speed of the race.
     */
    public void setAttackSpeed(int attack_speed) {
        this.attackSpeed = attack_speed;
    }

    
    /** 
     * Setter of the critical_attack variable. 
     * 
     * @param critical_attack critical_attack of the race.
     */
    public void setCriticalAttack(int critical_attack) {
        this.criticalAttack = critical_attack;
    }

    
    /** 
     * Setter of the defense variable. 
     * 
     * @param defense defense of the race.
     */
    public void setDefense(int defense) {
        this.defense = defense;
    }

    
    /** 
     * Getter of the agility base stat.
     * 
     * @return int agility base stat.
     */
    public int getAgility() {
        return agility;
    }

    
    /** 
     * Getter of the attack base stat.
     * 
     * @return int attack base stat.
     */
    public int getAttack() {
        return attack;
    }

    
    /** 
     * Getter of the attackSpeed base stat.
     * 
     * @return int attackSpeed base stat.
     */
    public int getAttackSpeed() {
        return attackSpeed;
    }

    
    /** 
     * Getter of the criticalAttack base stat.
     * 
     * @return int criticalAttack base stat.
     */
    public int getCriticalAttack() {
        return criticalAttack;
    }

    
    /** 
     * Getter of the defense base stat.
     * 
     * @return int defense base stat.
     */
    public int getDefense() {
        return defense;
    }

    
    /** 
     * Method overrided toSting. It prints the base stats.
     * @return String
     */
    @Override
    public String toString() {
        return "\nAttack: " + getAttack() + "\nDefense: " + getDefense() + "\nAgility: " 
            + getAgility() + "\nAttack speed: " + getAttackSpeed() + "\nCritic attack: " + getCriticalAttack();
    }

}
