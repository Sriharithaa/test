package project;
import java.util.*;


class Sweetshop{
	
	Scanner sc=new Scanner(System.in);
	int n=4;
	
	String[]name=new String[n];
	String[]city=new String[n];
	String[]Sweetname=new String[n];
	int[]cost=new int[n];
	int[]quantity=new int[n];
	
	void setInfo() {
		
		for(int i = 0; i < n ;i++)
		{
		
			System.out.println("enter the name of the shop"+(i+1));
			name[i]=sc.nextLine();
			
			System.out.println("enter the city of the city"+(i+1));
			city[i]=sc.nextLine();
			
			
				for(int j=0;j<n;j++) {
			
		
		
		System.out.println("enter the sweet:"+(j+1));
		Sweetname[j]=sc.nextLine();
		
		System.out.println("enter the cost of the :"+(j+1));
		cost[j]=sc.nextInt();
		
		System.out.println("enter the quantity of the :"+(j+1));
		quantity[j]=sc.nextInt();
		sc.nextLine();
				}
	}
		
}
void search() {
	int j = 0;
	System.out.println("*****sweets present in the shop*****");
	for(int i=0;i<n;i++) {
		System.out.println((i+1)+"name of the shop:"+name[i]);
		//System.out.println((i+1)+"name of the shop:"+name[i]);
		
	}
	System.out.println("enter the name of the shop:");
	String titkey;
	titkey=sc.nextLine();
	int flag=0;
	
	for(int p=0;p<n;p++) {
		
		if(titkey.equals(name[j])) {
			flag++;
			break;
			
		}
	}
		if(flag!=0) {
			System.out.println("*****details of the sweet shop*****");
			System.out.println("name of shop:"+name);
			System.out.println("city:"+city);
			System.out.println("sweet name:"+Sweetname);
			System.out.println("cost of sweet:"+cost);
			System.out.println("quantity of sweet:"+quantity);
		}
		else {
			System.out.println("the particular sweet is not available");
		}
	}
}
public class SweetStall {

	public static void main(String[] args) {
		int c;
		Sweetshop sw=new Sweetshop();
		Scanner s=new Scanner(System.in);
		while(true) {
			System.out.println("\t\t1.to enter data\n\t\t2.to search\n\t\t3.to exit:");
			System.out.println("enter the choice:");
			c=s.nextInt();
			//s.close();
		
		
		
		
		switch(c) {
		case 1:sw.setInfo();
		break;
		case 2:sw.search();
		break;
		case 3:System.exit(0);
		}
		

	}
	}

}
