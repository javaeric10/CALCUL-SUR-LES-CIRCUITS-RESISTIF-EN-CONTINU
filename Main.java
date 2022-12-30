import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main (String[] args) {
        try (Scanner scanner = new Scanner ( System.in )) {
            System.out.println ( "      CALCUL SUR LES CIRCUITS RESISTIF EN CONTINU         -" );
            System.out.println ( "-----------------------------------------------------------" );
            System.out.println ( "-   1 RESISTANCE - 2 TENSION - 3 INTENSITE - 4 PUISSANCE  -" );
            System.out.println ( "-----------------------------------------------------------" );
            System.out.println ( "QUEL SONT LES VALEURS QUE TU CONNAIS, TAPE 1 OU 2 OU 3 OU 4" );
            // choix des valeurs connues
            System.out.println ( "donne ta premiere valeur" );
            int choix1 = scanner.nextInt ();
            System.out.println ( "donne ta deuxieme valeur" );
            int choix2 = scanner.nextInt ();
            //calcul possible en fonction du choix des valeurs
            if ( (choix1 == 1) && (choix2 == 2) ) {
                //calcul intensite et puissance
                System.out.println ( "donne la tension" );
                float tension = scanner.nextInt ();
                System.out.println ( "donne la valeur de la resistance" );
                var resistance = scanner.nextInt ();
                System.out.println ( "valeur calculer" );
                float intensite;
                intensite = tension / resistance;
                System.out.println ( "valeur de l'intensité = " + intensite + "ampere" );
                int puissance;
                puissance = (int) ((tension * tension ) / resistance);
                System.out.println ( "valeur de la puissance = " + puissance + "watt");

                if ( (choix1 == 2) && (choix2 == 3) )
                //calcul resistance et puissance
                {
                    System.out.println ( "donne la tension" );
                    tension = scanner.nextInt ();
                    System.out.println ( "donne la valeur de la intensite" );
                    intensite = scanner.nextInt ();
                    System.out.println ( "valeur calculer" );
                    resistance = (int) (tension / intensite);
                    System.out.println ( "valeur de la resistance = " + resistance +"ohms");
                    puissance = (int) (tension * intensite);
                    System.out.println ( "valeur de la puissance = " + puissance + "watts" );
                }
                if ( (choix1 == 3) && (choix2 == 4) )
                //calcul resistance et puissance
                {
                    System.out.println ( "donne le valeur la resistance" );
                    resistance = scanner.nextInt ();
                    System.out.println ( "donne la valeur de la puissance" );
                    puissance = scanner.nextInt ();
                    System.out.println ( "valeur calculer" );
                    tension = puissance / intensite;
                    System.out.println ( "valeur de la tension = " + tension + "volt");
                    resistance = (int) (puissance / (intensite * intensite ));
                    System.out.println ( "valeur de la puissance = " + resistance +"ohms");
                }
                if ( (choix1 == 2) && (choix2 == 4) )
                {
                    System.out.println ( "donne la tension" );
                    intensite = scanner.nextInt ();
                    System.out.println ( "donne la puissance" );
                    puissance = scanner.nextInt ();
                    System.out.println ( "valeur calculer" );
                    tension =  ( intensite*intensite ) / puissance;
                    System.out.println ( "valeur de la tension = " + tension + "volt");
                    resistance = (int) (puissance / (intensite * intensite ));
                    System.out.println ( "valeur de la resistance = " + resistance +"ohms");

                }
                if ( (choix1 == 1) && (choix2 == 4) )
                {
                    System.out.println ( "donne la tension" );
                    intensite = scanner.nextInt ();
                    System.out.println ( "donne la puissance" );
                    puissance = scanner.nextInt ();
                    System.out.println ( "valeur calculer" );
                    intensite =   puissance/tension;
                    System.out.println ( "valeur de l'intensite' = " + intensite + "ampere");
                    resistance = (int) (puissance / (intensite * intensite ));
                    System.out.println ( "valeur de la resistance = " + resistance +"ohms");


            }
        }
    }
}}




