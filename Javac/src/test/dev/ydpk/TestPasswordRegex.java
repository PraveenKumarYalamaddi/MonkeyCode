package test.dev.ydpk;

import org.junit.jupiter.api.Test;

import dev.ydpk.PasswordRegex;
import junit.framework.Assert;

@SuppressWarnings({ "static-access", "deprecation" })
public class TestPasswordRegex {
	

	/**
	 * buildValidator(boolean forceSpecialChar,boolean forceCapitalLetter,boolean forceNumber,int minLength,int maxLength); 
	 * @return
	 */
	
	@Test
	public void testNormalPassword() {
		PasswordRegex validate = PasswordRegex.buildValidator(false, false, false, 6, 12);
		Assert.assertTrue(validate.validatePw("testpassword"));
		Assert.assertTrue(validate.validatePw("TestPassw"));
		Assert.assertFalse(validate.validatePw("Test"));
	}
	
	@Test
	public void testForceDegitPassword() {
		PasswordRegex validate = PasswordRegex.buildValidator(true, false, false, 6, 8);
		Assert.assertTrue(validate.validatePw("tes@test"));
		Assert.assertTrue(validate.validatePw("te$sttte"));
		Assert.assertFalse(validate.validatePw("testtest"));
	}
	

}
