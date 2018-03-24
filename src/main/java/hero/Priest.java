package hero;

public class Priest extends Hero {

    public Priest(String name, Side side) {
        super(name, side);
    }

    @Override
    public void setHP(double HP) {
        super.setHP(HP * 1.5);
    }

    @Override
    public double getHP() {
        return super.getHP();
    }


    @Override
    public void doSpecialMove(Hero hero) {

    }
}
