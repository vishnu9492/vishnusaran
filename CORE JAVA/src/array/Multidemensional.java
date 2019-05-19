package array;

public class Multidemensional {

	public static void main(String[] args) {
int a[][]= {{1,5,8,9},{4,5,8,9}};
int b[][]= {{6,4,9,8},{5,8,9,10}};
       int c[][]=new int[2][4];
       for(int i=0;i<2;i++) {
    	   for(int j=0;j<4;j++) {
    	   c[i][j]=a[i][j]+b[i][j];
    	  System.out.println(c[i][j]+"");
    	  //System.out.println();
       }
	}	

}}
