package dev.ydpk;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegex {
	public List<String> emails = new ArrayList<>();

	/**
	 * Simple Email Validation with @ symbol
	 */
	public void simpleEmailValidation() {
		String regex = "^(.+)@(.+)$";
		emails.add("praveen.kumar@pervacio.com");
		emails.add("praveen@gmail.com");
		emails.add("pj@gmail.com");
		emails.add("pk@gmail.com");
		emails.add("ydpk@gamil.com");
		emails.add("@gmail.com");
		emails.add("praveen.");
		Pattern pattern = Pattern.compile(regex);
		for (String email : emails) {
			Matcher matcher = pattern.matcher(email);
			System.out.println(email + " : " + matcher.matches());
		}
	}

	public void restrictedEmailIDChecking() {
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		emails.add("dheud@dhcuh.com");
		emails.add("ceuh7498234@dhdh.com");
		emails.add("dcdc8442*@*@gm.com");
		emails.add("dkpdwdk$@$&*@.com");
		emails.add("$(@*$@$*)($");
		emails.add("diwdhiwu55455@");
		emails.add("sjdncskjcn_-.@dnjn.com");
		emails.add("_-.-.-@com");
		Pattern pattern = Pattern.compile(regex);
		for (String email : emails) {
			Matcher matcher = pattern.matcher(email);
			System.out.println(email + " res: " + matcher.matches());
		}

	}

	public void regexPermittedByRFC5322() {
		String regex = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		emails.add("user@domain.com");
		emails.add("user@domain.co.in");
		emails.add("user.name@domain.com");
		emails.add("user?name@domain.co.in");
		emails.add("user'name@domain.co.in");

		// Invalid emails
		emails.add("@yahoo.com");

		Pattern pattern = Pattern.compile(regex);
		for (String email : emails) {
			Matcher matcher = pattern.matcher(email);
			System.out.println(email + " :RFC: " + matcher.matches());
		}
	}

	public void restrictByTopLevelDomineName() {
		String regex = "^[\\\\w!#$%&’*+/=?`{|}~^-]+(?:\\\\.[\\\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\\\.)+[a-zA-Z]{2,6}$";
		emails.add("user@domain.com");
		emails.add("user@domain.co.in");
		emails.add("user.name@domain.com");
		emails.add("user_name@domain.com");
		emails.add("username@yahoo.corporate.in");

		// Invalid emails
		emails.add(".username@yahoo.com");
		emails.add("username@yahoo.com.");
		emails.add("username@yahoo..com");
		emails.add("username@yahoo.c");
		emails.add("username@yahoo.corporate");

		Pattern pattern = Pattern.compile(regex);
		for (String email : emails) {
			Matcher matcher = pattern.matcher(email);
			System.out.println(email + " :top level domain: " + matcher.matches());
		}
	}

	public static void main(String[] args) {
		EmailRegex er = new EmailRegex();
		er.simpleEmailValidation(); // Simple Email Validation with @ symbol checking
		er.restrictedEmailIDChecking();// Restricted email checking only with allowed characters.
		er.regexPermittedByRFC5322(); // Regex allowing email addresses permitted by RFC 5322
		er.restrictByTopLevelDomineName();//no. of characters in top level domain

	}
}
