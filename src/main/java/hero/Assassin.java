package hero;

public class Assassin extends Hero {

    public Assassin(String name, Side side) {
        super(name, side);
            setAttackPoints(super.getAttackPoints() * 2.5);
        }

    @Override // enhanced damage
    public void doSpecialMove(Hero hero) {
        if (!this.getSide().equals(hero.getSide())) {
            hero.setHP(hero.getHP() - this.getAttackPoints() * 1.5);
        }else{
            System.out.println("You cannot attack a friendly unit");
        }
    }

}
