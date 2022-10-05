import java.util.Iterator;
import java.util.LinkedList;
//https://www.youtube.com/watch?v=YQQio9BGWgs
public class Linky {

    public static void main(String[] args) {
        LinkedList <Integer> linky = new LinkedList<Integer>();
         //<> tells what type, it's good programing practice but I think java automatically
        // recognizes the type
        linky.add(6);
        linky.add(78);
        linky.add(1);

        linky.remove(2);

        System.out.println(linky.get(1));

        Iterator it = linky.iterator();
        while(it.hasNext()) { //while iterator has something next
            if((int) it.next() == 78) { //make sure to cast
                System.out.println("we found 78");
            }
        }

    }
}
