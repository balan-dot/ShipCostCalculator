import java.util.Scanner;

class ShipCostCalculator {
    static void main(){

        Scanner in = new Scanner(System.in);

        double shipCost = 0;
        double itemPrice = 0;
        double totalCost = 0;
        String trash = "";

        // Get the item price form the user
        IO.print("Enter your item price: ");


        if(in.hasNextDouble())
        {
            itemPrice = in.nextDouble();        // Read the value
            in.nextLine();          // Clear the newline from Key Buffer
        }
        else
        {
            trash = in.nextLine();
            IO.println("You must enter a valid number not " + trash);
            IO.println("Rerun the program and try again!");
            System.exit(0);

        }

        if (itemPrice >= 100){
            shipCost = 0;
            totalCost = itemPrice;
        }else{
            shipCost = itemPrice * 0.02;
            totalCost = shipCost + itemPrice;
        }

        // Display Results
        IO.println("The shipping cost is: " + shipCost);
        IO.println("The total cost is: " + totalCost);







    }

}
