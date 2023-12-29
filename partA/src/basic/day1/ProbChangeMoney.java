package basic.day1;

public class ProbChangeMoney {

    public static void main(String[] args) {
        
        System.out.println(" ::: 원화를 엔화로 환전하기 :::");
        int myWon=1000000;                  //여행 경비 (100만 원)
        System.out.printf("환전할 원화는 %d원입니다.\n", myWon);
        double toYen=1000000/9.29;                       //환전한 엔화 값
        System.out.printf("원화를 엔화로 바꿀 때: %f원입니다.\n", toYen);
        
        System.out.println("\n::: 엔화를 원화로 환전할 경우 :::");
        int cost=98760;                          //여행 비용
        System.out.printf("일본에서 사용한 금액은 %d원입니다.\n", cost);
        int myYen=(int)toYen-cost;                          //남은 여행 경비
        System.out.printf("남은 엔화는 얼마인가요? %d엔\n", (int)toYen-cost);
        double toWon=myYen*8.97;                     //남은 경비 환전한 원화 값
        System.out.printf("엔화를 원화로 바꿀 때: %f\n", toWon);
        
        System.out.println("\n::: 한/일 23.12.28. 기준 환율 :::");
        double yenTowonRate=9.29;           //1엔이 몇 원? 살 때
        System.out.printf("살 때 1엔 = " + yenTowonRate);
        double wonToYenRate=8.97;           //1엔이 몇 원? 팔 때
        System.out.printf("\n팔 때 1엔 = " + wonToYenRate);
    }
}