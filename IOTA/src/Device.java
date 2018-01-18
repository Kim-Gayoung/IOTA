
public class Device {
	Property property;
	Field lock;
	Timer m;
	
	public Device() {
	}
	public Property GetProperty() {
		return this.property;
	}
	public void SetField(String n) {
		lock = new Field(n);
	}
	public void SetTimer(int time) {
		m = new Timer(time);
	}
	public Field GetField() throws NotInitializeException{
		if(lock == null) {
			throw new NotInitializeException("�ʵ� ���� �ʱ�ȭ ���� �ʾҽ��ϴ�.");// lock �ʵ��� ���� �ʱ�ȭ �� ��µ� ����Ϸ��� �ϸ� ����
		}
		return this.lock;
	}
	public Timer GetTimer() {
		if(m == null) {
			throw new NotInitializeException("Ÿ�̸Ӱ� �ʱ�ȭ ���� �ʾҽ��ϴ�.");// m �ʵ��� ���� �ʱ�ȭ �� ��µ� ����Ϸ��� �ϸ� ����
		}
		return this.m;
	}
}
