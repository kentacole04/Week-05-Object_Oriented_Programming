
public class SpacedLogger implements Logger{

	@Override
	public void log(String str) {
		// TODO Auto-generated method stub
		System.out.println(insertSpaces(str));
		
	}

	@Override
	public void error(String str) {
		// TODO Auto-generated method stub
		System.out.println("ERROR: " + insertSpaces(str));
		
	}
	
	public String insertSpaces(String str) {
		StringBuilder returnStr = new StringBuilder(str);
		for (int i = 0; i < returnStr.length(); i++) {
			if (i % 2 != 0) {
				returnStr.insert(i, " ");
			}
		}
		return returnStr.toString();
	}

}
