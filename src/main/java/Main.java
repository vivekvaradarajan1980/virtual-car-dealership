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

        List<Car> carList = new ArrayList();
        ShowRoom showRoomStock = new ShowRoom(carList);

        showRoomStock.addToInventory(volt);
        showRoomStock.addToInventory(porsche);
        showRoomStock.addToInventory(honda);

        showRoomStock.DisplayInventory();


        System.out.println("Hey, What car make you want to buy ?");

        Scanner carChoiceScanner = new Scanner(System.in);  // Create a Scanner object

        String carMake = carChoiceScanner.nextLine();  // Read user input

        System.out.println("Hey, What car model you want to buy ?");
        String carModel = carChoiceScanner.nextLine();  // Read user input
        Car chosenCar=showRoomStock.findCar(carMake, carModel);
        if (chosenCar != null) {
            System.out.println("Price of your car is: " + showRoomStock.findCar(carMake, carModel).getPrice());
            System.out.println("Do you want to buy it Y/N?");
            String buyOrNo = carChoiceScanner.nextLine();  // Read user input

            if (buyOrNo.equals("Y")) {
                showRoomStock.removeFromInventory(chosenCar);

            }
        }
        else
            System.out.println("Not available");

        showRoomStock.DisplayInventory();

    }

}