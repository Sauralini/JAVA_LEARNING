package test;

public class Arrays {

	public static void main(String[] args) {
		
		//array is used to store more than one value in one variable
		//for this a syntax is require 
		//two types or array are there 
		// one dimensional Array  int i[]=new int [];
		// two dimensional Array syntax int i[] [] = new int [][];
		
		int i[]=new int [4];//[] value needs to be put in the index so no of value can be indentified
			i[0]=100;
			i[1]=200;
			i[2]=300;
			i[3]=400;
			System.out.println(i[3]);// if wanted to print one variable
			
			//for printing all values of array we used for loop
			for(int j=0;j<4;j++) {
				System.out.println(i[j]);
			}
			
			
			// sample two dimensional arrays // two print two dimensional array we used nested for loop
			
			String st[][]=new String[4][5];
				st[0][0]="A";
				st[0][1]="B";
				st[0][2]="C";
				st[0][3]="D";
				st[0][4]="E";
				
				st[1][0]="F";
				st[1][1]="G";
				st[1][2]="H";
				st[1][3]="I";
				st[1][4]="J";
				
				st[2][0]="K";
				st[2][1]="L";
				st[2][2]="M";
				st[2][3]="N";
				st[2][4]="O";
				
				st[3][0]="O";
				st[3][1]="P";
				st[3][2]="Q";
				st[3][3]="R";
				st[3][4]="S";
				
				for(int a=0;a<4;a++) {
					for(int b=0;b<5;b++) {
						System.out.print(st[a][b]+"  ");
					}System.out.println();
				}
				
				
				String st1[][]=new String[3][5];
				st1[0][0]=" ";
				st1[0][1]=" ";
				st1[0][2]="*";
				st1[0][3]=" ";
				st1[0][4]=" ";
				
				st1[1][0]=" ";
				st1[1][1]="*";
				st1[1][2]="*";
				st1[1][3]="*";
				st1[1][4]=" ";
				
				st1[2][0]="*";
				st1[2][1]="*";
				st1[2][2]="*";
				st1[2][3]="*";
				st1[2][4]="*";
				
				
				for(int a=0;a<3;a++) {
					for(int b=0;b<5;b++) {
						System.out.print(st1[a][b]);
					}System.out.println();
	 }
	}
}
