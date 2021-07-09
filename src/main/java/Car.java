import java.util.List;

public class Car {

   private String model;

   private String make;

   private Integer price;

   private boolean isAvailable;

    public Car(String model, String make, Integer price) {
        this.model = model;
        this.make = make;
        this.price = price;
        this.isAvailable = true;
    }

    public String getModel() {
        return model;
    }
                                                                      
    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }


}
