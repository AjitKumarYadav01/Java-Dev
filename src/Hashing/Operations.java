package Hashing;

import java.util.HashSet;

public class Operations {
    //Operations on HashSet
    public static void main(String[] args) {
        //Creating a HashSet
        HashSet <Integer> set = new HashSet<>();

        //Adding elements into the HashSet
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(10);

        //Printing the HashSet
        System.out.println(set);

        //Searching an element in the HashSet
        System.out.println(set.contains(30));

        //Removing an element from the HashSet
        set.remove(30);
        System.out.println(set);

        //Size of the HashSet
        System.out.println(set.size());

        //Iterating over the HashSet
        for(int x : set){
            System.out.println(x);
        }
    }
}
