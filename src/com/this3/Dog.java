package com.this3;

class Dog {
	int age;
	float height;
	public Dog() {
		age = 1;
		height = 10;
	}
	
	public Dog grow() {	//����������Dog����������������
		height = height + 10;
		age++;
		return this;	//Dog tomʵ������������ʵ�������������
	}

}
