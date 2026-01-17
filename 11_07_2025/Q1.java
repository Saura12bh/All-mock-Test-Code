/* Q1. Write a java program to print this pattern.
 A
 A B A
 A B C B A
 A B C D C B A
 A B C D E D C B A  */
public class Q1{
    public static void main(String[] x){
        int r=5;   //rows
        for (int i=0;i<r;i++) {    //r=0 to r=5 

            for (int j=0;j<=2*i;j++) {  //j=0  to j<=2*i =>2*0=1 ,2*1=>2
	   char ch='A';
                if(j<=i){     
                    System.out.print((char)(ch+j)+" ");  //(char) for type casting (ch=A=>65)->(char)(65+0))=>A
                }
                else {
                    System.out.print((char)(ch+(2*i-j))+" ");  //(char)(65+(2*1-2))=>65=>A
                }
            }
            System.out.println();  //for next Line
        }
    }
}

