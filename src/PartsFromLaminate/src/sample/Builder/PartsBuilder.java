package sample.Builder;

public interface PartsBuilder {

    void BuildShape();
    void BuildHoles();
    void BuildAdhesiveTape();
    void BuildLabel();
    void BuildPackaging();

    Parts getPart();
}
