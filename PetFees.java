import java.util.ArrayList;

public class PetFees {
    private static ArrayList<Pet> pets = new ArrayList<Pet>();

    public static void main(String[] args) {
        monthlyFees();
    }

    private static void monthlyFees() {
        Dog d1 = new Dog(80, 5.00);
        Dog d2 = new Dog(95, 5.00);
        pets.add(d1);
        pets.add(d2);

        Cat c1 = new Cat(10, 3);
        Cat c2 = new Cat(10, 3);
        pets.add(c1);
        pets.add(c2);

        Monkey m1 = new Monkey(15, 4);
        Monkey m2 = new Monkey(12, 4);
        pets.add(m1);
        pets.add(m2);


        double sum = 0;
        for (Pet pet: pets) {
            sum += pet.calcFee();
        }

        System.out.println(sum);

    }
}