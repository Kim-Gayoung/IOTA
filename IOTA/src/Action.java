import java.util.ArrayList;
import java.util.List;

public class Action {
	Device device;
	List<String> actionList;
	public Action(Device device, String action) {  //�̷������� Device �ϳ��� ������ �� ��ġ�� �ʵ� ���� ���� �� �� �����ϱ� �ٸ� ����� �����غ��߰ڴ�.
		this.device = device;
		actionList = new ArrayList<>();
	}
	public void AddAction(String action) {  // �� Action ��ü���� �������� action�� �����ϴ� actionList�� ���´�. �ű⿡ action�� �߰��ϴ� �޼ҵ�
		actionList.add(action);
	}
}
