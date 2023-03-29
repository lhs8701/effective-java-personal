package ch02.item01;

public class Item01 {
    public static void main(String[] args) {
        /* 정적 팩토리 메서드의 장점 1 - 객체 생성 시 이름을 가질 수 있다. */
        Student elementary = Student.elementarySchoolStudent("김철수");
        Student middle = Student.middleSchoolStudent("김철수");
        Student high = Student.highSchoolStudent("김철수");
        System.out.println("elementary.getAge() = " + elementary.getAge()); // 8
        System.out.println("middle.getAge() = " + middle.getAge()); // 14
        System.out.println("high.getAge() = " + high.getAge()); // 17

        /* 정적 팩토리 메서드의 장점 2 - 정적 팩토리 메서드를 사용하면, 객체를 호출할 때마다 같은 인스턴스가 반환되도록 할 수 있다. */
        Boolean trueValue1 = new Boolean(true);
        Boolean trueValue2 = new Boolean(true);
        System.out.println("trueValue1 == trueValue2 = " + (trueValue1 == trueValue2)); // false
        System.out.println("Boolean.valueOf(trueValue1) == Boolean.valueOf(trueValue2) = " + (Boolean.valueOf(trueValue1) == Boolean.valueOf(trueValue2))); // true

        /* 정적 팩토리 메서드의 장점 3 - 정적 팩토리 메서드를 사용하면, 반환 타입의 하위 타입 객체를 반환할 수 있다. */
        /* 정적 팩토리 메서드의 장점 4 - 정적 팩토리 메서드를 사용하면, 입력 매개변수에 따라 매번 다른 클래스의 객체를 반환할 수 있다. */
        Language.of("한국").description(); // 한국어입니다.
        Language.of("일본").description(); // 일본어입니다.
        Language.of("미국").description(); // 영어입니다.

        /* 정적 팩토리 메서드의 단점 1 - 상속(하위 클래스 생성)을 위해서는 public이나 protected 생성자가 반드시 필요하다. */
        ExtendedStudent extendedStudent = new ExtendedStudent("김철수", 7);
    }
}

