import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class Teisendaja {
    public static HashMap<String, Integer> astmed = new HashMap<> () {{
        put ("nano", 9);
        put ("mikro", 6);
        put ("milli", 3);
        put ("kilo", -3);
        put ("mega", -6);
        put ("giga", -9);
    }};                         // Kujutus astme nimede hoidmiseks nt 1000 on kilo 1 000 000 on mega jne


//    public static String convertToString(double number, String ühik, boolean positiivsusNegatiivsus){
//        String s = DecimalFormat.getNumberInstance().format(number).replace (".", "");  // mõõdan arvu suurust sõne abil
//        int suurus = s.replace(",","").length()-1;
//        System.out.println (suurus);
//        int kontrollija = (suurus % 3); // Kontrollin kas mul on tuleb näiteks 10 mega- või 100 megaühikut
//        if ( kontrollija == 1 ){
//            suurus -= 1;
//        }
//        if ( kontrollija == 2 ){
//            suurus -= 2;
//        }
//        if ( !positiivsusNegatiivsus ){     // Kui teisendan väiksemaks ühikuks, siis pean lähenemist muutma
//            suurus *= -1;
//        }
//        String tulemus = astmed.get (suurus) + ühik;
//        return tulemus;
//    }
// Proovisin keerukamat lahendust, kuid nullist väiksemate arvudega jõudsin ummikusse.
    public static String teisendusStringiks(double teisendatav, String kordaja, String ühik){
        double teisendatudArv = teisendaja (teisendatav, astmed.get (kordaja));
        String tulemus = Double.toString (teisendatudArv) + " " + kordaja + ühik;
        return tulemus;
    }
    public static double teisendaja (double teisendatav, double kordaja){
        return teisendatav * Math.pow (10, kordaja);

    }


}
