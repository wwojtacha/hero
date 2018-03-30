package hero;



import java.util.*;


public class Arena {

    private List<Hero> goodGuys;
    private List<Hero> badGuys;


    public Arena() {
        goodGuys = new ArrayList<>();
        badGuys = new ArrayList<>();
    }

    public void addHero(Hero hero) {
        if (hero.getSide() == Side.GOOD) {
            goodGuys.add(hero);
            assignBossGood();
        } else {
            badGuys.add(hero);
            assignBossBad();
        }
    }

    public void assignBossGood() {
//        Comparator<Hero> heroComparator = new Comparator<Hero>() {
//            @Override
//            // -1 o1 < o2
//            // 0 o1 == o2
//            // 1 o2 > o1
//            public int compare(Hero o1, Hero o2) {
//                if (o1.getSpawnDate().isBefore(o2.getSpawnDate())) {
//                    return -1;
//                } else if (o1.getSpawnDate().isEqual(o2.getSpawnDate())) {
//                    return 0;
//                }
//                    return 1;
//            }
//        };
//
//            goodGuys.stream()
//                    .sorted(heroComparator);
//            badGuys.stream()
//                .sorted(heroComparator);

        for (int i = 0; i < goodGuys.size(); i++) {
            if (i == goodGuys.size() - 1) {
                break;
            } else if (goodGuys.get(i).getSpawnDate().isBefore(goodGuys.get(i + 1).getSpawnDate())) {
                goodGuys.get(i).setBoss(true);
                if (goodGuys.get(i).getClass() == Tank.class) {
                    goodGuys.get(i).setHP(goodGuys.get(i).getHP() * 2);
                    goodGuys.get(i).setDefPoints(goodGuys.get(i).getDefPoints() * 1.15);
                } else if (goodGuys.get(i).getClass() == Priest.class) {
                    goodGuys.get(i).setHP(goodGuys.get(i).getHP() * 2);
                } else {
                    goodGuys.get(i).setAttackPoints(goodGuys.get(i).getAttackPoints() * 2);
                }
            } else {
                goodGuys.get(i + 1).setBoss(true);
                if (goodGuys.get(i + 1).getClass() == Tank.class) {
                    goodGuys.get(i + 1).setHP(goodGuys.get(i + 1).getHP() * 2);
                    goodGuys.get(i + 1).setDefPoints(goodGuys.get(i + 1).getDefPoints() * 1.15);
                } else if (goodGuys.get(i + 1).getClass() == Priest.class) {
                    goodGuys.get(i + 1).setHP(goodGuys.get(i + 1).getHP() * 2);
                } else {
                    goodGuys.get(i + 1).setAttackPoints(goodGuys.get(i + 1).getAttackPoints() * 2);
                }

            }
        }
    }

    public void assignBossBad() {
        for (int i = 0; i < badGuys.size(); i++) {
            if (i == badGuys.size() - 1) {
                break;
            } else if (badGuys.get(i).getSpawnDate().isBefore(badGuys.get(i + 1).getSpawnDate())) {
                badGuys.get(i).setBoss(true);
                if (badGuys.get(i).getClass() == Tank.class) {
                    badGuys.get(i).setHP(badGuys.get(i).getHP() * 2);
                    badGuys.get(i).setDefPoints(badGuys.get(i).getDefPoints() * 1.15);
                } else if (badGuys.get(i).getClass() == Priest.class) {
                    badGuys.get(i).setHP(badGuys.get(i).getHP() * 2);
                } else {
                    badGuys.get(i).setAttackPoints(badGuys.get(i).getAttackPoints() * 2);
                }
            } else {
                badGuys.get(i + 1).setBoss(true);
                if (badGuys.get(i + 1).getClass() == Tank.class) {
                    badGuys.get(i + 1).setHP(badGuys.get(i + 1).getHP() * 2);
                    badGuys.get(i + 1).setDefPoints(badGuys.get(i + 1).getDefPoints() * 1.15);
                } else if (badGuys.get(i + 1).getClass() == Priest.class) {
                    badGuys.get(i + 1).setHP(badGuys.get(i + 1).getHP() * 2);
                } else {
                    badGuys.get(i + 1).setAttackPoints(badGuys.get(i + 1).getAttackPoints() * 2);
                }

            }
        }
    }



    public void printHeroes(){
        System.out.println("The Good guys are: ");
        for (Hero goodGuy : goodGuys ) {
            System.out.println(goodGuy);
        }
        System.out.println("The Bad guys are: ");
        for (Hero badGuy : badGuys ) {
            System.out.println(badGuy);
        }
    }

}


