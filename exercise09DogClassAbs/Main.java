package exercise09DogClassAbs;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Blacklab> blacklabs = new ArrayList<>();
        ArrayList<Collie> collies = new ArrayList<>();
        ArrayList<Dalmation> dalmations = new ArrayList<>();

        blacklabs.add(new Blacklab("Blackie", "Mitko", 4, 5.5));
        blacklabs.add(new Blacklab("Josy", "Petko Petkov", 12, 555.5));
        blacklabs.add(new Blacklab("Jacky", "John Johnson", 7, 49.8));

        collies.add(new Collie("Lasi", "Steve", 2, false));
        collies.add(new Collie("Lasi", "Matt Mattson", 3, true));

        dalmations.add(new Dalmation("101", "Cruela", 101));


        System.out.println(blacklabs);


    }
}
