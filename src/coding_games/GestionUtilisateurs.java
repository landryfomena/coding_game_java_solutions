package coding_games;

import java.util.HashMap;
import java.util.Map;

public class GestionUtilisateurs {
    Map<Integer, String> utilisateursmap = new HashMap<>();

    public void ajouterUtilisateur(int identifiant, String nom) {
        utilisateursmap.put(identifiant, nom);
    }
    public String trouverNom(int identifiant) {
        return  utilisateursmap.get(identifiant);
    }
}
