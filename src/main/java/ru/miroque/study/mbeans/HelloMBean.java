package ru.miroque.study.mbeans;

public interface HelloMBean {
	int getNumber();
	
	void setNumber(int n);

	public void sayHello();

	public int add(int x, int y);

	public String getName();

	public int getCacheSize();

	public void setCacheSize(int size);
}
