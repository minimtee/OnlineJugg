public Solution{
	public static void main(String[] args){
		Tester tester = new Tester();
		tester.check("...\\....\\....\\....");
	}
}

class Tester{
	public void check(String pattern){
		Scanner scan = new Scanner(System.in);
		String testString = scan.nextLine();
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(testString);
		boolean match = m.matches();

		System.out.println("%s",match);
	}
}