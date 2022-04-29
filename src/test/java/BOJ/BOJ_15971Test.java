package BOJ;

import static org.junit.jupiter.api.Assertions.*;

import BOJ.BOJ_15971.Edge;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;

class BOJ_15971Test {
    BOJ_15971 boj_15971 = new BOJ_15971();
    @Test
    void bfs(){
        int robot1 = 5;
        int robot2 = 1;
        int n = 5;
        List<Edge>[] map = new List[n+1];
        for(int i = 0 ; i <= n ;i++){
            map[i] = new ArrayList<>();
        }
        map[1].add(new Edge(2,1));
        map[2].add(new Edge(1,1));

        map[2].add(new Edge(3,2));
        map[3].add(new Edge(2,2));

        map[3].add(new Edge(4,3));
        map[4].add(new Edge(3,3));

        map[4].add(new Edge(5,4));
        map[5].add(new Edge(4,4));

        assertEquals(6,boj_15971.bfs(map, robot1, robot2, n));
    }
    @Test
    void bfs2(){
        int robot1 = 9;
        int robot2 = 1;
        int n = 9;
        List<Edge>[] map = new List[n+1];
        for(int i = 0 ; i <= n ;i++){
            map[i] = new ArrayList<>();
        }
        map[1].add(new Edge(2,8));
        map[2].add(new Edge(1,8));

        map[2].add(new Edge(3,6));
        map[3].add(new Edge(2,6));

        map[2].add(new Edge(4,5));
        map[4].add(new Edge(2,5));

        map[2].add(new Edge(5,10));
        map[5].add(new Edge(2,10));

        map[9].add(new Edge(5,6));
        map[5].add(new Edge(9,6));

        map[6].add(new Edge(5,14));
        map[5].add(new Edge(6,14));

        map[6].add(new Edge(7,7));
        map[7].add(new Edge(6,7));

        map[8].add(new Edge(6,7));
        map[6].add(new Edge(8,7));

        assertEquals(14,boj_15971.bfs(map, robot1, robot2, n));
    }
}