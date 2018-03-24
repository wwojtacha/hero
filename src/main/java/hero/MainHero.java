package hero;

public class MainHero {
    public static void main(String[] args) {

        Tank tank = new Tank("Pablo", Side.EVIL);
        Hero priest = new Priest("Alojzy", Side.EVIL);
        Hero assassin = new Assassin("Stefan", Side.GOOD);
        Hero tank1 = new Tank("Edmund", Side.GOOD);

        Arena arena = new Arena();
        arena.addHero(tank);
        arena.addHero(assassin);
        arena.addHero(priest);
        arena.addHero(tank1);



        arena.printHeroes();



    }
}
