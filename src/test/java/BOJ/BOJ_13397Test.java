package BOJ;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BOJ_13397Test {
    BOJ_13397 boj_13397;
    @BeforeEach
    void setUp(){
        boj_13397 = new BOJ_13397();
    }
    @Test
    void checkDiffTest(){
        int[] arr = {1,5,4,6,2,1,3,7};
        assertEquals(4,boj_13397.checkDiff(arr,0,1));
        assertEquals(4,boj_13397.checkDiff(arr,2,4));
        assertEquals(6,boj_13397.checkDiff(arr,5,7));
    }
    @Test
    void checkGroupCnt(){
        int[] arr = {1,5,4,6,2,1,3,7};
        assertEquals(true,boj_13397.checkGroupCnt(arr,3,6));
    }
    @Test
    void checkGroupCnt1(){
        int[] arr = {1,5,4,6,2,1,3,7};
        assertEquals(true,boj_13397.checkGroupCnt(arr,3,5));
    }
    @Test
    void checkGroupCntFail(){
        int[] arr = {1,5,4,6,2,1,3,7};
        assertEquals(false,boj_13397.checkGroupCnt(arr,3,4));
    }
    @Test
    void ExampleTestFirst(){
        int n = 8;
        int m = 3;
        int[] arr = {1,5,4,6,2,1,3,7};
        assertEquals(5,boj_13397.solution(arr,n,m));
    }
    @Test
    void ExampleTestSecond(){
        int n = 4;
        int m = 2;
        int[] arr = {1,1,1,1};
        assertEquals(0,boj_13397.solution(arr,n,m));
    }
    @Test
    void ExampleTest3(){
        int n = 7;
        int m = 4;
        int[] arr = {1,2,3,1,2,3,1};
        assertEquals(2,boj_13397.solution(arr,n,m));
    }
    @Test
    void ExampleTest4(){
        int n = 5;
        int m = 1;
        int[] arr = {1,100,99,2,3};
        assertEquals(99,boj_13397.solution(arr,n,m));
    }
    @Test
    void ExampleTest5(){
        int n = 5;
        int m = 2;
        int[] arr = {1,100,99,2,3};
        assertEquals(98,boj_13397.solution(arr,n,m));
    }
    @Test
    void ExampleTest6(){
        int n = 5;
        int m = 3;
        int[] arr = {1,100,99,2,3};
        assertEquals(1,boj_13397.solution(arr,n,m));
    }


}