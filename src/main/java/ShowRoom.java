import java.util.List;

public class ShowRoom {


    private List<Car> carInventory;

    public ShowRoom(List<Car> carInventory) {
        this.carInventory = carInventory;
    }


    public Car findCar(String make, String model){

        for (int i = 0; i < this.carInventory.size(); i++) {
            if(this.carInventory.get(i).getMake().equals(make) &&
            this.carInventory.get(i).getModel().equals(model)){
                return this.carInventory.get(i);
            }

        }

        return null;
    }


    public void removeFromInventory(Car car){

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
