//5g. Write a program to copy arraylist to an array.
import java.util.ArrayList;

public class CopyArrayListToArray {

    public static void main(String a[]){
        ArrayList<String> arrl = new ArrayList<String>();
        arrl.add("One");
        arrl.add("Two");
        arrl.add("Three");
        arrl.add("Rand");
        System.out.println("Real ArrayList:"+arrl);
        String[] strArr = new String[arrl.size()];
        arrl.toArray(strArr);
        System.out.println("Created Array content:");
        for(String str:strArr){
            System.out.println(str);
        }
    }
}