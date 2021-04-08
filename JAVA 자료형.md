# JAVA 자료형

## `int`, `long`.

1. 정수를 표현하기 위한 자료형이다.
2. `byte`, `short`도 있으나 거의 사용하지 않는다.
3. `long`형의 값이 `int`형의 표현 범위를 벗어날 경우, 값에 L, l을 붙여야 컴파일 에러가 발생하지 않는다.
4. 0으로 시작하면 8진수, 0x로 시작하면 16진수를 표현할 수 있다.
5. 0으로 초기화된다.

| 자료형 | 표현 범위 |
|--|--|
| int | -2147483648 ~ 2147483647 |
| long | 9223372036854775808 ~ 9223372036854775807 |

## `float`, `double`.

1. 실수를 표현하기 위한 자료형이다.
2. 자바에서 Default는 `double`이기 때문에, `float`를 쓸 때면 값에 F, f를 붙여야 한다.
3. 소수점 표현과 과학적 지수 표현을 사용할 수 있다.

## `boolean`.

1. true, false를 갖는 자료형이다.
2. `boolean`에는 Boolean 연산을 대입할 수 있다.

    e.g. `boolean check = 1 < 2;`

## `char`.

1. 한 개의 문자를 표현하기 위한 자료형이다.
2. 문자를 ''로 감싼다.
3. 문자, 아스키코드, 유니코드 모두 표현이 가능하다.
4. 자바에서는 문자열 자료형이 있으므로 잘 사용하지 않는다.

## `String`.

1. 문자열, 문장을 표현하기 위한 자료형이다.
2. `new String("");`으로 `new` 키워드를 사용할 수 있다.
3. Literal 표기를 사용하는 것이 가독성도 좋고 최적화에 도움이 된다.
4. `String`에는 유용한 Method가 있다.
5. null로 초기화된다.

    ```java
    //1. equals(): 문자열의 값을 비교하여 결과를 리턴한다.
    String a = "Hello";
    String b = "Hello";
    System.out.println(a.equals(b)); //true

    String c = "Hello Java";

    //2. indexOf(): 문자열에서 특정 문자의 인덱스를 리턴한다.
    //Index는 0부터 시작한다.
    System.out.println(c.indexOf("Java")); //6

    //3. replaceAll(): 문자열에서 특정 문자, 부분을 바꿀 수 있다.
    System.out.println(c.replaceAll("Java", "World")); //Hello World

    //4. substring(): 문자열에서 특정 부분을 뽑아낸다.
    //시작 위치는 포함하지만, 끝 위치는 포함하지 않는다.
    System.out.println(c.substring(0, 4)); //Hell

    //5. toUpperCase(): 문자열을 모두 대문자로 변경한다.
    //toLowerCase는 문자열을 모두 소문자로 변경한다.
    System.out.println(c.toUpperCase()); //HELLO JAVA
    ```

## `StringBuffer`.

1. 문자열을 추가하거나 변경할 때 사용하는 자료형이다.

## `Array`.

1. 자료형 바로 옆에 [ ]를 사용하여 표현한다.
2. 배열은 자료형의 종류가 아닌 자료형의 집합이다.

## `List`.

1. 리스트는 배열과 비슷하지만 자료형의 종류 중 하나이다.

## `Generics`.

1. 자바 J2SE 5.0 이후에 도입된 개념이다.
2. 명확한 자료형의 확인이 가능하다.

## `Map`.

1. Python의 딕셔너리와 비슷하다.
2. Key, Value를 한 쌍으로 갖는다.

## Primitive, 원시 자료형.

1. `int`, `long`, `double`, `float`, `boolean`, `char` 등은 Primitive 자료형으로 `new` 키워드를 사용할 수 없다.
2. `String`은 Primitive가 아님에도 Literal 표기를 사용할 수 있다.
3. Primitive 자료형은 값을 Literal로 사용할 수 있다. (Literal: 계산식 없이 표기하는 상수값.)

    ```java
    boolean result = true;
    char capitalC = 'C';
    int i = 100000;
    ```