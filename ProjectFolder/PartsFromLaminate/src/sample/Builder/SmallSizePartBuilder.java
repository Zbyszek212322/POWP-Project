package sample.Builder;

public class SmallSizePartBuilder implements PartBuilder{

    private Part part;

    public SmallSizePartBuilder() {
        this.part = new Part();
    }

    public void buildShape() {
        this.part.setKształt("mały rozmiar kształtki");
    }

    public void buildHoles() {
        this.part.setOtwory("mała średnica otworów");
    }

    public void buildAdhesiveTape() {
        this.part.setTaśmaKlejąca("wąska taśma klejąca");
    }

    public void buildLabel() {
        this.part.setEtykieta("mały rozmiar etykiety");
    }

    public void buildPackaging() {
        this.part.setOpakowanie("małe pudełko");
    }

    public Part getPart() {
        return part;
    }
}
