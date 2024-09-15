//package Arrays;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;
//import java.util.*;
//public class posNeg {
//    void rearrange(int arr[], int n) {
//        // Define array for storing the ans separately.
//        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));
//
//        // positive elements start from 0 and negative from 1.
//        int posIndex = 0, negIndex = 1;
//        for (int i = 0; i < n; i++) {
//
//            // Fill negative elements in odd indices and inc by 2.
//            if (arr.get(i) < 0) {
//                ans.set(negIndex, arr.get(i));
//                negIndex += 2;
//            }
//
//            // Fill positive elements in even indices and inc by 2.
//            else {
//                ans.set(posIndex, arr.get(i));
//                posIndex += 2;
//            }
//        }
//
//        return ans;
//    }
//}
