// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание1");
        int age1 = 17;
        {
            if (age1 >= 18) System.out.println("вам 18 или больше");
            else System.out.println("вы несовершеннолетний, нужно немного подождать.");
        }
        System.out.println("Задание2");
        int temperature = 6;
        {
            if (temperature <= 5) System.out.println("На улице " + temperature + " Градусов, нужно надеть шляпу.");
            else System.out.println("На улице " + temperature + " Градусов, можно идти без шляпы.");
        }
        System.out.println("Задание3");
        int speed = 70;
        {
            if (speed <= 60) System.out.println("можно ездить спокойно");
            else System.out.println("придется заплатить штраф");
        }
        System.out.println("Задание4");
        int age2 = 25;
        {
            if (age2 >= 2 && age2 <= 6) System.out.println("Если возраст человека равен: " + age2 + " то ему нужно ходить в детсад");
            else if (age2 >= 7 && age2 <= 17) System.out.println("Если возраст человека равен: " + age2 + " то ему нужно ходить в школу");
            else if (age2 >= 18 && age2 <= 24) System.out.println("Если возраст человека равен: " + age2 + " то ему нужно ходить в университет");
            else if (age2 > 24) System.out.println("Если возраст человека равен: " + age2 + " то он должен идти на работу.");
            else System.out.println("вы слишком молод");
        }
        System.out.println("Задание5");
        int age3 = 10;
        {
            if (age3 < 5) System.out.println("Если возраст ребенка равен " + age3 + " то ему нельзя на аттракцион");
            else if (age3 >= 5 && age3 < 14) System.out.println("Если возраст ребенка равен " + age3 + " то ему можно на аттракцион, но только со взрослыми");
            else if (age3 >=14) System.out.println("Если возраст ребенка равен " + age3 + " то ему можно на аттракцион");
            else System.out.println("вы слишком молод");
        }
        System.out.println("Задание6");
        int countHum = 102;
        {
            if (countHum < 60) System.out.println("В вагоне: " + countHum+" Человек - Там есть и стоячие и сидячие места" );
            else if (countHum >= 60 && countHum< 102) System.out.println("В вагоне: " + countHum+" Человек - Там есть только стоячие места" );
            else if (countHum == 102) System.out.println("В вагоне: " + countHum+" Человека - Мест нет" );
        }
        System.out.println("Задание7");
        int one = 1;
        int two = 2;
        int three = 3;
        {   if (one > two && one > three) System.out.println (" Первое число больше");
            else if (two > one && two > three) System.out.println (" Второе число больше");
            else if (three > one && three > two) System.out.println ("третье число больше");
        }
    }
}