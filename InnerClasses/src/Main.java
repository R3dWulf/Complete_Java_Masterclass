import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button buttonPrint = new Button("Print");

    public static void main(String[] args) {
//	    Gearbox porsche = new Gearbox(4);
//        porsche.operateClutch(true);
//        porsche.changeGear(1);
//        porsche.operateClutch(false);
//        System.out.println(porsche.wheelSpeed(1000));
//        porsche.operateClutch(true);
//        porsche.changeGear(2);
//        porsche.operateClutch(false);
//        System.out.println(porsche.wheelSpeed(2000));
//        porsche.operateClutch(true);
//        porsche.changeGear(3);
//        //porsche.operateClutch(false);
//        System.out.println(porsche.wheelSpeed(3000));
//        porsche.operateClutch(false);
//        porsche.changeGear(4);
//        porsche.operateClutch(true);
//        System.out.println(porsche.wheelSpeed(3000));

        // ** Local class ***
        class ClickListener implements Button.OnClickListener
        {
            public ClickListener()
            {
                System.out.println("I have been attached");
            }

            @Override
            public void onClick(String title)
            {
                System.out.println(title + " was clicked");
            }
        }

        //buttonPrint.setOnClickListener(new ClickListener( ));

        //** Anonymous class**
        buttonPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();
    }

    private static void listen()
    {
        boolean quit = false;
        while(!quit)
        {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice)
            {
                case 0:
                    quit = true;
                    break;
                case 1:
                    buttonPrint.onClick();

            }
        }
    }
}
