package day11.task2;

public class Shaman extends Hero implements MagicAttack, PhysAttack, Healer {
    private int healHimself;
    private int healTeammate;
    private int magicAtt;

    public Shaman() {
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

    @Override
    public void magicalAttack(Hero hero) {
        double powerMagicDamage = magicAtt * (1 - hero.magicDef);
        if (hero.health - powerMagicDamage < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= powerMagicDamage;
        }
    }
}
