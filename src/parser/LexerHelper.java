package parser;

public class LexerHelper {
	
	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static char lexemeToChar(String str) {
		if (str.contains( "\\" )) {
			if (str.contains( "n" )) {
				return '\n';
			} else if (str.contains( "t" )) {
				return '\t';
			}
			str = str.replaceAll( "\\D+", "" );
			return (char) Integer.parseInt( str );

		} else {
			return str.charAt( 1 );
		}
		/**try {
			if(str.contains("\\n")){
				return '\n';
			} else if (str.contains("\\t")) {
				return '\t';
			}
			return str.charAt(1);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return str.charAt(1);**/
	}

	public static double lexemeToReal(String str) {
		try {
			return Double.parseDouble(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}
}
