package LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class find_all_duplicates {
    public List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
            }
            else
                i++;
        }
        List<Integer> ans = new ArrayList<>();
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i)
                ans.add(i);
        }
        return ans;
    }

    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
