package Qspiders_java;

public class CountLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="hi jerin broo";
		int count=0;
		for(int i=0;i<st.length();i++) {
			if(st.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println(count);//11
	}

}
