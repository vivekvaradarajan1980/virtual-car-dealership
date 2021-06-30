import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the dealership!");

        Car volt = new Car("Volt", "Chevy",4000);
        Car porsche = new Car("911", "Porsche",200000);

        List<Car> carInventory = new ArrayList();

        carInventory.add(volt);
        carInventory.add(porsche);

        System.out.print(carInventory.get(0).getMake() + " ");
        System.out.print(carInventory.get(0).getModel() + " ");
        System.out.println("$" + carInventory.get(0).getPrice());
    }
}