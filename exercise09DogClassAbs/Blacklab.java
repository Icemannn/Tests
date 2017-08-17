package exercise09DogClassAbs;

public class Blacklab extends Dog{
    private double price;


    public Blacklab(String name, String owner, int age, double price) {
        super(name, owner, age);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
