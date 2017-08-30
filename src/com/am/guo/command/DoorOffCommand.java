package com.am.guo.command;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version ����ʱ�䣺2017��8��30�� ����12:51:01 
 * �� �ر�
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
