
public class Device {
	protected Property property;   // ��ġ�� On, Off ���� ���� ����Ʈ�� �����Ѵ�.(On->5 ���� ������ ���� ���� ���)
	protected Field f;
	protected Timer m;
	
	public Device(String n) {
		this.f = new Field(n);
		this.property = new Property();
	}
	public Property GetProperty() {
		return this.property;
	}
	public void SetTimer(int time) {
		this.m = new Timer(time);
		this.m.Start(time);
	}
	public void StopTimer(int time) {
		this.m.Stop(time);
	}
	public String GetCurrentState() throws NotInitializeException {
		if(this.f == null) {
			throw new NotInitializeException("�ʵ� ���� �ʱ�ȭ ���� �ʾҽ��ϴ�.");// lock �ʵ��� ���� �ʱ�ȭ �� ��µ� ����Ϸ��� �ϸ� ����
		}
		return this.f.GetCurrentValue();
	}
	public Timer GetTimer() throws NotInitializeException {
		if(m == null) {
			throw new NotInitializeException("Ÿ�̸Ӱ� �ʱ�ȭ ���� �ʾҽ��ϴ�.");// m �ʵ��� ���� �ʱ�ȭ �� ��µ� ����Ϸ��� �ϸ� ����
		}
		return this.m;
	}
}
