package DecoratorPattern;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(DecoratorShape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        setRedBorder(decoratorShape);
    }

    private void setRedBorder(DecoratorShape decoratorShape) {
        System.out.println("Border Color: Red");
    }
}