
public class Predicate {
	Boolean state;
	public Predicate() {
		this.state = false;
	}
	public Predicate(Boolean state) {   
		/*
			Predicate�� RuleSet�� ��� Event�� �˻�� �Ŀ� �� �������� ������ Ȯ�� �ؾ� �Ѵ�. �̷��� ó������ ��������
			Boolean�� ������ Event�� �˻�� �� ������ ������ Ȯ���ϴ°� �ƴϴ�. 
			IotaMain���� ��ϵ� ��ġ���� ������ �Ѱ� ������ �� ������ ���� Ȯ���� ���� �� ����.
		*/
		this.state = state;
	}
	public Boolean GetState() {
		return this.state;
	}
}
