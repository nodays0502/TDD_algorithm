package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Function;

public class BOJ_2164 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Function<String,Integer> stoi = Integer::parseInt;
        int n = stoi.apply(br.readLine());
        System.out.println(solution(n));
    }
    public static int solution(int n){
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1 ; i <= n ; i++){
            q.offer(i);
        }
        while(q.size() > 1){
            removeTop(q);
            moveTopToBottom(q);
        }
        return q.peek();
    }
    public static void removeTop(Queue<Integer> q){
        q.poll();
    }
    public static void moveTopToBottom(Queue<Integer> q){
        q.offer(q.poll());
    }
}
