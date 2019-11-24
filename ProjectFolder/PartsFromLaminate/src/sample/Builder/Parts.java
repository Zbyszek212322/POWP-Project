package sample.Builder;

public class Parts {

    private String kształt;
    private String otwory;
    private String taśmaKlejąca;
    private String etykieta;
    private String opakowanie;

    public String getKształt() {
        return kształt;
    }

    public void setKształt(String kształt) {
        this.kształt = kształt;
    }

    public String getOtwory() {
        return otwory;
    }

    public void setOtwory(String otwory) {
        this.otwory = otwory;
    }

    public String getTaśmaKlejąca() {
        return taśmaKlejąca;
    }

    public void setTaśmaKlejąca(String taśmaKlejąca) {
        this.taśmaKlejąca = taśmaKlejąca;
    }

    public String getEtykieta() {
        return etykieta;
    }

    public void setEtykieta(String etykieta) {
        this.etykieta = etykieta;
    }

    public String getOpakowanie() {
        return opakowanie;
    }

    public void setOpakowanie(String opakowanie) {
        this.opakowanie = opakowanie;
    }

    public String toString() {

        return "Część z laminatu {" +
                " kształt: " + kształt +
                " otwory: " + otwory +
                " taśmaKlejąca: " + taśmaKlejąca +
                " etykieta: " + etykieta +
                " opakowanie: " + opakowanie +
                "}";
    }
}
