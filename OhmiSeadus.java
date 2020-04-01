public class OhmiSeadus {

    public OhmiSeadus () {

    }

    static double pingeLeidmine(double voolutugevus, double takistus){
        return  voolutugevus * takistus;
    }
    static double voolutugevuseLeidmine(double pinge, double takistus){
        return pinge/takistus;
    }
    static double takistuseLeidmine(double pinge, double voolutugevus){
        return pinge/voolutugevus;
    }
}
