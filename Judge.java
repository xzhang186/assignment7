import java.util.*;

public class Judge
{
    //find judge, return int number
    public int findJudge(int N, int[][] trust)
    {  
        int [] value = new int[N+1];
        
        for(int i = 0; i < trust.length; i++)
        {
             int[] item = trust[i];
             value[item[0]]--;
             value[item[1]]++;
        }

        for(int i = 1; i <= N; i++)
        {
            if((N-1) == value[i])
            {
                return i;
            }
        }
        
	return -1;
    }


    static int id = 0;

    // print judge
    private static void example(int N, int[][] trust)
    {
	System.out.printf("Example%d\t%d\t%-40s\t%d\n", ++id, N, Arrays.deepToString(trust), new Judge().findJudge(N, trust));
    }

    //main
    public static void main(String[] args)
    {
        Judge judge = new Judge();

        System.out.println("\t\tN\ttrust\t\t\t\t\t\tOutput");

        example(2, new int[][]{{1,2}});
        example(3, new int[][]{{1,3},{2,3}});
        example(3, new int[][]{{1,3},{2,3},{3,1}});
        example(4, new int[][]{{1,2},{2,3}});
        example(4, new int[][]{{1,3},{1,4},{2,3},{2,4},{4,3}});
   }
}
