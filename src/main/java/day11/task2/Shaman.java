package day11.task2;

import day11.task2.Interfaces.Healer;
import day11.task2.Interfaces.MagicAttack;
import day11.task2.Interfaces.PhysAttack;

public class Shaman extends Hero implements MagicAttack, PhysAttack, Healer {

    public Shaman() {
        health = 100;
        physDef = 0.2;
        magicDef = 0.2;
        physAtt = 10;
        healHimself = 50;
        healTeammate = 30;
        magicAtt = 15;
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }

    @Override
    public void healHimself() {
        if (health == 100.0) {
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
