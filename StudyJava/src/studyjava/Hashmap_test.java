/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyjava;

import java.util.WeakHashMap;

/**
 *
 * @author ADMIN
 */
public class Hashmap_test {
    public static void main(String[] args) {
        WeakHashMap map = new WeakHashMap();
        String[] s = {"i", "i", "b", "t", "b"};
        for (int i = 0; i < s.length; i++) {
            map.put(i, s[i]);
        }
        System.out.println(map.size() + " " + map);
    }
}
