package com.am.guo.singleton;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version ����ʱ�䣺2017��8��28�� ����2:28:22 ��������˫�ؼ���������̰߳�ȫ
 */
public class Singleton_4 {

    /* volatile��֤�˿ɼ��ԡ������� */
    /*
     * ��δ��뿴�������������ܿ�ϧ�����������⡣��Ҫ����instance = new Singleton()��䣬�Ⲣ����һ��ԭ�Ӳ�������ʵ���� JVM
     * ����仰����������� 3 �����顣
     * 
     * 1�� instance �����ڴ� 
     * 2���� Singleton �Ĺ��캯������ʼ����Ա���� 
     * 3��instance����ָ�������ڴ�ռ䣨ִ�����ⲽinstance ��Ϊ�� null �ˣ� 
     * 
     * ������ JVM�ļ�ʱ�������д���ָ����������Ż���Ҳ����˵����ĵڶ����͵�������˳���ǲ��ܱ�֤�ģ����յ�ִ��˳������� 1-2-3 Ҳ������
     * 1-3-2������Ǻ��ߣ����� 3 ִ����ϡ�2 δִ��֮ǰ�����̶߳���ռ�ˣ���ʱ instance �Ѿ��Ƿ� null
     * �ˣ���ȴû�г�ʼ�����������̶߳���ֱ�ӷ��� instance��Ȼ��ʹ�ã�Ȼ��˳����µر���
     * 
     * ����ֻ��Ҫ�� instance ���������� volatile �Ϳ����ˡ�
     */
    private volatile static Singleton_4 _instance;

    private Singleton_4() {
    }

    public static Singleton_4 getInstance() {
        // �����жϵ�δ��ʼ����ʱ��Ż����ͬ����
        if (_instance == null) {
            synchronized (Singleton_4.class) {
                // �û��жϵ������߳�һ�����ͬ���飬һ����ִ�У���ס��ִ�к����򿪣���һ��Ӧ������Ҫ�ж��Ƿ��ʼ����ֻ��δ��ʼ��ʱ�Ż��ʼ����
                if (_instance == null)
                    _instance = new Singleton_4();
            }
        }
        return _instance;
    }

    public void showMessage() {
        System.out.println("��������˫�ؼ���������̰߳�ȫ");
    }
}
