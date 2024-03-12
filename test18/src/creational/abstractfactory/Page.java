package creational.abstractfactory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class Page extends Item {
	protected String title;
	protected String author;
	protected ArrayList content = new ArrayList<>();
	public Page(String title, String author) { //content�� ���� ����(add�� ��������)
		super();
		this.title = title;
		this.author = author;
	}
	public Page(String caption, String title, String author) { //content�� ���� ����(add�� ��������)
		super(caption);
		this.title = title;
		this.author = author;
	}
	public void add(Item item) {
		content.add(item);
	}
	public void output() {
		String filename = title + ".html";
		try {
			Writer writer = new FileWriter(filename);
			writer.write(this.makeHTML());
			writer.close();
			System.out.println(filename+"�� �ۼ��Ͽ����ϴ�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
