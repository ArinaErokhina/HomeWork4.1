public class Main {
    public static void main(String[] args) {
        System.out.println("Hello ");
    //Задание 1

        var clientOS = 1;
        if ( clientOS == 0)
            {System.out.println("Установите версию приложения для iOS по ссылке");}
        else if ( clientOS == 1)
            {System.out.println("Установите версию приложения для Android по ссылке");}

    //Задание 2

        var clientDeviceYear = 2013;
        if ( clientOS == 1 && clientDeviceYear < 2015)
            {System.out.println("Установите облегченную версию приложения для Android по ссылке");}
        if ( clientOS ==0 && clientDeviceYear < 2015)
            {System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
        if (clientOS == 1 && clientDeviceYear >= 2015)
            {System.out.println("Установите версию приложения для Android по ссылке");}
        if (clientOS == 0 && clientDeviceYear >= 2015)
            {System.out.println("Установите версию приложения для iOS по ссылке");}

    //Задание 3


        int year = 2024;
        if (year % 4 == 0){
            if ((year % 100 != 0) || (year % 400 == 0))
                {System.out.println(+ year + " год является високосным");}
            else
                {System.out.println(+ year + " год является не високосным");}}
        else
            {System.out.println(+ year + " год является не високосным");}

    //Задание 4

        var deliveryDistance = 110;

        var distanceTo20 = 1;
        var distanceFrom20To60 = 2;
        var distanceFrom60To100 = 3;

        if (deliveryDistance < 20)
            {System.out.println("Потребуется дней: " +distanceTo20);}
        if (deliveryDistance > 20 && deliveryDistance < 60)
            {System.out.println("Потребуется дней: " +distanceFrom20To60);}
        if (deliveryDistance > 60 && deliveryDistance <100)
            {System.out.println("Потребуется дней: " +distanceFrom60To100);}
        if (deliveryDistance > 100)
            {System.out.println("Доставка не осуществляется.");}


    //Задание 5
        int monthNumber = 17;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                {System.out.println("Зимний месяц");}
                break;
            case 3:
            case 4:
            case 5:
                {System.out.println("Весенний месяц");}
                break;
            case 6:
            case 7:
            case 8:
                {System.out.println("Летний месяц");}
                break;
            case 9:
            case 10:
            case 11:
                {System.out.println("Осенний месяц");}
                break;
            default:
                {System.out.println("Не является месяцем");}}










    }






    }
