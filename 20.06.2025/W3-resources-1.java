class Student {
    String name;
    int age;
    String grade;

    void display() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nGrade: " + grade);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "John";
        s.age = 15;
        s.grade = "10th";
        s.display();
    }
}
