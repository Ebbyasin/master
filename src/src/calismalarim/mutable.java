package src.calismalarim;

import java.util.ArrayList;
import java.util.List;

public class mutable {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("kenan");
        list.add("enes");
        list.add("ismail");
        System.out.println(list);

        list.set(1,"yasemin");
        System.out.println(list);

        list.remove("ismail");
        System.out.println(list);




    }
}
