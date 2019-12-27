package sample.Decorator;

public class DecoratorPrintNumber extends DataSourceDecorator {

    public DecoratorPrintNumber(DecoratePart decoratePart) {
        super(decoratePart);
        decoratePart();
    }

    @Override
    public void decoratePart() {
        System.out.println(" + printed number");
    }
}
