package hero;

public class Tank extends Hero {

    public Tank(String name, Side side) {
        super(name, side);
    }

    @Override
    public void setHP(double HP) {
        HP = getHP() * 2;
        super.setHP(HP);
    }

    @Override
    public double getHP() {
        return super.getHP();
    }

    @Override
    public void setDefPoints(double defPoints) {
        super.setDefPoints(defPoints * 1.2);
    }

    @Override
    public void doSpecialMove(Hero hero) {

    }
}
