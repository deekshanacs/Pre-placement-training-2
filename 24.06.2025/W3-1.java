class Cat {
    String name;
    int age;

    Cat() {
        name = "Unknown";
        age = 0;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.display();
    }
}
