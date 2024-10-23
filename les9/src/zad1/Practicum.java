package zad1;

public class Practicum {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.catchMouse();
        cat.giveVoice();

        Dog dog = new Dog();
        dog.bringStick();
        dog.play();

        Hamster hamster = new Hamster();
        hamster.hideFood();
        hamster.sleep();

        Fish fish = new Fish();
        fish.sleep();

        Spider spider = new Spider();
        System.out.println("У паука " + spider.getPawsCount() + " лапок.");
    }

}

abstract class Pet {
    protected int pawsCount;
    public void sleep() {
        System.out.println("сплю....");
    }
    public void play() {
        System.out.println("играю!");
    }
    public abstract void giveVoice();
    protected Pet(int pawsCount){
        this.pawsCount = pawsCount;
    }
    public int getPawsCount(){
        return pawsCount;
    }

}
class Fish extends Pet{
    @Override
    public void giveVoice(){
        System.out.println("бульк");
    }
    protected Fish(){
        super(0);
    }
}
class Spider extends Pet{
    @Override
    public void giveVoice(){
        System.out.println("пш");
    }
    protected Spider(){
        super(8);
    }
}
class Dog extends Pet{
    public void bringStick(){
        System.out.println("Принес палочку, как хороший мальчик!");
    }
    @Override
    public void giveVoice(){
        System.out.println("гав-гав");
    }
    protected Dog(){
        super(4);
    }

}
class Cat extends Pet{
    public void catchMouse(){
        System.out.println("Поймала мышку!");
    }
    @Override
    public void giveVoice(){
        System.out.println("Мяяяу!!!!!!");
    }
    protected Cat(){
        super(4);
    }
}
class Hamster extends Pet{
    @Override
    public void giveVoice(){
        System.out.println("ииии");

    }
    protected Hamster(){
        super(4);
    }
    public void hideFood(){
        System.out.println("Вся еда - в щечках!");
    }
}