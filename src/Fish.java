public class Fish extends Animal {
    private boolean isFreshWater;

    public Fish(String name, int age, double weight, boolean isFreshWater) {
        super(name, age, weight);
        this.isFreshWater = isFreshWater;
    }

    public boolean isFreshWater() {
        return isFreshWater;
    }

    public void setFreshWater(boolean freshWater) {
        isFreshWater = freshWater;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats something smaller");
    }

    @Override
    public String getVoice() {
        return "Blub Blub";
    }

    public void swim() {
        System.out.println(getName() + " is swimming");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "isFreshWater=" + isFreshWater +
                '}';
    }
}
