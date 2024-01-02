package basic.day2;

public class A09HangeulCharTest {

    
    /*
    * 1. 문자 '나'부터 '냿'까지 while문으로 출력해 보세요. -> 변수 char start = '나';
    * 2.                       모두 몇 개의 문자가 있는지 갯수 구하기. int codeNa, codeNet;
    */
    
    public static void main(String[] args) {

        char start = '나';
        char end = '냿';
        int codeNa = start; // '나'의 코드값
        int codeNet = end;
        //1)
        while(start<=end){
            System.out.print(start++);
        }
        // ** 이 시점에서의 start는? **
        System.out.println("\nstart=???? " + start);        // '냿'의 문자 "넀"
        //2)
        System.out.println("\n나~냿 사이 몇 개의 문자가 있냐면: " + (codeNet - codeNa + 1) + "개");
    }
    
}
