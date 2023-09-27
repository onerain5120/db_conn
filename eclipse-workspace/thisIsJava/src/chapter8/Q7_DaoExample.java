package chapter8;

public class Q7_DaoExample {
	
	public static void dbwork(Q7_DateAceessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	
	public static void main(String[] args) {
		dbwork(new Q7_OracleDao());
		dbwork(new Q7_MySqlDao());
	}

}
