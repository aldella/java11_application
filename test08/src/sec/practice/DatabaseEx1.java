package sec.practice;

public class DatabaseEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database db;
		
		System.out.println("\nOracle");
		db = new Oracle();
		db.connect(Oracle.URL, Oracle.PORT+"", Oracle.ID, Oracle.PW);
		db.select("board", " where title like \'%\'+알림+\'%\'");
		db.insert("board", "\'제목10\'", 10);
		
		System.out.println("\nMYSQL");
		db = new Mysql();
		db.connect(Mysql.URL, Mysql.PORT+"", Mysql.ID, Mysql.PW);
		db.select("board", " where title like \'%\'+알림+\'%\'");
		db.insert("board", "\'제목11\'", 11);
		
		System.out.println("\nMariaDB");
		db = new MariaDB();
		db.connect(MariaDB.URL, MariaDB.PORT+"", MariaDB.ID, MariaDB.PW);
		db.select("board", " where title like \'%\'+알림+\'%\'");
		db.insert("board", "\'제목12\'", 12);
	}

}
