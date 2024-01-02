package basic.day2;

public class A10StringVariable {

    public static void main(String[] args) {
        //String은 문자열: 문자('')의 집합. 문자열 리터럴은 기호 "" 사용합니다.
        String message = "Hello~ 안녕!! 하이하이";

        System.out.println(message);
        System.out.println("메시지 '" + message + "'의 길이: " + message.length());
        
        message="welcome~ java world!!!!";
        System.out.println("메시지 '" + message + "'의 길이: " + message.length());
        

        // String으로 선언된 변수는 `객체`입니다.
        // 그래서 여러가지 메소드를 갖고 필요한 기능들을 제공해 줍니다.
        // char emo = ''; // char은 2바이트, 이모지는 4바이트. 문자형으로 저장 안 됨.
        String emo = "ㅎㅎ";  // 이모지는 문자열로 저장해야 합니다.
        System.out.println(emo);

        // !! 자바 String의 중요한 메소드 7가지씩 조사해서 테스트 해 보기 !!

        //1) 문자열 찾기
        String subject = "신나는 자바 프로그래밍";
        System.out.println("원하는 문자열의 시작 지점: " + subject.indexOf("자바")); // 없으면 -1

        //2) 대치하기
        String oldStr = "신나는 자바 프로그래밍";
        String newStr = oldStr.replace("자바", "JAVA");
        System.out.println("이것은 " + oldStr + " 그리고 " + newStr);

        //3) 문자 추출
        char charValue = subject.charAt(2);
        System.out.println("문자 추출하기: " + charValue);

        //4) 문자 나누기 (split)
        // String number = "1 2 3 4 5 6 7";

        //5) 문자열 합치기
        String a1 = "hi";
        String plus = " JAVA";
        System.out.println(a1.concat(plus));

        //6) 대소문자 변경


        //7)
    }
    
}
