package day11.task2;

import day11.task2.Interfaces.Healer;
import day11.task2.Interfaces.PhysAttack;

public class Paladin extends Hero implements Healer, PhysAttack {

    public Paladin() {
        health = 100;
        physDef = 0.5;
        magicDef = 0.2;
        physAtt = 15;
        healHimself = 25;
        healTeammate = 10;
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }

    @Override
    public void healHimself() {
        if (health == 100) {
            return;
        }
        health += healHimself;
        if (health > 100) {
            health = 100;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.getHealth() == 100) {
            return;
        }
        hero.setHealth((int) (hero.getHealth() + healTeammate));
        if (hero.getHealth() > 100) {
            hero.setHealth(100);
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
