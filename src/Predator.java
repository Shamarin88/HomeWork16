import java.util.Objects;

public class Predator extends Mammal {

    private String foodType;

    public Predator(String name, int age, String livingEnvironment, int runSpeed, String foodType) {
        super(name, age, livingEnvironment, runSpeed);
        this.foodType = foodType;
    }

    public void hunting() {
        if (getName() == "Гиена") {
            System.out.println("Охотится на мелких животных");
        } else if (getName() == "Тигр") {
            System.out.println("Охотится на крупных животных");
        } else {
            System.out.println("Охотится на рыбу");
        }
    }

    public String getFoodType() {
        return foodType;
    }

    @Override
    public String toString() {
        return "Животное - " + getName() +
                "\nВозраст - " + getAge() +
                "\nСреда обитания - " + getLivingEnvironment() +
                "\nСкорость передвижения - " + getRunSpeed() +
                "\nТип рациона - " + getFoodType();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Predator)) return false;
        if (!super.equals(o)) return false;
        Predator predator = (Predator) o;
        return Objects.equals(getFoodType(), predator.getFoodType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getFoodType());
    }
}
