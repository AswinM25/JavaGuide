/* Aswin menon cs2 14*/
import java.util.*;
public class matrixmulti
{
public static void main(String args[])
{
int i,j,k;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the rows and coloumns of Matrix A");
int r1=sc.nextInt();
int c1=sc.nextInt();
System.out.println("Enter the rows and coloumns of Matrix B");
int r2=sc.nextInt();
int c2=sc.nextInt();
int[][] A=new int[r1][c1];
int[][] B=new int[r2][c2];

if(c1!=r2)
{
System.out.println("Matrix multiplication not possible");
}

 else
 {
 System.out.println("Elements of Matrix A");
 for(i=0;i<r1;i++)
 {
 for(j=0;j<c1;j++)
 {
 A[i][j]=sc.nextInt();
 }
 }
 System.out.println("Elements of Matrix B");
 for(i=0;i<r2;i++)
 {
 for(j=0;j<c2;j++)
 {
 B[i][j]=sc.nextInt();
 }
 }
 System.out.println("Matrix A:");
 for(i=0;i<r1;i++)
 {
 for(j=0;j<c1;j++)
 {
 System.out.println(A[i][j]);
 }
 }
System.out.println("Matrix B:");
 for(i=0;i<r2;i++)
 {
 for(j=0;j<c2;j++)
 {
 System.out.println(B[i][j]);
 }
 }
 int[][] C=new int[r2][c2];
 for(i=0;i<r2;i++)
 {
 for(j=0;j<c2;j++){
 C[i][j]=0;
 for(k=0;i<c1;k++)
 {
 C[i][j]+=A[i][k]*B[k][j];
 }
 }
 }
 System.out.println("Matrix multiplication");
 for(i=0;i<r1;i++)
 {
 for(j=0;j<c2;j++)
 {
 System.out.println(C[i][j]);
 }
 }
 }
 }
 }
 
