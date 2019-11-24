package sample.Builder;

public interface PartBuilder {

    void buildShape();
    void buildHoles();
    void buildAdhesiveTape();
    void buildLabel();
    void buildPackaging();

    Part getPart();
}
