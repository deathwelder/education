package ru.hui.pc1;

import java.util.HashMap;

public class Phone {

    HashMap<String, String> hm = new HashMap<>();

    public void add(String w, String q) {

       String NAME = hm.put(w, q);

    }


    public void get(String K) {

        hm.get(K);

        System.out.println(hm.get(K));

    }

}