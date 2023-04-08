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

    public static void task1() {
        System.out.println("Задача 1");
        int a = 50000;
        System.out.println("Значение переменной a c типом int равно " + a);
        byte b = 33;
        System.out.println("Значение переменной b c типом byte равно " + b);
        short c = 32000;
        System.out.println("Значение переменной c c типом short равно " + c);
        long d = 2147483649L;
        System.out.println("Значение переменной c c типом long равно " + d);
        float e = 2.5f;
        System.out.println("Значение переменной c c типом float равно " + e);
        double f = 3.893892889;
        System.out.println("Значение переменной c c типом double равно " + f);


    }

    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12f;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        double c = 2.786;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        int f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);

    }

    public static void task3() {
        System.out.println("Задача 3");
        short lyudmilaP = 23;
        short annaS = 27;
        short ekaterinaA = 30;
        short papers = 480;
        int students = lyudmilaP + annaS + ekaterinaA;
        int oneStudentPapers = papers / students;
        System.out.println("На каждого ученика рассчитано " + oneStudentPapers + " листов бумаги.");


    }

    public static void task4() {
        System.out.println("Задача 4");
        short bottlesPerMinute = 16 / 2;
        int workTwentyMinute = bottlesPerMinute * 20;
        System.out.println("За 20 минут машина произвела " + workTwentyMinute + " штук бутылок");
        int workOneDay = bottlesPerMinute * 60 * 24;
        System.out.println("За сутки машина произвела " + workOneDay + " штук бутылок");
        int workThreeDay = workOneDay * 3;
        System.out.println("За три дня машина произвела " + workThreeDay + " штук бутылок");
        int workOneMonth = workThreeDay * 10;
        System.out.println("За месяц машина произвела " + workOneMonth + " штук бутылок");


    }

    public static void task5() {
        System.out.println("Задача 5");
        byte white = 2;
        byte brown = 4;
        int paintsForClass = white + brown;
        short paintsForSchool = 120;
        int classes = paintsForSchool / paintsForClass;
        int paintsWhite = classes * white;
        int paintsBrown = classes * brown;
        System.out.println("В школе, где " + classes + " классов, нужно " + paintsWhite + " банок белой краски и " +
                paintsBrown + " банок коричневой краски");


    }

    public static void task6() {
        System.out.println("Задача 6");
        byte bananas = 5;
        short oneBananaWeight= 80;
        int weightBananas = bananas*oneBananaWeight;
        short milk=200;
        int milkWeight=milk/100*105;
        byte cream = 2;
        short oneCreamWeight=100;
        int weightCream = cream * oneCreamWeight;
        byte eggs = 4;
        short oneEggWeight=70;
        int weightEggs = eggs * oneEggWeight;
        int foodWeight = weightBananas+milkWeight+weightCream+weightEggs;
        System.out.println(foodWeight + " грамм");
        double dabFoodWeight=foodWeight;
        double kiloFoodWeight = dabFoodWeight / 1000;
        System.out.println(kiloFoodWeight + " килограмм");

    }
    public static void task7() {
        System.out.println("Задача 7");
        byte loseWeightKilo = 7;
        int loseWeight=loseWeightKilo*1000;
        short min =250;
        short max =500;
        int maxDays=loseWeight/min;
        int minDays=loseWeight/max;
        int averageDays=(maxDays+minDays)/2;
        System.out.println("Максимальное количество дней "+ maxDays);
        System.out.println("Минимальное количество дней "+ minDays);
        System.out.println("Среднее количество дней " + averageDays);


    }



    public static void task8() {
        System.out.println("Задача 8");
        int masha=67760;
        int denis=83690;
        int kristina=76230;
        int promotionMasha=masha/10*11;
        int promotionDenis=denis/10*11;
        int promotionKristina=kristina/10*11;
        int yearMasha=masha*12;
        int yearDenis=denis*12;
        int yearKristina=kristina*12;
        int promotionYearMasha=promotionMasha*12;
        int promotionYearDenis=promotionDenis*12;
        int promotionYearKristina=promotionKristina*12;
        int incomeMasha=promotionYearMasha-yearMasha;
        int incomeDenis=promotionYearDenis-yearDenis;
        int incomeKristina=promotionYearKristina-yearKristina;
        System.out.println("Маша теперь получает "+promotionMasha+" рублей. Годовой доход вырос на "+incomeMasha+
               " рублей");
        System.out.println("Денис теперь получает "+promotionDenis+" рублей. Годовой доход вырос на "+incomeDenis+
                " рублей");
        System.out.println("Кристина теперь получает "+promotionKristina+" рублей. Годовой доход вырос на "
                +incomeKristina+ " рублей");
    }
}