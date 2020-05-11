package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    VirtualPet test = new VirtualPet(10, 8, 50, 0, 0);

    @Test
    public void hunger10() {
        int hunger = test.getHunger();
        assertEquals(10, hunger);
    }

    @Test
    public void thirst8() {
        int thirst = test.getThirst();
        assertEquals(8, thirst);
    }

    @Test
    public void bored50() {
        int bored = test.getBored();
        assertEquals(50, bored);
    }

    @Test
    public void tired0() {
        int tired = test.getTired();
        assertEquals(0, tired);
    }

    @Test
    public void tick0() {
        int tick = test.getTick();
        assertEquals(0, tick);
    }
}
