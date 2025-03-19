import java.util.Scanner;
class Matrix
{
private int rows;
private int columns;
private int mat[][];
Public Matrix(int rows,int columns)
{
this.rows=rows;
this.columns =columns;
this.mat=new int [rows][columns]
}
Public void read (Scanner sc)
{
System.out.println("enter the element of the matrix:");
for(int i=0;i<rows;i++)
{for(int j=0;j<coloumns;j++)
mat[i][j]=sc.nextInt();
}
}

Public void printMatrix()
{
System.out.println("Matrix:");
for(int i=0;i<rows;i++)
{
for(int j=0;j<coloumns;j++)
System.out.print(mat[i][j] + " ");
Sysatem.out.println();
}
}

public boolean isSymmetric()
{

