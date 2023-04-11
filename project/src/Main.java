import java.util.Scanner;

public class Main {
    static void menu() {
        System.out.println("Выберите пункт меню:");
        System.out.println("0 - выход");
        System.out.println("1 - добавить точку");
    }

    static double[] x1 = new double[100];
    static double[] y1 = new double[100];
    static int count1;
    static double[] x2 = new double[100];
    static double[] y2 = new double[100];
    static int count2;
    static void add(Scanner sc) {
        System.out.println("Введите номер группы точки и её координаты: int, double, double");
        int set = sc.nextInt();
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (set == 1) {
            if (count1 < 100) {
                x1[count1] = x;
                y1[count1] = y;
                count1++;
                System.out.printf("точка (%.1f, %.1f) добавлена в группу №1\n", x, y);
            } else
                System.out.println("группа №1 заполнена полностью");
        } else if (set == 2) {
            if (count2 < 100) {
                x2[count2] = x;
                y2[count2] = y;
                count2++;
                System.out.printf("точка (%.3f, %.3f) добавлена во группу №2\n", x, y);
            } else
                System.out.println("группа №2 заполнена полностью");
        } else {
            System.out.println(set + " - недопустимое значение группы");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reqest;
        do {
            menu();
            reqest = sc.nextInt();
            switch (reqest) {
                case 1:
                    add(sc); break;
                default:
                    System.out.println("Нет такого варианта. Читай внимательней."); break;
            }
        } while (reqest != 0);
    }
}
