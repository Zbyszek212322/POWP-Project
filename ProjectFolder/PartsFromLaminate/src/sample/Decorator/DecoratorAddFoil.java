package sample.Decorator;

public class DecoratorAddFoil extends DataSourceDecorator {

    public DecoratorAddFoil(DecoratePart decoratePart) {
        super(decoratePart);
        decoratePart();
    }

    @Override
    public void decoratePart() {
        System.out.println(" + packed in foil bag");
    }
}
