/*
You are given a class Solution and its main method in the editor.
Your task is to create a class Prime. The class Prime should contain a single method checkPrime.

Sample Input

2
1
3
4
5
Sample Output

2
2
2 3
2 3 5

*/

import static java.lang.System.*;

class Prime{
    public void checkPrime(int... nums){
        List<Integer> primeList = new LinkedList<Integer>();
        primeList.add(2);

        // for every elements in the varargs
        for(int num :nums){
            boolean isPrime = true;
            // go through all elements in the prime list
            outer:for(int i :primeList){
                if(num%i == 0 && num != 2){
                    isPrime = false;
                    break outer;
                }
                if(i > (num/2)+1 ){
                    break outer;
                }
            }
            if(isPrime == true && num != 1){
                primeList.add(num);
                System.out.printf("%d ",num);
            }
        }
        System.out.println();
    }
}

public class Solution {

	public static void main(String[] args) {
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int n4=Integer.parseInt(br.readLine());
		int n5=Integer.parseInt(br.readLine());
		Prime ob=new Prime();
		ob.checkPrime(n1);
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4,n5);
		Method[] methods=Prime.class.getDeclaredMethods();
		Set<String> set=new HashSet<>();
		boolean overload=false;
		for(int i=0;i<methods.length;i++)
		{
			if(set.contains(methods[i].getName()))
			{
				overload=true;
				break;
			}
			set.add(methods[i].getName());

		}
		if(overload)
		{
			throw new Exception("Overloading not allowed");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
