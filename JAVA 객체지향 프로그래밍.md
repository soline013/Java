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