package inClassStrings;

public class StringMethods 
{

	public static void main(String[] args) 
	{
		String str = "aA,zZ,st";
		// Test the String Methods
		System.out.printf("%s Returned: %s\n", str, toUpperCase(str));
		System.out.printf("%s Returned: %s\n", str, subString(str, 1, 4));
		System.out.printf("%s Returned: %s\n", str, arrayToString(toCharArray(str)));
		System.out.printf("%s Returned: %s\n", str, arrayToString(split(str, ',')));	
	}
	
	public static String toUpperCase(String str) 
	{
		String newStr = "";
		for (int i = 0; i < str.length(); i++)
		{
			char currCh = str.charAt(i);
			if (isLower((byte)currCh))
				newStr += (char)(currCh - 32);
			else
				newStr += currCh;
		}
		return newStr;
	}
	
	public static String subString(String str, int beginIndex, int endIndex) 
	{
		String newStr = "";
		for (; beginIndex <= endIndex - 1; beginIndex++)
		{
			newStr += str.charAt(beginIndex);
		}
		return newStr;
	}

	public static char[] toCharArray(String str) 
	{
		char[] newStr = new char[str.length()];
		for (int i = 0; i < str.length(); i++)
		{
			newStr[i] = str.charAt(i);
		}
		return newStr;
	}
	
	public static String[] split(String str,char delim) 
	{
		int stringCount = 0;
		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == delim)
				stringCount++;
		}
		
		String[] newStrings = new String[stringCount + 1];
		int arrayIndex = 0;
		String currString = "";
		for (int i = 0; i < str.length(); i++)
		{
			char currChar = str.charAt(i);
			if (currChar != delim)
				currString += currChar;
			else
			{
				newStrings[arrayIndex] = currString;
				currString = "";
				arrayIndex++;
			}			
		}
		newStrings[arrayIndex] = currString;
		
		return newStrings;
	}
	
	
	public static boolean isLower(byte ch)
	{
		return (ch >= 97 && ch <= 122);
	}
	
	public static String arrayToString(char[] Array)
	{
		String str = "{ ";
		for (int i = 0; i < Array.length; i++)
		{
			if (i < Array.length - 1)
				str += Array[i] + ", ";
			else
				str += Array[i];	
		}
		return str + " }";
	}
	
	public static String arrayToString(String[] Array)
	{
		String str = "{ ";
		for (int i = 0; i < Array.length; i++)
		{
			if (i < Array.length - 1)
				str += Array[i] + ", ";
			else
				str += Array[i];				
		}
		return str + " }";
	}
}
