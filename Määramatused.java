public class Määramatused {

    private double pinge;
    private double standardhälve;
    private double keskminePinge;
    private double kordused;
    private double aMääramatus;
    private double bMääramatus;
    private double cMääramatus;

    public Määramatused (double pinge, double standardhälve, double keskminePinge, double kordused, double aMääramatus, double bMääramatus, double cMääramatus) {
        this.pinge = pinge;
        this.standardhälve = standardhälve;
        this.keskminePinge = keskminePinge;
        this.kordused = kordused;
        this.aMääramatus = aMääramatus;
        this.bMääramatus = bMääramatus;
        this.cMääramatus = cMääramatus;
    }

    public double getPinge () {
        return pinge;
    }

    public void setPinge (double pinge) {
        this.pinge = pinge;
    }

    public double getStandardhälve () {
        return standardhälve;
    }

    public void setStandardhälve (double standardhälve) {
        this.standardhälve = standardhälve;
    }

    public double getKeskminePinge () {
        return keskminePinge;
    }

    public void setKeskminePinge (double keskminePinge) {
        this.keskminePinge = keskminePinge;
    }

    public double getKordused () {
        return kordused;
    }

    public void setKordused (double kordused) {
        this.kordused = kordused;
    }

    public double getaMääramatus () {
        return aMääramatus;
    }

    public void setaMääramatus (double aMääramatus) {
        this.aMääramatus = aMääramatus;
    }

    public double getbMääramatus () {
        return bMääramatus;
    }

    public void setbMääramatus (double bMääramatus) {
        this.bMääramatus = bMääramatus;
    }

    public double getcMääramatus () {
        return cMääramatus;
    }

    public void setcMääramatus (double cMääramatus) {
        this.cMääramatus = cMääramatus;
    }

    void  aMääramatus (){
        aMääramatus = (standardhälve*pinge)/Math.sqrt ((kordused*pinge));
    }
    void bMääramatus (){
        bMääramatus = ((0.01 * keskminePinge*pinge) + 100 * 0.01 * pinge)/Math.sqrt (3);
    }
    void cMääramatus(){
        cMääramatus = Math.sqrt((Math.pow (aMääramatus, 2)) + (Math.pow (bMääramatus, 2)));
    }
}
