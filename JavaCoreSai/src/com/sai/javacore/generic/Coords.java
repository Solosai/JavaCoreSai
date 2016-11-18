package com.sai.javacore.generic;

class Coords<T extends TwoD> {
	T[] coords;

	Coords(T[] o) {
		coords = o;
	}
}