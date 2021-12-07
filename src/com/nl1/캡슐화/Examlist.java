package com.nl1.캡슐화;

public class Examlist {
     
    private Exam[] score;
    int counter;
    
    public Examlist() {   //생성자
        score = new Exam[2];
        counter = 0;
    }
    
    public void add(Exam ex) {
        //배열 크기 늘리기
        Exam[] origin = score;  
        int size = counter;  
        if (origin.length == size) {   //실제 배열길이와 카운터를 비교
            Exam[] tmp = new Exam[size + 1];    //비교값이 같으면 배열이 값으로 꽉찬상태. 배열길이+1의 임시배열 생성
            for (int i=0; i<size; i++) {    //입력받은 배열값을 임시배열로 옮기고, exams는 임시배열을 참조(길이+1)
                tmp[i] = origin[i];    
                score = tmp;       
            }
        }
        score[counter] = ex;  //exams[]의 마지막 index에 마지막으로 입력받은 값 exam을 입력
        counter++;
        System.out.println("────────────────────────");
    }    

    

    public Exam get(int i) {
        return score[i];
    }

    public int size() {
        return counter;
    }
}


