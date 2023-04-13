import java.util.Random;
import java.util.Scanner;

public class Main {
    static void menu() {
        System.out.println("Выберите пункт меню:");
        System.out.println("0 - выход");
        System.out.println("1 - добавить точку");
        System.out.println("2 - список точек");
        System.out.println("3 - добавить случайные точки");
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

    static void show() {
        System.out.println("Точки группы №1:");
        for (int i = 0; i < count1; i++) {
            System.out.printf("%.3f, %.3f\n", x1[i], y1[i]);
        }
        System.out.println("Точки группы №2:");
        for (int i = 0; i < count2; i++) {
            System.out.printf("%.3f, %.3f\n", x2[i], y2[i]);
        }
    }

    static void rnd(Scanner sc) {
        System.out.println("Введите количество случайных точек, которое хотите добавить: int");
        int count = sc.nextInt();
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            if (rand.nextBoolean()) {
                x1[count1] = rand.nextDouble() * 10 - 5;
                y1[count1] = rand.nextDouble() * 10 - 5;
                count1++;
            } else {
                x2[count2] = rand.nextDouble() * 10 - 5;
                y2[count2] = rand.nextDouble() * 10 - 5;
                count2++;
            }
        }
        System.out.println("Точки добавлены");
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
                case 2:
                    show(); break;
                case 3:
                    rnd(sc); break;
                default:
                    System.out.println("Нет такого варианта. Читай внимательней."); break;
            }
        } while (reqest != 0);
    }
}
