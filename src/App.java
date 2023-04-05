
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger astLogger = new AsteriskLogger();
		astLogger.log("Test Method Call");
		astLogger.error("Undefined");
		
		Logger spacedLogger = new SpacedLogger();
		spacedLogger.log("Test Method Call");
		spacedLogger.error("Undefined");

	}

}
