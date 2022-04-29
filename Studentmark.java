 import java.util.Scanner;
class Studentmark
{
int engmark;
int tamilmark;
int mathsmark;
int scimark;
int biomark;
int average;
void input()
{
Scanner s=new Scanner(System.in);
System.out.println("enter english mark: ");
engmark=s.nextInt();
System.out.println("enter tamil mark: ");
tamilmark=s.nextInt();
System.out.println("enter maths mark: ");
mathsmark=s.nextInt();
System.out.println("enter science mark: ");
scimark=s.nextInt();
System.out.println("enter biology mark: ");
biomark=s.nextInt();
}
void compute()
{
average=(engmark+tamilmark+mathsmark+scimark+biomark)/5;
}
void display()
{
System.out.println(" The average is: "+average);
}
public static void main(String args[])
{
Studentmark m=new Studentmark();
m.input();
m.compute();
m.display();

}
}