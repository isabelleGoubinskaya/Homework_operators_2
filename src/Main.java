public class Main {
    public static void main(String[] args) {
        byte clientOS = 0;
        short clientDeviceYear = 2015;
        if (clientOS == 0){
            if (clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear >= 2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("bad entry");
        }

        int year = 2022;
        if (year % 100 == year % 400 && year % 4 == 0) {
            System.out.println( "год " + year + "  является високосным");
        } else {
            System.out.println( "год " + year + " не является високосным");
        }

        var kilometers = 100;
        var delay = kilometers - 20;
        var delivery = delay / 40;
        if (kilometers < 20){
            System.out.println("delivery will take one day");
        } else {
            System.out.println("Потребуется дней: " + delivery);
        }

        short monthNumber = 12;
        switch (monthNumber){
            case 1:
                System.out.println("winter");
                break;
            case 2:
                System.out.println("winter");
                break;
            case 3:
                System.out.println("spring");
                break;
            case 4:
                System.out.println("spring");
                break;
            case 5:
                System.out.println("spring");
                break;
            case 6:
                System.out.println("summer");
                break;
            case 7:
                System.out.println("summer");
                break;
            case 8:
                System.out.println("summer");
                break;
            case 9:
                System.out.println("autumn");
                break;
            case 10:
                System.out.println("autumn");
                break;
            case 11:
                System.out.println("autumn");
                break;
            case 12:
                System.out.println("winter");
                break;

                default:
                System.out.println("Incorrect month number");
                break;
        }
    }
}