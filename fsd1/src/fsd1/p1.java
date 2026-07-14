package fsd1;

public class p1 {
	int sum(int a[]){
		int total=0;
		for(int i=0;i<a.length;i++) {
			total=total+a[i];
		}
		return total;
	}
 public static void main(String args[]) {
	 p1 ob1=new p1();
	 int num[]= {520,650,140,210,950};
	 int result=ob1.sum(num);
	 System.out.println("sum is:"+result);
 }
}
