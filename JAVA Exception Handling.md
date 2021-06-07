# JAVA Exception Handling.
# What is Exception?

1. 정상적인 실행을 방해하는 기대하지 않은 에러.

2. Example
    1. Array Index of Bounds
    2. Null Point Exception

3. Exception vs Error
    1. Try to Catch로 Handle이 가능하면 Exception.
    2. Try to Catch가 불가능하여 프로그램이 멈추면 Error.

# Why Exceptions Occur?

1. Causes
    1. User Error - 잘못된 입력
    2. Programming Logic Error - 알고리즘, 구현체
    3. Physical Resource Failure - 메모리, 디스크
    4. External System Defect - 외부 연동 시스템
    5. Others

2. Examples
    1. Invalid Input Data
    2. File to be opened: NOT FOUND
    3. Network Connection Lost
    4. JVM Run Out of Memory
    5. Others

# Exception Handling

1. Objective

    To Catch, 예외를 잡으면 정상적인 흐름으로 돌아가도록 한다.

2. Advantages
    1. 안정적이고 신뢰도가 높다.
    2. 의도한 기능 Code와 Error-handling Code를 분리할 수 있다.
    3. Error Reporting에서 Call Stack of Methods, 예외 처리 메소드를 순차적으로 쌓아 구조적으로 작동되게 한다.

# Exception in Java

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2a69c675-5452-4ebd-96e8-7534988561cb/_2021-06-07_21.12.35.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2a69c675-5452-4ebd-96e8-7534988561cb/_2021-06-07_21.12.35.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2fb85b88-a359-4ac0-9bc7-b96aa06de464/_2021-06-07_21.12.21.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2fb85b88-a359-4ac0-9bc7-b96aa06de464/_2021-06-07_21.12.21.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8df7c7ea-b6e8-4bb9-b924-4b3924ff4f80/_2021-06-07_21.13.42.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8df7c7ea-b6e8-4bb9-b924-4b3924ff4f80/_2021-06-07_21.13.42.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/df812311-fd25-45ea-97fe-16a7a812cceb/_2021-06-07_21.14.10.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/df812311-fd25-45ea-97fe-16a7a812cceb/_2021-06-07_21.14.10.png)

1. Checked Exception

    컴파일할 때, 컴파일러가 확인하는 예외.

2. Unchecked Exception

    Runtime에 가야 알 수 있는 예외.

    1. Error

        앱 외부에서부터 문제가 생기는 경우.

        내부에서 할 수 있는 행동이 많지 않다.

    2. Runtime Exception

        앱 내부에서 문제가 생기는 경우.

        내부에서 해결할 수 있다.

# Exception Handling in Java

1. Catching Exception

    Try-Catch Block을 사용한다.

2. Syntax

    ```cpp
    try {
    	// Prootected Code
    } catch (ExceptionType1 e1) {
    	// Catch Block
    } catch (ExceptionType2 e2) {
    	// Catch Block
    } catch (ExceptionType3 e3) {
    	// Catch Block
    }
    ```

3. Example

    ![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/86d50ec1-04bd-4762-86ae-50721639046a/_2021-06-07_21.23.27.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/86d50ec1-04bd-4762-86ae-50721639046a/_2021-06-07_21.23.27.png)

4. Throws/Throw Keywords

    ![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/20c85170-2f39-4b17-863a-4d59867fd427/_2021-06-07_21.37.22.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/20c85170-2f39-4b17-863a-4d59867fd427/_2021-06-07_21.37.22.png)

    Checked Exception이 아니라면, Method는 `throws` 키워드를 이용한 선언이 필요하다.

    `throws` 키워드는 발생한 예외의 처리를 해당 메소드를 호출한 쪽으로 위임할 때 사용한다. 예외를 처리하는 키워드이다.

    `throw` 키워드는 프로그램 내에서 임의로 예외를 발생시킬 때 사용한다. 실제로 예외를 발생시키는 키워드이다.

5. Finally Block

    ![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0ba819e9-f895-437d-b1c5-4ec7937bed67/_2021-06-07_21.39.30.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0ba819e9-f895-437d-b1c5-4ec7937bed67/_2021-06-07_21.39.30.png)

    예외가 발생하든 안하든 무조건 실행된다.

    Cleanup-type Statements를 위해서 넣는다.

6. Example 2

    ![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ed7a5977-55ec-43bf-99b8-e3155b1052a7/_2021-06-07_21.41.11.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ed7a5977-55ec-43bf-99b8-e3155b1052a7/_2021-06-07_21.41.11.png)

# User-defined Exceptions

1. Throwable을 상속받는다.

2. Exception Class를 상속받는다.

    Checked Exception을 정의한다.

    ![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6e622095-ad44-43cc-bb45-d8084008efbb/_2021-06-07_21.45.43.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6e622095-ad44-43cc-bb45-d8084008efbb/_2021-06-07_21.45.43.png)

    ![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/28bdc5d2-3205-420a-b6f0-879bc748f72b/_2021-06-07_21.50.54.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/28bdc5d2-3205-420a-b6f0-879bc748f72b/_2021-06-07_21.50.54.png)

    ![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e72d9f65-6c41-435a-8304-772dc229c04f/_2021-06-07_21.54.02.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e72d9f65-6c41-435a-8304-772dc229c04f/_2021-06-07_21.54.02.png)

3. RuntimeException Class를 상속받는다.

    Runtime Exception을 정의한다.