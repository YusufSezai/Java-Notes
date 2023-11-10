package classes;

public class Dog {
    String name;
    String breed;

    Dog(String n, String b) {
        name = n;
        breed = b;
    }

    Dog(Dog d) {
        name = d.name;
        breed = d.breed;
    }



    public static void main(String[] args) {
        Dog dog1 = new Dog("Marceline", "German Shepherd");
        Dog dog2 = new Dog(dog1);
        dog2.name = "Cajun";
        dog2.breed = "Belgian Malinois";

        System.out.println(dog1.name + " " + dog1.breed);
        System.out.println(dog2.name + " " + dog2.breed);
        System.out.println(dog2 == dog1);
    }
}
