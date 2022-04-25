package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.function.Function;

public class BOJ_16985 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Function<String,Integer> stoi = Integer::parseInt;
        int[][][] arr = new int[SIZE][SIZE][SIZE];
        for(int k = 0 ; k < SIZE ; k++){
            for(int i = 0 ; i < SIZE ; i++){
                st = new StringTokenizer(br.readLine(), " ");
                for(int j = 0 ; j < SIZE ; j++){
                    arr[k][i][j] = stoi.apply(st.nextToken());
                }
            }
        }
        System.out.println(solution(arr));
    }
    private static final int SIZE = 5;
    private static final int INF = 987654321;
    public static int solution(int[][][] arr){
        boolean[] used = new boolean[SIZE];
        int[][][] board = new int[SIZE][SIZE][SIZE]; // 높이 세로 가로
        int result = dfs(0,used,arr,board);
        if(result == INF){
            return -1;
        }
        return result;
    }
    public static int dfs(int depth,boolean[] used,int[][][]arr,int[][][] board){
        if(depth == SIZE){
            return findRoute(board);
        }
        int result = INF;
        for(int i = 0 ; i < SIZE ; i++){
            if(used[i]){
                continue;
            }
            used[i] = true;
            int[][] temp = new int[SIZE][SIZE];
            temp = arr[i];
            for(int j = 0 ; j < 4; j++){
                temp = rotationBoard(temp);
                board[depth] = temp;
//                copyArr(board[depth],temp);
                result = Math.min(result,dfs(depth+1,used,arr,board));
            }
            used[i] = false;
        }
        return result;
    }

    private static final int BLOCK = 0;
    private static final int EMPTY = 1;
    private static final int[] dz = {-1,1,0,0,0,0};
    private static final int[] dy = {0,0,-1,1,0,0};
    private static final int[] dx = {0,0,0,0,1,-1};

    public static int findRoute(int[][][] arr){
        if(arr[0][0][0] == BLOCK || arr[SIZE-1][SIZE-1][SIZE-1] == BLOCK){
            return INF;
        }
        Queue<int[]> q = new LinkedList<>();
        boolean[][][] visited = new boolean[SIZE][SIZE][SIZE];
        q.offer(new int[] {0,0,0});
        visited[0][0][0] = true;
        int time = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int s = 0 ; s < size ; s++){
                int[] now = q.poll();
                if(isGoal(now[0],now[1],now[2])){
                    return time;
                }
                for(int i = 0 ; i < 6; i++){
                    int nz = now[0] + dz[i];
                    int ny = now[1] + dy[i];
                    int nx = now[2] + dx[i];
                    if(checkBound(nz) && checkBound(ny)&&checkBound(nx) && !visited[nz][ny][nx] && arr[nz][ny][nx] == EMPTY){
                        visited[nz][ny][nx] = true;
                        q.offer(new int[] {nz,ny,nx});
                    }
                }
            }
            time++;
        }
        return INF;
    }
    public static int[][] rotationBoard(int[][] arr){
        int[][] temp = new int[SIZE][SIZE];
        for(int i = 0 ; i < SIZE ; i++){
            for(int j = 0 ; j < SIZE ; j++){
                temp[j][SIZE - 1- i] = arr[i][j];
            }
        }
        return temp;
    }

    public static boolean checkBound(int point){
        if(point >= 0 && point < SIZE){
            return true;
        }
        return false;
    }
    public static boolean isGoal(int z, int y, int x){
        if(z == y && y == x && x == SIZE-1){
            return true;
        }
        return false;
    }
}
