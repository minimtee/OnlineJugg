/*
Two strings A and B are called anagrams if they consist same characters, but may be in different orders.
So the list of anagrams of CAT is CAT,ACT,TAC,TCA,ATC,CTA .

Given two strings, print Anagrams if they are anagrams, print Not Anagrams if they are not. The strings may consist at most 50 English characters; the comparison should NOT be case sensitive.
*/

    static boolean isAnagram(String a, String b) {
        HashMap<Character,Integer> map_a = new HashMap<Character,Integer>();
        HashMap<Character,Integer> map_b = new HashMap<Character,Integer>();

        char[] a_array = a.toLowerCase().toCharArray();
        char[] b_array = b.toLowerCase().toCharArray();

        for(char i : a_array){
            if(!map_a.containsKey(i)){
                map_a.put(i,1);
            }else{
                map_a.put(i,map_a.get(i)+1);
            }
        }

        for(char j : b_array){
            if(!map_b.containsKey(j)){
                map_b.put(j,1);
            }else{
                map_b.put(j,map_b.get(j)+1);
            }
        }

        return map_a.equals(map_b);
    }