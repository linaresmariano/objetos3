package main;

public class Utils {

	public static String getFieldFromAccessor(String metodo) {
		String fstChar = Character.toString(metodo.charAt(3)).toLowerCase();
		return fstChar + metodo.substring(4);
	}

}
