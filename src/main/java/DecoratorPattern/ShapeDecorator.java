package DecoratorPattern;

public class ShapeDecorator implements DecoratorShape {

    protected DecoratorShape decoratorShape;

    public ShapeDecorator(DecoratorShape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
    }
}