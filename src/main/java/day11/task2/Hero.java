package day11.task2;

public abstract class Hero implements PhysAttack{
    protected int health;
    protected double physDef;
    protected double magicDef;
    protected int physAtt;
    protected final int MIN_HEALTH = 0;
    protected final int MAX_HEALTH = 100;

    public Hero() {
        health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double powerPhysDamage = physAtt * (1 - hero.physDef);
        if (hero.health - powerPhysDamage < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= powerPhysDamage;
        }
    }
}
