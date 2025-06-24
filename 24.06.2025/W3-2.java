class Dog {
    String name;
    String color;

    Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    void display() {
        System.out.println("Name: " + name + ", Color: " + color);
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Tommy", "Brown");
        dog.display();
    }
}
