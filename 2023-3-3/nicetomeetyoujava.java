public class nicetomeetyoujava{
    public static void main(String[] Args){
            int r = 0;
	    Deck_of_cards a=new Deck_of_cards();
		
	    a.printPoker();
	    
	    r = (int)(Math.random()*51);
	 
	    
	    a.printPoker(r);
    }
}
