package player.race;

import java.io.Serializable;
import java.util.ArrayList;

import player.race.classes.*;

/**
 * Race class.
 * Instance of the race. In order to save the stats of the race that is being played. 
 * 
 * @author Camilo Jené Conde <cjeneconde@gmail.com>
 * @version 0.0.1
 */
public abstract class Race implements Serializable {
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
     * Class type of the race chosen for the game. CAN BE CHANGED.
     */
    private ClassType classType;

    private final int attackLevelUp;
    private final int defenseLevelUp;
    private final int agilityLevelUp;
    private final int attackSpeedLevelUp;
    private final int criticalAttackLevelUp;

    /**
     * Race class constructor. We receive the base stats and save them on the final variables.
     * 
     * @param a base attack.
     * @param df defense base stat.
     * @param ag agility base stat.
     * @param as attack speed base stat.
     * @param ca critic base stat.
     */
    public Race (int a, int df, int ag, int as, int ca, ArrayList<Integer> baseLevelUpStats) {
        setAgility(ag);
        setAttack(a);
        setDefense(df);
        setAttackSpeed(as);
        setCriticalAttack(ca);

        /**
         * We initialise the final stats data.
         */
        attackLevelUp = baseLevelUpStats.get(0);
        defenseLevelUp = baseLevelUpStats.get(1);
        agilityLevelUp = baseLevelUpStats.get(2);
        attackSpeedLevelUp = baseLevelUpStats.get(3);
        criticalAttackLevelUp = baseLevelUpStats.get(4);
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
     * Method that sets the class type of the race. 
     * We have to set the extra habilities of the race.
     * 
     * @param classType
     */
    public void setClassType(ClassType classType) {
        this.classType = classType;
    }

    /**
     * Method to level up the player.
     */
    public void levelUp() {
        setAttack(getAttack() + attackLevelUp + classType.levelUp());
        setDefense(getDefense() + defenseLevelUp + classType.levelUp());
        setAgility(getAgility() + agilityLevelUp + classType.levelUp());
        setAttackSpeed(getAttackSpeed() + attackSpeedLevelUp + classType.levelUp());
        setCriticalAttack(getCriticalAttack() + criticalAttackLevelUp + classType.levelUp());    
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
