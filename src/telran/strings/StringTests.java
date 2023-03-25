package telran.strings;
public class StringTests {
	static public char charat (String sentence) {
		return sentence.charAt(0);
	}
	static public int compartTo (String str1, String str2) {
		return str1.compareTo(str2);
	}
	static public int compareToIgnoreCase (String str1, String str2) {
		return str1.compareToIgnoreCase(str2);
	}
	static public String concat (String str1, String str2) {
		return str1.concat(str2);
	}
	static public boolean startWith (String str1, String str2, int prefix) {
		
		return str1.startsWith(str2, prefix);
	}
	static public boolean endWith (String str1, String str2) {
		return str1.endsWith(str2);
	}
	static public boolean contains (String str1, String str2) {
		return str1.contains(str2);
	}
	static public int indexOf(String str1, String str2) {
		return str1.indexOf(str2);
	}
	static public int lastIndexOf(String str1, char abc) {
		return str1.lastIndexOf(abc);
	}
}
