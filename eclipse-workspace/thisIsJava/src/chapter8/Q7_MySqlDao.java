package chapter8;

public class Q7_MySqlDao implements Q7_DateAceessObject {

	String name = "MySql";
	
	@Override
	public void select() {
		System.out.println(name + "DB에서 검색");
	}
	
	@Override
	public void insert() {
		System.out.println(name + "DB에 삽입");
	}
	
	@Override
	public void update() {
		System.out.println(name + "DB를 수정");
	}
	
	@Override
	public void delete() {
		System.out.println(name + "DB에서 검색");
	}
	
}
