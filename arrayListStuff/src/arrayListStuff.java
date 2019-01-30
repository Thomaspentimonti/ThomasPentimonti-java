import java.util.*;
public class arrayListStuff {
    public static void main(String[] args) {
        plural();


    }
    public static void plural (){
        ArrayList <String> list = new ArrayList<>();
        list.add("Sally");
        list.add("Tims");
        list.add("Johns");
        list.add("Billy");
        for(int i =0; i < list.size() -1; i++){
            if (list.get(i).endsWith("s")){
                list.remove(i);
                i=0;
            }
        }
        System.out.println(list);
    }

}

