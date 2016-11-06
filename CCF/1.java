public class Main{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int[] array = new int[number];
		for(int i = 0;i < number;i++){
			array[i] = scan.nextInt();
		}
		scan.close();

		Map<Integer,Integer> wholeMap = new HashMap<Integer,Integer>();
		for (int x : array) {
			if(!wholeMap.containsKey(x)){
				wholeMap.put(x,1);
			}else{
				wholeMap.put(x,wholeMap.get(x)+1);
			}
		}

		List<Integer> resultList = new LinkedList<Integer>();
		int max_appear = 0;

		for(int x : wholeMap.keySet()){
			if(wholeMap.get(x) > max_appear){
				resultList.removeAll();
				resultList.add(x);
				max_appear = wholeMap.get(x);
			}
			if(wholeMap.get(x) == max_appear){
				resultList.add(x);
			}
		}

		int minResult = resultList.get(0);
		for (int x : resultList) {
			minResult = (x < minResult)?x:minResult;
		}

		System.out.printf(minResult);
	}
}