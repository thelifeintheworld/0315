package com.test.mor;

public class MultiChoice extends Question {
	 String[] options;
	 int[] answers;
	 public MultiChoice() {}
	 public MultiChoice(String text, String[] options, int[] answers) {
		 this.answers = answers;
		 this.text = text;
		 this.options = options;
		 
	 }
	 public boolean checkAnswer(int[] q) {
			for(int a :q) {
			if(q == null ||q.length == 1)
			{
				return false;
			}else
			{
				return this.answers.equals(q);
			}
			}
			return false;
			}
}
