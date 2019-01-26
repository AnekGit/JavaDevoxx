package com.devoxx.java;

import jdk.nashorn.internal.runtime.regexp.joni.Syntax.MetaCharTable;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
public class CollectionAwakens {
    public static void main(String... args){

        System.out.println("Here is my code ");

        List<String> jedis = new ArrayList(asList("Anek","roul"));

        for(String jedi : jedis){
            if(Character.isLowerCase(jedi.charAt(0)))
                jedis.remove(jedi);
            System.out.println(jedi);
        }

    }
}
