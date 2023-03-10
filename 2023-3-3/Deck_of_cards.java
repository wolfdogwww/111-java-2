class Deck_of_cards{
    Poker b=new Poker();
    String[] Deck_of_cards =new String[52];
    int a =0;
	
    public Deck_of_cards(){    //constructs
            for(int i =0; i <4;i++){              
                for(int j = 0;j<13;j++){
                    Deck_of_cards[a]= b.num[j]+"\tof\t"+b.suits[i];
                    a++;
                }
            }
	}    
    
	public void printPoker(){
		for(a =0;a<=51;a++){
			System.out.println(Deck_of_cards[a]+" "+(a+1));
		}
	}
	public void printPoker(int i ){
		System.out.print(Deck_of_cards[i]);
        }
}