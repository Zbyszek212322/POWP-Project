package sample.Decorator;

public class DecoratorTrimEdges extends DataSourceDecorator {

    public DecoratorTrimEdges(DecoratePart decoratePart) {
        super(decoratePart);
        decoratePart();
    }

    @Override
    public void decoratePart() {
        System.out.println(" + trimmed edges");
    }
}
