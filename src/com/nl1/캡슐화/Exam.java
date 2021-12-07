package com.nl1.캡슐화;

public class Exam {
	private int kor;
	private int eng;
	private int math;
	
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
    public void setEng(int eng) {
		this.eng = eng;
    }
    public void setMath(int math) {
		this.math = math;
    }
    public int total() {
        return kor + eng + math;
    }
	public float avg() {
		return total() / 3.0f;
	}

	
}

