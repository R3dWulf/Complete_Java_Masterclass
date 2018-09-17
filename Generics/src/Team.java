import java.util.ArrayList;
import java.util.Collections;

public class Team<T extends Player> implements  Comparable<Team<T>>{
    private String name;
    int gamePlayed = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player)
    {
        if(members.contains(player))
        {
            System.out.println( player.getName() + " is already a member of the team");
            return false;
        }
        else
        {
            members.add(player);
            System.out.println( player.getName() + " was picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers(){
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore)
    {
        String message;
        if(ourScore > theirScore )
        {
            won++;
            message = " beat ";
        }
        else if( ourScore == theirScore)
        {
            tied++;
            message = " tied with ";
        } else
        {
            lost++;
            message = " lost to ";
        }

        gamePlayed++;

        if(opponent != null)
        {
            System.out.print(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking()
    {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking())
        {
            return -1;
        }
        else if(this.ranking() < team.ranking() )
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

}
