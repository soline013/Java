# Basic JAVA.
## 변수.

`int a;`

`String b;`

## 변수명.

1. 숫자로 시작할 수 없다.
2. `_`, `$` 이외의 특수문자는 사용할 수 없다.
3. JAVA의 키워드는 사용할 수 없다.

## 자료형.
1. `int` : 정수.
2. `long` : 정수.
3. `float` : 실수.
4. `double` : 실수.
5. `String` : 문자열.
6. `StringBuffer`
7. `boolean` : 참, 거짓.
8. `char` : 문자.
9. `List`
10. `Map`

## 사용자 정의 자료형.

`class Animal {
}`에서 `Animal cat;`으로 Class에 맞는 자료형을 정의하여 사용할 수 있음.

## 주석.

1. `/*--블록 주석--*/`
2. `//라인 주석`

## Hello, World!

```java
public class FileName {
	public static void main(String[] args)
		System.out.pirntln("Hello, World!");
}
```

여기서 `main` Method는 C와 의미가 같고, `String[] args`를 통해 프로그램 실행 단계에서 Parameter를 입력받을 수 있다.

Class는 파일 이름과 같게 설정해준다.

## JAVA의 작동 원리.

![https://cphinf.pstatic.net/mooc/20200626_288/1593156437130AvxWd_PNG/mceclip0.png](https://cphinf.pstatic.net/mooc/20200626_288/1593156437130AvxWd_PNG/mceclip0.png)

.class 확장자로 JVM에 올리면 모든 환경에서 작동할 수 있다.