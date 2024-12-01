public class Mammal extends Animal {
    private boolean hasFur;

    public Mammal(String name, int age, double weight, boolean hasFur) {
        super(name, age, weight);
        this.hasFur = hasFur;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats milk");
    }

    @Override
    public String getVoice() {
        return "Generic Mammal Sound";
    }

    public void walk() {
        System.out.println(getName() + " is walking");
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "hasFur=" + hasFur +
                '}';
    }
}
