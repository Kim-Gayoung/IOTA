import java.util.Scanner;

public class IotaMain { //3���� ��ġ�� ����ϰ� �ִٴ� ���� �Ͽ� simulation, �ַܼ� �ٲٷ��� ��ġ ���¸� �Է��ϸ� �ٲ�� Device�� Stop�� �Է��ϸ� �ݺ��� ���߰� ��ġ���� ���� ���
	MotionSensor motionSensor;
	Door door;
	HallwayLight hallwayLight;

	public static void main(String[] args) {
		// ���⿡ IOTA ���α׷��� �ϴ� �� ó�� ���α׷��� �Ѵ�.
		/*
		Evaluation eval = new Evaluation(new RuleSet());
		eval.setDaemon(true);
		eval.start();
		 */
		IotaMain main = new IotaMain();
		
		while(true) {
			Scanner input = new Scanner(System.in);

			System.out.print("Device: ");
			String device = input.nextLine();
			if(device.equals("Stop"))
				break;

			System.out.print("Select: "); // �ٲ� ���� Filed���� Timer����
			String select = input.nextLine();

			System.out.print("Value: "); // �ٲ� ���� Filed���� Timer����
			String value = input.nextLine();
			
			main.EventTriggered(device, select, value);
		}
		
		System.out.println("MotionSensor: " + main.GetMotionSensorState());
		System.out.println("Door: " + main.GetDoorState());
		System.out.println("HallwayLight: " + main.GetHallwayLightState());
	}

	public IotaMain() {
		motionSensor = new MotionSensor("Off");
		door = new Door("Locked");
		hallwayLight = new HallwayLight("Off");
	}
	public String GetMotionSensorState() {
		return motionSensor.f.GetCurrentValue();
	}
	public String GetDoorState() {
		return door.f.GetCurrentValue();
	}
	public String GetHallwayLightState() {
		return hallwayLight.f.GetCurrentValue();
	}
	public void EventTriggered(String device, String select, String value) throws RuntimeException{ // ex)����� ���ͼ� motion sensor�� on �Ȱ��� �ݿ��Ѵ�.
		switch(device) { //select�� Timer�� ���� ���� �����.
		case "MotionSensor" : 
			switch(select) {
			case "Field" :
				switch(value) {
				case "On" :
					motionSensor.f.FieldChange("On");
					break;
				case "Off" :
					motionSensor.f.FieldChange("Off");
					break;
				default : 
					throw new RuntimeException("Please submit \"On\" or \"Off\".");
				}
				break;
			case "Timer" :
				break;
			default :
				throw new RuntimeException("Please submit \"Field\" or \"Timer\".");
			}
			break;
		case "Door" : 
			switch(select) {
			case "Field" :
				switch(value) {
				case "Locked" :
					door.f.FieldChange("Locked");
					break;
				case "UnLocked" :
					door.f.FieldChange("UnLocked");
					break;
				default : 
					throw new RuntimeException("Please submit \"Locked\" or \"UnLocked\".");
				}
				break;
			case "Timer" :
				break;
			default :
				throw new RuntimeException("Please submit \"Field\" or \"Timer\".");
			}
			break;
		case "HallwayLight" : 
			switch(select) {
			case "Field" :
				switch(value) {
				case "On" :
					hallwayLight.f.FieldChange("On");
					break;
				case "Off" :
					hallwayLight.f.FieldChange("Off");
					break;
				default : 
					throw new RuntimeException("Please submit \"On\" or \"Off\".");
				}
				break;
			case "Timer" :
				break;
			default :
				throw new RuntimeException("Please submit \"Field\" or \"Timer\".");
			}
			break;
		default :
			throw new RuntimeException("Unregistered Device is used.");
		}
	}
}
