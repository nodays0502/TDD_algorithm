package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.function.Function;

public class BOJ_2623 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," " );
        Function<String,Integer> stoi = Integer::parseInt;
        int n = stoi.apply(st.nextToken());
        int m = stoi.apply(st.nextToken());
        List<Integer>[] input = new List[n+1];
        for(int i = 0 ; i <= n ; i++){
            input[i] = new LinkedList<>();
        }

        int[] cnt = new int[n+1];
        for(int i = 0 ; i < m ; i++){
            st = new StringTokenizer(br.readLine()," " );
            int num = stoi.apply(st.nextToken());
            int prev = 0;
            for(int j = 0 ; j < num ; j++){
                int now = stoi.apply(st.nextToken());
                if(j != 0){
                    cnt[now]++;
                    input[prev].add(now);
                }
                prev = now;
            }
        }
        List<Integer> result = solution(n,input,cnt);
        for(int num : result){
            System.out.println(num);
        }
    }

    public static List<Integer> solution(int n, List<Integer>[] input, int[] cnt) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> result = new LinkedList<>();
        for(int i = 1; i <= n ; i++){
            if(cnt[i] == 0){
                q.offer(i);
            }
        }
        while(!q.isEmpty()){
            int now = q.poll();
            result.add(now);
            for(int i = 0; i < input[now].size(); i++){
                int next = input[now].get(i);
                if(--cnt[next] == 0){
                    q.offer(next);
                }
            }
        }
        if(result.size() != n){
            result = new LinkedList<>();
            result.add(0);
            return result;
        }
        return result;
    }
}
