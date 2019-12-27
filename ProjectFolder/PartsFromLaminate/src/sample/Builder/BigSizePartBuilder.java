package sample.Builder;

public class BigSizePartBuilder implements PartBuilder {

    private Part part;

    public BigSizePartBuilder() {
        this.part = new Part();
    }

    public void buildShape() {
        this.part.setKształt("big");
    }

    public void buildHoles() {
        this.part.setOtwory("big diameter");
    }

    public void buildAdhesiveTape() {
        this.part.setTaśmaKlejąca("wide");
    }

    public void buildLabel() {
        this.part.setEtykieta("big");
    }

    public void buildPackaging() {
        this.part.setOpakowanie("big box");
    }

    public Part getPart() {
        return part;
    }
}
