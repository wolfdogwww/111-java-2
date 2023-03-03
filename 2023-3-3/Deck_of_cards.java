class Deck_of_cards{
    Poker b=new Poker();
    int[] Deck_of_cards =new int[52];
	
	for(int num = 0;num<=51;num++){
		for(int i =1; i <=4;i++){
			b.suits=i;
			for(int j = 1;j<=13;j++){
				b.num = j;
				Deck_of_cards[num]= b.suits*100+b.num;
			}
			
		}
	}
	
	public void printPoker(){
		for(int a =0;a<=51;a++){
			System.out.print(Deck_of_cards[a]);
		}
	}
}