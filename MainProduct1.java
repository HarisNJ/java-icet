class Product
{
int pcode;
String pname;
int pprice;
Product(int code,String name,int price)
{
pcode=code;
pname=name;
pprice=price;
}
void display()
{
System.out.println("product code:"+pcode);
System.out.println("product name:"+pname);
System.out.println("product price:"+pprice);
}
}
class Mainproduct1
{
public static void main(String[] args)
{
Product ob1=new Product(123,"pen",10);
Product ob2=new Product(423,"pencil",5);
Product ob3=new Product(233,"book",30);

System.out.println("\n product with lower price");
if(ob1.pprice<ob2.pprice)
   if(ob1.pprice<ob3.pprice)
      ob1.display();
    else
      ob3.display();
else if(ob3.pprice<ob2.pprice)
     ob1.display();
   else
      ob2.display();
}
}

