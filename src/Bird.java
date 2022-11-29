import java.util.Objects;

public class Bird extends Animal {
    private String livingEnvironment;

    public Bird(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }


    public void hunt(){
        if (getName() == "Павлин") {
            System.out.println("Охотится на мелких грызунов");
        } else if (getName() == "Пингвин") {
            System.out.println("Охотится на мелких рыб");
        } else if (getName() == "Птица ДоДо") {
            System.out.println("Охотится на насекомых");
        } else if (getName() == "Чайка") {
            System.out.println("Охотится на рыб");
        } else if (getName() == "Альбатрос") {
            System.out.println("Охотится на больших рыб");
        } else {
            System.out.println("Охотится на Мелких грызунов");
        }
    }

    @Override
    public void eat() {
        if (getName() == "Павлин") {
            System.out.println("Ест мелких грызунов");
        } else if (getName() == "Пингвин") {
            System.out.println("Ест мелких рыб");
        } else if (getName() == "Птица ДоДо") {
            System.out.println("Ест насекомых");
        } else if (getName() == "Чайка") {
            System.out.println("Ест рыб");
        } else if (getName() == "Альбатрос") {
            System.out.println("Ест больших рыб");
        } else {
            System.out.println("Ест Мелких грызунов");
        }
    }

    @Override
    public void sleep() {
        if (getName() == "Павлин") {
            System.out.println("Спит стоя");
        } else if (getName() == "Пингвин") {
            System.out.println("Спит в снегу");
        } else if (getName() == "Птица ДоДо") {
            System.out.println("Спит на дереве");
        } else if (getName() == "Чайка") {
            System.out.println("Спит в гнезде");
        } else if (getName() == "Альбатрос") {
            System.out.println("Спит в гнезде");
        } else {
            System.out.println("Спит в гнезде");
        }
    }

    @Override
    public void run() {
        if (getName() == "Павлин") {
            System.out.println("Не бегает");
        } else if (getName() == "Пингвин") {
            System.out.println("Не бегает");
        } else if (getName() == "Птица ДоДо") {
            System.out.println("Не бегает");
        } else if (getName() == "Чайка") {
            System.out.println("Не бегает");
        } else if (getName() == "Альбатрос") {
            System.out.println("Не бегает");
        } else {
            System.out.println("Не бегает");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bird)) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(getLivingEnvironment(), bird.getLivingEnvironment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLivingEnvironment());
    }
}
