package zoo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class AnimalTest {
    @Test
    void testGetName() {
        Lion lion = new Lion("Simba");
        assertEquals("Simba", lion.getName());
    }

    @Test
    void testMakeSoundNormal() {
        Lion lion = new Lion("Leo");
        assertDoesNotThrow(() -> lion.makeSound(3));
    }

    @Test
    void testMakeSoundEdgeCaseZero() {
        Elephant elephant = new Elephant("Ella");
        assertDoesNotThrow(() -> elephant.makeSound(0));
    }

    @Test
    void testMakeSoundEdgeCaseOne() {
        Monkey monkey = new Monkey("Momo");
        assertDoesNotThrow(() -> monkey.makeSound(1));
    }

    @Test
    void testMakeSoundEdgeCaseHigh() {
        Lion lion = new Lion("Max");
        assertDoesNotThrow(() -> lion.makeSound(100));
    }

    @Test
    void testAbstractMethodImplementation() {
        Animal lion = new Lion("Leo");
        assertNotNull(lion);
        assertDoesNotThrow(() -> lion.makeSound());
    }
}