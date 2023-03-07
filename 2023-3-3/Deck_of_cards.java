class Deck_of_cards{
    Poker b=new Poker();
    int[] Deck_of_cards =new int[52];
    int a =0;
	
    public Deck_of_cards(){    //constructs
            for(int i =1; i <=4;i++){
                b.suits=i;
                for(int j = 1;j<=13;j++){
                    b.num = j;
                    Deck_of_cards[a]= b.suits*100+b.num;
                    a++;
                }
            }
	}    
    

    
	public void printPoker(){
		for(a =0;a<=51;a++){
			System.out.println(Deck_of_cards[a]+" "+(a+1));
		}
	}
}