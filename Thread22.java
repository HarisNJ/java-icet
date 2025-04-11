class FibNos implements Runnable
{
private int count;
public FibNos (int count) // Constructor to initialize count
{
this.count = count;
}
public void run()
{
int a = 0, b = 1;
System.out.println("Fibonacci Series (" + count + " terms):");
for (int i = 0; i < count; i++)
{
System.out.print(a + " ");
int next = a + b;
a = b;
b = next;
try
{ Thread.sleep(500); }
catch (InterruptedException e)
{ System.out.println(e); }
}
System.out.println();
}
}
class EvenNos implements Runnable
{
private int start, end;
public EvenNos(int start, int end) // Constructor to initialize range
{
this.start = start;
this.end = end;
}
public void run()
{
System.out.println("Even Numbers in range " + start + " to " + end + ":");
for (int i = start; i <= end; i++)
{
if (i % 2 == 0)
{
System.out.print(i + " ");try
{ Thread.sleep(500); }
catch (InterruptedException e)
{ System.out.println(e);
}
}
}
System.out.println();
}
}
public class Thread22
{
public static void main(String[] args)
{ // Create Runnable objects
FibNos fib = new FibNos(10); // 10 Fibonacci numbers
EvenNos even = new EvenNos(1, 20); // Even numbers from 1 to 20
Thread t1 = new Thread(fib);
//create thread object
Thread t2 = new Thread(even);
//create thread object
t1.start();
// Start 1st thread
t2.start();
//start 2 nd thread
}
}
