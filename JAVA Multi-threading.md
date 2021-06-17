# JAVA Multi-threading.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7f7ddd83-796b-4dee-bae5-2efc0437f957/_2021-06-08_00.35.33.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7f7ddd83-796b-4dee-bae5-2efc0437f957/_2021-06-08_00.35.33.png)

- Processor가 복수 개의 Threads를 같은 시간대에 처리하는 것이다.
- 한 프로그램 내의 어떤 기능은 병렬적으로 처리해도 되기 때문에 Multi-threads를 사용한다.
- 이미 컴퓨터에서 볼 수 있는 Multi-processing과 비슷하다.
- 한 프로그램 안에 독립적으로 실행할 수 있는 부분을 Thread라고 부른다.
- Thread는 가벼운 Process라고 볼 수 있다.

# Multitasking

일상생활에서 많이 이루어지고 있다.

이를 컴퓨터에 적용하는 것.

가장 넓은 범위이다.

# How to design Multitasking?

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c8e70700-188b-4a91-b0b4-f4028c34cc05/_2021-06-08_01.03.12.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c8e70700-188b-4a91-b0b4-f4028c34cc05/_2021-06-08_01.03.12.png)

1. Multicore Processing - Multicore를 사용한다.
2. Multi-processing - 여러 프로그램
3. Multi-threading - 한 프로그램

# Java

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7f695225-f394-4df2-be3a-9933ef8448a6/_2021-06-08_02.33.53.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7f695225-f394-4df2-be3a-9933ef8448a6/_2021-06-08_02.33.53.png)

1. Extending the Thread Class.
2. Implementing the Runnable Interface

# Runnable

1. Implements java.lang.Runnable.
2. Override the run() method.
3. Instantiate a Thread object.
4. Invoke start() method.

```java
/*
 * Program Name: DateDisplayerRunnable.java
 * Program Description: DateDisplayerRunnable is multi-threading java program Implementing 'Runnable' interface.
 * Name: 심현솔
 * Student ID: 20201736
*/

import java.lang.Runnable;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateDisplayerRunnable implements Runnable {
	public void run() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
		
		for (int i=0; i<7; i++) {
			try {
				System.out.println(Thread.currentThread().getName() + " : " + sdf.format(new Date()));
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String args[]) {
		Thread thread0 = new Thread(new DateDisplayerRunnable());
		Thread thread1 = new Thread(new DateDisplayerRunnable());
		System.out.println("Testing Program 2 using Runnable Interface");
		thread0.start();
		thread1.start();
	}
}
```

# Thread

1. Extend java.lang.Thread.
2. Override the run() method.
3. Instantiate a Thread object.
4. Invoke start() method.

```java
/*
 * Program Name: DateDisplayerThread.java
 * Program Description: DateDisplayerThread is multi-threading java program extending 'Thread' class.
 * Name: 심현솔
 * Student ID: 20201736
*/

import java.lang.Thread;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateDisplayerThread extends Thread {
	public void run() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
		
		for (int i=0; i<7; i++) {
			try {
				System.out.println(this.getName() + " : " + sdf.format(new Date()));
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String args[]) {
		System.out.println("Testing Program 1 using Thread Class");
		new DateDisplayerThread().start();
		new DateDisplayerThread().start();	
	}
}
```

# States

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/db0af734-2eee-4bea-9a6e-e1c321445c5f/_2021-06-08_16.08.46.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/db0af734-2eee-4bea-9a6e-e1c321445c5f/_2021-06-08_16.08.46.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3469eadc-91d5-45df-b8f5-cd607a872001/_2021-06-08_16.09.17.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3469eadc-91d5-45df-b8f5-cd607a872001/_2021-06-08_16.09.17.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/62f42476-35d5-4e37-907d-0f1a9befa516/_2021-06-08_16.09.37.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/62f42476-35d5-4e37-907d-0f1a9befa516/_2021-06-08_16.09.37.png)
