package model;
import lombok.*;

import java.util.List;

@Data @AllArgsConstructor @NoArgsConstructor

public class Etudiant {

    public static List<Double> getNotes;
    private Long id;
        private String name;
        private List<Double> notes;

    @Override
        public String toString(){
            var etudiantStr = "==================================================================== \n";
        etudiantStr = "=> etudiant n°                  : " + getId() + "                        \n";
        etudiantStr+= "=> Nom d'etudiant: " + getName() + "           \n";
        etudiantStr+= "-------------------------------------------------------------------- \n";
        etudiantStr+= "=> les notes a calculer          : " + getNotes() + "        \n";
  
        etudiantStr+= "==================================================================== \n";

            return etudiantStr;
        }
    }


