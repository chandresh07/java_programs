import java.util.ArrayDeque;

class arraydeque {
    public static void main(String[] args) {
        

        ArrayDeque<Integer>  ad = new ArrayDeque<>();

        ad.add(1);
        ad.add(2);
        ad.add(5);
        ad.add(34);

        ad.addFirst(0);
        ad.addLast(100);
        

        System.out.println(ad);
    }
}