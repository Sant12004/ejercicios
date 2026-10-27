package programacion;

import java.util.Scanner;
public class Adivina {
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         
         int ran=(int)(Math.random()*10);
         
         System.out.println("dame un numero del 0 al 99:");
         
         int num = sc.nextInt();
         
         System.out.println("el numero introducido es mayor?"+ (num>ran));
         
         System.out.println("el numero introducido es menor?"+ (num<ran));
         
         System.out.println("el numero introducido es igual?"+ (num==ran));
         
         System.out.println(ran);

    }
    
}
