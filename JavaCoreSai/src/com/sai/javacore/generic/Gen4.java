package com.sai.javacore.generic;
class Gen4<T> extends NonGen1 {
	T ob;

	Gen4(T o, int i) {
		super(i);
		ob = o;
	}

	T getob() {
		return ob;
	}
}