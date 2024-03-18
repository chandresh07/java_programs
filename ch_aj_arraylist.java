import java.util.ArrayList;
import java.util.Collections;

public class ch_aj_arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);
        l2.add(15);


        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        l1.addAll(l2);    
        
            //  l1.clear(); clear the array list 

            // l1.contains(2);

            // l1.set(3,7);
            //  Collections.sort(l1);
            //  System.out.println(l1.contains(5));
            //   System.out.println(l1);
        for(int i=0; i<l1.size(); i++){
            System.out.println(l1.get(i));
        }
        
    }
}
