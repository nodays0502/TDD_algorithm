package BOJ;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BOJ_15565Test {
    private BOJ_15565 boj_15565;

    @BeforeEach
    void setUp(){
        boj_15565 = new BOJ_15565();
    }

    @Test
    @DisplayName("예제 입력")
    void exampleTest(){
        int n = 10;
        int k = 3;
        int[] arr = new int[] {1,2,2,2,1,2,1,2,2,1};
        assertEquals(6,boj_15565.solution(n,k,arr));
    }

    @Test
    @DisplayName("k개 이상 1 없음")
    void exampleTestFail(){
        int n = 10;
        int k = 3;
        int[] arr = new int[] {2,2,2,2,1,2,2,2,2,2};
        assertEquals(-1,boj_15565.solution(n,k,arr));
    }
}