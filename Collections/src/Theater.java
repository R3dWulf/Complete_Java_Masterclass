import java.util.*;

public class Theater {

    private final String theaterName;
    private List<Seat> seats = new ArrayList<>();

    static final Comparator<Seat> PRICE_ORDER;

    static {
        PRICE_ORDER = new Comparator<Seat>() {
            @Override
            public int compare(Seat seat1, Seat seat2) {
                if (seat1.getPrice() < seat2.getPrice()) {
                    return -1;
                } else if (seat1.getPrice() > seat2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
    }

    /*
        ******  -- Other formats that can be used -- ******
        private List<Seat> seats = new LinkedList<>();
        private Collection<Seat> seats = new ArrayList<>();
        private Collection<Seat> seats = new HashSet<>(); -- Unordered list
        private Collection<Seat> seats = new LinkedHashSet<>();
     */



    public Theater(String theaterName, int numberOfRows, int seatsPerRow) {
        this.theaterName = theaterName;
        int lastRow = 'A' + (numberOfRows -1);

        for (char row = 'A'; row <= lastRow; row++)
        {
            for(int seatNumber = 1; seatNumber <= seatsPerRow; seatNumber++)
            {
                double price = 19.99;
                if( (row < 'C') && (seatNumber >= 4 && seatNumber <= 9 ) )
                {
                    price = 24.99;
                }
                else if( ( row > 'F') && (seatNumber < 4 || seatNumber > 9) )
                {
                    price = 6.99;
                }
                Seat seat = new Seat( row + String.format("%02d", seatNumber), price);
                seats.add(seat);
            }
        }
    }

    public String getTheaterName()
    {
        return theaterName;
    }

    public boolean reserveSeat(String seatNumberParam)
    {
//****** Using modified Java source code *****************************
//*********************************************************************
//        int low = 0;
//        int high = seats.size()-1;
//        while( low <= high)
//        {
//            System.out.print(".");
//            int mid = (low + high) / 2;
//            Seat midValue = seats.get(mid);
//            int cmp = midValue.getSeatNumber().compareTo(seatNumberParam);
//
//            if(cmp < 0)
//            {
//                low = mid + 1;
//            }
//            else  if(cmp > 0)
//            {
//                high = mid -1;
//            }
//            else
//            {
//                return seats.get(mid).reserve();
//            }
//        }
//        System.out.println("There is no seat " + seatNumberParam );
//        return false;
// ******************************************************************
        Seat requestedSeat = new Seat(seatNumberParam, 0);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if(foundSeat >= 0)
        {
            return seats.get(foundSeat).reserve();
        }
        else
        {
            System.out.println("There is no seat " + seatNumberParam);
            return false;
        }

    }

    //testing
    public Collection<Seat> getSeats()
    {
        return seats;
    }

    public class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private double price;
        private boolean reserved = false;

        public Seat(String seatNumberParam, double priceParam) {
            this.seatNumber = seatNumberParam;
            this.price = priceParam;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean reserve()
        {
            if(!this.reserved )
            {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " is open");
                return true;
            }
            else
            {
                return false;
            }
        }

        public boolean cancel()
        {
            if(this.reserved == true)
            {
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " has been cancelled");
                return true;
            }
            else
            {
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public double getPrice() {
            return price;
        }
    }
}
