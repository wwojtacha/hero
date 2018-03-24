package hero;

public class Assassin extends Hero {

    public Assassin(String name, Side side) {
        super(name, side);

    }

    @Override
    public double getAttackPoints() {
        return super.getAttackPoints();
    }

    @Override
    public void setAttackPoints(double attackPoints) {
        super.setAttackPoints(attackPoints * 2.5);
    }

    @Override
    public void doSpecialMove(Hero hero) {

    }


}
