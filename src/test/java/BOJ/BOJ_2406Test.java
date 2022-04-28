package BOJ;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;

class BOJ_2406Test {
    BOJ_2406 boj_2406 = new BOJ_2406();
    @Test
    void checkConnection(){
        int n = 5;
        List<int[]> connection = new LinkedList<>();
        connection.add(new int[] {2,1});
        connection.add(new int[] {2,3});
        int[][]map = new int[][]{
            {0, 100, 50, 100, 100},
            {100, 0, 100, 100, 100},
            {50, 100, 0, 20, 100},
            {100, 100, 20, 0, 80},
            {100, 100, 100, 80, 0}
        };
        int[][]result = new int[][]{
            {0, 100, 50, 100, 100},
            {100, 0, 0, 100, 100},
            {50, 0, 0, 0, 100},
            {100, 100, 0, 0, 80},
            {100, 100, 100, 80, 0}
        };
        boj_2406.checkConnection(connection,map);
        for(int i = 0 ; i < n ; i++){
            assertArrayEquals(result[i],map[i]);
        }
    }
    @Test
    void prim(){
        int n = 5;
        int[][]map = new int[][]{
            {0, 100, 50, 100, 100},
            {100, 0, 0, 100, 100},
            {50, 0, 0, 0, 100},
            {100, 100, 0, 0, 80},
            {100, 100, 100, 80, 0}
        };
        List<int[]> prim = boj_2406.prim(map, n);
        assertEquals(80,prim.get(0)[0]);
        assertEquals(1,prim.get(0)[1]);
        assertEquals(4,prim.get(1)[0]);
        assertEquals(5,prim.get(1)[1]);
    }
}