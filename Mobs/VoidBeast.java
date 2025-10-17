package Mobs;

public class VoidBeast extends Mobs {
    private String skill1 = "Rift Claw";
    private String skill2 = "Gravity Crush";
    private int manaCostSkill1 = 50;
    private int manaCostSkill2 = 250;
    private int manaCapacity = getMana();

    public VoidBeast() {
        super("Void Beast", 5000, 600, 300, 80, 15, 150);

    }

    @Override
    public int basicAttack() {
        double damage = getAttack(); 
        System.out.println(getName() + " used Basic Attack!");
        System.out.println("Basic Attack deals " + damage + " damage!");
        double manaRecovery = manaCapacity * 0.2;

        if(manaRecovery+getMana() > manaCapacity){
            setMana(manaCapacity);
        } else {
            int addMana = (int) manaRecovery + getMana();
            setMana(addMana);
        }

        return (int) damage;
    }
    
    @Override
    public int skill1(){
        double damage = getAttack() * (int) 1.5;
        System.out.println(getName() + " used " + skill1 + "!");
        System.out.println(skill1 + " deals " + damage + " damage!");

        int manaReduce = getMana() - manaCostSkill1;
        setMana(manaReduce);

        return (int) Math.round(damage);
    }

    @Override
    public int skill2(){
        int damage = getAttack() * (int) 1.6;
        System.out.println(getName() + " used " + skill2 + "!");
        System.out.println(skill2 + " deals " + damage + " damage!");
        int manaReduce = getMana() - manaCostSkill2;
        setMana(manaReduce);

        return (int) Math.round(damage);
    }

    @Override
    public int ultimate(){
        System.out.println(getName() + " has no ultimate skill!");

        return 0; 

    }

    
}