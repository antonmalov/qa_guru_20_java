public class Main {
    public static void main(String[] args) {

        System.out.println("сложение int: " + sumInt(32_000, 50_000));
        System.out.println("умножение int с выходом за пределы " + multiplicationInt(13_000_000, 10_000_000));
        System.out.println("вычитание из double int " + increaseNum(3.4, 2));
        System.out.println("деление int на double " + divisionNum(5, 2.5));
        System.out.println("деление int на int с отсеканием остатка " + divisionNum(5, 2));
        System.out.println("сравнение int " + compareInt(5, 3));
        System.out.println("сравнение int " + compareInt(1, 3));
        System.out.println("получение остатка от деления " + remainsDivision(10, 3));
        System.out.println("инкрементация на 1 полученного int " + incrementInt(5));
    }


    public static int sumInt(int num1, int num2) {
        return num1 + num2;
    }

    public static int multiplicationInt(int num1, int num2) {
        return num1 * num2;
    }

    public static double increaseNum(double num1, int num2) {
        return num1 - num2;
    }

    public static double divisionNum(int num1, double num2) {
        return num1 / num2;
    }

    public static double divisionNum(int num1, int num2) {
        return num1 / num2;
    }


    public static int sumByte(byte num1, byte num2) {
        return num1 + num2;
    }

    public static boolean compareInt(int num1, int num2) {
        return num1 > num2;
    }

    public static int remainsDivision(int num1, int num2) {
        return num1 % num2;
    }

    public static int incrementInt(int num) {
        return ++num;
    }
}
