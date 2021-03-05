package day11.task2;

import day11.task2.Interfaces.PhysAttack;

public class Warrior extends Hero implements PhysAttack {

    public Warrior() {
        health = 100;
        physDef = 0.8;
        magicDef = 0.0;
        physAtt = 30;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }

    @Override
    public void physicalAttack(Hero hero) {
        if (hero.getHealth() == 0) {
            return;
        }
        hero.setHealth((int) (hero.getHealth() - (physAtt * (1 - hero.getPhysDef()))));
        if (hero.getHealth() < 0) {
            hero.setHealth(0);
        }
    }

}