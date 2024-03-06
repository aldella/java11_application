package sec3;

import java.io.IOException;
import java.util.Scanner;

public class ScheduleExam {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//R이면 roundrobin객체, P면 PriorityAllocation, L이면 LeastJob객체 출력
		Scheduler s;
		Scanner scan = new Scanner(System.in);
		int ch = System.in.read();
		System.out.println(String.valueOf((char)ch));
		char ch1 = (char) ch;
		switch (ch1)
		{
		case 'r':
		case 'R':
			s = new RoundRobin();
			s.getNextCall();
			s.sendCallToAgent();
			break;
		case 'p':
		case 'P':
			s = new PriorityAllocation();
			s.getNextCall();
			s.sendCallToAgent();
			break;
		case 'l':
		case 'L':
			s = new LeastJob();
			s.getNextCall();
			s.sendCallToAgent();
			break;
		default:
			System.out.println("지원하지 않는 스케줄링입니다.");
		}
	}

}
