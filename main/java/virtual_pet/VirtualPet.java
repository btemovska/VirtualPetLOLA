package virtual_pet;

public class VirtualPet {
    private int hunger;
    private int thirst;
    private int bored;
    private int tired;
    private int tick;

    public VirtualPet(int hunger, int thirst, int bored, int tired, int tick) {
        this.hunger = hunger;
        this.thirst = thirst;
        this.bored = bored;
        this.tired = tired;
        this.tick = tick;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBored() {
        return bored;
    }

    public int getTired() {
        return tired;
    }

    public int getTick() {
        return tick;
    }

    public void feed(int amount) {
        hunger -= amount;
        thirst += 1;
    }

    public void drink(int amount) {
        thirst -= amount;
    }

    public void play(int amount) {
        bored -= 1;
    }

    public void sleep(int amount) {
        tired -= 1;
    }

    public void tick(int amount) {
        hunger += 1;
        thirst += 1;
    }
}