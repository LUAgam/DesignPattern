package com.am.guo.command;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version ����ʱ�䣺2017��8��30�� ����12:51:01 
 * �� ��
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
