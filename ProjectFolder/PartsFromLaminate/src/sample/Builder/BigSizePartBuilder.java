package sample.Builder;

public class BigSizePartBuilder implements PartBuilder {

    private Part part;

    public BigSizePartBuilder() {
        this.part = new Part();
    }

    public void buildShape() {
        this.part.setKształt("duży rozmiar kształtki");
    }

    public void buildHoles() {
        this.part.setOtwory("duża średnica otworów");
    }

    public void buildAdhesiveTape() {
        this.part.setTaśmaKlejąca("szeroka taśma klejąca");
    }

    public void buildLabel() {
        this.part.setEtykieta("duży rozmiar etykiety");
    }

    public void buildPackaging() {
        this.part.setOpakowanie("duże pudełko");
    }

    public Part getPart() {
        return part;
    }
}
