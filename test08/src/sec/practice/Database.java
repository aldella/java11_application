package sec.practice;

public interface Database {
	public void connect(String url, String port, String id, String pw); //url port id pw로 오라클 db에 연결
	public void close(Connection conn, PreparedStatement pstmt, ResultSet rs); //연결된 오라클 데이터베이스 연결을 종료
	public void select(String tbname, String condition); //select * from tbname condition 출력
	public void insert(String tbname, String field1, int field2); //insert into tbname values (field2, field1) 출력
	public void update(String tbname, String field1, int value1, String condition); //update tbname set field1=value1 condtion 출력
	public void delete(String tbname, String condition); //delete from tbname condition 출력
	
	//url port id pw Connection PreparedStatement ResultSet tbname condition field1 value1
	
}
