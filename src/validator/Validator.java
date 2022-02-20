package validator;

@FunctionalInterface
public interface Validator<T> {
	boolean validate(T t);
}
