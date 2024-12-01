public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];

        animals[0] = new Dog("Paws", 4, 21.37, true, "German Shepherd");
        animals[1] = new Pigeon("Angel", 3, 0.6, "Gray", "Rock Pigeon");
        animals[2] = new Blowfish("Puff", 2, 1.5, true, false);
        animals[3] = new Mammal("Bear", 5, 230.7, true);
        animals[4] = new Bird("Parrot", 2, 0.71, "Orange");
        animals[5] = new Fish("Nemo", 1, 0.3, true);

        for (Animal animal : animals) {
            System.out.println(animal);
            animal.eat();
            System.out.println("Voice: " + animal.getVoice());
            System.out.println();
        }

        ((Dog) animals[0]).fetch();
        ((Pigeon) animals[1]).deliverMessage();
        ((Blowfish) animals[2]).inflate();
    }
}
