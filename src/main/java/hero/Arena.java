package hero;



import java.util.*;


public class Arena {

    private List<Hero> goodGuys = new ArrayList<>();
    private List<Hero> badGuys = new ArrayList<>();



    public Arena() {
    }

    public void addHero(Hero hero) {
            if (hero.getSide() == Side.GOOD) {
                goodGuys.add(hero);
            }else{
                badGuys.add(hero);
            }

        Comparator<Hero> heroComparator = new Comparator<Hero>() {
            @Override
            // -1 o1 < o2
            // 0 o1 == o2
            // 1 o2 > o1
            public int compare(Hero o1, Hero o2) {
                if (o1.getSpawnDate().isBefore(o2.getSpawnDate())) {
                    return -1;
                } else if (o1.getSpawnDate().isEqual(o2.getSpawnDate())) {
                    return 0;
                }
                    return 1;
            }
        };

            goodGuys.stream()
                    .sorted(heroComparator);
            badGuys.stream()
                .sorted(heroComparator);


    }


//    public void setBoss (){
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
//        goodBoss = goodGuys.stream()
//                        .min(heroComparator);
//        goodBoss.get().setBoss(true);
//        System.out.println(goodBoss.get());
//
//
//        badBoss = badGuys.stream()
//                .min(heroComparator);
//        badBoss.get().setBoss(true);
//        System.out.println(badBoss.get());
//    }


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


