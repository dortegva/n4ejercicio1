package ex1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest1 {
    static private   ArrayList<String> mesos = new ArrayList<>();

    @BeforeAll
    public static void prepararTest(){

        mesos.add("gener");
        mesos.add("febrer");
        mesos.add("març");
        mesos.add("abril");
        mesos.add("maig");
        mesos.add("juny");
        mesos.add("juliol");
        mesos.add("agost");
        mesos.add("setembre");
        mesos.add("octubre");
        mesos.add("novembre");
        mesos.add("desembre");
    }

    @Test
    public void test1(){

        Assertions.assertEquals(12,mesos.size());
    }
    @Test
    public void test2 (){


        Assertions.assertNotNull(mesos);
    }

    @Test
    public void test3(){

        Assertions.assertEquals(mesos.get(7),"agost");
    }

}