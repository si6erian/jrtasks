package com.javarush.task.level14.lesson08.home05;

/**
 * Created by nassi on 03.03.2016.
 */
public class Mouse implements CompItem
{
    public String getName(){
        return this.getClass().getSimpleName();
    }
}
