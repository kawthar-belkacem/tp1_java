import lombok.var;
import presentation.EtudiantControleur;
import presentation.IEtudiantControleur;
import model.Etudiant;
import Metier.EtudiantMetier;
import Metier.IEtudiantMetier;
import Dao.EtudiantDao;
import Dao.IDao;
import java.util.Scanner;

public class simulateur {
    public static class SimulateurDeEtudiant {
        static Scanner clavier = new Scanner(System.in);
        static IEtudiantControleur creditControleur;

        private static boolean estUnNombre(String input){
            try {
                Integer.parseInt(input);
                return true;
            }
            catch (Exception e ){
                return false;
            }
        }

        public static void test(){
            // instanciation des différents compsants de l'application
            var dao = new EtudiantDao();
            var metier = new EtudiantMetier();
            var controleur = new EtudiantControleur();
            // injection des dépendances
            metier.setEtudiantdao(dao);
            controleur.setEtudiantMetier(metier);
            // tester
            String rep = "";
            do {
                System.out.println("=>  calcule la moyenne d etudiant <= \n");
                try {
                    String input = "";
                    while (true){
                        System.out.println("=> Entrez l'id d etudiant : ");
                        input = clavier.nextLine();
                        if (estUnNombre(input)) break;
                        System.err.println("Entrée non valide !!!");
                    }
                    long id = Long.parseLong(input);
                    controleur.afficher_Moyenne(id);
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
                System.out.println("Voulez vous quittez (oui/non) ? ");
                rep = clavier.nextLine();
            }while (!rep.equalsIgnoreCase("oui"));
            System.out.println("Au revoir ^_^");
        }
    }

}
