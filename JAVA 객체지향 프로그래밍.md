# JAVA 객체지향 프로그래밍.

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

1. 주 메모리에 인스턴스가 위치하도록 공간을 할당하고 인스턴스를 생성한다.
2. 생성된 인스턴스의 상태를 초기화한다.
3. 생성자의 이름은 클래스의 이름과 같다.
4. 생성자는 인스턴스 생성 시 한 번만 실행된다.

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

## 메시지(Message).
```java
int Age() {
	return Age;
}
```

```java
Age();
```

함수나 메서드 정의가 아닌, 함수나 메서드를 부르는 것을 Message라고 한다.

## public, private.
`public`: 함수나 변수를 Class 밖에서 자유롭게 부를 수 있다.

`private`: 함수나 변수를 Class 밖에서 자유롭게 부를 수 없다.

## static.

```java
public class FileName {
	static String str = "Hello, world!";
}
```

1. Static 변수는 모든 객체에서 같은 값을 갖는다.

2. Static은 객체를 만들지 않아도 Class 자체에 메모리 장소가 저장되어 있다.

3. Method에 Static이 붙으면 Static 변수만 사용한다.

4. Class 내의 Class에서도 상위 클래스의 Static 변수를 사용할 수 있다.

## finalize(), gc().
`new`가 객체를 생성하는 키워드였다면,

`finalize()`, `gc()`는 객체를 지우는 C++에서의 `Delete` 역할을 한다.

## finalize() Method.

보통 Garbage Collector가 호출될 때 실행된다.

결국 `gc()`가 호출되면 `finalize()`도 같이 실행된다.

gc는 돌아가는데 시간이 다소 소요되므로, 밑에 있는 코드가 먼저 실행되고 `finalize()`가 실행될 수 있다.

1. The finalize() method is called the 'finalizer'.
2. Finalizer is invoked when JVM performs the garbage collection.
3. Finalizer may perform any operations.
4. Main Purpose of a Finalizer.
	- To release resources used by objects before they're removed from the memory.
	- A finalizer can work as the primary mechanism for clean-up operatons, or as a safety net when other methods fail.

## gc() Method.

임의로 Garbage Collector를 부를 때 사용하므로 잘 사용하지 않는다.

1. Garbage Collection in Java.
	- Eventually, some objects will no longer be needed.
	- The garbage collector finds these unused objects and deletes them to free up memory.

2. Java garbage collection is an automatic process.
	- No need to explicitly mark objects to be deleted.

3. gc() method.
	- It runs the garbage collector.