package main;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import model.User;

public class Chapter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user1 = new User("Paulo Silveira", 150);
		User user2 = new User("Rodrigo Turini", 120);
		User user3 = new User("Guilherme Silveira", 190);

		List<User> usuarios = Arrays.asList(user1, user2, user3);

		// new
		usuarios.forEach(new Consumer<User>() {
			public void accept(User t) {
				System.out.println(t.getNome());
			}
		});

	}

}
