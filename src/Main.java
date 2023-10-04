public class Main {
    public static void main(String[] args) {

        Animal genericAnimal = new Animal("Generic Animal", 5);
        Mammal lion = new Mammal("Lion", 10, "Yellow");
        Bird eagle = new Bird("Eagle", 3, 2.5);
        Dog goldenRetriever = new Dog("Buddy", 2, "Golden", "Golden Retriever");
        
        genericAnimal.makeSound();
        System.out.println("Generic Animal Attributes:\n" + genericAnimal.toString() + "\n");

        lion.makeSound();
        System.out.println("Lion Attributes:\n" + lion.toString() + "\n");

        eagle.makeSound();
        System.out.println("Eagle Attributes:\n" + eagle.toString() + "\n");

        goldenRetriever.makeSound();
        System.out.println("Golden Retriever Attributes:\n" + goldenRetriever.toString() + "\n");
    }
}