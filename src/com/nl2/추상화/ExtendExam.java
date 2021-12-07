package com.nl2.추상화;

public class ExtendExam extends Exam {

    private int com;
    public ExtendExam() {
        this(0,0,0,0);
    }

    public ExtendExam(int kor, int eng, int math, int com) {
        super(kor, eng, math);
        this.com = com;
    }

    public int getCom() {
        return com;
    }

    public void setCom(int com) {
        this.com = com;
    }

    @Override
    public int total() {
        int total = onTotal() + com;
        return total;
    }

    @Override
    public float avg() {
        return total() / 4.0f;
    }
}
