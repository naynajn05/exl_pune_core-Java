package com.tnsif.multiinheritancedemo;

public class MLIDemo {

	public static void main(String[] args) {
		Word word=new Word();
		
		word.write("Hello ");
		word.formatText(true);
		word.write("Everyone...");
		word.displayData();
		
		word.spellCheck();
		word.enableSpellCheck(true);
		System.out.println(word.isBold());
		

	}

}
