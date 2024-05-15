public class Fibonacci2
{
public static void main(String[] args)
{

int n = 7;
int a = 0, b = 1;
System.out.println("Fibonacci Series:");
for (int i = 1; i <= n; ++i)

{
    int next = a + b;
System.out.print(a + " ");



a = b;
b = next;
int sum=0;
sum+=next;
    System.out.println("sum:"+sum);
}
}
}