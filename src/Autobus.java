public class Autobus extends Transport{

    public Autobus(String brand, String model, int productionYear, String productionCountry, String color, Integer maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
    }

    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином или дизелем на заправке");
    }

    @Override
    public String toString() {
        return "\nНазвание - " + getBrand() +
                "\nМодель - " + getModel() +
                "\nГод выпуска - " + getProductionYear() +
                "\nСтрана производитель - " + getProductionCountry() +
                "\nЦвет - " + getColor() +
                "\nМаксимальная скорость - " + getMaxSpeed();
    }
}
