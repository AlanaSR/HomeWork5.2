public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, Куратор!");

        System.out.println("Задача 1");
        int stash = 15000;
        int total = 0;
        int month = 0;
        while (total <= 2459000) {
            month = month + 1;
            total = total + stash;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей.");
        }

        System.out.println("Задача 2");
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();
        for (int b = 10; b >= 1; b--) {
            System.out.print(b + " ");
        }

        System.out.println("Задача 3");
        int country = 12000000;
        int birthRate = country / 1000 * 17;
        int deathRate = country / 1000 * 8;
        int year = 0;
        while (year < 10) {
            country = country + birthRate - deathRate;
            year++;
            System.out.println("Год " + year + " численность населения составляет " + country + ".");
        }

        System.out.println("Задача 4");
        int deposit = 15000;
        int mnth = 0;
        while (deposit <= 12000000) {
            deposit = deposit + deposit / 100 * 7;
            mnth++;
            System.out.println("Месяц " + mnth + ", сумма накоплений равна " + deposit + " рублей.");
        }

        System.out.println("Задача 5");
        int Deposit = 15000;
        int Mnth = 0;
        while (Deposit <= 12000000) {
            Deposit = Deposit + Deposit / 100 * 7;
            Mnth++;
            if (Mnth % 6 == 0) {
                System.out.println("Месяц " + Mnth + ", сумма накоплений равна " + Deposit + " рублей.");
            }
        }

        System.out.println("Задача 6");
        int contribution = 15000;
        int term = 0;
        while (term <= 9 * 12) {
            contribution = contribution + contribution / 100 * 7;
            term++;
            if (term % 6 == 0) {
                System.out.println("Месяц " + term + ", сумма накоплений равна " + contribution + " рублей.");
            }
        }

        System.out.println("Задача 7");
        for (int friday = 3; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }

        System.out.println("Задача 8");
        int comet = 0;
        int currentYear = 2024;
        int startPeriod = currentYear-200;
        int endPeriod = currentYear+100;
        while (comet <= endPeriod) {
            comet = comet + 79;
            if (comet >= startPeriod) {
                System.out.println(comet + " году пролетает комета.");
            }
        }

    }
}
