public class SeriesUp {
    public int[] seriesUp(int n)
    {
        int[] arr = new int[n*(n+1)/2];
        int p = 0;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++, p++){
                arr[p] = j;
            }
        }
        return arr;
    }
}
