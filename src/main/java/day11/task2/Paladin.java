package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack {
    private int healHimself;
    private int healTeammate;

    public Paladin() {
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
        if (health + healHimself > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health += healHimself;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + healTeammate > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += healTeammate;
        }
    }
}
