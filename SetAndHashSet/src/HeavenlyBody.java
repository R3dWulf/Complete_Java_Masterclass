import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<HeavenlyBody>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }


    public boolean addMoon(HeavenlyBody moonParam){
        return this.satellites.add(moonParam);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }


    /*
        Below, equals() is not necessary. HeavenlyBody
        is final therefore cannot have a subclass which
        means there is no worry about comparing to a subclass
     */
    @Override
    public boolean equals(Object obj) {
        if ( this == obj)
        {
            return true;
        }

        System.out.println("obj.getClass() " + obj.getClass() );
        System.out.println("this.getClass() " + this.getClass());

        if( (obj == null ) || (obj.getClass() != this.getClass()) )
        {
            return false;
        }

        String objName = ( (HeavenlyBody) obj).getName();
        return  this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode called");
        return this.name.hashCode() + 57;
    }
}