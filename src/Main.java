public class Main {
    public static void main(String[] args) {
        System.out.println("Травоядные :");
        System.out.println();

        Herbivore gazelle = new Herbivore("Газель",10,"Суша",80,"Трава");
        Herbivore giraffe = new Herbivore("Жираф",10,"Суша",10,"Трава");
        Herbivore horse = new Herbivore("Лошадь",10,"Суша",60,"Трава");

        System.out.println(gazelle);
        gazelle.walk();
        gazelle.eat();
        gazelle.sleep();
        gazelle.run();
        gazelle.grace();
        System.out.println();
        System.out.println(giraffe);
        giraffe.walk();
        giraffe.eat();
        giraffe.sleep();
        giraffe.run();
        giraffe.grace();
        System.out.println();
        System.out.println(horse);
        horse.walk();
        horse.eat();
        horse.sleep();
        horse.run();
        horse.grace();

        System.out.println();
        System.out.println("Хищники");
        System.out.println();

        Predator hyena = new Predator("Гиена",10,"Суша",30,"Мясо");
        Predator tiger = new Predator("Тигр",20,"Суша", 60,"Мясо");
        Predator bear = new Predator("Медведь",15,"Суша",60,"Мясо");

        System.out.println(hyena);
        hyena.hunting();
        hyena.walk();
        hyena.eat();
        hyena.sleep();
        hyena.run();
        System.out.println();
        System.out.println(tiger);
        tiger.hunting();
        tiger.walk();
        tiger.eat();
        tiger.sleep();
        tiger.run();
        System.out.println();
        System.out.println(bear);
        bear.hunting();
        bear.walk();
        bear.eat();
        bear.sleep();
        bear.run();

        System.out.println();
        System.out.println("Земноводные");
        System.out.println();

        Amphibian frog = new Amphibian("Лягушка",5,"Води и Суша");
        Amphibian snake = new Amphibian("Змея",10,"Вода и Суша");


        System.out.println(frog);
        frog.hunt();
        frog.eat();
        frog.sleep();
        frog.run();
        System.out.println();
        System.out.println(snake);
        snake.hunt();
        snake.eat();
        snake.sleep();
        snake.run();

        System.out.println();
        System.out.println("Не летающие птицы");
        System.out.println();

        Notflying peacock = new Notflying("Павлин",7,"Суша", "Ходьба");
        Notflying penguin = new Notflying("Пингвин",7,"Ледник","Ходьба");
        Notflying dodoBird = new Notflying("Птица ДоДо",5,"Суша","Ходьба");

        System.out.println(peacock);
        peacock.walking();
        peacock.hunt();
        peacock.eat();
        peacock.sleep();
        peacock.run();
        System.out.println();
        System.out.println(penguin);
        penguin.walking();
        penguin.hunt();
        penguin.eat();
        penguin.sleep();
        penguin.run();
        System.out.println();
        System.out.println(dodoBird);
        dodoBird.hunt();
        dodoBird.eat();
        dodoBird.sleep();
        dodoBird.run();
        dodoBird.walking();

        System.out.println();
        System.out.println("Летающие птицы");
        System.out.println();

        Flying seagull = new Flying("Чайка",5,"Воздух и Суша","Полет и Ходьба");
        Flying albatross = new Flying("Альбатрос",10,"Воздух и Суша","Полет и Ходьба");
        Flying falcon = new Flying("Сокол",15,"Воздух и Суша","Полет и Ходьба");

        System.out.println(seagull);
        seagull.hunt();
        seagull.eat();
        seagull.sleep();
        seagull.run();
        seagull.flying();
        System.out.println();
        System.out.println(albatross);
        albatross.hunt();
        albatross.eat();
        albatross.sleep();
        albatross.run();
        albatross.flying();
        System.out.println();
        System.out.println(falcon);
        falcon.hunt();
        falcon.eat();
        falcon.sleep();
        falcon.run();
        falcon.flying();
    }
}