package day11.task2;

public abstract class Hero {
    int health;
    double physDef;
    double magicDef;
    int physAtt;
    double healHimself;
    double healTeammate;
    int magicAtt;

    public double getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getPhysDef() {
        return physDef;
    }

    public void setPhysDef(double physDef) {
        this.physDef = physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public void setMagicDef(double magicDef) {
        this.magicDef = magicDef;
    }

    public double getPhysAtt() {
        return physAtt;
    }

    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
    }

    public double getHealHimself() {
        return healHimself;
    }

    public void setHealHimself(double healHimself) {
        this.healHimself = healHimself;
    }

    public double getHealTeammate() {
        return healTeammate;
    }

    public void setHealTeammate(double healTeammate) {
        this.healTeammate = healTeammate;
    }

    public double getMagicAtt() {
        return magicAtt;
    }

    public void setMagicAtt(int magicAtt) {
        this.magicAtt = magicAtt;
    }
}
