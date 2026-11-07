package videoYt.Data;

import java.util.ArrayList;
import java.util.List;

public class binaria {

    public static int bynarySearch(List<Integer> list, int item){
        int low = 0;
        int high = (list.toArray().length) - 1;

        while (low <= high){
            int mid = (low + high) / 2;
            int kick = list.get(mid);

            if (kick == item){
                return mid;
            }
            if (kick > item){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return 0; // = none do livro
    }


    public static void main(String[] args) {

        List myListSearch = List.of(1,3,5,7,9);

        System.out.println(bynarySearch(myListSearch, 3));

    }
}
