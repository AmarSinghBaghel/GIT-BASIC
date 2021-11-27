package com.greatlearning.corejava;
public class ClassB

{

    private int data;

  

    public ClassB()

    {

        data = 5;

    }

  

    public int getData()

    {

        return this.data;

    }

}

  

class ClassA extends ClassB

{

    private int data;

    public ClassA()

    {

        data = 6;

    }

    private int getData()

    {

        return data;

    }