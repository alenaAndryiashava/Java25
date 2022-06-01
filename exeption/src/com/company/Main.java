package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args){

        Person person = new Person(null);

        /*PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(2);
        queue.add(6);
        queue.add(3);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

         */
        Main main = new Main();
        try {
            System.out.println(main.method2(10,0));
        } catch (MyUncheckedException e) {
            e.print();
        }


        try {

            main.method3();
        } catch (IOException | InterruptedException e) {
            System.out.println("IO and Interrupted handler");
            System.out.println(e.getClass().getSimpleName());
            e.printStackTrace();

        }catch (Exception e){
            System.out.println("!!!!!!!");
            System.out.println(e.getClass().getSimpleName());
            e.printStackTrace();
        }
        /*
        try {
            main.method2(10,0);
        }catch (MyUncheckedException e){
            e.print();
        }

         */


    }
    public int method(int a, int b){
        try{
            int res = a/b;
            return res;
        } catch (ArithmeticException e){
            System.out.println("Error");
            throw e;
        }finally {
            System.out.println("B finally корректно закрываем используемые ресурсы");
        }


    }
    public int method1(int a, int b) {
        try {
            int res = a / b;
            return res;
        } catch (ArithmeticException e) {
            System.out.println("Error");
            throw new ArithmeticException("Divide by 0!!!");
        }
    }
    public int method2(int a, int b) {
        if (b == 0) {
            throw new MyUncheckedException("myChecked");
        }
        int res = a / b;
        return res;
    }
    public void method3() throws IOException,InterruptedException {
        int temp = 10/2;
        try {
            FileReader fileReader = new FileReader("Tree (1).java");
            fileReader.read();
        }catch (FileNotFoundException e){
            throw  new UncheckedFileNotFoundException("file not found file.txt",e);
        }
        Thread.sleep(1000);
    }
}
