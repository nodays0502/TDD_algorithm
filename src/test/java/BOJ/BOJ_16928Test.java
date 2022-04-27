package BOJ;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

class BOJ_16928Test {
    BOJ_16928 boj_16928 = new BOJ_16928();
    @Test
    void exampleTest(){
        Map<Integer,Integer> jump = new HashMap<>();
        jump.put(32,62);
        jump.put(42, 68);
        jump.put(12,98);
        jump.put(95, 13);
        jump.put(97, 25);
        jump.put(93, 37);
        jump.put(79, 27);
        jump.put(75, 19);
        jump.put(49, 47);
        jump.put(67, 17);
        assertEquals(3,boj_16928.solution(jump));
    }
}