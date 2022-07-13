package main;

import static java.util.stream.Collectors.toSet;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import model.User;

public class Chapter7 {

	public static void main(String[] args) {

		// STREAMS E COLLECTORS

		User user1 = new User("Paulo Silveira", 150);
		User user2 = new User("Rodrigo Turini", 120);
		User user3 = new User("Guilherme Silveira", 190);
		User user4 = new User("Raquel Santos", 190);
		User user5 = new User("Julia Mendes", 500);
		User user6 = new User("Joaquim Silva", 550);
		User user7 = new User("Fernando Souza", 50);
		User user8 = new User("Rêmulo Alves", 20);
		User user9 = new User("Fábio Jorge", 800);
		User user10 = new User("João Mateus", 684);
		User user11 = new User("Lucas Tavares", 486);
		User user12 = new User("Paulus III", 221);
		User user13 = new User("Mateus Salazar", 365);

		List<User> users = Arrays.asList(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10, user11,
				user12, user13);

		// users.sort(Comparator.comparing(User::getPontos).reversed()); // ordering

		// users.subList(0, 10).forEach(User::tornaModerador);

		// for (User user : users) {
		// if (user.getPontos() > 100) {
		// user.tornaModerador();
		// }
		// }

		// Stream<User> stream = users.stream();

		// stream.filter(u -> u.getPontos() > 100);

		// users.stream().filter(u -> u.getPontos() > 100).forEach(u -> {
		// System.out.println(u);
		// });

		// users.stream().filter(u -> u.getPontos() >
		// 100).forEach(User::tornaModerador);

		// users.forEach(System.out::println);

		// List<User> maisQue100 = new ArrayList<User>();

		// users.stream().filter(u -> u.getPontos() > 100).forEach(maisQue100::add);

		// maisQue100.forEach(System.out::println);

		//List<User> maisQueCem = users.stream().filter(u -> u.getPontos() > 100).collect(toList());
		
		//maisQueCem.forEach(System.out::println);

		//Set<User> maisQueCemSet = users.stream().filter(u -> u.getPontos() > 100).collect(toSet());
		
		//maisQueCemSet.forEach(System.out::println);
		
		User[] usersArray = users.stream().toArray(User[]::new);
				
		
		
		


	}

}
