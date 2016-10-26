public class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        //从尾部插入可以防止空数组的情况（把全部数据都放在a数组中）
        int point1 = m-1;
        int point2 = n-1;
        int pointM = m+n-1;
        
        //两边都存在数据的情况
        while(point1>=0 && point2>=0){
            if(a[point1] >= b[point2]) a[pointM--] = a[point1--];
            else a[pointM--] = b[point2--];
        }
        
        //一边不存在数据的情况
        
        //只要写处a数组先走完数据的情况，因为如果b数组先走完数据，剩下的数据肯定是按a排好的
        while(point1 == -1){
            a[point2] = b[point2];
            point2--;
            if(point2== -1)break;
        }
        
    }
}
