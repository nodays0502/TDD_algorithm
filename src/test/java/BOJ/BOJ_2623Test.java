package BOJ;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;

class BOJ_2623Test {
    BOJ_2623 boj_2623 = new BOJ_2623();
    @Test
    void solutionTest(){
        int n = 6;
        int[] cnt = new int[n+1];
        List<Integer>[] input = new List[n+1];
        for(int i = 0 ; i <= n ; i++){
            input[i] = new LinkedList<>();
        }

        input[1].add(4);
        cnt[4]++;
        input[4].add(3);
        cnt[3]++;

        input[6].add(2);
        cnt[2]++;
        input[2].add(5);
        cnt[5]++;
        input[5].add(4);
        cnt[4]++;

        input[2].add(3);
        cnt[3]++;
        List<Integer> solution = boj_2623.solution(n, input, cnt);
        System.out.println(solution);
        assertEquals(1,solution.get(0));
        assertEquals(6,solution.get(1));
        assertEquals(2,solution.get(2));
        assertEquals(5,solution.get(3));
        assertEquals(4,solution.get(4));
        assertEquals(3,solution.get(5));

    }
}