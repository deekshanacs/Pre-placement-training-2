class Classroom {
    String className;
    String[] students;

    Classroom(String className, String[] students) {
        this.className = className;
        this.students = students;
    }

    void display() {
        System.out.println("Class Name: " + className);
        System.out.print("Students: ");
        for (String s : students) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] names = {"Asha", "Bala", "Cathy"};
        Classroom cls = new Classroom("AI & DS", names);
        cls.display();
    }
}
