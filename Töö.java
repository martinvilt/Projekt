public class Töö {
    private double jõud;
    private double teepikkus;
    private double aeg;
    private double mass;

    public Töö(double jõud, double teepikkus, double aeg, double mass) {
        this.jõud = jõud;
        this.teepikkus = teepikkus;
        this.aeg = aeg;
        this.mass = mass;
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

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double tööLeidmineTeepikkusega(){
        return Math.round((jõud*teepikkus)*100.0)/100.0;
    }
    public double tööLeidmineMassiga(){
      return Math.round(((Math.pow((jõud*aeg),2))/(2*mass))*100.0)/100.0;
    }
}