package pack2;
/**
 * 一.Java语言基础  ---> 数组 ---> 字符串数组
 * 
 * 		重点：
 * 
 * 			1.一维字符串数组
 * 			2.二维字符串数组
 * 
 * 		练习：
 * 			1.随机生成双色球号码
 * 
 */
public class Test7 {
	
	public static void main(String[] args) {
		/**
		 * 一维字符串数组
		 */
		String[] names = {"张三","李四"};
		//System.out.println(names[0]);
		for (int i = 0; i < names.length; i++) {
			//System.out.println(names[i]);
		}
		
		/**
		 * 二维字符串数组
		 */
		String[][] teamName = {
				
				{"张三","李四",},
				{"王五","李丹"}
		};
		
		for (int i = 0; i < teamName.length; i++) {
			for (int j = 0; j < teamName[i].length; j++) {
				System.out.print(teamName[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
}
