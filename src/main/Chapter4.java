package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import model.User;

public class Chapter4 {

	public static void main(String[] args) {
		// Default methods

		User user1 = new User("Paulo Silveira", 150);
		User user2 = new User("Rodrigo Turini", 120);
		User user3 = new User("Guilherme Silveira", 190);

		List<User> users = new ArrayList<User>(Arrays.asList(user1, user2, user3));

		Consumer<User> mostraMensagem = u -> System.out.println("antes de imprimir os nomes");

		Consumer<User> imprimeNome = u -> System.out.println(u.getNome());

//		users.forEach(mostraMensagem.andThen(imprimeNome));

//		 Chapter 4.3

//		Predicate<User> predicado = new Predicate<User>() {
//			public boolean test(User u) {
//				return u.getPontos() > 160;
//			}
//		};

//		users.removeIf(u -> u.getPontos() > 160);

		users.removeIf((u) -> {
			return u.getPontos() > 160;
		});

		users.forEach(u -> System.out.println(u.getNome()));

	}

}
