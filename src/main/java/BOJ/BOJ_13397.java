package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.function.Function;

public class BOJ_13397 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        Function<String,Integer> stoi = Integer::parseInt;
        int n = stoi.apply(st.nextToken());
        int m = stoi.apply(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = stoi.apply(st.nextToken());
        }
        System.out.println(solution(arr,n,m));
    }
    public static int solution(int[] arr, int n , int m){
        return binarySearch(arr,n,m);
    }

    private static int binarySearch(int[] arr, int n, int m) {
        int end = INF;
        int start = 0;
        int result = INF;
        while(start <= end){
            int mid = (start + end)/2;
            if(checkGroupCnt(arr,m,mid)){
                result = mid;
                end = mid-1;
                continue;
            }
            start = mid+1;
            continue;
        }
        return result;
    }

    private static final int INF = 10_000;
    public static boolean checkGroupCnt(int[] arr , int m,int mid){
        int min = INF;
        int max = 0;
        int groupCnt = 1;
        for(int i = 0 ; i < arr.length ; i++){
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
            if(max - min > mid){
                groupCnt++;
                if (groupCnt > m) {
                    return false;
                }
                min = INF;
                max = 0;
                i--;
            }
        }
        return true;
    }
    public int checkDiff(int[] arr , int si,int ei){
        int min = INF;
        int max = 0;
        for(int i = si ; i <= ei ; i++){
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }
        return max - min;
    }
}
