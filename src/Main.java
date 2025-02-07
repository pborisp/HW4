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

        // Задача №4
        System.out.println("Задача №4:");
        int deliveryDistance = 95;
        int distance1 = 20;
        int distance2 = 60;
        int distance3 = 100;
        if (deliveryDistance <= distance1) {
            System.out.println("Потребуется дней: 1 сутки доставки");
        } else if (deliveryDistance > distance1 && deliveryDistance <= distance2) {
            System.out.println("Потребуется дней: 2 суток доставки");
        } else if (deliveryDistance > distance2 && deliveryDistance <= distance3) {
            System.out.println("Потребуется дней: 3 суток доствки");
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println();

        // Задача №5
        System.out.println("Задача №5:");
        int monthNumber = 12;
        switch (monthNumber) {
            case (1) :
                System.out.println(monthNumber+"-й месяц (январь) принадлежит к сезону зима");
                break;
            case (2) :
                System.out.println(monthNumber+"-й месяц (февраль) принадлежит к сезону зима");
                break;
            case (3) :
                System.out.println(monthNumber+"-й месяц (март) принадлежит к сезону весна");
                break;
            case (4) :
                System.out.println(monthNumber+"-й месяц (апрель) принадлежит к сезону весна");
                break;
            case (5) :
                System.out.println(monthNumber+"-й месяц (май) принадлежит к сезону весна");
                break;
            case (6) :
                System.out.println(monthNumber+"-й месяц (июнь) принадлежит к сезону лето");
                break;
            case (7) :
                System.out.println(monthNumber+"-й месяц (июль) принадлежит к сезону лето");
                break;
            case (8) :
                System.out.println(monthNumber+"-й месяц (август) принадлежит к сезону лето");
                break;
            case (9) :
                System.out.println(monthNumber+"-й месяц (сентябрь) принадлежит к сезону осень");
                break;
            case (10) :
                System.out.println(monthNumber+"-й месяц (октябрь) принадлежит к сезону осень");
                break;
            case (11) :
                System.out.println(monthNumber+"-й месяц (ноябрь) принадлежит к сезону осень");
                break;
            case (12) :
                System.out.println(monthNumber+"-й месяц (декабрь) принадлежит к сезону зима");
                break;
            default :
                System.out.println("Ошибка! Неверно указан номер месяца");
                break;
        }
        System.out.println();
    }
}