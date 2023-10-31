package vishal_20MIC0128;

public class ValidateUser {
	private static final String predefinedUsername = "Ram"; 
	private static final String predefinedID = "3025"; 
	public static boolean validate(String inputUsername, String inputPassword) { 
	return inputUsername.equals(predefinedUsername) && inputPassword.equals(predefinedID); 
	}
}
