package org.zk.gradledemo;

import java.io.InputStream;

public class ResourceTest {

    public static void main(String[] args) {
        InputStream in = ResourceTest.class.getClassLoader().getResourceAsStream("a.txt");
        System.out.println(in);
    }
}
