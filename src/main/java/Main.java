import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the dealership!");

        Car volt = new Car("Volt", "Chevy", 4000);
        Car porsche = new Car("911", "Porsche", 200000);
        Car honda = new Car("Ridgeline", "Honda", 15000);
        Car honda2 = new Car("Ridgeline", "Honda", 16000);
        Car bmw = new Car("ES6", "BMW", 35000);
        Car toyota = new Car("Corolla", "Toyota", 25000);

        List<Car> carList = new ArrayList();
        ShowRoom showRoomStock = new ShowRoom(carList);

        showRoomStock.addToInventory(volt);
        showRoomStock.addToInventory(porsche);
        showRoomStock.addToInventory(honda);
        showRoomStock.addToInventory(honda2);
       // showRoomStock.addToInventory(bmw);

        // Appointments
        for (int i = 0; i < 5; i++) {

            if (showRoomStock.getNumberOfCars() != 0) {

                System.out.println("\n\nCurrent commission of salesperson " + showRoomStock.getSalesCommission());

                showRoomStock.DisplayInventory();

                System.out.println("\n\nHey, What car make you want to buy ?");


                Scanner carChoiceScanner = new Scanner(System.in);  // Create a Scanner object

                String carMake = carChoiceScanner.nextLine();  // Read user input

                System.out.println("Hey, What car model you want to buy ?");
                String carModel = carChoiceScanner.nextLine();  // Read user input
                System.out.println("Hey, What is the sticker price ?");
                String carPrice = carChoiceScanner.nextLine();  // Read user input
                int priceTag=Integer.valueOf(carPrice);
                Car chosenCar = showRoomStock.findCar(carMake, carModel,priceTag);
                if (chosenCar != null) {
                    System.out.println("Price of your car is: " + showRoomStock.findCar(carMake, carModel,priceTag).getPrice());
                    System.out.println("Do you want to buy it Y/N?");
                    String buyOrNo = carChoiceScanner.nextLine();  // Read user input

                    if (buyOrNo.equals("Y")) {
                        showRoomStock.removeFromInventory(chosenCar);
                        System.out.println("Congratulations, you are the new owner of " + chosenCar.getMake() + " " + chosenCar.getModel());

                    }
                } else
                    System.out.println("Not available");



            }

            else {
                i=5;

            }



        }
            if (showRoomStock.getNumberOfCars() == 0) {
                System.out.println("Sorry, we out of stock");
            }
            else
            {
                System.out.println("We closed for the day, no more appointments");
            }
            System.out.println("I made $" + showRoomStock.getSalesCommission());
    }

}