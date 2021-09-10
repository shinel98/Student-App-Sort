package com.practice.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<Student>();
		
		Student s = new Student();
		s.setNo(1);
		s.setName("홍길동");
		s.setAge(20);
		list.add(s);
		list.add(new Student(2,"철수", 22));
		list.add(new Student(3,"민수", 24));
		list.add(new Student(4,"인혁", 24));
		list.add(new Student(5,"안나", 24));
		list.add(new Student(6,"채윤", 24));
		list.add(new Student(7,"예은", 24));
		list.add(new Student(8,"준현", 24));
		list.add(new Student(9,"종윤", 24));
		list.add(new Student(10,"성진", 24));
		
		Collections.sort(list);
		
		for(Student e : list) 
			System.out.println(e.toString());
		
		
				
	}
}
