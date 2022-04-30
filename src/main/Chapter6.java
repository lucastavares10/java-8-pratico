package main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import model.User;

public class Chapter6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user1 = new User("Paulo Silveira", 150);
		User user2 = new User("Rodrigo Turini", 120);
		User user3 = new User("Guilherme Silveira", 190);
		User user4 = new User("Raquel Santo", 190);

		List<User> users = Arrays.asList(user1, user2, user3, user4);

		// Method Reference

		users.forEach((u) -> System.out.println("isModerador " + u.isModerador()));

		users.forEach(User::tornaModerador);

		users.forEach((u) -> System.out.println("isModerador " + u.isModerador()));

		// sorting

		// users.sort(Comparator.comparing(User::getNome));

		Function<User, String> byName = User::getNome;
		users.sort(Comparator.comparing(byName));

		users.forEach((u) -> System.out.println("nome " + u.getNome()));

		System.out.println();

		// sorting with reference method

		users.sort(Comparator.comparingInt(User::getPontos));

		users.forEach((u) -> System.out.println("nome " + u.getNome()));

		System.out.println();

		// sorting with reference methods, then conditions and autoboxing

		Comparator<User> c = Comparator.comparingInt(User::getPontos).thenComparing(User::getNome);

		users.sort(c);

		users.forEach((u) -> System.out.println("nome " + u.getNome()));

		System.out.println();

		// sorting letting nulls last
		users.sort(Comparator.nullsLast(Comparator.comparing(User::getNome)));

		users.forEach((u) -> System.out.println("nome " + u.getNome()));

		System.out.println();

		// descending order sort

		users.sort(Comparator.comparing(User::getNome).reversed());

		users.forEach((u) -> System.out.println("nome " + u.getNome()));

		System.out.println();

		// referencing instance methods

		Runnable r = user1::tornaModerador;

		r.run();

		System.out.println("user1.isModerador() " + user1.isModerador());

		// referencing methods with params

		users.forEach(System.out::println);

	}

}
