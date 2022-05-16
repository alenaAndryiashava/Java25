package com.company;

public class Teacher implements TaskObserver{
    //private static Teacher INSTANCE;
    String name;

    public Teacher(String name) {
        this.name = name;
    }
    /*public static Teacher getInstance(String name){
        if(INSTANCE==null){
            INSTANCE=new Teacher(name);
        }
        return INSTANCE;
    }

     */

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void handleEvent(Task task) {
        System.out.println("Thank you. Task will be checked.");
    }
}
