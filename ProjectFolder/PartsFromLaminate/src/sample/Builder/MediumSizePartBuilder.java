package sample.Builder;

public class MediumSizePartBuilder implements PartBuilder {

    private Part part;

    public MediumSizePartBuilder() {
        this.part = new Part();
    }

    public void buildShape() {
        this.part.setKształt("medium");
    }

    public void buildHoles() {
        this.part.setOtwory("standard diameter");
    }

    public void buildAdhesiveTape() {
        this.part.setTaśmaKlejąca("standard");
    }

    public void buildLabel() {
        this.part.setEtykieta("standard");
    }

    public void buildPackaging() {
        this.part.setOpakowanie("standard box");
    }

    public Part getPart() {
        return part;
    }
}
