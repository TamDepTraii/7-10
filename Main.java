public class Main {
    public static void main(String[] args) {

        Animals pig = new Pig();
        Animals fish = new Fish();
        Animals duck = new Duck();
        System.out.println(pig.name + " can " + pig.move());  // Pig can walk
        System.out.println(duck.name + " can " + duck.move());  //Duck can walk and swim
        System.out.println(fish.name + " can " + fish.move()); // Fish can swim
    }
}