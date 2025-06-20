class Student {
    String name; int roll;

    Student(String n, int r) {
        name = n; roll = r;
    }

    void show() {
        System.out.println(name + " | Roll No: " + roll);
    }

    public static void main(String[] args) {
        Student s = new Student("Anita", 101);
        s.show();
    }
}
