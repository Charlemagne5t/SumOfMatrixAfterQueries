public class Solution {
    public long matrixSumQueries(int n, int[][] queries) {
        boolean[] rows = new boolean[n];
        boolean[] cols = new boolean[n];
        long rowsUsed = 0;
        long colsUsed = 0;
        long sum = 0;
        for(int i = queries.length - 1; i >= 0; i--){
            int[] query = queries[i];
            if(query[0] == 0){
                int row = query[1];
                int val = query[2];
                if(!rows[row]){
                    rows[row] = true;
                    rowsUsed++;
                    sum += (n - colsUsed) * val;
                }

            }else {
                int col = query[1];
                int val = query[2];
                if(!cols[col]){
                    cols[col] = true;
                    colsUsed++;
                    sum += (n - rowsUsed) * val;
                }


            }
            if(rowsUsed == n && colsUsed == n){
                break;
            }
        }

        return sum;
    }
}
