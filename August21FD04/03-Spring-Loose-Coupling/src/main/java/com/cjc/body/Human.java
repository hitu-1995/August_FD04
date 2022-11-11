package com.cjc.body;
public class Human {
	private HumanEar ear;
	
	private HumanEye eye;
	
	private HumanHeart heart;
	public void setEar(HumanEar ear) {
		this.ear = ear;
	}
	public void setEye(HumanEye eye) {
		this.eye = eye;
	}
	public void setHeart(HumanHeart heart) {
		this.heart = heart;
	}
	public void chekHuman() {
		if(heart!=null&&eye!=null&&ear!=null) {
			eye.chekEye();
			ear.chekEar();
			heart.chekHeart();
			System.out.println("Human Enjoying their life");
		}
		else {
			System.out.println("Human are Dead!!");
		}
	}
}
