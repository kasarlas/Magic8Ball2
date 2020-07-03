package com.Magic8Ball2.project;

public class Magic8BallDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Magic8Ball2 obj = new Magic8Ball2();
		System.out.println(obj.shake());
		System.out.println(obj.askQuestion(obj.getQuestion()));
	}

}
