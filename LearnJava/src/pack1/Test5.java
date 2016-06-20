package pack1;
/**
 * 
 * 一.Java语言基础  ---> Java基础语法 ---> 数据运算符
 * 
 *   重点
 *   
 *   	一.算术运算符
 *   
 *   		+、-、*、/、%、++、--
 *   
 *   	注意：两个整数相/,只留下整数
 *   
 *   	二.关系运算符 
 *   
 *   		<、<=、>、>=、!=、== 
		
		三.逻辑运算符
		
			&& 、|| 、!
			
		注意：&&是短路，如果左边是true,右边将不再执行。而&没有短路效果
		
		四.条件运算符(三目运算符) 
		
			A?B:C
		
		五.赋值运算符
		
			+=、-=、*=、/=
			
		举例：a+=20; // a = a + 20; (等价)
		
		六.位运算符
	
			<<、|、&、^
		
		特点：效率最高(直接操纵二进制数)，也较难理解
		
	   	七.作业
	   	
	   		计算：74513各个位数之和
 */
public class Test5 {
	
	public static void main(String[] args) {
		int number = 74513;
		int ge = number / 1 % 10;
		int shi = number / 10 % 10;
		int bai = number / 100 % 10;
		int qian = number / 1000 % 10;
		int wan = number / 10000 % 10;
		System.out.println("各个位数之和是："+(ge+shi+bai+qian+wan));
	}
	
}
