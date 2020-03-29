public class OhmiSeadus {
    private double pinge;
    private double voolutugevus;
    private double takistus;

    public OhmiSeadus (double pinge, double voolutugevus, double takistus) {
        this.pinge = pinge;
        this.voolutugevus = voolutugevus;
        this.takistus = takistus;
    }

    public double getPinge () {
        return pinge;
    }

    public void setPinge (double pinge) {
        this.pinge = pinge;
    }

    public double getVoolutugevus () {
        return voolutugevus;
    }

    public void setVoolutugevus (double voolutugevus) {
        this.voolutugevus = voolutugevus;
    }

    public double getTakistus () {
        return takistus;
    }

    public void setTakistus (double takistus) {
        this.takistus = takistus;
    }

    public double teisendaja (double teisendatav, double kordaja){
        double teisendatud = teisendatav * Math.pow (10, kordaja);
        return teisendatud;
    }
    void pingeLeidmine(){
        pinge = voolutugevus * takistus;
    }
    void voolutugevuseLeidmine(){
        voolutugevus = pinge/takistus;
    }
    void takistuseLeidmine(){
        takistus = pinge/voolutugevus;
    }
}
