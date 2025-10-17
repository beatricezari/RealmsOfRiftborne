package Mobs;

public class FadingWarden extends Mobs {
    private String skill1 = "Ethereal Slash";
    private String skill2 = "Ghost Step";
    private String ultimate = "Oblivion Veil";
    private int manaCostUltimate = 500;
    private int manaCostSkill1 = 50;
    private int manaCostSkill2 = 250;
    private int manaCapacity = getMana();

    public FadingWarden() {
        super("Fading Warden", 4000, 500, 250, 90, 12, 100);
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
        double damage = getAttack() * (int) 2.5;
        System.out.println(getName() + " used " + skill2 + "!");
        System.out.println(skill2 + " deals " + damage + " damage!");

        int manaReduce = getMana() - manaCostSkill2;
        setMana(manaReduce);

        return (int) Math.round(damage);
    }

    @Override
    public int ultimate(){
        double damage = getAttack() * (int) 2.0;
        System.out.println(getName() + " used " + ultimate + "!");
        System.out.println(ultimate + " deals " + damage + " damage!");

        int manaReduce = getMana() - manaCostUltimate;
        setMana(manaReduce);

        return (int) Math.round(damage);
    }
    
}