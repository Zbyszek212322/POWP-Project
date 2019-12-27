package sample.Decorator;

import sample.Builder.Part;

public class PartDecorator implements DecoratePart {

    private Part part;

    public PartDecorator(Part part) {
        this.part = part;
        decoratePart();
    }

    public void decoratePart() {
        System.out.println(part);
    }
}
