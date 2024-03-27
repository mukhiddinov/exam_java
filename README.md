# exam_java

1. `Runnable`: Bu interfeys no argumentli va void tipdagi `run()` metodi bor.

```java
public interface Runnable {
    void run();
}
```

2. `Callable`: Bu interfeys return type interface. 

```java
public interface Callable<V> {
    V call() throws Exception;
}
```

3. `Supplier`: Bu interfeys argument qabul qilmaydi. Natijani qaytaruvchi `get()` metodi bor.

```java
public interface Supplier<T> {
    T get();
}
```

4. `Consumer`: Bu interfeys argument qabul qiluvchi lekin hech qanday natija qaytarmaydi.

```java
public interface Consumer<T> {
    void accept(T t);
}
```

5. `Function`: Bu interfeys 1 typedan boshqa type ga otqazishda ishlatiladi.

```java
public interface Function<T, R> {
    R apply(T t);
}
```

