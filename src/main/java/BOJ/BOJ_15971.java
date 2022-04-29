package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.function.Function;

public class BOJ_15971 {
    public static class Edge{
        int next;
        int weight;

        public Edge(int next, int weight) {
            this.next = next;
            this.weight = weight;
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        Function<String,Integer> stoi = Integer::parseInt;
        int n = stoi.apply(st.nextToken());
        int robot1 = stoi.apply(st.nextToken());
        int robot2 = stoi.apply(st.nextToken());
        List<Edge>[] map = new List[n+1];
        for(int i = 0 ; i <=n ; i++){
            map[i] = new ArrayList<>();
        }
        for(int i = 0 ; i < n-1 ; i++){
            st = new StringTokenizer(br.readLine()," ");
            int start = stoi.apply(st.nextToken());
            int end = stoi.apply(st.nextToken());
            int weight = stoi.apply(st.nextToken());
            map[start].add(new Edge(end,weight));
            map[end].add(new Edge(start,weight));
        }
        int result = bfs(map,robot1,robot2,n);
        System.out.println(result);
    }
    private static class Node{
        int position;
        int weight;
        int max;

        public Node(int position, int weight,int max) {
            this.position = position;
            this.weight = weight;
            this.max = max;
        }
        public int weightMinusMax(){
            return weight - max;
        }

    }
    static int bfs(List<Edge>[] map, int robot1, int robot2, int n) {
        Queue<Node> q = new LinkedList<>();
        boolean[] visited = new boolean[n+1];
        q.offer(new Node(robot1,0,0));
        visited[robot1] = true;
        while(!q.isEmpty()){
            Node now = q.poll();
            if(now.position == robot2){
                return now.weightMinusMax();
            }
            for(int i = 0 ; i < map[now.position].size() ; i++){
                Edge edge = map[now.position].get(i);
                if(!visited[edge.next]){
                    visited[edge.next] = true;
                    Node node = new Node(edge.next, now.weight + edge.weight, Math.max(now.max,
                        edge.weight));
                    q.offer(node);
                }
            }
        }
        return 0;
    }
}
