public class Energia {
    private double mass;
    private double kiirus;
    private double kõrgus;
    private double raskusjõud;

    public Energia(double mass, double kiirus, double kõrgus, double raskusjõud) {
        this.mass = mass;
        this.kiirus = kiirus;
        this.kõrgus = kõrgus;
        this.raskusjõud = raskusjõud;
    }

    public double getRaskusjõud() {
        return raskusjõud;
    }

    public void setRaskusjõud(double raskusjõud) {
        this.raskusjõud = raskusjõud;
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

    public double getKõrgus() {
        return kõrgus;
    }

    public void setKõrgus(double kõrgus) {
        this.kõrgus = kõrgus;
    }

    public double kineetiliseEnergiaLeidmine() {

        return Math.round((mass * Math.pow(kiirus, 2))*100.0)/100.0;
    }

    public double potentsiaalseEnergiaLeidmine() {

        return Math.round((mass * raskusjõud * kõrgus)*100.0)/100.0;
    }

    public double impulsiLeidmine() {
        return Math.round((mass * kiirus)*100.0)/100.0;
    }
    public double energiajäävuseLeidmine(){
        return potentsiaalseEnergiaLeidmine() + kineetiliseEnergiaLeidmine();
    }
}
