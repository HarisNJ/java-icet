import java.util.Scanner;
class Matrix
{
private int matrix[][];
private int rows;
private int cols;
public Matrix(int rows,int cols)
{
this.rows=rows;
this.cols=cols;
this.matrix=new int[rows][cols];
}

public void readMatrix(Scanner sc)
{
System.out.println("enter Element of the Matrix:");
for(int i=0;i<rows;i++)
{
for (int j=0;j<cols;j++)
matrix[i][j]=sc.nextInt();
}
}

public void displayMatrix()
{
for(int i=0;i<rows;i++)
{
for(int j=0;j<cols;j++)
System.out.print(matrix[i][j] +" ");
System.out.println();
}
}

public static Matrix addMatrices (Matrix a,Matrix b)
{
Matrix result=new Matrix(a.rows,a.cols);
for(int i=0;i<a.rows;i++)
{
for(int j=0;j<a.cols;j++)
result.matrix[i][j]=a.matrix[i][j] +b.matrix[i][j];
}
return result;
}}

public class Add2Matrix
{
public static void main(String[] args)
{
Scanner sc =new Scanner(System.in);
System.out.print("Enter the no of rows in 1st Matrix:");
int rows1=sc.nextInt();
System.out.print("Enter the no of columns in 1st Matrix:");
int cols1=sc.nextInt();
System.out.print("Enter the no of rows in 2nd Matrix:");
int rows2=sc.nextInt();
System.out.print("Enter the no of columns in 2nd Matrix:");
int cols2=sc.nextInt();

if(rows1!=rows2||cols1!=cols2)
{
System.out.print("Addition is not possible");
return;
}
Matrix Matrix1=new Matrix(rows1,cols1);
Matrix1.readMatrix(sc);

Matrix Matrix2=new Matrix(rows2,cols2);
Matrix2.readMatrix(sc);


System.out.println("First Matrix:");
Matrix1.displayMatrix();
System.out.println("second Matrix:");
Matrix2.displayMatrix();
Matrix resultMatrix=Matrix.addMatrices(Matrix1,Matrix2);
System.out.println("Matrix after addition:");
resultMatrix.displayMatrix();
}
}



