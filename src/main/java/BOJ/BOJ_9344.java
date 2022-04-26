package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.function.Function;

public class BOJ_9344 {
    public static class Edge{
        int start;
        int end;
        int weight;

        public Edge(int start, int end, int weight) {
            this.start = start;
            this.end = end;
            this.weight = weight;
        }
        public boolean isPQ(int p , int q){
            if(p != q && (p == start || q == start) && (p == end || q == end)){
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        Function<String,Integer> stoi = Integer::parseInt;
        int test = stoi.apply(st.nextToken());
        for(int t = 0; t < test ; t++){
            st = new StringTokenizer(br.readLine()," ");
            int n = stoi.apply(st.nextToken());
            int m = stoi.apply(st.nextToken());
            int p = stoi.apply(st.nextToken());
            int q = stoi.apply(st.nextToken());
            List<Edge> edges = new LinkedList<>();
            for(int i = 0 ; i < m ; i++){
                st = new StringTokenizer(br.readLine()," ");
                int a = stoi.apply(st.nextToken());
                int b = stoi.apply(st.nextToken());
                int weight = stoi.apply(st.nextToken());
                edges.add(new Edge(a,b,weight));
            }
            if(solution(n,p,q,edges)){
                System.out.println("YES");
                continue;
            }
            System.out.println("NO");
        }
    }
    private static int findSet(int now , int[] parent){
        if(now == parent[now]){
            return now;
        }
        return parent[now] = findSet(parent[now],parent);
    }
    public static boolean unionSet(int a,int b,int[] parent){
        int aParent = findSet(a,parent);
        int bParent = findSet(b,parent);
        if (aParent == bParent){
            return false;
        }
        parent[aParent] = bParent;
        return true;
    }
    public static boolean solution(int n , int p ,int q, List<Edge> edges){
        Collections.sort(edges,(o1,o2)->{
            return o1.weight - o2.weight;
        });
        int[] parent = new int[n+1];
        for(int i = 0 ; i <= n ; i++){
            parent[i] = i;
        }
        int cnt = 1;
        boolean flag = false;
        for(Edge edge : edges){
            if(unionSet(edge.start,edge.end,parent)){
                cnt++;
                if(edge.isPQ(p,q)){
                    flag = true;
                }
            }
            if(cnt >= n){
                break;
            }
        }
        return flag;
    }
}