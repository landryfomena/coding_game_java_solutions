package coding_games.jenkins_nexus;

import java.util.HashMap;
import java.util.Map;

public class QuestionAndAnswers {
    private Map<String,String> qaMap= new HashMap<>();
    private void populateMap(){
        qaMap.put("les pipeslines jenkins sont ecrites dans un DSL. a partir de quel langage de programation ce dsl a ete construit " , "Groovy");
        qaMap.put("comment peut-on desactiver l'acces anonyme a Nexus ?" , "securit-> decocher allow anonymous users to acces the server");
        qaMap.put("Qu'arrive-t-il lorsque le nombre maximum d'executors est atteint par un Agent Jenkins ? ?" , "le build est place dans la queue, en attente du prochain excecutor disponible");




    }
}
