public abstract class Transport {
    private String brand;
    private String model;
    private final int productionYear;
    private final String productionCountry;
    private  String color;
    private Integer maxSpeed;

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, Integer maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (this.brand == null || this.brand.isBlank() || this.brand.isEmpty()) {
            System.out.println("Не корректное значение");
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (this.model == null || this.model.isBlank() || this.model.isEmpty()) {
            System.out.println("Не корректное значение");
        } else {
            this.model = model;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (this.color == null || this.color.isBlank() || this.color.isEmpty()) {
            System.out.println("Не корректное значение");
        } else {
            this.color = color;
        }
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        if (this.maxSpeed == null || this.color.isBlank() || this.color.isEmpty()) {
            System.out.println("Не корректное значение");
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }
    public abstract void refill();
}
