package sample.Decorator;

public class DataSourceDecorator implements DecoratePart {

    private DecoratePart decoratePart;

    public DataSourceDecorator(DecoratePart decoratePart) {
        this.decoratePart = decoratePart;
    }

    public void decoratePart() {
        decoratePart.decoratePart();
    }
}
