
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    private static void task1() {
        System.out.println("Задача1");
        int money = 15000;
        int totalMoney = 0;
        int i = 1;
        while (totalMoney <= 2459000) {
            totalMoney = totalMoney + money;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalMoney);
            i++;
        }
    }

    private static void task2() {
        System.out.println("Задача2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int i1 = 10; i1 >= 1; i1--) {
            System.out.print(i1 + " ");
        }
    }

    private static void task3() {
        System.out.println();
        System.out.println("Задача3");
        int population = 12000000;
        int fertilityPer1000 = population / 1000 * 17;
        int mortalityPer1000 = population / 1000 * 8;
        for (int i = 1; i <= 8; i++) {
            population = population + (fertilityPer1000 - mortalityPer1000);
            System.out.println("Год " + i + " численность населения составлет " + population);
        }
    }

    private static void task4() {
        System.out.println("Задача4");
        double money = 15000;
        int i = 1;
        while (money <= 12000000) {
            money = money + money * 0.07d;
            System.out.println(i);
            System.out.println(money);
            i++;
        }
    }

    private static void task5() {
        System.out.println("Задача5");
        double money = 15000;
        int i = 1;
        while (money <= 12000000) {
            money = money + money * 0.07d;
            i++;
            if (i % 6 == 0) {
                System.out.println(i);
            }
        }
    }

    private static void task6() {
        System.out.println("Задача6");
        int money = 15000;
        for (int i = 1; i <= 108; i++) {
            money = money + (money / 100 * 7);
            if (i % 6 == 0) {
                System.out.println("Сумма накоплений за " + i + " месяц равна " + money);
            }
        }
    }

    private static void task7() {
        System.out.println("Задача7");
        for (int dayOfTheMonth = 1; dayOfTheMonth <= 31; dayOfTheMonth = dayOfTheMonth + 7) {
            System.out.println("Сегодня пятница, " + dayOfTheMonth + " число. Необходимо подготовить отчет");
        }
    }

    private static void task8() {
        System.out.println("Задаача8");
        int start = 1823;
        int end = 2123;
        for (int i = start; i < end; i = i + 1) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
}