public class Solution{
	public static void main(String[] args){
		Regex_Test tester = new Regex_Test();
		tester.checker("hackerrank");
	}
}

class Regex_Test{
	public void checker(String Regex_Pattern){
		Scanner scan = new Scanner(System.in);
		String Test_String = Input.nextLine();
		Pattern p = Pattern.compile(Regex_Pattern);
		Matcher m = p.matcher(Test_String);
		int count = 0;
		while(m.find()){
			count += 1;
		}
		System.out.format("Number of matches : %d",count);
	}
}