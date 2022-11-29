import java.util.Objects;

public class Herbivore extends Mammal {
    private String foodType;

    public Herbivore(String name, int age, String livingEnvironment, int runSpeed, String foodType) {
        super(name, age, livingEnvironment, runSpeed);
        this.foodType = foodType;
    }

    public void grace() {
        if (getName() == "Газель") {
            System.out.println("Питается только травой");
        } else if (getName() == "Жираф") {
            System.out.println("Питается листьями деревьев и фруктами");
        } else {
            System.out.println("Питается травой и фруктами");
        }
    }

    public String getFoodType() {
        return foodType;
    }


    @Override
    public String toString() {
        return  "Животное - " + getName() +
                "\nВозраст - " + getAge() +
                "\nСреда обитания - " + getLivingEnvironment() +
                "\nСкорость передвижения - " + getRunSpeed() +
                "\nТип рациона - " + getFoodType();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Herbivore)) return false;
        if (!super.equals(o)) return false;
        Herbivore herbivore = (Herbivore) o;
        return Objects.equals(getFoodType(), herbivore.getFoodType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getFoodType());
    }
}
