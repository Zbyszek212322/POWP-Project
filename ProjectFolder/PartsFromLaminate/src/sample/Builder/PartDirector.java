package sample.Builder;

public class PartDirector {

    private PartBuilder partBuilder;

    public PartDirector(PartBuilder partBuilder) {

        this.partBuilder = partBuilder;

    }

    public void buildPart() {
        partBuilder.buildShape();
        partBuilder.buildHoles();
        partBuilder.buildAdhesiveTape();
        partBuilder.buildLabel();
        partBuilder.buildPackaging();
    }

    public Part getPart() {

        return this.partBuilder.getPart();
    }
}
