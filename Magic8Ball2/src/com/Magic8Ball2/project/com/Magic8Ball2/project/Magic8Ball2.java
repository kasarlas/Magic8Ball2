package com.Magic8Ball2.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Magic8Ball2 {

	// Java compiler creates a "default constructor"
	/*
	 * public Magic8Ball2(){ }
	 */
	private String question;
	private List<String> answers; // A type of Java Collections

	// Random rand = new Random();
	// int choice = (int) (Math.random()*4);//Get a random number from 1to 4

	public Magic8Ball2() {
		// Initialize variables here
		this.question = "Test";
		answers = new ArrayList<String>();
		answers.add("As I see it Yes");
		answers.add("Ask again later");
		answers.add("Yes");
		answers.add("No");

	}

	public boolean askQuestion(String question) {
		if (question instanceof String) {
			this.question = question;
			return true;
		} else {
			return false;
		}
	}

	public String getQuestion() {
		return question;
	}

	public String shake() {
		// ?? Return a random element from the list
		// ??? Use Random class to create random number
		// ?? Use random number to get element from arraylist
		// int randomIndex = (int) (Math.random() * 4);
		Random rand = new Random();
		int randomIndex = rand.nextInt(4);
		System.out.println("Your answer is: " + answers.get(randomIndex));
		return answers.get(randomIndex);

	}

}
