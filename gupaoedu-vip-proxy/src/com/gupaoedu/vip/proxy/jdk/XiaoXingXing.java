package com.gupaoedu.vip.proxy.jdk;

//С���ǡ�����
public class XiaoXingXing implements Person{
	
	private String sex = "Ů";
	private String name = "С����";
	
	@Override
	public void findeLove() {
		System.out.println("�ҽ�" + this.name + ",�Ա�:" + this.sex + "���Ҷ����Ҫ����:");
		System.out.println("�߸�˧");
		System.out.println("�з��г���");
		System.out.println("���Ҫ��180cm���ϣ�����70kg");
		
	}

	@Override
	public String Sex() {
		return sex;
	}

	@Override
	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//�ع�һ�£��������ģʽӦ�ó�����������Ҫ��������ȡ��
	//1��������ɫ��ִ���ߡ����������
	//2��ע�ع��̣�����Ҫ�������������ûʱ�������߲������������ߣ�����רҵ
	//3��ִ���߱����õ����������ĸ������ϣ�ִ���߳��б������������ã�
	
	

}
