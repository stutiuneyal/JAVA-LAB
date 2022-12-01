import java.util.*;
import java.lang.*;
class Book{
String name,author;
double price;
int num_pages;

void getval()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter book name");
name=sc.next();
System.out.println("enter author name");
author=sc.next();
System.out.println("enter price");
price=sc.nextDouble();
System.out.println("enter number of pages");
num_pages=sc.nextInt();
}

void display()
{
System.out.println("book details");
System.out.println(" book name is"+" "+name);
System.out.println("the author name is"+ " "+author);
System.out.println("the book price is"+" "+price);
System.out.println("no. of pages in book is" +" "+num_pages);
}
}

class Bookv
{
public static void main(String args[])
{
Scanner in =new Scanner(System.in);
System.out.println("ENTER THE NO. OF BOOK OBJECTS");
int n=in.nextInt();
Book[] ob=new Book[n];
for(int i=0;i<n;i++)
{
ob[i]=new Book();
}
for(int i=0;i<n;i++)
{
ob[i].getval();
}
for(int i=0;i<n;i++)
{
ob[i].display();
}
}
}

