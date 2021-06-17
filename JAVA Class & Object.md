# JAVA Class & Object.
해당 페이지는 JAVA 객체지향을 중심으로 다룹니다.

C++의 객체지향도 일부 나오나, 해당 페이지의 내용이 모든 객체지향에 해당하지는 않습니다.

Class와 Object에 대한 기본적인 내용을 정리합니다.

Inheritance, Polymorphism, Abstract Class, Interface, Generic Class는 다른 문서에서 정리합니다.

## Class.

```java
//File: Animal.java
public class Animal {
}
```

Class는 객체(Object)를 만들 수 있다.

---

```java
Animal cat = new Animal();
```

Animal Class의 인스턴스(Instance) cat이 만들어진다.

`new`는 객체를 생성하는 키워드이다.

### 번외. 객체와 인스턴스.
Class에 의해 만들어진 객체를 인스턴스라고 한다.

즉, 객체와 Class의 관계를 설명할 때 인스턴스라는 표현을 사용한다.

Cat은 Animal의 객체 → Cat은 Animal의 인스턴스.

## 객체 변수, Instance Variable.

```java
public class Animal {
	String name;

	public static void main(String[] args) {
		Animal cat = new Animal();
		System.out.println(cat.name);
	}
}
//null
```

Class에 선언된 변수를 객체 변수, 인스턴스 변수, 속성이라고 한다.

## 생성자(Constructor).
```java
public ClassName(int i, int j) {
	this.i = 0;
	this.j = 0;
}
```

1. 생성자는 다음 두 가지 일을 순서대로 수행한다.
    1. 주 메모리에 인스턴스가 위치하도록 공간을 할당하고 인스턴스를 생성한다.
    2. 생성된 인스턴스의 상태를 초기화한다.

2. 생성자의 특성.
    1. 생성자의 이름은 클래스의 이름과 같다.
    2. 생성자는 인스턴스 생성 시 한 번만 실행된다.

### 번외. C++에서의 생성자.
```cpp
public:
	ClassName();
```

```cpp
ClassName() {
	i = 0;
	j = 0;
}
```

## 소멸자(Destructor).

JAVA에서는 분명한 소멸자가 없는 대신, Garbage Collection을 이용해 자원을 반환하고, JVM이 메모리에서 자동으로 삭제한다.

대신 `finalize()`, `gc()` 등을 사용할 수 있다.

1. 소멸자는 다음 두 가지 일을 순서대로 수행한다.
    1. 인스턴스가 사용하던 모든 자원을 반환한다.
    2. 메모리에서 인스턴스를 삭제하고, 메모리를 반환한다.

## 메시지(Message).

```java
class Person {
	int Age() {
		return Age;	
	}
}
```

```java
Person p1 = new Person;
p1.Age();
```

[수신 객체 이름].[메소드 이름] ([매개변수 목록])으로 사용한다.

메소드 정의가 아닌, 메소드를 부르는 것을 Message라고 한다.

메시지는 수신 객체와 송신 객체가 필요하고, 수신 객체와 송신 객체가 같아 수신 객체를 명시할 필요가 없다면 함수 호출이라고 부른다.

## 캡슐화(Encapsulation).

관련되 속성과 오퍼레이션들을 하나의 객체 안에 그룹화하는 원칙이다.

캡슐화 원칙만으로는 속성이나 오퍼레이션이 외부로 노출되므로, 정보 은닉이 필요하다.

## 정보 은닉(Information Hiding).

객체가 가지고 있는 속성, 오퍼레이션 일부를 감추어서, 객체의 외부에서 접근하지 못하게 하는 원칙이다.

객체는 블랙박스 형태로 정의된다.

## public, private.

`public` : 함수나 변수를 Class 밖에서 자유롭게 부를 수 있다.

`private` : 함수나 변수를 Class 밖에서 자유롭게 부를 수 없다.

## static.

```java
public class FileName {
	static Srting str = "Hello, world!";
}
```

1. Static 변수는 모든 객체에서 같은 값을 갖는다.
2. Static은 객체를 만들지 않아도 Class 자체에 메모리 장소가 저장되어 있다.
3. Method에 Static이 붙으면 Static 변수만 사용한다.
4. Class 내의 Class에서도 상위 클래스의 Static 변수를 사용할 수 있다.

## finalize(), gc().

`new`가 객체를 생성하는 키워드였다면,

`finalize()`, `gc()`는 소멸자, C++에서의 `Delete` 역할을 한다.

## finalize() Method.

보통 Garbage Collector가 호출될 때 실행된다.

결국 `gc()`가 호출되면 `finalize()`도 같이 실행된다.

Garbage Collection은 우선순위가 낮은 작업으로 시간이 다소 소요되므로, 밑에 있는 코드가 먼저 실행되고 `finalize()`가 실행될 수 있다.

1. The finalize() method is called the 'finalizer'.
2. Finalizer is invoked when JVM performs the garbage collection.
3. Finalizer may perform any operations.
4. Main Purpose of a Finalizer.
    - To release resources used by objects before they're removed from the memory.
    - A finalizer can work as the primary mechanism for clean-up operatons, or as a safety net when other methods fail.

## gc() Method.

임의로 Garbage Collection를 부를 때 사용하므로 잘 사용하지 않는다.

Garbage Collection은 우선순위가 낮은 작업이므로, Garbage Collection을 명확하게 하려면 다른 자원은 `null` 처리하는 것이 좋다.

1. Garbage Collection in Java.
    - Eventually, some objects will no longer be needed.
    - The garbage collector finds these unused objects and deletes them to free up memory.
2. Java garbage collection is an automatic process.
    - No need to explicitly mark objects to be deleted.
3. gc() method.
    - It runs the garbage collector.
