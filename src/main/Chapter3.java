package main;

import validator.Validator;

public class Chapter3 {

	public static void main(String[] args) {

		final int numero = 5;
		int numero2 = 10;

		// Chapter 3

//		Runnable r = new Runnable() {
//			@Override
//			public void run() {
//				for (int i = 0; i < 100; i++) {
//					System.out.println(i);
//				}
//			}
//		};
//		
//		new Thread(r).start();

		Runnable r = () -> {
			for (int i = 0; i < 100; i++) {
				System.out.println(i);
			}
		};

		new Thread(r).start();

		// Chapter 3.2

		Validator<String> validateCEP = new Validator<String>() {
			@Override
			public boolean validate(String v) {
				return v.matches("[0-9]{5}-[0-9]{3}");
			}
		};

		System.out.println(validateCEP.validate("63036-100"));

		System.out.println("with Lambda:");

		Validator<String> validateCEPL = (v) -> v.matches("[0-9]{5}-[0-9]{3}");

		System.out.println(validateCEPL.validate("63036-100"));
		
		Runnable r2 = () -> {
			System.out.println(numero);
			System.out.println(numero2);
		};

		new Thread(r2).start();

	}

}
