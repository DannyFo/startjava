package com.lesson_2_3_4.robot;//1

public class JaegerTest {	
    public static void main(String[] args) {

        Jaeger tacitRonin = new Jaeger();

        tacitRonin.setModelName("Tacit Ronin");
        tacitRonin.setMark("Mark-1");
        tacitRonin.setOrigin("Japan");
        tacitRonin.setHeight(244);
        tacitRonin.setWeight(7.45f);
        tacitRonin.setSpeed(8);
        tacitRonin.setStrenght(7);
        tacitRonin.setArmor(3);

        System.out.println ("ModelName = " + tacitRonin.getModelName());
        System.out.println ("Mark = " + tacitRonin.getMark());
        System.out.println ("Origin = " + tacitRonin.getOrigin());
        System.out.println ("Height = " + tacitRonin.getHeight());
        System.out.println ("Weight = " + tacitRonin.getWeight());
        System.out.println ("Speed = " + tacitRonin.getSpeed());
        System.out.println ("Strenght = " + tacitRonin.getStrenght());
        System.out.println ("Armor = " + tacitRonin.getArmor());
        tacitRonin.drift();

        Jaeger chernoAlpha = new Jaeger();
        chernoAlpha.setModelName("Cherno Alpha");
        chernoAlpha.setMark("Mark-1");
        chernoAlpha.setOrigin("Russia");
        chernoAlpha.setHeight(280);
        chernoAlpha.setHeight(30000); // проверил ограничания
        chernoAlpha.setWeight(2.412f);
        chernoAlpha.setSpeed(3);
        chernoAlpha.setStrenght(10);
        chernoAlpha.setArmor(10);

        System.out.println ("ModelName = " + chernoAlpha.getModelName());
        System.out.println ("Mark = " + chernoAlpha.getMark());
        System.out.println ("Origin = " + chernoAlpha.getOrigin());
        System.out.println ("Height = " + chernoAlpha.getHeight());
        System.out.println ("Weight = " + chernoAlpha.getWeight());
        System.out.println ("Speed = " + chernoAlpha.getSpeed());
        System.out.println ("Strenght = " + chernoAlpha.getStrenght ());
        System.out.println ("Armor = " + chernoAlpha.getArmor());
        chernoAlpha.move();
    }
}