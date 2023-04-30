import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class testone {
    // some comment here
    //another comment
    public static void main(String[] args) {
        // code here

        // another one


        System.out.println(bigSmall(new ArrayList<>(Arrays.asList(5,2,0,7,15,1,99,-21))));
    }

    public static ArrayList<Integer> bigSmall (ArrayList<Integer> list){
        Collections.sort(list);
        System.out.println(list);
        ArrayList<Integer> result=new ArrayList<>();

        int j=list.size()-1;
        for (int i = 0; i < list.size()/2+1;) {
            if (i<j) {
                result.add(list.get(i));
                result.add(list.get(j));
            } else if(i==j) {
                result.add(list.get(i));
                return result;
            }
            j--;
            i++;
        }
        return  result;
        }

    }




