//223
//https://leetcode.com/problems/rectangle-area/

public class Solution
{
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H)
	{
	    //两个长方形的面积简单加和
		int area_all=(D-B)*(C-A)+(G-E)*(H-F);

        //计算八个边中更靠近“中心”的四条
		int A1=(A>E?A:E);//biger one
		int B1=(B>F?B:F);//biger one
		int C1=(C>G?G:C);//smaller one
		int D1=(D>H?H:D);//smaller one

        //如果两个长方形完全分离，覆盖面积就是简单加和
		if (A1>=C1||B1>=D1)
		{
			return area_all;
		}
		else//如果重复，就扣除这四个内边围成的面积
		{
			return area_all-(C1-A1)*(D1-B1);
		}
    }
}