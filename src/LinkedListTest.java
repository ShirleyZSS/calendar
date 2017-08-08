import java.util.*;

/**
 * Created by Shirley on 2017/7/30.
 */
public class LinkedListTest {
    public static void main(String[] args){
        List<String> a=new LinkedList<>();
        a.add("Amy");
        a.add("Carl");
        a.add("Erica");

        List<String> b= new LinkedList<>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");

        ListIterator<String> aIter=a.listIterator();
        ListIterator<String > bIter=b.listIterator();

        while(bIter.hasNext()){
            if(aIter.hasNext())
                aIter.next();
            aIter.add(bIter.next());
        }
        System.out.println(a);
    }
}
