import java.util.Objects;

public class Mammal extends Animal {

    private String livingEnvironment;
    private int runSpeed;

    public Mammal(String name, int age, String livingEnvironment, int runSpeed) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
        this.runSpeed = runSpeed;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public void walk() {
        if (getName() == "Газель") {
            System.out.println("Бегает");
        } else if (getName() == "Жираф") {
            System.out.println("Медленно ходит");
        } else if (getName() == "Гиена") {
            System.out.println("Обычно ходит");
        } else if (getName() == "Тигр") {
            System.out.println("Обычно ходит");
        } else {
            System.out.println("Ходит");
        }
    }

    @Override
    public void eat() {
        if (getName() == "Газель") {
            System.out.println("Ест траву");
        } else if (getName() == "Жираф") {
            System.out.println("Ест листья");
        } else if (getName() == "Гиена") {
            System.out.println("Ест падаль");
        } else if (getName() == "Тигр") {
            System.out.println("Ест мясо");
        } else {
            System.out.println("Ест мед");
        }
    }

    @Override
    public void sleep() {
        if (getName() == "Газель") {
            System.out.println("Спит ночью");
        } else if (getName() == "Жираф") {
            System.out.println("Спит ночью стоя");
        } else if (getName() == "Гиена") {
            System.out.println("Спит в пещере");
        } else if (getName() == "Тигр") {
            System.out.println("Спит ночью");
        } else {
            System.out.println("Спит в берлогеу");
        }
    }

    @Override
    public void run() {
        if (getName() == "Газель") {
            System.out.println("Бегает");
        } else if (getName() == "Жираф") {
            System.out.println("Медленно ходит");
        } else if (getName() == "Гиена") {
            System.out.println("Быстро бегает");
        } else if (getName() == "Тигр") {
            System.out.println("Быстро бегает");
        } else {
            System.out.println("Бегает");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mammal)) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return getRunSpeed() == mammal.getRunSpeed() && Objects.equals(getLivingEnvironment(), mammal.getLivingEnvironment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLivingEnvironment(), getRunSpeed());
    }
}
