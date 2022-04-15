package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

import model.User;

public class Chapter5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user1 = new User("Paulo Silveira", 150);
		User user2 = new User("Rodrigo Turini", 120);
		User user3 = new User("Guilherme Silveira", 190);

		List<User> users = new ArrayList<User>(Arrays.asList(user1, user2, user3));

		Comparator<User> comparator = new Comparator<User>() {
			public int compare(User u1, User u2) {
				return u1.getNome().compareTo(u2.getNome());
			}
		};

		users.forEach(u -> System.out.println(u.getNome()));

//		String.CASE_INSENSITIVE_ORDER

		//

//		System.out.println("\nordered with collections.sort:");
//		
//		Collections.sort(users, (User u1, User u2) -> u1.getNome().compareTo(u2.getNome()));
//
//		users.forEach(u -> System.out.println(u.getNome()));

		//

//		System.out.println("\nordered with list.sort:");
//		
//		users.sort((u1, u2) -> u1.getNome().compareTo(u2.getNome()));
//
//		users.forEach(u -> System.out.println(u.getNome()));

		//

//		System.out.println("\nordered with Comparator.comparing:");
//
//		Comparator<User> comparatorC = Comparator.comparing(u -> u.getNome());
//
//		users.sort(Comparator.comparing(u -> u.getNome()));
//
//		users.forEach(u -> System.out.println(u.getNome()));

		List<String> palavras = Arrays.asList("Casa do Código", "Alura", "Caelum");

		//

		System.out.println("\nordered with Comparator.naturalOrder:");

		palavras.sort(Comparator.naturalOrder());

		palavras.forEach(u -> System.out.println(u));

		//

		System.out.println("\nordered with Comparator.reverseOrder:");

		palavras.sort(Comparator.reverseOrder());

		palavras.forEach(u -> System.out.println(u));

		//

//		User usr = new User();
//
//		System.out.println(Objects.isNull(usr.getNome()));
//		

		// using comparing

		System.out.println("");

		Function<User, String> extraiNome = u -> u.getNome();
		Comparator<User> comparatorCp = Comparator.comparing(extraiNome);

		users.sort(comparatorCp);

		users.forEach(u -> System.out.println(u.getNome()));

		
		
		//avoid autoboxing
		
		ToIntFunction<User> extraiPontos = u -> u.getPontos();
		Comparator<User> comparatorTIF =
		Comparator.comparingInt(extraiPontos);
		users.sort(comparator);

		users.sort(Comparator.comparingInt(u -> u.getPontos()));
		
		System.out.println("");
		
		users.forEach(u -> System.out.println(u.getNome()));
		

	}

}
