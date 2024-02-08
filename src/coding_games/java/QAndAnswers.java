package coding_games.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class QAndAnswers {
    private Map<String,String> qaMap= new HashMap<>();
    private void populateMap(){
        qaMap.put("la serialisation","permet de convertir le type d'un attribut ou d'une methode dans un autre type" +
                "\n permet de rendre un objet persisitant pour stockage et utilisation ulterieur ou echange avec applications");
        qaMap.put("choose the method which releases all the monitor locks on objects held by a thread","wait()");
        qaMap.put("how many abstract method are there in a functional interface","1");
        qaMap.put("what is true about transcient ","transient avoid the serialization of an attribute or an object");
        qaMap.put("all module(package, classe, methode) should be open to modification and closed to extension","faux");
        qaMap.put("pour communiquer avec une machine via TCP/IP, on peut utiliser la out les classes ","Socket");
        qaMap.put("which statement is true regarding methods declared as volatile?","method can't be declared as volatile");
        qaMap.put("what is the result of 2>>1","method can't be declared as volatile");
        qaMap.put("a method declared as final means","method can't be overridden");
        qaMap.put("le garbage collector garanti qu'il y a suffisamment de memoir pour executer un programme java","faux");


    }


    public static String computeGameState(String nameP1, String nameP2, String[] wins) {
        int scoreP1 = 0;
        int scoreP2 = 0;

        for (String winner : wins) {
            if (winner.equals(nameP1)) {
                scoreP1++;
            } else if (winner.equals(nameP2)) {
                scoreP2++;
            }

            String gameState = getCurrentState(nameP1, scoreP1, nameP2, scoreP2);
            if (!gameState.equals("")) {
                return gameState;
            }
        }

        return formatScore(nameP1, scoreP1) + " - " + formatScore(nameP2, scoreP2);
    }

    private static String getCurrentState(String nameP1, int scoreP1, String nameP2, int scoreP2) {
        if (scoreP1 >= 3 && scoreP2 >= 3) {
            if (scoreP1 == scoreP2) {
                return "DEUCE";
            } else if (Math.abs(scoreP1 - scoreP2) == 1) {
                return (scoreP1 > scoreP2) ? "ADVANTAGE " + nameP1 : "ADVANTAGE " + nameP2;
            } else if (Math.abs(scoreP1 - scoreP2) == 2) {
                return (scoreP1 > scoreP2) ? nameP1 + " WINS" : nameP2 + " WINS";
            }
        }

        return "";
    }

    private static String formatScore(String playerName, int score) {
        String[] scoreLabels = {"0", "15", "30", "40"};

        if (score <= 2) {
            return playerName + " " + scoreLabels[score];
        } else {
            return playerName + " " + scoreLabels[3];
        }
    }
    private static void main(String [] args){
        String s = null;
        System.out.println(s);
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(1));
        hashSet.add(Integer.valueOf(1));
        hashSet.add(Integer.valueOf(2));


    }
}
