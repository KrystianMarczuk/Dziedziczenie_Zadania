public class Pigeon extends Bird {
    private String species;

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats bread");
    }

    @Override
    public String getVoice() {
        return "Gru Gru";
    }

    public void deliverMessage() {
        System.out.println(getName() + " delivers message");
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "species='" + species + '\'' +
                '}';
    }
}
