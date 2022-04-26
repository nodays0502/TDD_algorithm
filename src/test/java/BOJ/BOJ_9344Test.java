package BOJ;

import static org.junit.jupiter.api.Assertions.*;

import BOJ.BOJ_9344.Edge;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BOJ_9344Test {

    BOJ_9344 boj_9344;
    @BeforeEach
    void setUp(){
        boj_9344 = new BOJ_9344();
    }
    @Test
    void isPQTestSucess(){
        int p = 1;
        int q = 2;
        Edge edge = new BOJ_9344.Edge(1,2,3);
        assertEquals(true,edge.isPQ(p,q));
        assertEquals(true,edge.isPQ(q,p));
    }
    @Test
    void isPQTestFail(){
        int p = 1;
        int q = 3;
        Edge edge = new BOJ_9344.Edge(1,2,3);
        assertEquals(false,edge.isPQ(p,q));
        assertEquals(false,edge.isPQ(q,p));
    }
    @Test
    void solutionTest(){
        int n = 2;
        int p = 1;
        int q = 2;
        List<Edge> edges = new LinkedList<>();
        edges.add(new Edge(1,2,4));
        assertEquals(true,boj_9344.solution(n,p,q,edges));
    }
    @Test
    void solutionTest2(){
        int n = 3;
        int p = 2;
        int q = 3;
        List<Edge> edges = new LinkedList<>();
        edges.add(new Edge(1,2,1));
        edges.add(new Edge(1,3,2));
        edges.add(new Edge(2,3,3));
        assertEquals(false,boj_9344.solution(n,p,q,edges));
    }
    @Test
    void solutionTest3(){
        int n = 4;
        int p = 3;
        int q = 4;
        List<Edge> edges = new LinkedList<>();
        edges.add(new Edge(1,2,1));
        edges.add(new Edge(1,3,3));
        edges.add(new Edge(3,4,2));
        edges.add(new Edge(1,4,4));
        edges.add(new Edge(4,2,5));
        assertEquals(true,boj_9344.solution(n,p,q,edges));
    }
}