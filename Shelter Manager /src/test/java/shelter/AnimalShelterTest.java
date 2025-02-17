package shelter;
import models.Dog;
import models.Cat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnimalShelterTest {
    @Test
    void testEnqueueDequeue() {
        AnimalShelter shelter = new AnimalShelter();
        Dog dog1 = new Dog("Rex");
        Cat cat1 = new Cat("Mittens");
        shelter.enqueue(dog1);
        shelter.enqueue(cat1);
        assertEquals("Rex", shelter.dequeueAny().getName());
        assertEquals("Mittens", shelter.dequeueAny().getName());
    }

    @Test
    void testDequeueDog() {
        AnimalShelter shelter = new AnimalShelter();
        shelter.enqueue(new Dog("Charlie"));
        shelter.enqueue(new Cat("Lily"));
        assertEquals("Charlie", shelter.dequeueDog().getName());
        assertNull(shelter.dequeueDog());
    }

    @Test
    void testDequeueCat() {
        AnimalShelter shelter = new AnimalShelter();
        shelter.enqueue(new Dog("Bruno"));
        shelter.enqueue(new Cat("Kitty"));
        assertEquals("Kitty", shelter.dequeueCat().getName());
        assertNull(shelter.dequeueCat());
    }
}