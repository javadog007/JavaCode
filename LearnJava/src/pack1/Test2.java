package pack1;
/**
 * 一.Java语言基础  ---> Java基础语法 ---> Java变量
 * 
 * 重点：
 * 	
 * 		一.变量的命名
 * 		
 * 		1.规则
 * 			开头：字母、"_"、$
 * 			后面：字母、"_"、$、数字
 * 
 * 		2.规范：驼峰命名
 * 
 * 		二.理解变量
 * 
 * 			1.变量的本质就是声明一块内存空间
 * 			2.变量必须赋值才能使用
 * 			3.变量可以重复赋值，不能重复定义(相同作用域内)
 * 			4.变量只作用于离它最近的大括号
 * 
 * 		三.练习
 * 
 * 			实现两个变量的互换
 */
public class Test2 {
	
	public static void main(String[] args) {
		
		int a = 10,b = 20;
		
		int add = a + b;
		a = add - a;
		b = add - b;
		
		System.out.println("a="+a+",b="+b);
	}
	
}
