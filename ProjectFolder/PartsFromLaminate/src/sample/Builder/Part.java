package sample.Builder;

public class Part {

    private String rozmiar;
    private String otwory;
    private String taśmaKlejąca;
    private String etykieta;
    private String opakowanie;

    public String getKształt() {
        return rozmiar;
    }

    public void setKształt(String kształt) {
        this.rozmiar = kształt;
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

    @Override
    public String toString() {
        return "\nPart from laminate: " +
                "dimensions='" + rozmiar + '\'' +
                ", holes='" + otwory + '\'' +
                ", adhesive tape='" + taśmaKlejąca + '\'' +
                ", label='" + etykieta + '\'' +
                ", packaging='" + opakowanie + '\'';
    }
}
