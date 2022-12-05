public class Train extends Transport {
    private int tripPrice;
    private int tripTime;
    private String startStation;
    private String finalStation;
    private int trainLength;

    public Train(String brand, String model, int productionYear, String productionCountry, String color, Integer maxSpeed, int tripPrice, int tripTime, String startStation, String finalStation, int trainLength) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.tripPrice = tripPrice;
        this.tripTime = tripTime;
        this.startStation = startStation;
        this.finalStation = finalStation;
        this.trainLength = trainLength;
    }

    public int getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(int tripPrice) {
        this.tripPrice = tripPrice;
    }

    public int getTripTime() {
        return tripTime;
    }

    public void setTripTime(int tripTime) {
        this.tripTime = tripTime;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getFinalStation() {
        return finalStation;
    }

    public void setFinalStation(String finalStation) {
        this.finalStation = finalStation;
    }

    public int getTrainLength() {
        return trainLength;
    }

    public void setTrainLength(int trainLength) {
        this.trainLength = trainLength;
    }

    @Override
    public String toString() {
        return "\nНазвание - " + getBrand() +
                "\nМодель - " + getModel() +
                "\nГод выпуска - " + getProductionYear() +
                "\nСтрана производитель - " + getProductionCountry() +
                "\nЦвет - " + getColor() +
                "\nМаксимальная скорость - " + getMaxSpeed() +
                "\nСтоимость поездки - " + getTripPrice() +
                "\nВремя поездки - " + getTripTime() +
                "\nСтанция отправления - " + getStartStation() +
                "\nСтанция прибытия - " + getFinalStation();
    }

    @Override
    public void refill() {
        System.out.println("Нужно заправлять дизелем");
    }
}
