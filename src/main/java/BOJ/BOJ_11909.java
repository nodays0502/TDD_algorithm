package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.function.Function;

public class BOJ_11909 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        Function<String,Integer> stoi = Integer::parseInt;
        int n = stoi.apply(st.nextToken());
        int[][] map = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j = 0 ; j < n ; j++){
                map[i][j] = stoi.apply(st.nextToken());
            }
        }
        System.out.println(solution(map,n));
    }

    private static final int[] dy = {0,1};
    private static final int[] dx = {1,0};
    private static final int INF = 987654321;
    static int solution(int[][] map, int n) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1,o2)->{
            return o1[2] - o2[2];
        });
        pq.offer(new int[] {0,0,0});
        int[][]dp = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            Arrays.fill(dp[i],INF);
        }
        while(!pq.isEmpty()){
            int[] now = pq.poll();
            if(now[0] == n-1 && now[1] == n-1){
                return now[2];
            }
            for(int i = 0 ; i < 2; i++){
                int ny = now[0] + dy[i];
                int nx = now[1] + dx[i];
                if(!checkBound(ny,nx,n)){
                    continue;
                }
                int dif = 0;
                if(map[ny][nx] >= map[now[0]][now[1]]){
                    dif = map[ny][nx] + 1 - map[now[0]][now[1]];
                }
                if(now[2]+dif < dp[ny][nx]){
                    dp[ny][nx] = now[2]+dif;
                    pq.offer(new int[] {ny,nx,now[2]+dif});
                }
            }
        }
        return -1;
    }
    public static boolean checkBound(int y ,int x, int n){
        if(y >= 0 && y < n && x >= 0 && x < n){
            return true;
        }
        return false;
    }
}
