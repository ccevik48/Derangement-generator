/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package derangement;

import java.util.*;
import java.io.*;

/**
 *
 * @author Can
 */
public class Derangement {
    /**
     * 
     * @param n : number of objects being considered
     * @return  : an array which is a derangement of an array of size 'n'
     */
    public static int[] derange(int n) {
        int[] arr = new int[n];
        Queue<Integer> q = new LinkedList(); //use a queue to ensure every number from 1 to 'n' is used once
        Random r = new Random();             //used to randomly index the current number
        for (int i = 0; i < n; i++) {
            q.add(i);
        }
        for (int i = 0; i < n; i++) {        //initialize array elements with -1
            arr[i] = -1;
        }
        int tmp = 0;                         //temporary variable to help with indexing
        while (!q.isEmpty()) {
            do {
                tmp = r.nextInt(n);          //keep generating a random number until a usable index is found
            } while (tmp == q.peek() && (arr[tmp] != -1));
            if (arr[tmp] > -1 || tmp == q.peek()) {
                    //do nothing if index is the same as tmp or is taken by another number
            } else {
                arr[tmp] = q.remove();
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i]+1;
        }

        return arr;
        //IGNORE THIS BIT OF CODE
        /*Random rand = new Random();
        int[] result = new int[n];
        SortedMap<Double, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            map.put(rand.nextDouble(), i);
        }
        int i = 0;
        for (Double key : map.keySet()) {
            result[i] = map.get(key);

            i++;
        }
        return result;*/
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(derange(7))); //change to however many n is needed
    }

}
