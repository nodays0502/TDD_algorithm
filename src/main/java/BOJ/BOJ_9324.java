package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.function.Function;

public class BOJ_9324 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Function<String,Integer> stoi = Integer::parseInt;
        int n = stoi.apply(br.readLine());
        for(int i = 0 ; i < n ; i++){
            System.out.println(checkRealMessage(br.readLine()));
        }
    }
    static final String OK = "OK";
    static final String FAKE = "FAKE";
    public static String checkRealMessage(String str){
        int[] alphaCnt = new int[26];
        for(int i = 0 ; i < str.length() ; i++){
            int index = str.charAt(i) - 'A';
            ++alphaCnt[index];
            if( alphaCnt[index] % 3 == 0 && (i == str.length()-1 || str.charAt(i+1) != str.charAt(i)) ){
                return FAKE;
            }
            if(alphaCnt[index] % 3 == 0){
                i++;
            }
        }
        return OK;
    }
}
