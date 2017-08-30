package com.am.guo.command;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version 创建时间：2017年8月30日 下午12:53:15 
 * 请求者
 */
public class House {

    private Command[] commands;
    
    public House() {
        super();
    }

    public House(Command[] commands) {
        this.commands = commands;
    }

    public void turn(int index) {
        this.commands[index].execute();
    }
    
    public void fix(int index){
        this.commands[index].undo();
    }
    
    public void turnAll() {
        for (Command command : commands) {
            command.execute();
        }
    }
    
    public void fixAll(){
        for (Command command : commands) {
            command.undo();
        }
    }
}
