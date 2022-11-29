import java.util.Objects;

public class Notflying extends Bird {

    private String movementType;

    public Notflying(String name, int age, String livingEnvironment, String movementType) {
        super(name, age, livingEnvironment);
        this.movementType = movementType;
    }

    public void walking() {
        if (getName() == "Павлин") {
            System.out.println("Ходит по земле");
        } else if (getName() == "Пингвин") {
            System.out.println("Ходит по земле и льду");
        } else {
            System.out.println("Ходит по земле и веткам");
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
        if (!(o instanceof Notflying)) return false;
        if (!super.equals(o)) return false;
        Notflying notflying = (Notflying) o;
        return Objects.equals(getMovementType(), notflying.getMovementType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMovementType());
    }
}
