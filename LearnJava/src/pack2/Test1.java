package pack2;
/**
 * 一.Java语言基础  ---> Java循环 ---> for循环
 * 
 * 		重点
 * 			1.for循环执行流程
 * 
 * 			for(A:B:C){
 * 				//D
 * 			}
 * 
 * 			A --> B --> D --> C --> B --> D --> C --> B --> D --> ...
 * 
 * 			2.break 和 continue
 * 
 * 			break : 结束整个循环
 * 			continue ： 结束当前循环，进入下次循环
 * 
 * 			3.嵌套for循环
 * 
 * 			执行顺序：外层循环循环一次，内层循环执行一轮
 * 
 * 			作业：
 * 				1.打印99乘法表
 * 				2.见下面方法
 * 			
 * 
 */
public class Test1 {
	
	public static void main(String[] args) {
		//print99();
		//addNum();
		//count();
		printStart3();
	}
	
	//打印99乘法表
	public static void print99(){
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i+"*"+j+"="+i*j+" ");
			}
			System.out.println();
		}
	}
	
	//计算1+2+3+...+100
	public static void addNum(){
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum+=i;
		}
		System.out.println("和是："+sum);
	}
	
	//打印1~100 之间既能被3整除，又能被5整除的数。并计算有几个
	public static void count(){
		int sum = 0;
		for (int i = 1; i < 100; i++) {
			if(i%3==0&&i%5==0){
				System.out.println("既能被3整除，又能被5整除的数："+i);
				sum++;
			}
		
		}
		System.out.println("一共有："+sum+"个");
	}
	
	/**
	  	打印：
	  
	    *
		**
		***
		****
		*****
	 */
	public static void printStart1(){
		for (int i = 1; i <= 5; i++) { //控制行数
			for (int j = 1; j <= i ; j++) { //控制星数
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/**
	  	打印：
	  
	     *******
	     ******
	     *****
	     ****
	     ***
	     **
	     *
	     
	*/
	public static void printStart2(){
		for (int i = 7; i >= 1 ; i--) { //控制行数
			for (int j = 1; j <= i; j++) { //控制星数
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/**
	  	打印：[相对难度较大]
	  
	      *
	     ***
	    *****
	   *******
		*****
		 ***
	      *
     
	 */
	public static void printStart3(){
		
		for (int i = 1; i <= 4 ; i++) {
			//上半部分，空格根据行数逐行递减1
			for(int j=1;j<=4-i;j++){
				System.out.print(" ");
			}
			//星号数是一个：2n-1的等差数列
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		//下面  上面的i=6 打印的就是下面的第一行
		for(int i=4-1;i>=1;i--){
			for(int j=1;j<=4-i;j++){
				//下半部分，空格逐行递增1
				System.out.print(" ");
			}
			//星号同样是等差数列
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
}
