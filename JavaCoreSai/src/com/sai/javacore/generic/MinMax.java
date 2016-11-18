package com.sai.javacore.generic;

interface MinMax<T extends Comparable<T>> {
	T min();

	T max();
}
