import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
//        ArrayList<Integer> items = new ArrayList<>();
//        items.add(1);
//        items.add(2);
//        items.add(3);
//        items.add(4);
//        items.add(5);
//
//        printDouble(items);

        FootballPlayer bob = new FootballPlayer("Bob");
        BaseballPlayer kevin = new BaseballPlayer("Kevin");
        SoccerPlayer stuart = new SoccerPlayer("Stuart");

        Team<FootballPlayer> evilVillains = new Team<>("Evil Villains");

        evilVillains.addPlayer(bob);
        //evilVillains.addPlayer(kevin);
        //evilVillains.addPlayer(stuart);

        System.out.println(evilVillains.numPlayers());

        Team<BaseballPlayer> braves = new Team<>("Atlanta Braves");
        braves.addPlayer(kevin);


        //Team<SoccerPlayer> brokenTeam = new Team<>("This won't work");
        //brokenTeam.addPlayer(stuart);

        Team<FootballPlayer> turtles = new Team<>("Pizza Eaters");
        FootballPlayer ralph = new FootballPlayer("Ralph");
        turtles.addPlayer(ralph);

        Team<FootballPlayer> spies = new Team<>("Spies");
        FootballPlayer archer = new FootballPlayer("Archer");
        spies.addPlayer(archer);

        Team<FootballPlayer> deliveryExpress = new Team<>("Delivery Express");
        FootballPlayer bender = new FootballPlayer("Bender");
        deliveryExpress.addPlayer(bender);

        turtles.matchResult(spies, 8,  1);

        System.out.println();

        turtles.matchResult(deliveryExpress, 14, 0);

        spies.matchResult(deliveryExpress, 1, 1);

        System.out.println();

        System.out.println(turtles.getName() + ": " + turtles.ranking());
        System.out.println(spies.getName() + ": " + spies.ranking());

        System.out.println(turtles.compareTo(spies));
        System.out.println(spies.compareTo(deliveryExpress));

        League<Team<FootballPlayer>> footballLeague = new League("AFL");
        footballLeague.add(turtles);
        footballLeague.add(spies);
        footballLeague.add(deliveryExpress);

        footballLeague.showLeagueTable();

    }

//    private static void printDouble(ArrayList<Integer> n)
//    {
//        for(int i : n)
//        {
//            System.out.println( i * 2);
//        }
//    }


}
