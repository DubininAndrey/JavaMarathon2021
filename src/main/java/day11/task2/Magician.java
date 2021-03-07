package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {
    private int magicAtt;

    public Magician() {
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
        double powerMagicDamage = magicAtt * (1 - hero.magicDef);
        if (hero.health - powerMagicDamage < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= powerMagicDamage;
        }
    }
}
