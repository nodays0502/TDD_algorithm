package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.function.Function;

public class BOJ_2406 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        Function<String,Integer> stoi = Integer::parseInt;
        int n = stoi.apply(st.nextToken());
        int m = stoi.apply(st.nextToken());
        List<int[]> connection = new LinkedList<>();
        for(int i = 0 ;i < m ; i++){
            st = new StringTokenizer(br.readLine()," ");
            int a = stoi.apply(st.nextToken())-1;
            int b = stoi.apply(st.nextToken())-1;
            connection.add(new int[]{a,b});
        }
        int[][]map = new int[n][n];
        for(int i = 0 ; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                map[i][j] = stoi.apply(st.nextToken());
            }
        }
        checkConnection(connection,map);
        List<int[]> result = prim(map, n);
        for(int[] num : result){
            System.out.println(num[0]+" "+num[1]);
        }
    }
    private static final int INF = 987654321;
    private static final int CONNECTION = 0;
    public static void checkConnection(List<int[]> connection,int[][]map ){
        for(int[] node : connection){
            map[node[0]][node[1]] = CONNECTION;
            map[node[1]][node[0]] = CONNECTION;
        }
    }
    private static final int HEAD_OFFICE = 0;
    public static List<int[]> prim(int[][]map,int n){
        LinkedList<int[]> result = new LinkedList<>();

        int[] distance = new int[n+1];
        int[] prev = new int[n+1];
        boolean[] visited = new boolean[n+1];
        int cost = 0;
        Arrays.fill(distance,INF);
        visited[HEAD_OFFICE] = true;
        distance[HEAD_OFFICE+1] = 0;
        for(int i = 0 ; i < n-1 ; i++){
            int minIndex = 0;
            int minValue = INF;
            for(int j = 1 ; j < n ; j++){
                if(!visited[j] && minValue > distance[j]){
                    minIndex = j;
                    minValue = distance[j];
                }
            }
            visited[minIndex] = true;
            if(minValue != CONNECTION){
                cost += minValue;
                result.add(new int[] {prev[minIndex]+1,minIndex+1});
            }
            for(int j = 0 ; j < n ; j++){
                if(!visited[j] && map[minIndex][j] < distance[j]){
                    distance[j] = map[minIndex][j];
                    prev[j] = minIndex;
                }
            }
        }
        result.offerFirst(new int[] {cost,result.size()});
        return result;
    }
}
