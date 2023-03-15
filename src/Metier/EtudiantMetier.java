package Metier;

import Dao.IDao;
import lombok.*;
import model.Etudiant;
import Dao.EtudiantDao;
/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;*/

import java.util.List;

@Data @AllArgsConstructor @NoArgsConstructor

public class EtudiantMetier implements IEtudiantMetier {
    // @Autowired
    // @Qualifier("Dao")
    @Override
    public double calculer_Moyenne(Long id) throws Exception {
        List<Double> notes = Etudiant.getNotes;
        double somme = 0;
        for (Double note : notes) {
            somme += note;
        }
        return somme / notes.size();

    }
}


