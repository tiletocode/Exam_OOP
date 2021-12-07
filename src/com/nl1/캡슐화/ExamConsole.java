package com.nl1.캡슐화;

import java.util.Scanner;
public class ExamConsole {
    Examlist list = new Examlist();
    Scanner sc = new Scanner(System.in);
    void input() {
        System.out.println("      -성적 입력-");
        int kor, eng, math;
        do {
            System.out.print("국어" + (list.counter + 1) + ":");
            kor = sc.nextInt();
            if (kor < 0 || 100 < kor) {
                System.out.println("성적은 0~100까지의 범위만 입력이 가능합니다.");
            }
        } while (kor < 0 || 100 < kor);

        do {
            System.out.print("영어" + (list.counter + 1) + ":");
            eng = sc.nextInt();
            if (eng < 0 || 100 < eng) {
                System.out.println("성적은 0~100까지의 범위만 입력이 가능합니다.");
            }
        } while (eng < 0 || 100 < eng);

        do {
            System.out.print("수학" + (list.counter + 1) + ":");
            math = sc.nextInt();
            if (math < 0 || 100 < math) {
                System.out.println("성적은 0~100까지의 범위만 입력이 가능합니다.");
            }
        } while (math < 0 || 100 < math);

        Exam ex = new Exam();
        ex.setKor(kor);
        ex.setEng(eng);
        ex.setMath(math);

        list.add(ex);
    }
    
    void output() { 
        
        for (int i=0; i<list.size(); i++) {
            Exam exam = list.get(i);
            int kor = exam.getKor();
            int eng = exam.getEng();
            int math = exam.getMath();
            int total = exam.total();
            float avg = exam.avg();
            System.out.println("국어" + (i + 1) + ":" + kor);
            System.out.println("영어" + (i + 1) + ":" + eng);
            System.out.println("수학" + (i + 1) + ":" + math);
            System.out.println("총점" + (i + 1) + ":" + total);
            System.out.println("평균" + (i + 1) + ":" + avg);
            System.out.println("────────────────────────");
        }
    }
}
