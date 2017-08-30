package com.am.guo.command;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version 创建时间：2017年8月30日 下午12:51:01 
 * 门 打开
 */
public class DoorOnCommand implements Command {

    private Door door;

    public DoorOnCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.doorOn();
    }

    @Override
    public void undo() {
        door.doorOff();
    }

}
