import java.util.*;
/**
Inputs : number of passengers in flight, number of connections, seat number for voucher
Output : number of passegers to get vouchers ,passengers id
**/
public class HelloWorld{
    
     public static void main(String []args){
        long startTime = System.nanoTime();
        Scanner sc = new Scanner(System.in);
        ArrayList<Set<Integer>> outer = new ArrayList<Set<Integer>>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        int pas = sc.nextInt();
        int con = sc.nextInt();
        int seat = sc.nextInt();
        HelloWorld hw = new HelloWorld();
        Set<Integer> all = new HashSet<Integer>();
        for (int i = 0; i < con; i++) {
            Set<Integer> inner = new HashSet<Integer>();
            for (int j = 0; j < 2; j++) {
                int value = sc.nextInt();
                inner.add(value);
                all.add(value);
            }
            outer.add(i, inner);
        }
        for (int k = 0; k < con; k++) {
            for (int m = k+1; m < con; m++) {
                if (hw.mergeLists(outer.get(k), outer.get(m))) {
                    outer.get(k).addAll(outer.get(m));
                    outer.remove(m);
                    con--;
                    k--;
                }
            }
        }
        for (Set<Integer> elem: outer) {
            if (elem.size() >= seat) {
                List sortedList = new ArrayList(elem);
                Collections.sort(sortedList);
                result.add((Integer)(sortedList.get(seat-1)));
            }
        }
        for (int k = 1; k <= pas; k++) {
            if (!all.contains(k) && seat == 1) {
                result.add(k);
            }
        }
        System.out.println(result.size());
        for (Integer num: result) {
            System.out.print(num+ " ");
        }
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        // System.out.println(totalTime);
     }
     
     public boolean mergeLists(Set<Integer> ar1, Set<Integer> ar2) {
         for (Integer val1: ar1) {
           for (Integer val2: ar2) {
              if (val1 == val2) {
                  return true;
              }
            }  
         }
         return false;
     }
}