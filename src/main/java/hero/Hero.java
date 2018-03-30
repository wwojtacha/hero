package hero;

import java.time.LocalDateTime;
import java.util.Random;

public abstract class Hero {
    private String name;
    private double HP = 1000.0;
    private double attackPoints = 100.0;
    private double defPoints = 50.0;
    private Side side;
    private boolean isBoss = false;
    private LocalDateTime spawnDate = randomSpawnDate();


    public Hero(String name, Side side) {
        this.name = name;
        this.side = side;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHP() {
        return HP;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public double getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(double attackPoints) {
        this.attackPoints = attackPoints;
    }

    public double getDefPoints() {
        return defPoints;
    }

    public void setDefPoints(double defPoints) {
        this.defPoints = defPoints;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public boolean isBoss() {
        return isBoss;
    }

    public void setBoss(boolean boss) {
        isBoss = boss;
    }

    public LocalDateTime getSpawnDate() {
        return spawnDate;
    }

    public void setSpawnDate(LocalDateTime spawnDate) {
        this.spawnDate = spawnDate;
    }

    public abstract void doSpecialMove(Hero hero);

    public double getAttacked(int pointsOfAttack){

        attackPoints = (int) getAttackPoints();
        double result = getHP() - (attackPoints - getDefPoints());
        setHP(result);
        return result;
    }

    public void attack(Hero enemy) {
        enemy.HP = enemy.getHP() - (this.getAttackPoints() - enemy.getDefPoints());

    }

    private LocalDateTime randomSpawnDate(){
    Random rn = new Random();
    int year = rn.nextInt(47) + 1970;
    int month = rn.nextInt(11) + 1;
    int day = 1;
    if (month == 1 || month == 3  || month == 5  || month == 7  || month == 8  || month == 10  || month == 12){
        day = rn.nextInt(30) + 1;
    } else if (month == 2){
        day = rn.nextInt(27) + 1;
    } else {
        day = rn.nextInt(29) + 1;
    }
    int hour = rn.nextInt(23);
    int minute = rn.nextInt( 59);
    int sec = rn.nextInt(59);
    spawnDate = LocalDateTime.of(year, month, day, hour, minute, sec);
    return spawnDate;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", HP=" + HP +
                ", attackPoints=" + attackPoints +
                ", defPoints=" + defPoints +
                ", side=" + side +
                ", spawnDate=" + spawnDate +
                ", isBoss=" + isBoss +
                '}';
    }

}
