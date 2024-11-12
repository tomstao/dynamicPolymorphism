import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // dynamic ->> after compilation (during runtime)
        Scanner scanner = new Scanner(System.in);

        Animal animal;

        System.out.println("Enter the kind of the animal: ");
        System.out.print("Enter \"1\" for dog, or \"2\" for cat: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        }

    }
}