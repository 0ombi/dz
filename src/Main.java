import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int povtoreni9;
        double chislo1;
        double chislo2;


        Scanner input = new Scanner(System.in);

        do {

            System.out.println("введите первое число");
            chislo1 = input.nextInt();

            System.out.println("ведите второе число");
            chislo2 = input.nextInt();

            System.out.println("Выбирите арифметическое действие");
            System.out.println("Сложение" + " " + "1");
            System.out.println("Вычитание" + " " + "2");
            System.out.println("Умножение" + " " + "3");
            System.out.println("Деление" + " " + "4");
            System.out.println("Квадратное уровнение" + " " + "5");

            {
                int number = input.nextInt();
                if (number == 1) {
                    System.out.println("ваше число =" + " " + (chislo1 + chislo2));
                }
                if (number == 2) {
                    System.out.println("ваше число =" + " " + (chislo1 - chislo2));
                }
                if (number == 3) {
                    System.out.println("ваше число =" + " " + (chislo1 * chislo2));
                }
                if (number == 4) {
                    System.out.println("ваше число =" + " " + (chislo1 / chislo2));
                }
                if (number == 5) {
                    System.out.println("Добавьте новую переменную ");

                    double chislo3;
                    System.out.println("введите третье число ");
                    chislo3 = input.nextInt();
                    double D = (chislo2 * chislo2) - (4 * chislo1 * chislo3);
                    if (D < 0) {
                        System.out.println("Нет корней");
                    }
                    if (D == 0) {
                        double x1 = (-chislo2 - 0) / (2 * chislo1);
                        System.out.println("ваше число =" + " " + x1);
                    }
                    if (D > 0) {
                        double x1 = (-chislo2 - Math.sqrt(D)) / (2 * chislo1);
                        double x2 = (-chislo2 + Math.sqrt(D)) / (2 * chislo1);
                        System.out.println("ваше число =" + " " + x1 + " " + x2);
                    }
                }
            }
            System.out.println("завершить программу: 0-да; 1-нет");
            povtoreni9 = input.nextInt();
        }
        while (povtoreni9 == 1);
        }
    }
    //I don`t know what is it method.
// Maybe you can help me on the lesson. Sorry im bad >_<