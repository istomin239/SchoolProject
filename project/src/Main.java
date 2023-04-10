import java.util.Scanner;

public class Main {
    static void menu() {
        System.out.println("Выберите пункт меню:");
        System.out.println("0 - выход");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reqest;
        do {
            menu();
            reqest = sc.nextInt();
        } while (reqest != 0);
    }
}
