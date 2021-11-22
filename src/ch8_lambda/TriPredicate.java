package ch8_lambda;

@FunctionalInterface
public interface TriPredicate<T, U, V> {
	boolean test();
}
