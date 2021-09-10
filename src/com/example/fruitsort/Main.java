package com.example.fruitsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Fruit> fl = new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name) ");
		
		fl.add(new Fruit(101, "Apple", 1000));
		fl.add(new Fruit(102, "Banana", 1010));
		fl.add(new Fruit(103, "Mango", 1020));
		fl.add(new Fruit(104, "WaterMelon", 1030));
		fl.add(new Fruit(105, "Orange", 1040));
		fl.add(new Fruit(106, "Strawberry", 1050));
		fl.add(new Fruit(107, "Tomato", 1060));
		fl.add(new Fruit(108, "Melon", 1070));
		fl.add(new Fruit(109, "Coconut", 1080));
		fl.add(new Fruit(110, "Lambutan", 1090));
		
		Collections.sort(fl, new FruitComparator());
		
		for(Fruit s : fl) {
			System.out.println(s.toString());
		}
		System.out.println("Fruit List (reverse ordered by name)");
		
		Collections.sort(fl, new FruitComparatorDesc());
		
		for(int i=0; i<fl.size(); i++) {
			System.out.println(fl.get(i).toString());
		}
		

	}

}
