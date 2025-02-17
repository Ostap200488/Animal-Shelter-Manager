package shelter;

import models.Dog;
import models.Cat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nAnimal Shelter Manager");
            System.out.println("1. Enqueue Dog");
            System.out.println("2. Enqueue Cat");
            System.out.println("3. Adopt Any Animal");
            System.out.println("4. Adopt a Dog");
            System.out.println("5. Adopt a Cat");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter Dog's name: ");
                    String dogName = scanner.nextLine();
                    shelter.enqueue(new Dog(dogName));
                    System.out.println(dogName + " has been added to the shelter.");
                    break;

                case 2:
                    System.out.print("Enter Cat's name: ");
                    String catName = scanner.nextLine();
                    shelter.enqueue(new Cat(catName));
                    System.out.println(catName + " has been added to the shelter.");
                    break;

                case 3:
                    var anyAnimal = shelter.dequeueAny();
                    if (anyAnimal != null) {
                        System.out.println("You adopted: " + anyAnimal.getName());
                    } else {
                        System.out.println("No animals available for adoption.");
                    }
                    break;

                case 4:
                    var adoptedDog = shelter.dequeueDog();
                    if (adoptedDog != null) {
                        System.out.println("You adopted a dog: " + adoptedDog.getName());
                    } else {
                        System.out.println("No dogs available for adoption.");
                    }
                    break;

                case 5:
                    var adoptedCat = shelter.dequeueCat();
                    if (adoptedCat != null) {
                        System.out.println("You adopted a cat: " + adoptedCat.getName());
                    } else {
                        System.out.println("No cats available for adoption.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}