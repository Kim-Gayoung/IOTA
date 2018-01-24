import java.util.ArrayList;
import java.util.List;

public class Action {
	Device device;
	List<String> actionList;
	public Action(Device device, String action) {  
		/*
			�̷������� Device �ϳ��� ������ �� ��ġ�� �ʵ� ���� ���� �� �� �����ϱ� �ٸ� ����� �����غ��߰ڴ�. 
			�� Rule�� Event�� predicate���� ���� �Ǹ鼭�� ��ϵ� ���� ��ġ�� �ʵ� ���� ���� �� �� �ֵ��� ���� �ؾ߰ڴ�.
		*/
		this.device = device;							
		actionList = new ArrayList<>();
	}
	public void AddAction(String action) {  // �� Action ��ü���� �������� action�� �����ϴ� actionList�� ���´�. actionList�� action�� �߰��ϴ� �޼ҵ�
		actionList.add(action);
	}
	public void PerformAction() { // actionlist�� ��� �ִ� ��� action�� �����ؾ� �Ѵ�.
		
	}
}
