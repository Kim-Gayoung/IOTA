
public class Event {
	private EventElement eventElement;  // EventElement �������̽��� ������ �ʵ� Ŭ������ Ÿ�̸� Ŭ������ ���ڷ� ����.

	public Event(EventElement eventElement) {  // �ʱ�ȭ ���: Event e1 = new Event(Door.GetField()); Event e2 = new Event(Door.GetTimer());
		this.eventElement = eventElement;
	}
	public Boolean IsEventTriggered() { // ��, �� �� ��� ���� ���� ���ߴ���
		if(eventElement.GetOldValue() != eventElement.GetCurrentValue()) {
			return true;
		}
		else {
			return false;
		}
	}
	public Boolean IsEventTriggered(String n) { // �ʵ峪 Ÿ�̸��� ���� �� ���� n���� �ٲ�����
		if((this.eventElement.GetOldValue() == n) && (this.eventElement.GetOldValue() != this.eventElement.GetCurrentValue())) {
			return true;
		}		
		else {
			return false;
		}
	}
	public Boolean IsEventTirggered(String n1, String n2) { // �ʵ峪 Ÿ�̸��� ���� �ٲ�� �� ���� �ٲ� �� ���� n1���� n2�� �ٲ�����
		if((this.eventElement.GetOldValue() == n1) && (this.eventElement.GetCurrentValue() == n2)) {
			return true;
		}		
		else {
			return false;
		}
	}
}
