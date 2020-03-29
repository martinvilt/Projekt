public class Võimsus {
    private double töö;
    private double aeg;
    private double võimsus;
    private double kiirus;
    private double jõud;


    public Võimsus (double töö, double aeg, double võimsus, double kiirus, double jõud) {
        this.töö = töö;
        this.aeg = aeg;
        this.võimsus = võimsus;
        this.kiirus = kiirus;
        this.jõud = jõud;
    }

    public double getTöö () {
        return töö;
    }

    public void setTöö (double töö) {
        this.töö = töö;
    }

    public double getAeg () {
        return aeg;
    }

    public void setAeg (double aeg) {
        this.aeg = aeg;
    }

    public double getVõimsus () {
        return võimsus;
    }

    public void setVõimsus (double võimsus) {
        this.võimsus = võimsus;
    }

    public double getKiirus () {
        return kiirus;
    }

    public void setKiirus (double kiirus) {
        this.kiirus = kiirus;
    }

    public double getJõud () {
        return jõud;
    }

    public void setJõud (double jõud) {
        this.jõud = jõud;
    }

    public Võimsus (int töö, int aeg, int võimsus) {
        this.töö = töö;
        this.aeg = aeg;
        this.võimsus = võimsus;
    }

    void arvutaVõimsus(){
        võimsus = töö/aeg;
    }
    void võimsusÜhtlaseltLiikuvaleKehale(){
        võimsus = jõud * kiirus;
    }

}
