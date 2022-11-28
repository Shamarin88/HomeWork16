public class Main {
    public static void printSeparator() {
        System.out.println("========================");
    }
    public static void main(String[] args) {
        Car BMW = new Car("BMW","M3",2015,"Германия","Черный",230,1.8,"Автоматическая","Седан","е777кх777",5,"Летние");
        printSeparator();
        System.out.println(BMW);
        BMW.refill();

        printSeparator();

        Train lastochka = new Train("Ласточка", "B-901",2011,"Россия","Белый",310,3500,3,"Белорусский вокзал","Минск-Пассажирский",11);
        System.out.println(lastochka);
        lastochka.refill();

        printSeparator();

        Train leningrad = new Train("Ленинград","D-125",2019,"Россия","Красный",270,1700,5,"Ленинградский вокзал","Ленинград-Пассажирский",8);
        leningrad.refill();
        System.out.println(leningrad);

        printSeparator();

        Autobus ekarus = new Autobus("Ekarus", "700",1988,"Болгария","Красно-Белый",80);
        System.out.println(ekarus);
        ekarus.refill();

        printSeparator();

        Autobus gazel = new Autobus("Газель", "Next",2005,"Россия","Белый", 100);
        System.out.println(gazel);
        gazel.refill();

        printSeparator();

        Autobus gaz = new Autobus("ГАЗ", "", 1985,"Россия","Синий",80);
        System.out.println(gaz);
        gaz.refill();
        printSeparator();

    }
}