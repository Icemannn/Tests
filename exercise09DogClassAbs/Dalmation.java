package exercise09DogClassAbs;

public class Dalmation extends Dog {
    public Dalmation(String name, String owner, int age) {
        super(name, owner, age);
    }


    @Override
    public String toString() {
        return "Dalmation{}";
    }
}
