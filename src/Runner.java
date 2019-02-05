public class Runner {
    public static void main(String[] args){
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");
        Unicorn rar = new Unicorn("Rarity");
        rar.eat("marshmallows");
        rar.sleep();
        Giraffe gem = new Giraffe("Gemma");
        gem.eat("meat");
        gem.eat("leaves");
        Bee sting = new Bee("Stinger");
        sting.eat("ice cream");
        sting.eat("pollen");
    }
}
