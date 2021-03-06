## 1장

1. 소프트웨어 복잡도로 머신러닝과 같은 방법 등이 보편화되고 있다, 높은 비용으로 개발 비용 등이 높아지고 있다.
2. 80년대에는 객체지향 프로그래밍이 보급되었고, 90년대에 객체 지향 분석 및 설계가 개발되었다.
3. ?
4. ?
5. JAVA, Objective-C, Android는 순수 객체지향 언어이고, C#, Python은 혼성 객체지향 언어이다.
6. ?
7. ?
8. ?
9. ?
10. ?

---

## 2장

1. X
2. 속성 처리에 필요한 오퍼레이션을 내부에 포함하면서 독립성이 높고 복잡한 프로그램도 객체 단위로 나누어 개발할 수 있다.
3. 속성의 값이 변경되면 객체의 상태도 변경된다.
4. 대부분의 객체 속성은 그 객체의 기능성에 의해서만 처리된다.
5. 한 프로그램 세션 동안만 유효하다. 세션이 종료되면 식별자는 모든 상태 정보와 같이 사라진다.
6. 한 컴퓨터 노드나 네트워크에 있는 경우에는 영구 식별자만 사용하고, 외부 컴퓨터나 네트워크에서 사용하려면 글로벌 식별자만 사용한다. 내부와 외부가 모두 필요한 경우 두 식별자를 모두 사용할 수 있다.
7. ?
8. 물리적 객체는 눈으로 볼 수 있고 만질 수 있는 형태를 가지고 있기 때문에 적합하지 않다.
9. 물리적 객체가 더 많다. 대부분 물리적 객체를 여러 개 사용하여 처리한 결과가 개념적 객체에 저장되기 때문이다.

---

## 3장

1. X
2. X
3. 오퍼레이션이 제대로 작동하지 않을 수 있고, 객체의 상태를 변경할 수 없다.
4. X
5. X
6. Getter, Setter는 감추어진 속성에 간접적으로 접근할 때 사용한다. `private int x;`

    데이터 처리의 CRUD는 어떤 속성/데이터에 대한 처리에서 사용한다. `PhoneNumber`

    비즈니스 고유의 오퍼레이션은 그 객체 고유의 기능을 처리한다. `Car Rental System에서 checkOutCar();`

    객체의 생명주기 처리 오퍼레이션은 객체를 생성하고, 삭제하고, 미들웨어에서 인스턴스를 관리한다.

    객체의 영구성 관리 오퍼레이션은 데이터베이스에 접근하여 객체의 상태를 저장하고, 객체를 불러온다.

7. X
8. 관련 속성과 오퍼레이션을 한 캡슐에 잘 보관하면, 수정 대상이 되는 특정 객체만 수정하면 되기 때문이다.

---

## 4장

1. 오퍼레이션을 public으로 공개해야 속성에 접근하여 속성을 변경할 수 있기 때문이다. 또한 오퍼레이션을 public으로 공개하여도 내부 알고리즘과 코드는 노출되지 않는다.
2. 객체의 속성값에 유효성 문제가 전혀 없을 것이라 생각하는 경우이다.
3. 객체 내부에서만 사용하는 오퍼레이션의 경우에는 private 설정을 할 수 있다.
4. 객체 외부에서 속성에 접근할 수 없다는 문제점이 발생한다.
5. 모두 public으로 공개하면 객체 무결성을 보장할 수 없기 때문이다.
6. 속성의 유효성이 지켜지지 않는 경우가 발생하여 객체 무결성이 보장되지 않을 수 있다.
7. 캡슐화는 수정 대상이 되는 특정 객체만 수정하게 하여 유지보수성을 높이고, 정보 은닉은 속성의 이름이나 데이터 타입 등을 변경했을 때 외부 객체에 직접 영향을 미치지 않고, 오퍼레이션만 수정하면 되므로 유지보수성을 높인다.

---

## 5장

1. 유사점은 두 정의 모두 속성과 오퍼레이션을 정의한다는 것이다. 차이점은 '객체 생성을 위한 템플릿으로서의 클래스'는 객체를 만들어서 사용하기 위한 것이고, '사용자 정의 데이터 타입으로서의 클래스'는 데이터 타입으로 사용하기 위한 것으로 객체와는 조금 다르다.
2. 클래스가 집합이라면, 객체는 클래스에 속한 것이다.

    ```java
    //이것이 클래스이다.
    class Line {
    	int x1, x2, y1, y2;
    }

    //그리고 객체는 이렇게 나타낼 수 있다.
    Line L1;
    ```

3. 생성자는 새로운 인스턴스를 생성한다. 처음으로는 주 메모리에 인스턴스가 위치하도록 공간을 할당하고 인스턴스를 생성한다. 두 번째로는 생성된 인스턴스의 상태를 초기화한다.
4. 정적으로 인스턴스를 생성하거나, 동적으로 인스턴스를 생성할 수 있다. 정적 생성은 메모리가 미리 할당되고, 동적 생성은 메모리가 동적으로 할당된다. 생성자와 소멸자 호출 시점이 다르다.
5. 인스턴스의 모든 자원을 반환한다. 메모리에서 인스턴스를 삭제하고 메모리가 반환된다.
6. finalize()를 이용하여 소멸자와 유사한 기능을 구현할 수 있다.

    ```java
    public class Line {
    	private Point points[]

    	public Line(Point p1, Point p2) {
    		points = new Point[] {p1, p2};
    	}
    	
    	public static void main(String [] args) {
    		Point p1 = new Point(0, 0);
    		Point p2 = new Point(100, 100);
    		Line L1 = new Line(p1, p2);

    		p1 = null;
    		p2 = null;
    		L1 = null;

    		System.gc();
    	}

    	protected void finalize() throws Throwable {
    		super.finalize();
    		points = null;
    		System.out.println("finalize() is invoked!");
    }
    ```

7. 수신 객체가 없을 경우 함수 호출에 해당하므로 제대로 작동하지 않는다. 즉, 같은 객체에 있는 메소드를 호출한다.
8. 강한 포함 관계와 약한 포함 관계는 모두 복합 객체와 부속 객체가 있어야한다. 강한 포함 관계는 생명 주기가 같아 같이 소멸되나, 약한 포함 관계는 생명 주기가 독립적이므로 같이 소멸하지 않는다.
9. Public은 여러 개의 객체가 저마다 다른 상태를 갖지만, Static은 클래스 자체에 생성되어 여러 개의 객체라도 같은 상태를 갖는다.
10. Student 클래스에서 총 학생 수에 대한 속성과 해당 속성에 접근하는 메소드가 있을 수 있다.

    ```java
    class Student {
    	private static int studentNum;
    	
    	public static int getStudentNum() {
    		return studentNum;
    	}
    }
    ```

---

## 6장

1. 공통적인 요소들이 많고 하나의 범용적인 개체가 필요할 때 일반화를 사용할 수 있고, 구체적인 특징을 가진 개체들이 필요할 때 세분화를 사용할 수 있다.
2. `Java처럼 루트 클래스가 있는 클래스 상속 구조와 C++처럼 루트 클래스를 사용하지 않은 클래스 상속 구조의 장단점을 비교하시오.`
3. 슈퍼클래스가 될 클래스를 지정한다. 서브클래스에 필요한 추가적인 속성, 메소드를 정의한다. 필요한 경우, 오버라이딩으로 슈퍼클래스의 메소드를 재정의한다.
4. `상속을 사용할 때의 단점은 무엇인가?`
5. 다음 코드와 같다.

    ```java
    //JAVA에서.
    //extends 키워드를 사용한다.
    class Subclass extends Superclass { ... }
    ```

    ```cpp
    //C++에서.
    //: 부호를 사용한다.
    class Subclass : Superclass { ... }
    ```

6. 슈퍼클래스의 생성자가 먼저 호출되고, 서브클래스의 생성자가 나중에 호출된다. 서브클래스의 생성자는 다음과 같이 슈퍼클래스의 생성자를 호출하도록 정의한다.

    ```java
    class ClassB extends ClassA {
    	public ClassB(int a, int b) {
    		super(a);
    		this.b = b;
    	}
    }
    ```

7. 새로운 클래스를 모두 정의할 필요없이, 기존의 클래스를 재사용하여 경제적으로 클래스를 정의할 수 있다.
8. 여러 슈퍼클래스의 속성이나 메소드 명칭이  겹쳐 애매해진다.
9. 다중 상속 직렬화로 A를 상속하여 B를 정의하고, 그런 B를 상속하여 C를 정의한다. 이 경우 B가 필요없는 A의 속성과 메소드를 갖는 문제점이 있다.

---

## 7장

1. 동일한 메소드가 여러 형태로 변하여 사용되는 것이다. 이를 통해 객체의 재사용성을 높일 수 있고, 프로그램의 확장성을 보장한다.
2. 오버로딩과 오버라이딩으로, 오버로딩은 이름만 같고 입력 매개변수나 반환 타입 등이 다른 메소드를 여러 번 정의하는 것이고, 오버라이딩은 상속 관계에서 발생하여 이름 등이 모두 동일한 메소드가 다른 일을 할 때 사용한다.
3. 생성자 정의에 유용하게 사용할 수 있다. 또한 같은 이름의 메시지를 사용하여 다른 데이터 타입의 처리를 편리하게 할 수 있다.
4. 같은 메소드라도 클래스에 따라 실행 내용은 다를 수 있는데, 이때 다른 메소드를 정의하지 않아도 오버라이딩으로 편리하게 사용할 수 있다.
5. JAVA에서는 `super.methodName();`을 사용하고, C++에서는 `SuperclassName::methodName();`을 사용한다.
6. JAVA로 작성.

    ```java
    Point p1 = new Point();
    ColorPoint cp1 = new ColorPoint();

    p1 = cp1;
    ```

7. 서브클래스는 슈퍼클래스의 속성와 오퍼레이션을 갖고 있기 때문에, 슈퍼클래스 인스턴스는 서브클래스 인스턴스로 대체될 수 있다.
8. 동적 바인딩이 없으면 객체 대치성을 활용할 수 없고, 오버라이딩의 활용성이 줄어든다.
9. `다운캐스팅을 설명하고 필요한 이유를 설명하시오. 수업에서 언급이 안 되었기 때문에 안 나올 확률이 높을 듯.`
10. `프로그램 확장성 보장에 대한 예를 Java나 C++로 설명하시오.`