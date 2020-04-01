public class Energia {
    private double impulss;
    private double mass;
    private double kiirus;
    private double kõrgus;
    private double energia;
    private double kineetilineEnergia;
    private double potentsiaalneEnergia;
    private double energiaJäävus;
    private double raskusjõud;

    public Energia(double impulss, double mass, double kiirus, double kõrgus, double energia, double kineetilineEnergia, double potentsiaalneEnergia, double energiaJäävus, double raskusjõud) {
        this.impulss = impulss;
        this.mass = mass;
        this.kiirus = kiirus;
        this.kõrgus = kõrgus;
        this.energia = energia;
        this.kineetilineEnergia = kineetilineEnergia;
        this.potentsiaalneEnergia = potentsiaalneEnergia;
        this.energiaJäävus = energiaJäävus;
        this.raskusjõud = raskusjõud;
    }

    public double getRaskusjõud() {
        return raskusjõud;
    }

    public void setRaskusjõud(double raskusjõud) {
        this.raskusjõud = raskusjõud;
    }

    public double getImpulss() {
        return impulss;
    }

    public void setImpulss(double impulss) {
        this.impulss = impulss;
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

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    public double getKineetilineEnergia() {
        return kineetilineEnergia;
    }

    public void setKineetilineEnergia(double kineetilineEnergia) {
        this.kineetilineEnergia = kineetilineEnergia;
    }

    public double getPotentsiaalneEnergia() {
        return potentsiaalneEnergia;
    }

    public void setPotentsiaalneEnergia(double potentsiaalneEnergia) {
        this.potentsiaalneEnergia = potentsiaalneEnergia;
    }

    public double getEnergiaJäävus() {
        return energiaJäävus;
    }

    public void setEnergiaJäävus(double energiaJäävus) {
        this.energiaJäävus = energiaJäävus;
    }

    void kineetiliseEnergiaLeidmine(){

        kineetilineEnergia = (mass*Math.pow(kiirus,2));
    }

    void potentsiaalseEnergiaLeidmine(){

        potentsiaalneEnergia = mass * raskusjõud * kõrgus;
    }

    void impulsiLeidmine(){
        impulss = mass * kiirus;
    }
    void energiajäävuseLeidmine(){
        energiaJäävus = potentsiaalneEnergia + kineetilineEnergia;
    }
}
