package pack1;

/**
 * 一.Java语言基础  ---> Java基础语法 ---> 环境搭建
 * 
 * 重点：
 * 	1.理解Path 和 ClassPath
 * 
 * 	Path : Windows系统去哪找可执行命令
 * 	ClassPath : Java虚拟机去哪找class文件
 * 
 * 	一：
 * 		1.在命令行中运行这段程序
 * 		步骤：
 * 			STEP1:cd切换目录，javac编译文件[简单]
 * 			STEP2:set classpath=D:\leanJava\LeanJava\LearnJava\src(包名上一级目录)
 * 			STEP3:java pack1.Test1
 * 
 * 	二：
 * 		1.在命令行中启动QQ
 * 			set path=F:\A\Bin
 * 			QQScLauncher
 */
public class Test1 {
	
	public static void main(String[] args) {
		System.out.println("Hello,World");
	}
	
}

