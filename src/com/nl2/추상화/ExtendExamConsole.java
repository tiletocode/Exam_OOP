package com.nl2.추상화;

import java.util.Scanner;

public class ExtendExamConsole extends ExamConsole{

    @Override
    protected Exam makeExam()
    {
        return new ExtendExam();
    }

    @Override
    protected void onInput(Exam exam) {
        ExtendExam ee = (ExtendExam)exam;   //exam의 자료형을 ExtendExam으로 형변환
        int com;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.printf("컴퓨터" + (list.counter + 1) + ":");
            com = sc.nextInt();
            if (com < 0 || 100 < com) {
                System.out.println("성적은 0~100까지의 범위만 입력이 가능합니다.");
            }
        } while (com < 0 || 100 < com);
        ee.setCom(com);
    }

    @Override
    protected void onOutput(Exam exam) {
        ExtendExam ee = (ExtendExam)exam;   //exam의 자료형을 ExtendExam으로 형변환
        int com = ee.getCom();
        System.out.println("컴퓨터:" + com);

    }


}
