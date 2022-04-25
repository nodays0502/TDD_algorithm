package BOJ;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BOJ_16985Test {

    BOJ_16985 boj_16985;

    @BeforeEach
    void setUp() {
        boj_16985 = new BOJ_16985();
    }

    @Test
    void exampleTestFirst() {
        int[][][] arr = new int[][][]{
            {
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
            },
            {
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
            },
            {
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
            },
            {
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
            },
            {
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
            }
        };
        assertEquals(12,boj_16985.solution(arr));
    }
    @Test
    void exampleTest2() {
        int[][][] arr = new int[][][]{
            {
                {1, 1, 1, 1, 1},
                {1, 0, 0, 0, 1},
                {1, 0, 0, 0, 1},
                {1, 0, 0, 0, 1},
                {1, 1, 1, 1, 1}
            },
            {
                {0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 1, 0, 1, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0}
            },
            {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
            },
            {
                {0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 1, 0, 1, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0}
            },
            {
                {1, 1, 1, 1, 1},
                {1, 0, 0, 0, 1},
                {1, 0, 0, 0, 1},
                {1, 0, 0, 0, 1},
                {1, 1, 1, 1, 1}
            }
        };
        assertEquals(-1,boj_16985.solution(arr));
    }

    @Test
    void exampleTest7() {
        int[][][] arr = new int[][][]{
            {
                {1, 1, 0, 0, 0},
                {0, 0, 0, 0, 1},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
            },
            {
                {0, 0, 1, 1, 1},
                {1, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 1, 1},
                {0, 0, 1, 0, 0}
            },
            {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 1, 0, 1}
            },
            {
                {0, 0, 1, 0, 0},
                {1, 0, 0, 0, 0},
                {0, 0, 1, 1, 0},
                {1, 0, 1, 0, 0},
                {0, 0, 1, 0, 1}
            },
            {
                {0, 0, 1, 1, 0},
                {1, 1, 0, 1, 1},
                {0, 0, 0, 0, 1},
                {0, 1, 0, 1, 0},
                {0, 1, 0, 0, 0}
            }
        };
        assertEquals(16,boj_16985.solution(arr));
    }

    @Test
    void exampleTest5() {
        int[][][] arr = new int[][][]{
            {
                {0 ,0 ,0 ,1 ,0},
                {0 ,0 ,0 ,0 ,0},
                {1 ,0 ,1 ,1 ,1},
                {0 ,0 ,0 ,1 ,0},
                {0, 0 ,1 ,0 ,0}
            },
            {
                {0, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 0, 0, 1, 0},
                {0, 1, 1, 1, 0},
                {0, 1, 0, 1, 0}
            },
            {
                {0, 0, 1, 0, 0},
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {1, 1, 1, 0, 1}
            },
            {
                {1, 0, 0, 0, 1},
                {1, 0, 0, 0, 0},
                {0, 0, 1, 0, 1},
                {0, 1, 1, 0, 0},
                {0, 1, 0, 0, 0}
            },
            {
                {0, 0, 0, 1, 0},
                {1, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 1, 0, 0, 1},
                {0, 1, 0, 0, 0}
            }
        };
        assertEquals(22,boj_16985.solution(arr));
    }

    @Test
    void rotationBoard(){
        int[][] arr = new int[][]{
            {1,1,1,1,1},
            {0,0,0,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0}
        };
        int[][] rotatedArr = new int[][]{
            {0,0,0,0,1},
            {0,0,0,0,1},
            {0,0,0,0,1},
            {0,0,0,0,1},
            {0,0,0,0,1}
        };

        int[][] ints = boj_16985.rotationBoard(arr);

//        assertEquals(rotatedArr,ints);

        for(int i = 0 ; i < 5 ; i++){
            assertArrayEquals(rotatedArr[i],ints[i]);
        }
    }

    @Test
    void checkBoundSuccess(){
        assertEquals(true,boj_16985.checkBound(3));
    }
    @Test
    void checkBoundFail(){
        assertEquals(false,boj_16985.checkBound(5));
    }
    @Test
    void findRouteTest(){
        int[][][] arr = new int[][][]{
            {
                {1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
            },
            {
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
            },
            {
                {0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
            },
            {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 1, 0},
                {0, 0, 0, 0, 0}
            },
            {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 1, 1}
            }
        };
        assertEquals(12,boj_16985.findRoute(arr));
    }
    @Test
    void findRouteTest2(){
        int[][][] arr = new int[5][5][5];
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < 5 ; j++){
                for(int k = 0 ; k < 5; k++){
                    arr[i][j][k] = 1;
                }
            }
        }
        assertEquals(12,boj_16985.findRoute(arr));
    }
    @Test
    void isGoalTest(){
        assertEquals(true,boj_16985.isGoal(4,4,4));
    }
    @Test
    void isGoalTestFail(){
        assertEquals(false,boj_16985.isGoal(4,4,3));
        assertEquals(false,boj_16985.isGoal(4,3,4));
        assertEquals(false,boj_16985.isGoal(3,4,4));
    }
}