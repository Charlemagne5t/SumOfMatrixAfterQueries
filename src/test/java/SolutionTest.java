import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1(){
        int n = 3;
        int[][] queries = {
                {0, 0 , 1},
                {1, 2 , 2},
                {0, 2 , 3},
                {1, 0 , 4}
        };
        long expected = 23;
        long actual = new Solution().matrixSumQueries(n, queries);

        Assert.assertEquals(expected, actual);
    }
}
