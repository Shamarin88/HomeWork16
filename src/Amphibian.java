import java.util.Objects;

public class Amphibian extends Animal {

    private String livingEnvironment;

    public Amphibian(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void hunt(){
        if (getName() == "Лягушка") {
            System.out.println("Охотится на мух");
        } else {
            System.out.println("Охотится на мелких грызунов");
        }
    }

    @Override
    public void eat() {
        if (getName() == "Лягушка") {
            System.out.println("Ест насекомых");
        } else {
            System.out.println("Ест мелких животных и яйца");
        }
    }

    @Override
    public void sleep() {
        if (getName() == "Лягушка") {
            System.out.println("Спит в воде");
        } else {
            System.out.println("Спит в на земле или на ветках деревьев");
        }
    }

    @Override
    public void run() {
        if (getName() == "Лягушка") {
            System.out.println("Прыгает");
        } else {
            System.out.println("Ползает");
        }
    }

    @Override
    public String toString() {
        return "Животное - " + getName() +
                "\nВозраст - " + getAge() +
                "\nСреда обитания - " + getLivingEnvironment();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Amphibian)) return false;
        if (!super.equals(o)) return false;
        Amphibian amphibian = (Amphibian) o;
        return Objects.equals(getLivingEnvironment(), amphibian.getLivingEnvironment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLivingEnvironment());
    }
}
