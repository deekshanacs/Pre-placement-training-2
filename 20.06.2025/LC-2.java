import java.util.Scanner;

class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = "student", pass = "school123";
        System.out.print("Enter username: ");
        String u = sc.nextLine();
        System.out.print("Enter password: ");
        String p = sc.nextLine();

        if (u.equals(user) && p.equals(pass))
            System.out.println("Login Successful");
        else
            System.out.println("Invalid Credentials");
    }
}
