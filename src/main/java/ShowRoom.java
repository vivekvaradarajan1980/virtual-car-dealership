import java.util.List;

public class ShowRoom {


    private List<Car> carInventory;

    private double salesCommission=0;

    public double getSalesCommission() {
        return salesCommission;
    }

    public int getNumberOfCars() {
        return carInventory.size();
    }

    public ShowRoom(List<Car> carInventory) {
        this.carInventory = carInventory;
    }


    public Car findCar(String make, String model, int price){

        for (int i = 0; i < this.carInventory.size(); i++) {
            if(this.carInventory.get(i).getMake().toLowerCase().equals(make.toLowerCase()) &&
            this.carInventory.get(i).getModel().toLowerCase().equals(model.toLowerCase()) &&
            this.carInventory.get(i).getPrice()==price){
                return this.carInventory.get(i);
            }

        }

        return null;
    }


    public void removeFromInventory(Car car){

        int carPos = this.carInventory.indexOf(car);
        this.salesCommission += 0.2*this.carInventory.get(carPos).getPrice();
        this.carInventory.remove(car);
    }
    public void addToInventory(Car car){
        this.carInventory.add(car);
    }

    public void DisplayInventory(){

        for (int i = 0; i < this.carInventory.size(); i++) {

                System.out.print(this.carInventory.get(i).getMake() + " ");
                System.out.print(this.carInventory.get(i).getModel() + " ");
                System.out.println("$" + this.carInventory.get(i).getPrice());

        }
    }
}
