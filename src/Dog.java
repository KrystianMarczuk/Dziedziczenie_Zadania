public class Dog extends Mammal {
    private String breed;

    public Dog(String name, int age, double weight, boolean hasFur, String breed) {
        super(name, age, weight, hasFur);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats meat");
    }

    @Override
    public String getVoice() {
        return "Woof Woof";
    }

    public void fetch() {
        System.out.println(getName() + " if Fetching the ball!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
