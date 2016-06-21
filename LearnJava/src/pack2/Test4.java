package pack2;

import java.util.Arrays;

/**
 * 一.Java语言基础  ---> 数组 ---> 数组的扩容、复制
 * 
 * 		作业：
 * 			1.数组已经初始化完毕后，再向下标位3的后面插入一个元素100
 * 			2.在[1]的基础上进行改进,使方法适用于在任何下标位置插入元素
 */
public class Test4 {
	
	public static void main(String[] args) {
		//insert1();
		//insert2();
		
		//数组插入最终版
		try{
			int[] arr = new int[]{554,1,36,7,99,147};
			int[] newArray = insertIndex(arr, 1, 50);
			printArr(newArray);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	
	//数组已经初始化完毕后，再向下标位3的后面插入一个元素100
	public static void insert1(){
		int[] arr = new int[]{554,1,36,7,99,147};
		
		//思考：数组的容量是固定的，要想再插入一个元素，必须扩容
		
		//扩容方式一：
		int[] arrLength = new int[7];
		
		for (int i = 0; i < arr.length; i++) {
			arrLength[i] = arr[i];
		}
		printArr(arrLength);
		
		arr = arrLength;
		///////////////////////////////////////
		
		//最后一位是0，把下标3后面的元素往后移一位
		for (int i = arr.length-1; i > 3; i--) {
			arr[i] = arr[i-1];
		}
		arr[3] = 100;
		printArr(arr);
	}
	
	//数组已经初始化完毕后，再向下标位3的后面插入一个元素100[改进版1]
	public static void insert2(){
		int[] arr = new int[]{554,1,36,7,99,147};
		printArr(arr);
		//使用JDK源码扩容，效率更高
		int[] array = Arrays.copyOf(arr, arr.length+1);
		
//		System.out.println(array.length);
//		printArr(array);
		
		for (int i = array.length-1; i > 3; i--) {
			array[i] = array[i-1];
		}
		
		array[3] = 100;
		printArr(array);
	}
	
	/**
	 * 
	 * 数组已经初始化完毕后，再在指定下标插入一个元素[最终版]
	 *
	 * @param arr int类型的数组
	 * @param index 插入元素的下标 
	 * @param value 插入的值
	 * 
	 * @author mengluo
	 * @throws Exception 插入的index不合法
	 * @date 2016年6月20日 下午4:37:03
	 */
	public static int[] insertIndex(int[] arr,int index,int value) throws Exception{
		if(index<0||index>arr.length){
			throw new Exception("index下标越界,请插入合法的index");
		}
		int[] array = Arrays.copyOf(arr, arr.length+1);
		for (int i = array.length-1; i > index; i--) {
			array[i] = array[i-1];
		}
		array[index] = value;
		return array;
	}
	
	//打印数组
	public static void printArr(int[] a){
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+",");
		}
		System.out.println();
	}
	
}
