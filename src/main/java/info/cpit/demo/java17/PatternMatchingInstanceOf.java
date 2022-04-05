package info.cpit.demo.java17;

/**
 * This feature is available since Java 16
 * @author CPeters
 *
 */

public class PatternMatchingInstanceOf {
	
	
	private static String testInstanceOf (Object obj) {
		
		if (obj instanceof String s && s.endsWith("ende")){
			return "A string that ends with 'ende'";
		}
		
		if (obj instanceof Integer i && i.equals(42)) {
			return "An integer that has the answer to everything";
		}
		
		return "An unknown value";
	}

	public static void main (String ...args) {
		System.out.println(testInstanceOf("blahblahende"));
		System.out.println(testInstanceOf(42L));
		System.out.println(testInstanceOf(42));
		System.out.println(testInstanceOf(42.42));
	}

}
