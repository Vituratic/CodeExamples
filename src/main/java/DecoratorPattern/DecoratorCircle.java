package DecoratorPattern;

public class DecoratorCircle implements DecoratorShape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}