
import java.util.Scanner;

import static java.lang.System.*;


public class Main {


    private static int valanneau1;
    private static int valanneau2;
    private static int valresiste;




    public static <valanneau2> void main(String[] args, int a4) throws IllegalStateException {
        try (Scanner scanner = new Scanner ( in )) {
            out.println ( "CODE COULEUR DE VOS RESISTANCES" );
            out.println ( "COMBIEN D'ANNEAUX A VOTRE RESISTANCES 3,4,5" );
            int nombreaneaux;
            nombreaneaux = scanner.nextInt ();
            int nbanneau = nombreaneaux + 10;
            if (nbanneau == 13) {
                out.println ( " VOTRE RESISTANCES A 3 ANNEAUX " );
                out.println ( " COULEUR DE VOTRE PREMIER ANNEAUX " );
                out.println ( " MARRON = 1, ROUGE = 2, ORANGE = 3, JAUNE = 4, VERT = 5 " );
                out.println ( " BLEU = 6, VIOLET = 7, GRIS = 8, BLANC = 9, " );
                int couleuran1 = scanner.nextInt ();
                switch (couleuran1) {
                    case 1:

                        int valanneau1 = 1;
                        out.println ( " valeur anneau = " + valanneau1 );
                        break;
                    case 2:


                        valanneau1 = 2;
                        out.println ( " valeur anneau = " + valanneau1 );
                        break;
                    case 3:

                        valanneau1 = 3;
                        out.println ( " valeur anneau = " + valanneau1 );
                        break;
                    case 4:

                        valanneau1 = 4;
                        out.println ( " valeur anneau = " + valanneau1 );
                    case 5:

                        valanneau1 = 5;
                        out.println ( " valeur anneau = " + valanneau1 );
                        break;
                    case 6:

                        valanneau1 = 6;
                        out.println ( " valeur anneau = " + valanneau1 );
                        break;
                    case 7:

                        valanneau1 = 7;
                        out.println ( " valeur anneau = " + valanneau1 );
                        break;
                    case 8:

                        valanneau1 = 8;
                        out.println ( " valeur anneau = " + valanneau1 );
                        break;
                    case 9:

                        valanneau1 = 9;
                        out.println ( " valeur anneau = " + valanneau1 );
                        break;

                    default:
                        break;
                }
                    out.println (" COULEUR DE VOTRE DEUXIEME ANNEAUX ");
                    out.println ( " NOIR + 0 'MARRON = 1, ROUGE = 2, ORANGE = 3, JAUNE = 4, VERT = 5 " );
                    out.println ( " BLEU = 6, VIOLET = 7, GRIS = 8, BLANC = 9, " );
                    int couleuran2;
                    couleuran2 = scanner.nextInt ();

                    switch (couleuran2) {
                        case 1:

                            int valanneau2 = 1;
                            out.println ( " valeur anneau = " + valanneau2 );
                            break;
                        case 2:


                            valanneau2 = 2;
                            out.println ( " valeur anneau = " + valanneau2 );
                            break;
                        case 3:

                            valanneau2 = 3;
                            out.println ( " valeur anneau = " + valanneau2 );
                            break;
                        case 4:

                            valanneau2 = 4;
                            out.println ( " valeur anneau = " + valanneau2 );
                        case 5:

                            valanneau2 = 5;
                            out.println ( " valeur anneau = " + valanneau2 );
                            break;
                        case 6:

                            valanneau2 = 6;
                            out.println ( " valeur anneau = " + valanneau2 );
                            break;
                        case 7:

                            valanneau2 = 7;
                            out.println ( " valeur anneau = " + valanneau2 );
                            break;
                        case 8:

                            valanneau2 = 8;
                            out.println ( " valeur anneau = " + valanneau2 );
                            break;
                        case 9:

                            valanneau2 = 9;
                            out.println ( " valeur anneau = " + valanneau2 );
                            break;

                        default:
                            break;
                    }
                        /* CALCUL ANNEAU3 */
                        out.println ( " COULEUR DE VOTRE TROISIEME ANNEAUX " );
                        out.println ( " NOIR + 0 'MARRON = 1, ROUGE = 2, ORANGE = 3, JAUNE = 4, VERT = 5 " );
                        out.println ( " BLEU = 6, VIOLET = 7, GRIS = 8, BLANC = 9, " );

                        int couleuran3 = scanner.nextInt ();

                        switch (couleuran3) {
                            case 1:

                                int valanneau3 = 1;
                                out.println ( " valeur anneau = " + valanneau3 );
                                break;
                            case 2:


                                valanneau3 = 10;
                                out.println ( " valeur anneau = " + valanneau3 );
                                break;
                            case 3:

                                valanneau3 = 100;
                                out.println ( " valeur anneau = " + valanneau3 );
                                break;
                            case 4:

                                valanneau3 = 1000;
                                out.println ( " valeur anneau = " + valanneau3 );
                            case 5:

                                valanneau3 = 10000;
                                out.println ( " valeur anneau = " + valanneau3 );
                                break;
                            case 6:

                                valanneau3 = 100000;
                                out.println ( " valeur anneau = " + valanneau3 );
                                break;
                            case 7:

                                valanneau3 = 1000000;
                                out.println ( " valeur anneau = " + valanneau3 );
                                break;
                            case 8:

                                valanneau3 = 10000000;
                                out.println ( " valeur anneau = " + valanneau3 );
                                break;
                            case 9:

                                valanneau3 = 1000000000;
                                out.println ( " valeur anneau = " + valanneau3 );
                                break;

                            default:
                                valanneau3 = 1;
                                valresiste = (( valanneau1 * 10 ) * valanneau3) + ( valanneau2 ) * valanneau3;
                                out.println ( " VALEUR DE VOTRE RESISTANCE = " + valresiste );


                                break;

                                case 14:
                            out.println ( " VOTRE RESISTANCES A 4 anneaux" );

                            break;
                        case 15:
                            out.println ( " VOTRE RESISTANCES A 5 ANNEAUX " );
                            break;
                    }
                }


            }
        }



    }
