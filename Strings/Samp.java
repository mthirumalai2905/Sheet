import java.util.HashMap;

public class Samp {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3,2,2,1,1,2,1,3};
        HashMap<Integer, Integer> map = new HashMap();

        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(int num : map.keySet()){
            System.out.println(num);
        }

        System.out.println(map.keySet());
        System.out.println(map.values());


        Character a = 'a';
        int a_val = (int) a;
        System.out.println(a_val);
    }
}
