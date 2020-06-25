public class test {
    public static void main(String... args) {

        // 내가 통근하는 길에 파워에이드 자판기가 새로 생겼다.
        자판기 음표수자판기 = new 자판기("파워에이드");
        
        // 더워서 파워에이드 사먹어야겠다.
        // 파워에이드 가격이 얼마지?

        int price = 음표수자판기.getPrice();
        // price 에 1000원이라고 나왔다.
        // 오천원짜리 지폐밖에 없잖아?

        String drink = 음표수자판기.getDrink(5000);
        // drink에 "파워에이드" 가 담겼다.
        // 잔돈을 반환해야겠다.
        
        int mypocket = 음료수자판기.returnMyMoney();
        // mypocket 에는 남은돈 4000원이 담겼다.


        /**
         * 자판기 클래스가 설계된 자판기.java 를 작성하세요...
         */
    }
}

class tests {
    public static void main(String... args) {
        
        /**
         * 계산기를 이용해서 계산을해야하는데
         * 클래스를 설계할 시간이 없다...
         * 계산기 인터페이스를 만들어서
         * 이젠 스터디 친구들에게 만들어 달라고 하자!
         */

        // Calculator 인터페이스를 구현하는 
        // EzenCal 클래스를 만들어주세요
        Calculator calculator = new EzenCal();
        
        int number = calculator.add(10, 10);
        // number 에는 20이 담겨졌다.

        number = calculator.sub(20, 10);
        // number 에는 10이 담겨졌다.

        number = calculator.mul(30, 3);
        // number 에는 90이 담겨졌다.

        number = calculator.div(40, 2);
        // number 에는 20이 담겨졌다.
    }
}

public interface Calculator {

    public int add(int A, int B);

    public int sub(int A, int B);

    public int mul(int A, int B);

    public int div(int A, int B);
}