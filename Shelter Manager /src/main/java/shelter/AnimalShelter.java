package shelter;
import models.Animal;
import models.Dog;
import models.Cat;
import java.util.LinkedList;

public class AnimalShelter {
    private LinkedList<Dog> dogs = new LinkedList<>();
    private LinkedList<Cat> cats = new LinkedList<>();
    private int order = 0;

    public void enqueue(Animal animal) {
        animal.setOrder(order++);
        if (animal instanceof Dog) {
            dogs.add((Dog) animal);
        } else if (animal instanceof Cat) {
            cats.add((Cat) animal);
        }
    }

    public Animal dequeueAny() {
        if (dogs.isEmpty()) return dequeueCat();
        if (cats.isEmpty()) return dequeueDog();
        return (dogs.peek().getOrder() < cats.peek().getOrder()) ? dequeueDog() : dequeueCat();
    }

    public Dog dequeueDog() {
        return dogs.isEmpty() ? null : dogs.poll();
    }

    public Cat dequeueCat() {
        return cats.isEmpty() ? null : cats.poll();
    }
}