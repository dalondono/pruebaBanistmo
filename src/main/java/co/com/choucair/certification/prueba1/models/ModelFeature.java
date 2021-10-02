package co.com.choucair.certification.prueba1.models;

public class ModelFeature {
    private int rate;
    private String periodicity;
    private String capitalization;
    private float result;

    public ModelFeature(int rate, String periodicity, String capitalization, float result) {
        this.rate = rate;
        this.periodicity = periodicity;
        this.capitalization = capitalization;
        this.result = result;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
    }

    public String getCapitalization() {
        return capitalization;
    }

    public void setCapitalization(String capitalization) {
        this.capitalization = capitalization;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }
}
