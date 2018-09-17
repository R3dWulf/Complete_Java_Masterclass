import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theater theater = new Theater("Fox", 8, 12);
//        List<Theater.Seat> seatCopy = new ArrayList<>(theater.seats);
//        printList(seatCopy);

//        seatCopy.get(1).reserve();

        if(theater.reserveSeat("G02"))
        {
            System.out.println("Please pay for G02");
        }
        else
        {
            System.out.println("Reserving seat");
        }

        if(theater.reserveSeat("A02"))
        {
            System.out.println("Please pay for A02");
        }
        else
        {
            System.out.println("Reserving seat");
        }


//        Collections.reverse(seatCopy);
//        System.out.println("Printing seatCopy in reverse");
//        printList(seatCopy);
//        System.out.println("Printing theater.seat in regular order");
//        printList(theater.seats);
//        Collections.shuffle(seatCopy);
//        System.out.println("Printing seatCopy in a random, shuffled order");
//        printList(seatCopy);
//
//        Theater.Seat minSeat = Collections.min(seatCopy);
//        System.out.println("The first element is the list is " + minSeat.getSeatNumber());
//        Theater.Seat maxSeat = Collections.max(seatCopy);
//        System.out.println("The element in the list is " + maxSeat.getSeatNumber());
//
//        sortList(seatCopy);
//        System.out.println("Manually printing sorted seatCopy back to regular order");
//        printList(seatCopy);

//        theater.getSeats();
//        if(theater.reserveSeat("h12"))
//        {
//            System.out.println("The seat you selected is now reserved");
//        }
//        else {
//            System.out.println("Seat has been taken, please try another seat");
//        }

        List<Theater.Seat> reverseSeats = new ArrayList<>(theater.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Theater.Seat> priceSeats = new ArrayList<>(theater.getSeats());
        priceSeats.add(theater.new Seat("F00", 13.00)); // F00 will be added in front of C00
        priceSeats.add(theater.new Seat("C00", 13.00));
        Collections.sort(priceSeats, Theater.PRICE_ORDER);
        System.out.println("Sorting seats by price order");
        printList(priceSeats);

    }

    public static void printList(List<Theater.Seat> list)
    {
        for(Theater.Seat seat : list)
        {
            System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }

        System.out.println();
        System.out.println("==============================");
    }

//    public static void sortList(List<? extends Theater.Seat> list)
//    {
//        for(int i = 0; i<list.size() -1; i++)
//        {
//            for(int j=i+1; j<list.size(); j++)
//            {
//                if(list.get(i).compareTo(list.get(j)) > 0)
//                {
//                    Collections.swap(list, i, j);
//                }
//            }
//        }
//    }
}
