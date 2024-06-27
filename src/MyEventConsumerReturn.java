@FunctionalInterface
public interface MyEventConsumerReturn<T> {

    public T consumer(Object value);

    default void calcular() {

    }
}
