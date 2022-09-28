public class Main {
    public static void main(String[] args) {

// Задание 1.1
        System.out.println(" Задание 1");


        byte age = 16;
        if (age >= 18) {
            System.out.println(" Поздравить с совершеннолетием ");
        }
        if (age < 18) {
            System.out.println(" Возраст совершеннолетия не наступил , необходимо  подождать ");
        }


// Задание 1.2

        System.out.println(" Задание 1.2");


        if (age > 7 && age < 18) {
            System.out.println(" Ребенок ходит в школу ");
        }
        if (age > 18 && age < 24) {
            System.out.println("Человек ходит в университет ");
        }
        if (age > 24) {
            System.out.println(" Человек ищет работу");
        }


        // Задание 1.3
        System.out.println("Задание 1.3");


        int copasity = 102;
        int seatCout = 60;
        int seatOther = copasity - seatCout;

        int seatUsed = 40;
        int otherUsed = 31;

        if (seatUsed < seatCout) {
            System.out.println("Есть " + (seatCout - seatUsed) + " сидячих мест");
        }
        if (otherUsed < seatOther) {
            System.out.println(" есть " + (seatOther - seatOther) + " стоячих мест");
        }
        if (copasity == seatUsed + otherUsed) {
            System.out.println(" мест нет");
        }

// Задание 2.1
        System.out.println(" Задание 2.1");


        byte ageMen = 16;
        if (ageMen >= 18) {
            System.out.println(" Поздравить с совершеннолетием ");
        } else {
            System.out.println(" возраст совершеннолетия ещё не наступил, и нужно немного подождать.");
        }
// Задание 2.2
        System.out.println("Задание 2.2");


        if (age > 7 && age < 18) {
            System.out.println(" Ребенок ходит в школу ");
        } else {
            System.out.println("Ребенок не ходит в школу");
        }
        if (age > 18 && age < 24) {
            System.out.println("Человек ходит в университет ");
        } else {
            System.out.println("человек не ходит в университет");
        }
        if (age > 24) {
            System.out.println(" Человек ищет работу");
        } else {
            System.out.println("Человек не ищет работу");
        }


// Задание 2.3
        System.out.println("Задание 2.3");


        int copasity2 = 102;
        int seatCout2 = 60;
        int seatOther2 = copasity2 - seatCout2;

        int seatUsed2 = 65;
        int otherUsed2 = 31;

        if (seatUsed2 < seatCout2) {
            System.out.println("Есть  сидячие места");
        } else {
            System.out.println("нет сидячих мест");
        }

        if (otherUsed2 < seatOther2) {
            System.out.println(" есть  стоячие места");
        } else {
            System.out.println(" нет стоячих мест");
        }

        if (copasity2 == seatUsed2 + otherUsed2) {
            System.out.println(" мест нет");
        } else {
            System.out.println("есть места");
        }


// Задание 3.1
        System.out.println("Задание 3.1");


        int yearsOld = 13;
        if (yearsOld > 2 && yearsOld < 6)
        {
            System.out.println("Если возраст человека равен" + yearsOld + " то ему нужно ходить в детский сад");

        } else if (yearsOld > 7 && yearsOld < 18) {
            System.out.println("Если возраст человека равен " + yearsOld + "  то ему нужно ходить в школу");

        } else if (yearsOld > 18 && yearsOld < 24) {
            System.out.println("Если возраст человека равен " + yearsOld + " то ему нужно ходить в университет");

         } else if (yearsOld >24){
            System.out.println("Если возраст человека равен " + yearsOld + " то ему нужно ходить на работу");}



// Задание 3.2
        System.out.println("Задание 3.2");
        int child = 9;
        if ( child < 5 ) {
            System.out.println("ребенок не может кататься на атракционе");
        } else if (child > 5 && child < 14 ) {
            System.out.println(" ребенок может кататься в сопровождении родителей");
        } else if (child > 14) {
            System.out.println(" ребенок может кататься без сопровождения ");}


// Задание 3.3
        System.out.println("Задание 3.3");


        short one = 1;
        short two = 2;
        short three = 3;

        if ( one > 3) {
            System.out.println("one большее число");
        } else if (two > 3) {
            System.out.println("two большее число");
        } else if (three >=3) {
            System.out.println("three большее число");
        }




    }
}