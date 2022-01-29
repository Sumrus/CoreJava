package test;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Clean World Green World";
		int vowelCount = 0;
		
		for(int index=0;index<str1.length();index++) {
			
			char temp = str1.charAt(index);
			
			switch(temp) {
			case 'a': case 'e' : case 'i' : case 'o' : case 'u' :
				vowelCount++;
				break;
				
				default:
					System.out.println("No vowles");
				
			}
		}
		
		System.out.println(vowelCount);

	}

}
