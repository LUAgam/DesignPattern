package com.am.guo.command;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version ����ʱ�䣺2017��8��30�� ����12:53:15 
 * ������
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
