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

    public static int[] derange(int n) {
        int[] arr = new int[n];
        Queue<Integer> q = new LinkedList();
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            q.add(i);
        }
        for (int i = 0; i < n; i++) {
            arr[i] = -1;
        }
        int tmp = 0;
        while (!q.isEmpty()) {
            do {
                tmp = r.nextInt(n);
            } while (tmp == q.peek() && (arr[tmp] != -1));
            if (arr[tmp] > -1 || tmp == q.peek()) {

            } else {
                arr[tmp] = q.remove();
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i]+1;
        }

        return arr;
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
        System.out.println(Arrays.toString(derange(7)));
    }

}
