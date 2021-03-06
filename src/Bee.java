public class Bee extends Animal {
    public Bee(String name) {
        super(name, "pollen");
    }

    public void sleep(){
        System.out.println(name + " never sleeps");
    }

    public void eat(String food){
        if(food.equals(favoriteFood)){
            System.out.println(name + " eats " + food);
            System.out.println("YUM!!! " + name + " wants more pollen");
            sleep();
        }else{
            System.out.println("YUCK!!! " + name + " will not eat " + food);
        }
    }

}
