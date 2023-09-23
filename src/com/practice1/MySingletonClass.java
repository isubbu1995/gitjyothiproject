package com.practice1;

public class MySingletonClass {

	private double roolNum = 3;

	private static MySingletonClass obj = null;

	private MySingletonClass() {

		this.roolNum = Math.random();
	}

	public static synchronized MySingletonClass getObj() {

		if (obj == null) {
			obj = new MySingletonClass();
		}

		return obj;
	}

	public static void main(String[] args) {
		MySingletonClass obj2 = MySingletonClass.getObj();
		System.out.println(obj2.roolNum);
		obj2.roolNum = 33;

		MySingletonClass obj3 = MySingletonClass.getObj();
		System.out.println(obj3.roolNum);

		System.out.println(obj2.hashCode() == obj3.hashCode());
	}
}
