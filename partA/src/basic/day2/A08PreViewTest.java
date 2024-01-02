package basic.day2;

public class A08PreViewTest {
    
    public static void main(String[] args) {
        char start='A'; // A = 65
        
        //반복명령 while 맛보기: while은 ~하는 동안에
        while(start<='Z'){           // <는 작다 (비교), Z = 90
            System.out.print(start++);
        }
        System.out.println();
        while(start>'A'){
            System.out.print(--start);
        }

    }
}
