package com.this3;

public class This3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog tom = new Dog();
		System.out.println("新生的tom身高：" + tom.height + "cm，年龄：" + tom.age);
		tom = tom.grow();
		System.out.println("长大后的tom身高：" + tom.height + "cm，年龄：" + tom.age);
	}

}
