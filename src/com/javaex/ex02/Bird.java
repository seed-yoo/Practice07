package com.javaex.ex02;

public abstract class Bird {
	
	// 필드
    private String name;

    // 생성자
	public Bird(String name) {
		super();
		this.name = name;
	}

	public Bird() {
		super();
	}

	// 메소드 - getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// 메소드 - 일반
	public abstract void showName();
	public abstract void fly();
	public abstract void sing();
	
    

}
