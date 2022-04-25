package BOJ;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BOJ_2164Test {
    private BOJ_2164 boj_2164;
    @BeforeEach
    void setup(){
        boj_2164 = new BOJ_2164();

    }
    @Test
    @DisplayName("예제 입력")
    void exampleTest(){
        int n = 6;
        assertEquals(4,boj_2164.solution(n));
    }

    @Test
    @DisplayName("1 입력")
    void exampleTestOne(){
        int n = 1;
        assertEquals(1,boj_2164.solution(n));
    }

    @Test
    @DisplayName("10 입력")
    void exampleTestTen(){
        int n = 10;
        assertEquals(4,boj_2164.solution(n));
    }

    @Test
    @DisplayName("4 입력")
    void exampleTestFour(){
        int n = 4;
        assertEquals(4,boj_2164.solution(n));
    }

    @Test
    @DisplayName("removeTopTest")
    void removeTopTest(){
        int n = 6;
        Queue<Integer> deque = new LinkedList<>();
        for(int i = 1 ; i <= n ; i++){
            deque.offer(i);
        }
        boj_2164.removeTop(deque);
        assertEquals(2,deque.peek());
    }

    @Test
    @DisplayName("moveTopToBottomTest")
    void moveTopToBottom(){
        int n = 6;
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1 ; i <= n ; i++){
            q.offer(i);
        }
        boj_2164.moveTopToBottom(q);
        assertEquals(2,q.poll());
        assertEquals(3,q.poll());
        assertEquals(4,q.poll());
        assertEquals(5,q.poll());
        assertEquals(6,q.poll());
        assertEquals(1,q.poll());
    }
}