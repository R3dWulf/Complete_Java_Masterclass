class Movie
{
    private String movieName;

    public Movie(String name)
    {
        this.movieName = name;
    }

    public String plot()
    {
        return "No plot here";
    }

    public String getMovieName() {
        return movieName;
    }
}

class Jaws extends Movie
{
    public Jaws()
    {
        super("Jaws");
    }

    public String plot()
    {
        return "Shark eats lots of people";
    }
}

class IndependenceDay extends Movie{

    public IndependenceDay()
    {
        super("Independence Day");
    }

    @Override
    public String plot()
    {
        return "Must stop aliens from taking over";
    }
}

class Matrix extends Movie{
    public Matrix()
    {
        super("Matrix");
    }

    @Override
    public String plot()
    {
        return "Liberate humans from machines";
    }
}

class StarWars extends Movie{
    public StarWars()
    {
        super("Star Wars");
    }

    @Override
    public String plot()
    {
        return "Eternal battle between good and evil";
    }
}

class Forgetable extends Movie{
    public Forgetable(){
        super("Forgetable");
    }
}


public class Main {

    public static void main(String[] args) {
        for(int i = 1; i<11; i++)
        {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i
            +  " : " + movie.getMovieName() + "\n" +
            "Plot: " + movie.plot() + "\n" );
        }
    }

    public static Movie randomMovie()
    {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was: " + randomNumber);

        switch(randomNumber)
        {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new Matrix();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }

        return null;
     }
}
