package com.list;

public class Data {
	public String key;
	public String name;
	public int age;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Data(String key, String name, int age) {
		this.key = key;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Data [key=" + key + ", name=" + name + ", age=" + age + "]";
	}
	
}
