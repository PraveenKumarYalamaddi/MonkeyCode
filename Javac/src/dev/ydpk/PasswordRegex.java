package dev.ydpk;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordRegex {
	
	/**
	 * (?=.*[a-z])      : This matches the presence of at least one lower case letter.
	 * (?=.*d)          : This matches the presence of at least one digit i.e. 0-9.
	 * (?=.*[@#$%]) 	: This matches the presence of at least one special character.
	 * (?=.*[A-Z])     : This matches the presence of at least one capital letter.
	 * {6,16}			: This limits the length of password from minimum 6 letters to maximum 16 letters. 
	 **/

	private static PasswordRegex PRINST = new PasswordRegex();
	private static String pwregex = null;
	
	private PasswordRegex() {
		
	}
	
	public static PasswordRegex buildValidator(boolean forceSpecialChar,
            boolean forceCapitalLetter,
            boolean forceNumericDigit,
            int minLength,
            int maxLength) {
		
		StringBuilder patternBuilder = new StringBuilder("((?=.*[a-z])");
		
		if (forceSpecialChar){patternBuilder.append("(?=.*[@#$%])");}
 
        if (forceCapitalLetter){patternBuilder.append("(?=.*[A-Z])");}
 
        if (forceNumericDigit){patternBuilder.append("(?=.*d)");}
 
        patternBuilder.append(".{" + minLength + "," + maxLength + "})");
		pwregex = patternBuilder.toString();
		return PRINST;
	}
	
	public static boolean validatePw(final String password) {
		Pattern pattern = Pattern.compile(pwregex);
		Matcher matcher = pattern.matcher(password);
		System.out.println("Password Matched: " +matcher.matches());
		return matcher.matches();
	}
	
	
}
