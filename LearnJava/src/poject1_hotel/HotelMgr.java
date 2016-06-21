package poject1_hotel;

import java.util.Scanner;

public class HotelMgr {
	
	public static void main(String[] args) {
		
	}
	
	public static void view(){
		System.out.println("欢迎使用XXX酒店前台管理系统,您可以输入如下命令");
		System.out.println("1.初始化房间:init");
		System.out.println("2.办理入住：in");
		System.out.println("3.办理退房：out");
		System.out.println("4.查询房间：search");
		System.out.println("5.退出系统：quit");
		
		Scanner input = new Scanner(System.in);
		System.out.println("请选择：");
		String choose = input.next();
		
		if(choose.equalsIgnoreCase("in")){
			in();
		}else if(choose.equalsIgnoreCase("search")){
			search();
		}else if(choose.equalsIgnoreCase("init")){
			
		}else if(choose.equalsIgnoreCase("out")){
			out();
		}else if(choose.equalsIgnoreCase("quit")){
			quit();
		}
		
		
	}

	//办理入住
	public static void in() {
		
	}
	
	//查询全部房间
	public static void search() {
		
	}
	
	//初始化房间
	public static void init() {
		
	}	
	
	//办理退房
	public static void out() {
		
	}	
	
	//退出程序
	public static void quit() {
		
	}	
	
}

