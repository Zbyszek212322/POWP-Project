package sample.Builder;

public class MediumSizePartBuilder implements PartBuilder {

    private Part part;

    public MediumSizePartBuilder() {
        this.part = new Part();
    }

    public void buildShape() {
        this.part.setKształt("średni rozmiar kształtki");
    }

    public void buildHoles() {
        this.part.setOtwory("standardowa średnica otworów");
    }

    public void buildAdhesiveTape() {
        this.part.setTaśmaKlejąca("standardowa taśma klejąca");
    }

    public void buildLabel() {
        this.part.setEtykieta("standardowa etykieta");
    }

    public void buildPackaging() {
        this.part.setOpakowanie("standardowe pudełko");
    }

    public Part getPart() {
        return part;
    }
}
