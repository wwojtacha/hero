package hero;

public class Tank extends Hero {

    public Tank(String name, Side side)
    {
        super(name, side);
            setHP(super.getHP() * 2);
            setDefPoints((super.getDefPoints() * 1.2));
        }

    @Override
    public void doSpecialMove(Hero hero) {
            hero.setDefPoints(hero.getDefPoints() * 2);
    }

}
