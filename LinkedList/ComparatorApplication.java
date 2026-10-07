package LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Print {

    private int id;
    private int sal;
    private String name;

    public Print() {
    }

    public Print(int id, int sal, String name) {
        this.id = id;
        this.sal = sal;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getSal() {
        return sal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Sort by ID
class SortById implements Comparator<Print> {

    @Override
    public int compare(Print o1, Print o2) {

        if (o1.getId() > o2.getId()) {
            return 1;
        } 
        else if (o1.getId() < o2.getId()) {
            return -1;
        } 
        else {
            return 0;
        }
    }
}

// Sort by Salary
class SortBySal implements Comparator<Print> {

    @Override
    public int compare(Print o1, Print o2) {

        if (o1.getSal() > o2.getSal()) {
            return 1;
        } 
        else if (o1.getSal() < o2.getSal()) {
            return -1;
        } 
        else {
            return 0;
        }
    }
}

// Sort by Name
class SortByName implements Comparator<Print> {

    @Override
    public int compare(Print o1, Print o2) {

        return o1.getName().compareTo(o2.getName());
    }
}

public class ComparatorApplication {

    public static void main(String[] args) {

        ArrayList<Print> at = new ArrayList<>();

        at.add(new Print(5, 400, "ABC"));
        at.add(new Print(3, 1000, "OPQ"));
        at.add(new Print(2, 700, "XYZ"));
        at.add(new Print(1, 800, "CDE"));
        at.add(new Print(4, 500, "IPL"));

        // Sort by ID
        Collections.sort(at, new SortById());

        System.out.println("Sorted By ID");

        Iterator<Print> it = at.iterator();

        while (it.hasNext()) {

            Print i = it.next();

            System.out.println(
                i.getId() + "\t" +
                i.getName() + "\t" +
                i.getSal()
            );
        }

        // Sort by Salary
        Collections.sort(at, new SortBySal());

        System.out.println("\nSorted By Salary");

        it = at.iterator();

        while (it.hasNext()) {

            Print i = it.next();

            System.out.println(
                i.getId() + "\t" +
                i.getName() + "\t" +
                i.getSal()
            );
        }

        // Sort by Name
        Collections.sort(at, new SortByName());

        System.out.println("\nSorted By Name");

        it = at.iterator();

        while (it.hasNext()) {

            Print i = it.next();

            System.out.println(
                i.getId() + "\t" +
                i.getName() + "\t" +
                i.getSal()
            );
        }
    }
}