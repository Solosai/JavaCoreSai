package com.sai.javacore.ood;

import com.sai.javacore.ood2.Star;
import com.sai.javacore.ood2.Teacher;
import com.sai.javacore.ood2.Worker;

public class TestOod {

	public static void main(String[] args) {
		Star star = new Star();
		Worker worker = new Worker();
		Teacher teacher = new Teacher();
		
		star.sing();
		worker.work();
		teacher.teacher(" ");
		
	}
}
