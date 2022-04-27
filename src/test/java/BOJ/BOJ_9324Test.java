package BOJ;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BOJ_9324Test {
    BOJ_9324 boj_9324 = new BOJ_9324();
    static final String OK = "OK";
    static final String FAKE = "FAKE";
    @Test
    void exampleTest1(){
        String str = "BAPC";
        assertEquals(OK,boj_9324.checkRealMessage(str));
    }
    @Test
    void exampleTest2(){
        String str = "AABA";
        assertEquals(FAKE,boj_9324.checkRealMessage(str));
    }
    @Test
    void exampleTest3(){
        String str = "ABCABCBBAAACC";
        assertEquals(OK,boj_9324.checkRealMessage(str));
    }
}