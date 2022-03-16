package ex01_collection_set;

import java.util.HashSet;
import java.util.Set;

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]\n";
	}

	@Override
	public int hashCode() {
		return name.hashCode() +age;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person temp = (Person) obj;
			return name.equals(temp.name) && age==temp.age;
		}
		return true;
	}
}//Person end



public class HashSetMain {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add(new Person("Doyeon",33));
		set.add(new Person("david",30));
		set.add(new Person("david",30));
		set.add(new Person("david",10));
		set.add(new Person("david",10));
		
		set.add(new String("Happy"));
		set.add(new String("Happy"));
		
		System.out.println(set);
	}
}
