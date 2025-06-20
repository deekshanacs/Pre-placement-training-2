import java.util.Scanner;

class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. View Student\n2. View Teacher");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> System.out.println("Student: Ram, Grade 10");
            case 2 -> System.out.println("Teacher: Shyam, English");
            default -> System.out.println("Invalid Choice");
        }
    }
}
