public class Apple extends Fruit {
    public Apple() {
        super("Apple", "sweet and crisp", "medium");
    }

    @Override
    public void eat() {
        System.out.println("Apple tastes sweet and crisp");
    }
}
