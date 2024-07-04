import java.util.Scanner;
class complex{
	 int r,i;
	 Scanner s = new Scanner(System.in);
	complex(int a, int b){
		System.out.println(a+"+"+b+"i");
 
	}
	complex(){
		System.out.println("Enter Real part :");
		r = s.nextInt();
		System.out.println("\nEnter imaginary part :");
		i =s.nextInt();
	}
	 void show(){
		System.out.println(r+"+"+i+"i");
	}
}
 
class Main{
	public static void main(String[] args){
		complex c1 = new complex(8,5);
		complex c2 = new complex();
 
 
		c1.show();
                c2.show();
	}
 
 
}

