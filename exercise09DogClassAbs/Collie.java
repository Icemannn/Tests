package exercise09DogClassAbs;

public class Collie extends Dog{
    boolean isPureBreed;

    public Collie(String name, String owner, int age, boolean isPureBreed) {
        super(name, owner, age);
        this.isPureBreed = isPureBreed;
    }

    public boolean isPureBreed() {
        return isPureBreed;
    }

    public void setPureBreed(boolean pureBreed) {
        isPureBreed = pureBreed;
    }

    @Override
    public String toString() {
        super.toString();
        return "Collie{" +
                "isPureBreed=" + isPureBreed +
                '}';
    }
}
