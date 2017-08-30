package com.am.guo.command.demo;

import org.junit.Test;

import com.am.guo.command.Command;
import com.am.guo.command.Door;
import com.am.guo.command.DoorOnCommand;
import com.am.guo.command.House;
import com.am.guo.command.Light;
import com.am.guo.command.LightOffCommand;
import com.am.guo.command.LightOnCommand;

/** 
* @author AMGuo E-mail:www.guoao@foxmail.com 
* @version 创建时间：2017年8月30日 下午12:52:11 
* 类说明 
*/
public class Demo {
    
    @Test
    public void demo_1(){
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);
        Door door = new Door();
        Command doorOnCommand = new DoorOnCommand(door);
        House house = new House(new Command[]{lightOnCommand,lightOffCommand,doorOnCommand});
        house.turnAll();
        System.out.println("-----------");
        house.fixAll();
        System.out.println("-----------");
        house.turn(1);
        System.out.println("-----------");
        house.fix(1);
    }

}
