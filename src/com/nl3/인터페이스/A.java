package com.nl3.인터페이스;

public class A {
    private X x;    //2.인터페이스는 참조만 가능

    public void setX(X x) { //세터: 인터페이스 결합역할
        this.x = x;
    }

    public A() {
//        x = new X();  1.인터페이스는 객체생성불가
    }

    public void output() {
        int total = x.total();

        System.out.println("total is " + total);
    }
}
