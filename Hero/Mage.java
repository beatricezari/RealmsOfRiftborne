package Hero;

public class Mage extends Hero {
    private int skillCd1, skillCd2, skillCdU;

    public Mage() {
        super(4000, 550, 1000, 180, 100, 20, "Selene Arclight", "Mage", "Wooden Staff", "Stellar Shard", "Chains of Starlight", "Astral Cataclysm", 200, 425, 850, 2000, 2500, 570);
        this.skillCd1 = 4;
        this.skillCd2 = 6;
        this.skillCdU = 9;
    }

    @Override
    public void basicAttack(Entity enemy) {
        int damage = multiplierB(getAttack(), getLevel());
        
        double manaRecovery = getManaCap() * 0.2;

        if(manaRecovery+getMana() > getManaCap()){
            setMana(getManaCap());
        } else {
            int addMana = (int) manaRecovery + getMana();
            setMana(addMana);
        }

        int damageDealt = damage - enemy.getDefense()/2;

        System.out.println(getName() + " used Basic Attack!");
        System.out.println("Basic Attack deals " + damageDealt + " damage!");

        enemy.setHp(enemy.getHp() - damageDealt);
    }

    @Override
    public void skill1(Entity enemy){
        setCooldown1(skillCd1);

        int damage = multiplier1(getAttack(), getLevel());

        int manaReduce = getMana() - scaledCost(getManaCostSkill1());
        setMana(manaReduce);

        int damageDealt = damage - enemy.getDefense()/2;

        System.out.println(getName() + " used " + getSkill1() + "!");
        System.out.println(getSkill1() + " deals " + damageDealt + " damage!");

        enemy.setHp(enemy.getHp() - damageDealt);
    }

    @Override
    public void skill2(Entity enemy){
        setCooldown2(skillCd2);

        int damage = multiplier2(getAttack(), getLevel());

        int manaReduce = getMana() - scaledCost(getManaCostSkill2());
        setMana(manaReduce);

         int damageDealt = damage - enemy.getDefense()/2;

        System.out.println(getName() + " used " + getSkill2() + "!");
        System.out.println(getSkill2() + " deals " + damageDealt + " damage!");

        enemy.setHp(enemy.getHp() - damageDealt);
    }

    @Override
    public void ultimate(Entity enemy){
        setCooldownU(skillCdU);

        int damage = multiplierU(getAttack(), getLevel());

        int manaReduce = getMana() - scaledCost(getManaCostUltimate());
        setMana(manaReduce);

        int damageDealt = damage - enemy.getDefense()/2;

        System.out.println(getName() + " used " + getUltimate() + "!");
        System.out.println(getUltimate() + " deals " + damageDealt + " damage!");

        enemy.setHp(enemy.getHp() - damageDealt);
    }
}