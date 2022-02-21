package Questao02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SenhaForte {
	private final static String EXPRESSAO_REGULAR_SENHA_FORTE = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+]).{6,}$";

	public void validaPassword(final String password) {

		if (password.length() < 6) {
			int senha = 6;
			System.out.println("A senha deve conter no mínimo 6 caracteres");
			senha = (senha - password.length());
			System.out.println("Por favor adicionar " + senha + " caracteres");
		}

		Pattern p1 = Pattern.compile(".*[0-9]");
		if (!p1.matcher(password).find()) {
			System.out.println("A senha deve conter no mínimo 1 digito");
		}

		Pattern p2 = Pattern.compile(".*[a-z]");
		if (!p2.matcher(password).find()) {
			System.out.println("A senha deve conter no mínimo 1 letra em minúsculo");
		}

		Pattern p3 = Pattern.compile(".*[A-Z]");
		if (!p3.matcher(password).find()) {
			System.out.println("A senha deve conter no mínimo 1 letra em maiúsculo");
		}

		Pattern p4 = Pattern.compile(".*[!@#$%^&*()-+]");
		if (!p4.matcher(password).find()) {
			System.out.println("A senha deve conter no mínimo 1  caractere especial. Os caracteres especiais são: !@#$%^&*()-+");
		}

		Pattern p = Pattern.compile(EXPRESSAO_REGULAR_SENHA_FORTE);
		Matcher m = p.matcher(password);

		if (m.matches()) {
			System.out.println("Senha aceita!");
		}
	}
}