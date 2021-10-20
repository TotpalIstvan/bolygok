package hu.petrik.bolygok;

import bolygo.Bolygo;


public class Main {

    public static void main(String[] args) {
	    double sajatsuly = 65;
        Bolygo fold = Bolygo.FOLD;
        double sajatTomeg =  sajatsuly/fold.getGravitacio();

        for (Bolygo bolygo: Bolygo.values()
             ) {
            System.out.printf("%s (%f): %f \n", bolygo, bolygo.getGravitacio(), bolygo.getSuly(sajatTomeg));
        }
    }
}
