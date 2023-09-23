package com.mycompany.Ivan;
import java.util.Scanner;
public class Proyecto7 {
public static void main(String[] args) {
 Scanner leer = new Scanner(System.in);
 String[]arreglo = new String[5];
 int n,i,j;
 for(n=0;n<=5;n++){
 System.out.print("Ingresa un nombre");
 arreglo[n]=leer.next();
 double[]arreglo1=new double[5];
 for(i=0;i<=5;i++){
 System.out.print("Ingresa precio");
 arreglo1[i]=leer.nextDouble();
 }
 int[]arreglo2=new int[5];
 for(j=0;j<=5;j++){
 System.out.print("Ingresa cantidad");
 arreglo2[j]=leer.nextInt();
 }
 
 }
}
}
