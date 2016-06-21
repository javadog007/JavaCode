package pack2;
/**
 * 一.Java语言基础  ---> 数组 ---> 数组的排序
 * 
 * 		排序：实现一串不规则的数字从小到大排序
 * 
 * 		方法：
 * 			1.选择排序
 * 		
 * 			思路：依次把前面的变成最小的
 * 
 */
public class Test5 {
	
	public static void main(String[] args) {
		int[] a = {10,14,2,9,8,7,32};
		//chooseSort(a); 
		//bubbling(a);
		Insertsort(a);
		printArray(a);
	}
	
	/**
	 * 选择排序
	 * 
	 * 思路：
	 * 		arr[0] 一直比到arr[a.length-1] ,保证arr[0]最小
	 * 		arr[1] 一直比到arr[a.length-1] ,保证arr[1]最小
	 * 
	 * 		...最后一对：
	 * 		a[a.length-2] 和 a[a.length-1]比较，保证a[a.length-2]最小
	 * 		
	 */
	public static void chooseSort(int[] arr){
		for (int i = 0; i <= arr.length-2; i++) {
			//第一对是arr[0]和arr[1]比较
			for (int j = i+1; j < arr.length-1; j++) {
				//一旦发现前面的大，就互换
				if(arr[i]>arr[j]){
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
	}
	
	/**
	 * 冒泡排序
	 * 
	 * 思路：很选择排序正好相反，依次把最大的放到后面	
	 */
	public static void bubbling(int[] arr){
			
		for (int i = 0; i < arr.length-1; i++) {
			for(int j=0 ; j<arr.length-1-i;j++){
					
				if(arr[j]>arr[j+1]){
					
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
	}
	
	/**
	 * 插入排序
	 * 
	 * 效率相对较高，但这三种排序和源码中的算法效率都相差甚远
	 */
	public static void Insertsort(int[] arr){
			
			int t,j;
			for (int i = 1; i < arr.length; i++) {
				
			t = arr[i] ;
			for (j = i-1 ; j>=0;j--) {
				
				if(t<arr[j]){
					arr[j+1] = arr[j];
				}else{
					break;
				}
			}
			arr[j+1] = t;
		}
	}
	
	/**
	 * 打印数组
	 */
	public static void printArray(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
	}
	
}
