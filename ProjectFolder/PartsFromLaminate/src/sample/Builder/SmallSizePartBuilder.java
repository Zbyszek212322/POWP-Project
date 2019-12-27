package sample.Builder;

public class SmallSizePartBuilder implements PartBuilder{

    private Part part;

    public SmallSizePartBuilder() {
        this.part = new Part();
    }

    public void buildShape() {
        this.part.setKształt("small");
    }

    public void buildHoles() {
        this.part.setOtwory("small diameter");
    }

    public void buildAdhesiveTape() {
        this.part.setTaśmaKlejąca("narrow");
    }

    public void buildLabel() {
        this.part.setEtykieta("small");
    }

    public void buildPackaging() {
        this.part.setOpakowanie("small box");
    }

    public Part getPart() {
        return part;
    }
}
