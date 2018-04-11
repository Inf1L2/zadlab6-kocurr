package pl.edu.ur.oopl6.zad1;

public class Figury {
    
    /**
     * Inicjalizator statyczny
     */
    static {
        System.out.println("Biblioteka obliczająca wielkość figur geometrycznych!!!");
    }
    
    /**
     * Metoda statyczna obliczająca pole koła
     */
    public static double PoleKola(double r){
        return Math.PI*Math.pow(r,2);
    }
    
    /**
     * Metoda statyczna obliczająca obwód koła
     */
    public static double ObwodKola(double r){
        return 2*Math.PI*r;
    }
    /**
     * kwadrat
     */
    public static double ObwodKwadratu(double a){
        return 4*a;
    }
    public static double PoleKwadratu(double a){
        return Math.pow(a,2);
    }    
    
    /**
     * Prostokąt
     */
    public static double ObwodProstokata(double a, double b){
        return 2*a+2*b;
    }
    public static double PoleProstokata(double a, double b){
        return a*b;
    }
    /**
     * stożek
     */
    public static double PoleStozka(double h, double r){
        double l, Pb, Pp ;
        l = Math.pow((h*h+r*r),(1/2));
        Pb = Math.PI*r*l;
        Pp = Math.PI*Math.pow(r,2);
        return Pb+Pp;
    }
    /**
     * walec
     */
     public static double PoleWalca(double h, double r){
         return 2*Math.PI*Math.pow(r,2)+2*Math.PI*r*h;
     }     
}