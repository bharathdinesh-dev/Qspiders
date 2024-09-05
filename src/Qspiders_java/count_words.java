package Qspiders_java;

public class count_words {

	public static void main(String[] args) {
		System.out.println("*********************************");
		System.out.println("Count words in the string");
		System.out.println("*********************************");
		String st="hi hello vanakkam";
		String[] str=st.split(" ");
		int count=0;
		for(int i=0;i<str.length;i++) {
			count++;
		}
		System.out.println(count);//3
	}

}
/*
*********************************
Count words in the string
*********************************
*/
