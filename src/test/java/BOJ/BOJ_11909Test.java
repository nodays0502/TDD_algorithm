package BOJ;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class BOJ_11909Test {

    BOJ_11909 boj_11909 = new BOJ_11909();
    @Test
    void exampleTest(){
        int n = 4;
        int[][] map = {
            {5,2,4,3},
            {6,5,1,2},
            {3,4,5,3},
            {7,4,3,1}
        };
        assertEquals(3,boj_11909.solution(map,n));
    }
    @Test
    void exampleTestSecond(){
        int n = 5;
        int[][] map = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            Arrays.fill(map[i],1);
        }
        assertEquals(8,boj_11909.solution(map,n));
    }
    @Test
    void checkBoundTestFail(){
        int n = 5;
        int y = 5;
        int x = 4;
        assertEquals(false,boj_11909.checkBound(y,x,n));
    }
    @Test
    void checkBoundTestSuccess(){
        int n = 6;
        int y = 5;
        int x = 4;
        assertEquals(true,boj_11909.checkBound(y,x,n));
    }

}