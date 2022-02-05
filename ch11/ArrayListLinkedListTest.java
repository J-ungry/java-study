package ch11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class ArrayListLinkedListTest {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(2000000);
        LinkedList ll = new LinkedList();

        System.out.println("순차적으로 추가하기");
        System.out.println("Arr >> "+add1(al));
        System.out.println("Link >> "+add1(ll));
        System.out.println();
        System.out.println("중간에 추가하기");
        System.out.println("Arr >> "+add2(al));
        System.out.println("Link >> "+add2(ll));
        System.out.println();
        System.out.println("중간에 삭제하기");
        System.out.println("Arr >> "+remove2(al));
        System.out.println("Link >> "+remove2(ll));
        System.out.println();
        System.out.println("순차적으로 삭제하기");
        System.out.println("Arr >> "+remove1(al));
        System.out.println("Link >> "+remove1(ll));
        System.out.println();

    }
    public static long add1(List list){
        long start = System.currentTimeMillis();
        for(int i=0; i<1000000; i++) list.add(i+"");
        long end = System.currentTimeMillis();
        return end - start;
    }
    public static long add2(List list){
        long start = System.currentTimeMillis();
        for(int i=0; i<10000; i++) list.add(500+"X");
        long end = System.currentTimeMillis();
        return end - start;
    }
    public static long remove1(List list){
        long start = System.currentTimeMillis();
        for(int i=list.size()-1; i>=0; i--) list.remove(i);
        long end = System.currentTimeMillis();
        return end - start;
    }
    public static long remove2(List list){
        long start = System.currentTimeMillis();
        for(int i=0; i<10000; i++) list.remove(i);
        long end = System.currentTimeMillis();
        return end - start;
    }
}
