import java.util.Objects;

public class Flying extends Bird {

    private String movementType;

    public Flying(String name, int age, String livingEnvironment, String movementType) {
        super(name, age, livingEnvironment);
        this.movementType = movementType;
    }

    public void flying() {
        if (getName() == "Чайка") {
            System.out.println("Летает над морем");
        } else if (getName() == "Альбатрос") {
            System.out.println("Летает над берегом");
        } else {
            System.out.println("Летает над равнинами и горами");
        }
    }

    public String getMovementType() {
        return movementType;
    }

    @Override
    public String toString() {
        return "Животное - " + getName() +
                "\nВозраст - " + getAge() +
                "\nСреда обитания - " + getLivingEnvironment() +
                "\nТип передвижения - " + getMovementType();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flying)) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(getMovementType(), flying.getMovementType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMovementType());
    }
}
