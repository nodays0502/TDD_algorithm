package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.function.Function;

public class BOJ_16928 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        Function<String,Integer> stoi = Integer::parseInt;
        int n = stoi.apply(st.nextToken());
        int m = stoi.apply(st.nextToken());
        Map<Integer,Integer>jump = new HashMap<>();
        for(int i = 0 ; i < n+m ; i++){
            st = new StringTokenizer(br.readLine()," ");
            int position = stoi.apply(st.nextToken());
            int nextPosition = stoi.apply(st.nextToken());
            jump.put(position,nextPosition);
        }
        System.out.println(solution(jump));
    }

    private static final int[] DICE = {1,2,3,4,5,6};
    public static int solution(Map<Integer,Integer>jump){
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        q.offer(1);
        int time = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int s = 0 ; s < size ; s++){
                int now = q.poll();
                if(now >= 100){
                    return time;
                }
                for(int i = 0 ; i < DICE.length ; i++){
                    int next = now + DICE[i];
                    if(jump.containsKey(next)){
                        next = jump.get(next);
                    }
                    if(!visited.contains(next)){
                        q.offer(next);
                        visited.add(next);
                    }
                }
            }
            time++;
        }
        return -1;
    }
}
