package day11.task2;

import day11.task2.Interfaces.MagicAttack;
import day11.task2.Interfaces.PhysAttack;

public class Magician extends Hero implements PhysAttack, MagicAttack {

    public Magician() {
        health = 100;
        physDef = 0.0;
        magicDef = 0.8;
        physAtt = 5;
        magicAtt = 20;
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }

    @Override
    public void magicalAttack(Hero hero) {
        if (hero.getHealth() == 0) {
            return;
        }
        hero.setHealth((int) (hero.getHealth() - (magicAtt * (1 - hero.getMagicDef()))));
        if (hero.getHealth() < 0) {
            hero.setHealth(0);
        }
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
