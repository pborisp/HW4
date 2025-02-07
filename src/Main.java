public class Main {
    public static void main(String[] args) {
        // Задача №1
        System.out.println("Задача №1:");
        byte clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        System.out.println();

        // Задача №2
        System.out.println("Задача №2:");
        int clientDeviceYear = 2015;
        clientOS = 1;
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        System.out.println();

        // Задача №3
        System.out.println("Задача №3:");
        int year = 2021;
        int startYear = 1584;
        int count1 = (year - startYear) % 400;
        int count2 = (year - startYear) % 100;
        int count3 = (year - startYear) % 4;
        if (count1 == 0) {
            System.out.println(year + " год является високосным");
        } else if (count1 != 0 && count2 == 0) {
            System.out.println(year + " год не является високосным");
        } else if (count2 != 0 && count3 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println();
    }
}