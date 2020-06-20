package db;

public class MySQLDBUtil {
	private static final String INSTANCE = "qiaolindatabase.ce2nbsrruroi.us-east-1.rds.amazonaws.com";
	private static final String PORT_NUM = "3306";
	public static final String DB_NAME = "jupiter";
	private static final String USERNAME = "QiaoLin";
	private static final String PASSWORD = "Linqiao970613!";
	public static final String URL = "jdbc:mysql://"
			+ INSTANCE + ":" + PORT_NUM + "/" + DB_NAME
			+ "?user=" + USERNAME + "&password=" + PASSWORD
			+ "&autoReconnect=true&serverTimezone=UTC";

}
