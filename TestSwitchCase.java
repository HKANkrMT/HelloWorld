public class TestSwitchCase{
	public static void main(String[] args) {
		char grade = 'F';
		
		switch(grade) 
		{
		case 'A' :
			System.out.println("优秀");
			break;
		case 'B' :
		case 'C' :
			System.out.println("良好");
			break;
		case 'D' :
			System.out.println("及格");
			break;
		case 'F' :
			System.out.println("不及格");
			break;
		default: 
			System.out.println("未知等级");
		}
		System.out.println("等级是" + grade);
	}
}