package coding_games;

import java.util.HashMap;
import java.util.Map;

public class FindNetworkEndpoint {
    public static int findNetworkEndpoint(int startNodeId, int[] fromIds, int[] toIds) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");
        Map nodes= new HashMap<Integer,Integer>();


        for(int i = 0; i < fromIds.length; i++){
            nodes.put(fromIds[i], toIds[i]);
        }
        Integer dep= (Integer) startNodeId;
        Integer nextDest= (Integer) nodes.get(dep);
        Map departures= new HashMap<Integer,Integer>();
        departures.put(dep, nextDest);



        do{
            try{
                System.err.println("dest and dep "+nextDest+" "+dep);
                dep= nextDest;
                nextDest=(int) nodes.get(dep);
                if(departures.get(nextDest)!=null){
                    nextDest= dep;
                    break;
                }else{
                    departures.put(nextDest, nodes.get(nextDest));
                }
            }catch(Exception e){
                System.err.println("dest and dep "+nextDest+" "+dep);
                break;
            }

        }while(nextDest!=null);

        return nextDest;


    }
}
