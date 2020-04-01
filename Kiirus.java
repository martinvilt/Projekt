public class Kiirus {
    private double kiirus;
    private double kiirendus;
    private double jõud;
    private double teepikkus;
    private double aeg;
    private double mass;


    public Kiirus(double kiirus, double kiirendus, double jõud, double teepikkus, double aeg, double mass) {
        this.kiirus = kiirus;
        this.kiirendus = kiirendus;
        this.jõud = jõud;
        this.teepikkus = teepikkus;
        this.aeg = aeg;
        this.mass = mass;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getKiirus() {
        return kiirus;
    }

    public void setKiirus(double kiirus) {
        this.kiirus = kiirus;
    }

    public double getKiirendus() {
        return kiirendus;
    }

    public void setKiirendus(double kiirendus) {
        this.kiirendus = kiirendus;
    }

    public double getJõud() {
        return jõud;
    }

    public void setJõud(double jõud) {

        this.jõud = jõud;
    }

    public double getTeepikkus() {

        return teepikkus;
    }

    public void setTeepikkus(double teepikkus) {

        this.teepikkus = teepikkus;
    }

    public double getAeg() {

        return aeg;
    }

    public void setAeg(double aeg) {

        this.aeg = aeg;
    }

    void kiirenduseLeidmine(){

        kiirendus = jõud/mass;
    }

    void teepikkuseLeidmine(){

        teepikkus = kiirus*aeg;
    }
    void ajaLeidmine(){
        aeg = teepikkus/kiirus;
    }
    void kiiruseLeidmine(){
        kiirus = teepikkus/aeg;
    }

    void teepikkusLedimineKiirendusega(){

        teepikkus = (kiirendus*Math.pow(aeg,2))/2;
    }

    void teepikkuseLeidmineJõuga(){
        teepikkus = (jõud*Math.pow(aeg,2))/(2*mass);
    }
}