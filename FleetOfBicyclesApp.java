import java.util.Scanner;

public class FleetOfBicyclesApp {

    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        System.out.println("\n");

        //Prompt the user for the number of bicycles they want to create.
        System.out.print("How many bicycles do you want to create (up to 6) --> ");
        int bicycleQuantity = userinput.nextInt();
        userinput.nextLine();

        //Create an array of bicycle objects.
        Bicycle[] bicycleFleet = new Bicycle[bicycleQuantity];

        //This loop will run once for every bicycle the user wanted to create.
        for(int i = 0; i < bicycleQuantity; i++){

            System.out.println("\n");
            
            //Prompt the user for the owner of the current bicycle.
            System.out.print("Enter the owner of bicycle" + i + " --> ");
            String owner = userinput.nextLine();

            //Prompt the user for the brand.
            System.out.print("Enter the brand of bicycle" + i + " --> ");
            String type = userinput.nextLine();

            //Prompt the user for the gear.
            System.out.print("Enter the gear of bicycle" + i + " --> ");
            int gear = userinput.nextInt();
            userinput.nextLine();

            //Prompt the user for the speed.
            System.out.print("Enter the speed of bicycle" + i + " --> ");
            int speed = userinput.nextInt();
            userinput.nextLine();

            //Prompt the user for the cadence.
            System.out.print("Enter the cadence of bicycle" + i + " --> ");
            int cadence = userinput.nextInt();
            userinput.nextLine();

            //Define the current bicycle with the attributes just entered by the user.
            bicycleFleet[i] = new Bicycle(cadence, speed, gear, type, owner);

            System.out.println("\n");
        }

        System.out.println("\n");

        //Tell the user that the info is being printed.
        System.out.println("Here is the information about all the bicycles:\n");

        //Iterate through the array of objects.
        for (int i = 0; i < bicycleQuantity; i++){

            //Get the message for each bicycle.
            String message = bicycleFleet[i].getInfo();

            //Print each message with a newline for formatting.
            System.out.println(message + "\n");
        }

        System.out.println("\n");

        //Tell the user the program is ending.
        System.out.println("The program is ending...");

        System.out.println("\n");

        //Close the scanner.
        userinput.close();

    }

}
