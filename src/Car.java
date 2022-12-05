            public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private String tireType;

    public Car(String brand, String model, int productionYear, String productionCountry, String color, Integer maxSpeed, double engineVolume, String transmission, String bodyType, String registrationNumber, int numberOfSeats, String tireType) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.engineVolume = engineVolume;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.tireType = checkTires(tireType);
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = checkTires(tireType);
    }

    public static String checkTires(String tireType) {
        if (tireType == "Летние шины") {
            return "У Вас летние шины, хотели бы поменять на зимнии?";
        } else if (tireType == "Зимние шины") {
            return "У Вас зимние шины, хотели бы поменять на летнии?";
        }
        return tireType;
    }

    @Override
    public String toString() {
        return  "\nМарка - " + getBrand() +
                "\nМодель - " + getModel() +
                "\nГод выпуска - " + getProductionYear() +
                "\nСтрана производитель - " + getProductionCountry() +
                "\nЦвет - " + getColor() +
                "\nМаксимальная скорость - " + getMaxSpeed() +
                "\nОбъем двигателя - " + engineVolume +
                "\nКоробка передач - " + transmission +
                "\nКузов - " + bodyType +
                "\nРегистрационный номер - " + registrationNumber +
                "\nКоличество сидений - " + numberOfSeats +
                "\nТип шин - " + tireType ;
    }

    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар");
    }
}
