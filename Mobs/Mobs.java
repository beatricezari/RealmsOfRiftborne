package Mobs;

import Hero.Entity;

public abstract class Mobs extends Entity {
    private String name;
    private int hp;
    private int attack;
    private int defense;
    private int speed;
    private int level;
    private int mana;
    

    public Mobs(String name, int hp, int attack, int defense, int speed, int level, int mana) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.level = level;
        this.mana = mana;
    }
    
    // abstract methods
    public abstract int basicAttack();
    public abstract int skill1();
    public abstract int skill2();
    public abstract int ultimate();
    
    //setters
    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }

    //getters
    public String getName() {
        return name;
    }
    public int getHp() {
        return hp;
    }
    public int getAttack() {
        return attack;
    }
    public int getDefense() {
        return defense;
    }
    public int getSpeed() {
        return speed;
    }
    public int getLevel() {
        return level;
    }
    public int getMana() {
        return mana;
    }
}