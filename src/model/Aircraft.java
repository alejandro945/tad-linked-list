package model;

public class Aircraft implements Comparable<Aircraft> {

    private int id;

    public Aircraft(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    @Override
    public int compareTo(Aircraft o) {
        return id - o.getId();
    }

    @Override
    public String toString(){
        return id+"";
    }

}
