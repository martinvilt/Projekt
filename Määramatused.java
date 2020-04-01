public class Määramatused {

    public Määramatused () {

    }

    static double   aMääramatus (double standardhälve, double pinge, int kordused){
        return (standardhälve*pinge)/Math.sqrt ((kordused*pinge));
    }
    static double bMääramatus (double keskminePinge, double pinge){
        return ((0.01 * keskminePinge*pinge) + 100 * 0.01 * pinge)/Math.sqrt (3);
    }
    static double cMääramatus(double aMääramatus, double bMääramatus){
        return Math.sqrt((Math.pow (aMääramatus, 2)) + (Math.pow (bMääramatus, 2)));
    }
}
