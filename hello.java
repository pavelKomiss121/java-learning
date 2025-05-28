import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Напиши имя: ");
        String text = scanner.nextLine();
        System.out.println("Hello, " + text + " !");

    }
}
