public class Bird extends Animal {
    private String featherColor;

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats seeds");
    }

    @Override
    public String getVoice() {
        return "Tweet Tweet";
    }

    public void fly() {
        System.out.println(getName() + " is flying");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "featherColor='" + featherColor + '\'' +
                '}';
    }
}
