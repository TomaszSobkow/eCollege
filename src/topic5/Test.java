package topic5;
import java.util.Arrays;
import java.util.Scanner;


	public class Test {
		
		private  int w = 1;
		int width;
		int row;
		
		
		
		
		public void createArray(){
			Scanner input = new Scanner(System.in);
			System.out.print("\tPlease enter the size of Multi Decymal Array\n "+
					" \nEnter number of rows:");
			width = input.nextInt();
			System.out.print("Enter width Please: ");
			row = input.nextInt();
			System.out.println();
			new Test().asymmetricArray(width,row);
		}
		
		
		public static void main(String[] args) {

			int[][] ar = new int[10][12];
			
			for(int x = 0; x < ar.length; x++){
				System.out.printf("%-4d",(x+1));
				for(int i = 0 ; i <ar[x].length; i++)
					System.out.print(ar[x][i]);
				System.out.println();
			}
			
			
		}	
		
		
		
		public void asymmetricArray( int width, int rows){
			
			if(width <=0 || rows <=0){
				width = 1;
				rows = 1;
			System.out.println("Multidecymal array wit paramiters [1][1] will be printed !\n");
			}
				
			int[][] arrayName = new int[width][rows];
			
			for(int i = 0; i < arrayName.length; i++){
				for(int y = 0; y < arrayName[i].length; y++){
				arrayName[i][y] = (int) (w); 
				w += 1;
				}
			}	
			
			//print arrayName
			for(int i = 0; i < arrayName.length; i++){
				System.out.printf("%-5d",(i+1));
				for(int y = 0; y < arrayName[i].length; y++)
					System.out.print(arrayName[i][y]+" ");
				System.out.println();
				
			}
		}
		
		int[][] ract = new int[3][15];
		
			public  void fillUpArray(){
				for(int i = 0; i < ract.length; i++){
					for(int y = 0; y < ract[i].length; y++){
						ract[i][y] = (int)(w +22 );
						w += 12;
					}
					
				}
				
			}
			
			public  void printArray(){
				for(int i = 0; i < ract.length; i++){
					System.out.print(i+1+"  --> ");
					for(int y = 0; y < ract[i].length; y++){
						System.out.print(+ract[i][y] + " - ");
						}
					System.out.println();
					
					
				}
				
			}
		String[] numbersInArray = {"20","100","11","Kw","0x","KWS"};

		public String[] sortArray(){
			String[] strings = {"10","20","30"};
			Arrays.sort(strings);
			for(String a : strings)
			System.out.print(a+" ");
			System.out.println("\n\n");
		

			Arrays.sort(numbersInArray);
			
			for(String a : numbersInArray){
				System.out.print(a+" ");
				
			}
			return numbersInArray;
			
			
		}
	}
