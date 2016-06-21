package pack2;

import java.util.Arrays;

/**
 * 一.Java语言基础  ---> 数组 ---> 数组的基本使用
 * 
 * 		重点
 * 
 * 			1.声明和初始化
 * 
 * 			int[] array; //数组声明
 * 			int[] array={94,60,70}; //声明并初始化
 * 			int[] b = new int[]{94,60,70}; //其他方式声明并初始化
 * 			int[] c = new int[5]; //指定数组长度
 * 
 * 			2.数组是引用数据类型
 * 
 * 			3.其他都太简单，不说了...
 * 
 * 			作业：
 * 				1.创建一个数组并初始化，求数组最大值、最小值、和、平均值
 * 				2.数组倒置
 * 				3.得到数组中相同且最大的数
 */
public class Test3 {
	
	public static void main(String[] args) {
		//homework1();
		int[] arr = new int[]{45,79,7,56,133,99,44};
		int[] arr2 = new int[]{56,199,4,7,45,94};
//		reverseArray(arr);
		
		int max = getSameAndMax(arr, arr2);
		System.out.println(max);
	}
	
	//创建一个数组并初始化，求数组大值、最最小值、和、平均值
	public static void homework1(){
		int[] arr = new int[]{45,79,7,56,133,99,44};
		
		int max = arr[0];
		int min = arr[0];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]>max){
				max = arr[i];
			}
			if(arr[i]<min){
				min = arr[i];
			}
			
			sum = sum += arr[i];
		}
		int avg = sum/arr.length;
		
		System.out.println("最大值："+max);
		System.out.println("最小值："+min);
		System.out.println("和："+sum);
		System.out.println("平均值："+avg);
	}
	
	//数组倒置
	public static void reverseArray(int[] arr){
		
		for (int i = 0; i < arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}
	
	//得到数组中相同且最大的数
	public static int getSameAndMax(int[] arr1,int[] arr2){
		int max = 1;
		for (int i = 0; i < arr1.length; i++) {
			
			for (int j = 0; j < arr2.length; j++) {
			
				if(arr1[i]==arr2[j]&&arr1[i]>max){
					max = arr1[i];
					break; //找到就跳出循环，提高效率
				}
			}
		}
		return max;
	}
	
	
	
}
