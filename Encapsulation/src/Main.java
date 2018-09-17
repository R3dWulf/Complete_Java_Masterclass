public class Main {

    public static void main(String[] args) {
        //-- Not using Encapsulation
//        Player player = new Player();
//        player.userName = "TheChosenOne";
//        player.weapon = "Light Saber";
//
//
//        int damage = 100;
//        //-- Player health is public so a developer can override it
//        player.health = 200;
//        player.loseHealth(damage);
//
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Zippidy", 250, "Dual Swords");
        System.out.println(player.getPlayerName() + " was created with " + player.getHealth() + " health");

        int playerWasHit = 10;
        player.loseHealth(playerWasHit);
    }
}
