import java.util.ArrayList;
import java.util.List;

public class CarList {
        //Creating an empty list to add car instances to
        static List<Car> carInventory = new ArrayList();
        static float totalSales = 0;

    public CarList() {
        this.carInventory = carInventory;
    }

    public static List<Car> getCarInventory() {
        return carInventory;
    }

    public void addToCarList(Car car) {
        this.carInventory.add(car);
    }

    public static void printCarList() {
        //Iterates through the array and prints the car's number and information about the car.
        for (int i = 0; i < carInventory.size(); i++) {
            System.out.print( (i + 1) + " ");
            carInventory.get(i).carInfo();
        }
    }

    public static void removeFromInventory(Integer carChoice) {
        totalSales += (carInventory.get(carChoice - 1).getPrice());
        carInventory.remove(carChoice - 1);
    }
}
