class Main {
	public static void main( String[] args ){

		//******************UsernamesSystem******************
		System.out.println("****** UsernamesSystem ******");
		UsernamesSystem uniqueName = new UsernamesSystem();
		String[] input = new String[] { "bob", "alice", "bob", "alice", "bob" };
		String[] output = uniqueName.uniqueUsernames( input );
		System.out.println( );

		//******************EvenSubarray******************
		System.out.println("****** EvenSubarray ******");
		EvenSubarray evenSubarray = new EvenSubarray();
		int[] numbers = new int[]{ 6, 3, 5, 8 };
		// for( int n : numbers ){
		// 	System.out.println( n );
		// }
		int count = evenSubarray.countSubarray2( numbers, 1 );
		System.out.println( "\n" + count + "\n" );	

		//******************PerfectTeam******************
		System.out.println("****** PerfectTeam ******");
		PerfectTeam perfectTeam = new PerfectTeam();
		System.out.println( perfectTeam.countPerfectTeam( "pcmbzpcmbzpc" ) + "\n" );	

		//******************ShiftString******************
		System.out.println("****** ShiftString ******");
		ShiftString shiftString = new ShiftString();
		System.out.println( shiftString.shift( "abcde", 2, 5 ) + "\n" );

		//******************BreakPalindrome******************
		System.out.println("****** BreakPalindrome ******");
		BreakPalindrome breakPalindrome = new BreakPalindrome();
		System.out.println( breakPalindrome.brkPalindrome( "aaaaa" ) + "\n" );	

	}
}