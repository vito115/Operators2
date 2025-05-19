public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задача 2");

        int clientOS1 = 1;
        int clientDeviseYear = 2014;
        if (clientOS1 == 0) {
            if (clientDeviseYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите обновленную версию приложения для iOS по ссылке");
            }
        }
        if (clientOS1 == 1) {
            if (clientDeviseYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите обновленную версию приложения для Android по ссылке");
            }
        }

        System.out.println("Задача 3");

        int year = 1684;
        if (year < 1584) {
            System.out.println("Високосный год еще не введен");
        } else {
            boolean year1 = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            if (year1) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        }

        System.out.println("Задача 4");
        int deliveryDistance = 100;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставка не доставляется");
        }

        System.out.println("Задача 5");

        int monthNumber = 13;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
        }
            if (monthNumber > 12){
                System.out.println("Программа не выполняется");
            }
        }
    }