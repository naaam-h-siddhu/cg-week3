package stackqueue.circulartour;

import java.util.LinkedList;
import java.util.Queue;

class PetrolPump{
    int petrol, distance;

    public PetrolPump(int petrol, int distance) {
        this.petrol = petrol;
        this.distance = distance;
    }
}
public class CircularTour {
    public static int findStart(PetrolPump[] pumps){
        Queue<Integer> queue = new LinkedList<>();

        int p = 0,d = 0;
        for(int i = 0;i< pumps.length;i++){
            p+=pumps[i].petrol;
            d+=pumps[i].distance;
        }
        if(p< d) return -1;

        int surplus = 0,start = 0;
        for (int i = 0; i < pumps.length; i++) {
            surplus+= pumps[i].petrol - pumps[i].distance;
            queue.add(i);
            while(surplus < 0 && !queue.isEmpty()){
                start = queue.poll()+1;
                surplus = 0;

            }

        }
        return start;
    }
    public static void main(String[] args) {


        PetrolPump[] pumps = { new PetrolPump(4,6),
                new PetrolPump(6,5), new PetrolPump(7,3),new PetrolPump(4,5)};

        int ans = findStart(pumps);
        System.out.println("The starting index of truck = "+ans);
    }
}
