import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        System.out.println("Задание 1");
        int year = 2024;
        if (tryLeapYear(year)) {
            System.out.println(year + " год — високосный год");
        }
        else {
            System.out.println(year + " год — невисокосный год");
        }
        System.out.println("Задание 2");
        findSuitableVersion(1, 2024);
        System.out.println("Задание 3");
        isShippingAvailable(95);
    }


    public static boolean tryLeapYear(int year) {
        boolean isLeap;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            isLeap = true;
        }
        else {
            isLeap = false;
        }
        return isLeap;
    }


    public static void findSuitableVersion(int clientDeviceOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientDeviceOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientDeviceOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else if (clientDeviceOS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Неправильно введены данные");
        }
    }


    public static void isShippingAvailable (int deliveryDistance) {
        if (deliveryDistance < 1) {
            System.out.println("Расстояние введено неверно");
        }
        else if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + 1);
        }
        else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + 2);
        }
        else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + 3);
        }
        else {
            System.out.println("Доставки нет");
        }
    }
}