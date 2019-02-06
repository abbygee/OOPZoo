import java.util.ArrayList;

public class Runner {
    public static void main(String[] args){
        ArrayList<Animal> animals = new ArrayList<>();

        Tiger tigger = new Tiger("Tigger");
//        tigger.eat("meat");
        animals.add(tigger);

        Bear pooh = new Bear("Pooh");
//        pooh.eat("fish");
//        pooh.eat("meat");
        animals.add(pooh);

        Unicorn rar = new Unicorn("Rarity");
//        rar.eat("marshmallows");
//        rar.sleep();
        animals.add(rar);

        Giraffe gem = new Giraffe("Gemma");
//        gem.eat("meat");
//        gem.eat("leaves");
        animals.add(gem);

        Bee sting = new Bee("Stinger");
//        sting.eat("ice cream");
//        sting.eat("pollen");
        animals.add(sting);

        Zookeeper zoe = new Zookeeper("Zoebot");
        zoe.feedAnimals(animals, "cheese");
    }
}
