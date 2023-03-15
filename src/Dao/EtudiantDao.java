package Dao;
import model.Etudiant;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import lombok.*;
//import org.springframework.stereotype.Component;

@Data @AllArgsConstructor
public class EtudiantDao implements IDao<Etudiant,Long>{

        @Override
        public Etudiant trouverParID(Long id) {
            System.out.println("[DAO - DS volatile] trouver le credit n° : " + id);
            return BDCredits()
                    .stream()
                    .filter(credit -> credit.getId() == id)
                    .findFirst()
                    .get();
        }
        public static Set<Etudiant> BDCredits(){
            return new HashSet<Etudiant>(
                    Arrays.asList(
                            new Etudiant(1L,"kawthar", Arrays.asList(85.0, 92.0, 78.0, 90.0)),
                            new Etudiant(2L,"kawthar", Arrays.asList(85.0, 92.0, 78.0, 90.0)),
                            new Etudiant(3L,"20000.0", Arrays.asList(85.0, 92.0, 78.0, 90.0)),
                            new Etudiant(4L,"650000.060", Arrays.asList(85.0, 92.0, 78.0, 90.0))
                    )
            );
        }

    }

