public class Blowfish extends Fish {
    private boolean isInflated;

    public Blowfish(String name, int age, double weight, boolean isFreshWater, boolean isInflated) {
        super(name, age, weight, isFreshWater);
        this.isInflated = isInflated;
    }

    public boolean isInflated() {
        return isInflated;
    }

    public void setInflated(boolean inflated) {
        isInflated = inflated;
    }

    public void inflate() {
        System.out.println(getName() + " is inflating...");
        this.isInflated = true;
    }

    @Override
    public String toString() {
        return "Blowfish{" +
                "isInflated=" + isInflated +
                '}';
    }
}
