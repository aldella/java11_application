package sec.practice;

public class Oracle implements Database{
	final static String DRIVER = "oracle.jdbc.driver.OracleDriver";
	final static String URL = "jdbc:oracle:thin:@localhost";
	final static int PORT = 1521;
	final static String PID = "xe";
	final static String ID = "system";
	final static String PW = "1234";
	
	@Override
	public void connect(String url, String port, String id, String pw) {
		// TODO Auto-generated method stub
		System.out.println(url+":"+port+"/"+id+";"+pw);
	}

	@Override
	public void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		if(rs!=null) {
			System.out.println("결과셋(저장소) 닫기");
		}
		if(pstmt!=null) {
			System.out.println("데이터베이스 비활성화");
		}
		if(conn!=null) {
			System.out.println("데이터베이스 연결 종료");
		}
	}

	@Override
	public void select(String tbname, String condition) {
		// TODO Auto-generated method stub
		System.out.println("select * from " + tbname + " " + condition);
	}

	@Override
	public void insert(String tbname, String field1, int field2) {
		// TODO Auto-generated method stub
		System.out.println("insert into " + tbname + " values (" + field2 + ", "+ field1 + ")");
	}

	@Override
	public void update(String tbname, String field1, int value1, String condition) {
		// TODO Auto-generated method stub
		System.out.println("update " + tbname + " set " + field1 + "=" + value1 +" " + condition);
	}

	@Override
	public void delete(String tbname, String condition) {
		// TODO Auto-generated method stub
		System.out.println("delete from " + tbname + " " + condition);
	}
	
	
	
}
