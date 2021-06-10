class Main
{
	private static long countOccurrences(String str, char ch) {
		return str.chars()
				.filter(c -> c == ch)
				.count();
	}

	public static void main(String[] args)
	{
		String str = "ABAACBDD";
		char ch = 'A';

		System.out.println("Character " + ch + " occurs " + countOccurrences(str, ch) + " times.");
	}
}