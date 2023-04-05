
public class AsteriskLogger implements Logger {

	@Override
	public void log(String str) {
		// TODO Auto-generated method stub
		System.out.println(returnMidString(str));
	}

	@Override
	public void error(String str) {
		// TODO Auto-generated method stub
		String midString = returnMidString("ERROR:" + str);
		int midLength = midString.length();
		StringBuilder border = new StringBuilder();
		for (int i = 0; i < midLength; i++) {
			border.append("*");
		}
		System.out.println(border);
		System.out.println(midString);
		System.out.println(border);
		
		
	}
	
	public String returnMidString(String str) {
		return "***" + str + "***";
	}

}
