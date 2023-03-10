package t1;

import java.io.InterruptedIOException;

public class Poker_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=0;
		
	    Deck_of_cards a=new Deck_of_cards();
		
	    //a.printPoker();
	    a.Shuffle();
	    a.print_fourpeople();
	}

}
