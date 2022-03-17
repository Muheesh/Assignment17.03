package com.harman.assignment;

abstract class Parent {
    abstract void printhere();
}
class child1 extends Parent{
    void printhere(){
        System.out.println("This is sub class 1");
    }


}
class child2 extends Parent{
    void printhere() {
        System.out.println("This is sub class 2");
    }
}
class General {
    public static void main(String[] args) {
        Parent data1 = new child1();
        Parent data2 = new child2();
        data1.printhere();
        data2.printhere();
    }
}