/*
You are given n pairs of strings.
Two pairs (a,b) and (b,a) are identical if a=c and b=d.
That also implies (a,b) is not same as (b,a).
After taking each pair as input, you need to print number of unique pairs you currently have.

Sample Input

5
john tom
john mary
john tom
mary anna
mary anna
Sample Output

1
2
2
3
3

*/

public class Solution{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] pair_left = new String[n];
		String[] pair_right = new String[n];

		for(int i = 0;i<n;i++){
			pair_left[i]  = scan.next();
			pair_right[i] = scan.next();
		}

		Set<String> pair_set = new HashSet<String>();

		for(int i = 0;i<n;i++){
			pair_set.add(pair_left[i] + "" +pair_right[i]);
			System.out.println(pair_set.size());
		}
	}

}