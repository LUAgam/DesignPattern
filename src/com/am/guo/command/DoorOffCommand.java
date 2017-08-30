package com.am.guo.command;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version 创建时间：2017年8月30日 下午12:51:01 
 * 门 关闭
 */
public class DoorOffCommand implements Command {

    private Door door;

    public DoorOffCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.doorOff();
    }

    @Override
    public void undo() {
        door.doorOn();
    }

}
