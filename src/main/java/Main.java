import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the dealership!");
        CarList inventory = new CarList();

        // creating instances of Car class and adding them to the list
        Car volt = new Car("Volt", "Chevy", 4000);
        inventory.addToCarList(volt);
        Car porsche = new Car("911", "Porsche", 200000);
        inventory.addToCarList(porsche);
        Car sienna = new Car("Sienna", "Toyota", 30000);
        inventory.addToCarList(sienna);
        Car tesla = new Car("Model 3", "Tesla", 70000);
        inventory.addToCarList(tesla);
        Car ram = new Car("Ram", "Dodge", 40000);
        inventory.addToCarList(ram);


        while(checkInventoryStillHasVehicles()){
                nextAppointment();
            }

        double commissionRate = .20;
        System.out.println("All appointments complete for the day!");
        System.out.print("Total commission for today is: $");
        System.out.println(CarList.totalSales * commissionRate);

        }

    private static Integer recieveAndProcessUserInput() {
        //Capture user input method
        System.out.println("Which car would you like to purchase?");
        Scanner scanner = new Scanner(System.in);
        Integer carChoice = scanner.nextInt();

        //Method to check user input
        if(checkUserInput(carChoice)) {
            return carChoice;
        }

        recieveAndProcessUserInput();
        return null;
    }

    private static boolean checkUserInput(Integer carChoice) {
        if(CarList.getCarInventory().size() < (carChoice)){
            System.out.println("Please enter a valid number!");
            return false;
        } else {
            CarList.removeFromInventory(carChoice);
            return true;
        }
    }

    private static boolean checkInventoryStillHasVehicles(){
        if(CarList.getCarInventory().size() >= 1){
            return true;
        }
        return false;
    }

    private static void nextAppointment() {
        CarList.printCarList();

        recieveAndProcessUserInput();
    }
}

