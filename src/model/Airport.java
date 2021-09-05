package model;

import collection.*;

public class Airport {
    
    private ILinkedList<Aircraft> i;
    public Airport(){
        i = new LinkedList<>();   
    }

    public void init (){
        System.out.println(i.isEmpty());
        System.out.println(i.addNode(new Aircraft(5)));
        System.out.println(i.addNode(new Aircraft(4)));
        System.out.println(i.addNode(new Aircraft(1)));
        System.out.println(i);
        System.out.println(i.size());
        System.out.println(i.searchNode(1));
        System.out.println(i.editNode(0, new Aircraft(9)));
        System.out.println(i);
    }

}
