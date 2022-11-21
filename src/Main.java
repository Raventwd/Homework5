public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("//Task 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
         else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Task 2
        System.out.println(" ");
        System.out.println("//Task 2");
        int clientDeviceYear = 2014;
        if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите  версию приложения для iOS по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Task 3
        System.out.println(" ");
        System.out.println("//Task 3");
        int year = 2000;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год високосный");
        }
        else {
            System.out.println(year + " год не високосный");
        }
        //Task 4
        System.out.println(" ");
        System.out.println("//Task 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
           deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println("потребуется дней " +deliveryDays);

        //Task 4
        System.out.println(" ");
        System.out.println("//Task 5");
        int month = 4;
        switch (month){
            case 1:
                System.out.println("январь");
                break;
            case 2:
                System.out.println("февраль");
                break;
            case 3:
                System.out.println("март");
                break;
            case 4:
                System.out.println("апрель");
                break;
            case 5:
                System.out.println("май");
                break;
            case 6:
                System.out.println("июнь");
                break;
            case 7:
                System.out.println("июль");
                break;
            case 8:
                System.out.println("август");
                break;
            case 9:
                System.out.println("сентябрь");
                break;
            case 10:
                System.out.println("октябрь");
                break;
            case 11:
                System.out.println("ноябрь");
                break;
            case 12:
                System.out.println("декабрь");
                break;
        default:
                System.out.println("Такого месяца не существует");
                break;

        }
    }
}