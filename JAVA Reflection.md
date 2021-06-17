# JAVA Reflection.

1. Computer Science

    Runtime에서 Structure나 Behavior를 Observe하거나 Modify하는 것

2. OOL / Java

    Runtime에서 메시지를 만들거나 하여, 관찰하고 변경시킨다.

# Usage

1. 확장성을 좋게 만들기 위해서 사용한다.
2. Class Browsers and Visual Development Environments

    Class의 정보, 변수, 메소드를 알고 싶을 때 사용한다.

3. Debuggers and Test Tools에서 사용한다.

# Reflection in Java

1. Class Related Operations
    1. Class Object를 가져온다. e.g. 이름
    2. Class Modifiers and Type을 가져온다. e.g. static, public
    3. Class Members를 가져온다. e.g. Constructors, Fields, Methods, Nested Classes

2. Field Related Operations
    1. Field Types를 가져온다. e.g. int
    2. Field Modifiers를 가져온다. e.g. public
    3. Field Values의 값을 Get, Set 할 수 있다.

3. Methods Related Operations
    1. Method Type을 가져온다. e.g. int
    2. Method Modifiers를 가져온다. e.g. public, protected
    3. Method를 메시지를 만들어서 Invoke한다.

4. Constructor Related Operations
    1. Constructor를 찾는다.
    2. Constructor Modifiers를 가져온다.
    3. 새로운 인스턴스를 만들 수 있다.

5. Arrays and Enumerated Types Related Operations
    1. Array Types를 가져온다.
    2. 새로운 Array를 만들 수 있다.
    3. Array와 요소를 Get, Set 할 수 있다.
    4. Enums를 가져온다.
    5. Enums Fields를 Get, Set 할 수 있다.

# Frameworks

1. Junit
2. Spring
3. Tomcat
4. Eclipse
5. Struts
6. Hibernate

# Example(1)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2258cc2a-7b7b-418a-99ab-f35c590ccdf8/_2021-06-07_23.49.27.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2258cc2a-7b7b-418a-99ab-f35c590ccdf8/_2021-06-07_23.49.27.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/dfb91ee0-0846-4962-8c66-449e8ca0e85d/_2021-06-07_23.49.34.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/dfb91ee0-0846-4962-8c66-449e8ca0e85d/_2021-06-07_23.49.34.png)

# Example(2)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2d52a22e-d482-449b-9217-4424c671a75a/_2021-06-07_23.49.40.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2d52a22e-d482-449b-9217-4424c671a75a/_2021-06-07_23.49.40.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1eef158d-bdf3-4171-a65c-5cd5265472a2/_2021-06-07_23.49.45.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1eef158d-bdf3-4171-a65c-5cd5265472a2/_2021-06-07_23.49.45.png)

```java
DoubleOperator douOper = new DoubleOperator();
Class<?> cla = Class.forName("DoubleOperator");

//We need 'Class' for 'getmethod()'.
Class paratypes[] = new Class[] {Double.TYPE, Double.TYPE};

//"Class.getMethod(String name, Class parameterTypes)"
methMet = cla.getMethod("add", paratypes);

//We need 'Object' for 'invoke()'.
Object arglist[] = new Object[2];
arglist[0] = new Double(5.0);
arglist[1] = new Double(5.0);

//"Method.invoke(Object obj, Object args)"
methMet.invoke(douOper, arglist);

//10.0
```

# Consequences

1. Pros
    1. Exploring Binary Objects, 확장성
    2. 프로그램을 동적으로 적용할 수 있다.

2. Cons
    1. 성능이 저하될 수 있다.
    2. 보안 공격이 들어올 수 있다.
    3. 보안 이슈가 발생할 수 있다.
    4. 높은 유지보수성을 요구한다.
