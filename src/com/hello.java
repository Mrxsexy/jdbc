package com;


import java.util.Scanner;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author 19616
 * @Date 2021/1/7 19:53
 */

interface Person {
    void run();
    String getName();
}

class Student implements Person {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    /**
     * Constructs a new object.
     */
    public Student() {
        super();
    }

    @Override
    public void run() {
        System.out.println(this.name + "run");
    }

    @Override
    public String getName() {
        return this.name;
    }
}

public class hello {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int i=0; i<arr.length; i++){
            int n = arr[i];
            System.out.println(n);
        }

    }

}

