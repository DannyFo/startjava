package com.lesson_2_3_4.robot;//1

public class Jaeger {	
	private String modelName;
	private String mark;
	private String origin;
	private float height;
	private float weight;
	private int speed;
	private int strenght;
	private int armor;

	public void setModelName(String modelName) {
		if (modelName == "") {
			System.out.println("Not correct model name");
		} else {
			this.modelName = modelName;
		}
	}
	public String getModelName() {
		return modelName;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getMark() {
		return mark;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getOrigin() {
		return origin;
	}

	public void setHeight(float height) {
		if (height > 150 && height < 350) {
			this.height = height;
		} else {
			System.out.println("Not correct height");
		}
	}

	public float getHeight() {
		return height;
	}

	public void setWeight(float weight) {
		if (weight > 2 && weight < 50) {
			this.weight = weight;
		} else {
			System.out.println("Not correct weight");
		}
	}

	public float getWeight() {
		return weight;
	}

	public void setSpeed(int speed) {
		if (speed >= 1 && speed <= 10) {
			this.speed = speed;
		} else {
			System.out.println("Not correct speed");
		}
	}

	public int getSpeed() {
		return speed;
	}

	public void setStrenght(int strenght) {
		if (strenght >= 1 && strenght <= 10) {
			this.strenght = strenght;
		} else {
			System.out.println("Not correct strenght");
		}
	}

	public int getStrenght() {
		return strenght;
	}

	public void setArmor(int armor) {
		if (armor >= 1 && armor <= 10){
			this.armor = armor;
		} else {
			System.out.println("Not correct armor");
		}
	}

	public int getArmor() {
		return armor;
	}	

	public void drift() {
		System.out.println("U're commin in to drift");
	}
    
	public void move() {
		System.out.println("U're walking 485 steps");
	}
}	