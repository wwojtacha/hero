package hero;

public class Priest extends Hero {

    public Priest(String name, Side side) {
        super(name, side);
        setHP(super.getHP() * 1.5);
    }


    @Override // heal friend
    public void doSpecialMove(Hero hero) {
        if (this.getSide().equals(hero.getSide())) {
            hero.setHP(hero.getHP() + 250);
        } else {
            System.out.println("You cannot heal an enemy unit");
        }
    }
}
