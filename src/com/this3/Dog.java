package com.this3;

class Dog {
	int age;
	float height;
	public Dog() {
		age = 1;
		height = 10;
	}
	
	public Dog grow() {	//返回类型是Dog，即引用数据类型
		height = height + 10;
		age++;
		return this;	//Dog tom实例对象本身；返回实例对象本身的引用
	}

}
