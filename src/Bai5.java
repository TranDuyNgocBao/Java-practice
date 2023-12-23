import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String ID, name;
        ID = scanner.nextLine();
        name= scanner.nextLine();

        int a,b;
        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println("Welcome ID: " +ID);
        System.out.println(name);
        System.out.println("Result = " + (a+b));
    }
}
