class Car {
    String make;
    String model;
    int year;

    Car(String make, String model, int year) {
        this.make = (make == null || make.isEmpty()) ? "Unknown" : make;
        this.model = (model == null || model.isEmpty()) ? "Standard" : model;
        this.year = (year <= 0) ? 2023 : year;
    }

    void display() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        Car c1 = new Car("Honda", "Civic", 2022);
        Car c2 = new Car("", "", -1);
        c1.display();
        c2.display();
    }
}
