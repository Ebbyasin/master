package src.calismalarim;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeCalismalar {
    public static void main(String[] args) throws InterruptedException {



    LocalTime simdi=LocalTime.now();
        System.out.println(simdi);
        Thread.sleep(3000);

        System.out.println(simdi.getSecond());
        System.out.println(simdi.plusSeconds(10000));
        System.out.println(simdi.minusMinutes(200));




    }




}
