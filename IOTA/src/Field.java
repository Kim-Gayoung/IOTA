
public class Field implements EventElement{
	String old_value;
	String current_value;
	String fieldType;

	public Field(String value) {
		old_value = value;
		current_value = value;
		if(IsStringDouble(value)) {
			fieldType = "Double";
		} else {
			fieldType = "String";
		}
	}
	public void FieldChange(String changedValue) { // �ʵ� ���� �ٲٷ��� �ٲ�� �� ���� ���� ������ �ٲ� ���� ���� ������ �Ѵ�.
		old_value = current_value;
		current_value = changedValue;
	}
	public static boolean IsStringDouble(String value) {
		try {
			Double.parseDouble(value);
			return true;
		} catch(NumberFormatException e) {
			
			return false;
		}
	}
	public String GetOldValue() { //�ٲ�� ���� �ʵ� ���� ��ȯ
		return old_value;
	}
	public String GetCurrentValue() { //���� �ʵ��� ���� ��ȯ
		return current_value;
	}
	public String GetType() {
		return "Field";
	}
}
