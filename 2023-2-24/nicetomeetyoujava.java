public class nicetomeetyoujava{
    public static void main(String[] Args){
	//Humen a = new Humen();
        int[] data=new int[3];
	//a.printHeight();
        //a.weight = 80;
	//a.printweight();
        Humen.printHeight();
    }
}

class Humen{
    int sex;
    private int weight;
    static int hight=180 ;

    public static void printHeight(){

	System.out.print(hight);
     }
    private void printweight(){
	System.out.print(weight);
     }
}