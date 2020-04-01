public class Töö {
    private double töö;
    private double jõud;
    private double teepikkus;
    private double aeg;
    private double mass;

    public Töö(double töö, double jõud, double teepikkus, double aeg, double mass) {
        this.töö = töö;
        this.jõud = jõud;
        this.teepikkus = teepikkus;
        this.aeg = aeg;
        this.mass = mass;
    }

    public double getTöö() {
        return töö;
    }

    public void setTöö(double töö) {
        this.töö = töö;
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

    void tööLeidmineTeepikkusega(){
        töö = jõud*teepikkus;
    }
    void tööLeidmineMassiga(){
        töö = (Math.pow((jõud*aeg),2))/(2*mass);
    }
}