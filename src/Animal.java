class Animal {
    // Task 2: Define attributes
    private String name;
    private int age;

    // Task 3: Implement constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Task 3: Define makeSound() method
    public void makeSound() {
        System.out.println("Animal makes a generic sound.");
    }

    // Task 5: Override toString() method
    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }
}



