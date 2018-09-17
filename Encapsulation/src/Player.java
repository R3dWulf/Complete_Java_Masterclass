/**
 * Not using encapsulation
 */

public class Player {
    // Changing names of public fields requires changing the name in the main class.
    //public String  userName;
    public String fullName;
    public int health = 100;
    public String weapon;

    public void loseHealth(int damage)
    {
        this.health = this.health - damage;
        if(this.health <= 0)
        {
            //System.out.println(userName + " has died");
        }
    }

    public int healthRemaining()
    {
        return this.health;
    }

}
