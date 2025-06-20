class Teacher {
    String name, subject;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void display() {
        System.out.println(name + " teaches " + subject);
    }

    public static void main(String[] args) {
        Teacher[] teachers = {
            new Teacher("Mr. Smith", "Math"),
            new Teacher("Mrs. Clark", "Science")
        };
        for (Teacher t : teachers) t.display();
    }
}
