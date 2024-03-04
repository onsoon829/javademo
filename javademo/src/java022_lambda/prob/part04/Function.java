package java022_lambda.prob.part04;

@FunctionalInterface
public interface Function<T> {
	public double apply(T t);
}