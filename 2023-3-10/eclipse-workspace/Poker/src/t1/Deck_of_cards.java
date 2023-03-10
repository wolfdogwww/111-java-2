package t1;

public class Deck_of_cards {
    Poker b=new Poker();
    String[] Deck_of_cards =new String[52];
    int a =0;
    int flower[] = new int[52];
	
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
	private void Shuffle() {
		flower[0]=(int)(Math.random()*52);
		for (int i = 1; i < 52; i++) {
		    flower[i] = (int)(Math.random() * 52);
		    for (int j = 0; j < i; j++) {
		        if (flower[i] == flower[j]) {
		            while (flower[i] == flower[j]) {
		                flower[i] = (int)(Math.random() * 52) ;
		                j = 0; // 回到內層迴圈的起始位置
		            }
		        }
		    }
		}
	}
	public void printShuffle() {
		Shuffle();
	    
	    for(int i =0;i<=51;i++) {
	    	System.out.println(Deck_of_cards[flower[i]]);
	    }
	}
	public void print_fourpeople(){
		Shuffle();
		int right = 13,left=0;
		
		for(int j=0;j<4;j++) {
			System.out.println("第"+(j+1)+"位");
			for(int i =left;i<right;i++) 
				System.out.println(Deck_of_cards[flower[i]]);
			System.out.println("==================");
			right+=13;
			left+=13;
		}
	}
}