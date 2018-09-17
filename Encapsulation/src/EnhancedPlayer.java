public class EnhancedPlayer {
    private String playerName;
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String playerName, int health, String weapon) {
        this.playerName = playerName;
        // validate health
        if( health > 0 && health <= 100)
        {
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage)
    {
        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints <= 0)
        {
            System.out.println(playerName + " has died");
        }
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getHealth() {
        return hitPoints;
    }

    public String getWeapon() {
        return weapon;
    }
}
