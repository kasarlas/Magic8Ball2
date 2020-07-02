package com.Magic8Ball2.project;

import java.util.ArrayList;
import java.util.List;

public class Magic8Ball2 {
	
	//Java compiler creates a "default constructor"
	/*
	 * public Magic8Ball2(){
	 * }
	 * 
	 */
	private String question;
	private List<String> answers; //A type of Java Collections
	
	public Magic8Ball2(){
		//Initialize variables here
		this.question = null;
		answers = new ArrayList<String>();
		answers.add("As I see it Yes");
		answers.add("ASk again later");
		answers.add("Yes");
		answers.add("No");
				
	}

	public boolean askQuestion(String question) {
		// TODO Auto-generated method stub
		if(question instanceof String){
			this.question = question;
			return true;
		}
			else{
				return false;
			}
					}

	public String getQuestion() {
		// TODO Auto-generated method stub
		return question;
	}

	public String shake() {
		// TODO Auto-generated method stub
	//??Return a random element from the list
		//??? Use Random class to create random number
		//??User random number to get element from arraylist
		return "ask again later.";
	}

	
	}
	
