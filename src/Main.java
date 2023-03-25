import classes.pets;

public class Main {
    public static void main(String[] args) {

        pets myPet = new pets("Fido", "Dog", "shih tzu");

        System.out.println("My pet named " + myPet.getName() + ", is "+ myPet.getType() + ", of race " + myPet.getRace());
    }
}