package sec2;

public class RemoteExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Screen s1 = new Screen() {
			int volume;
			int lightness;
			int zoom;
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("전원OFF");
			}
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("전원ON");
			}
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				if (volume > MAX)
					this.volume = MAX;
				else if (volume < MIN)
					this.volume = MIN;
				else
					this.volume = volume;
				System.out.println("현재볼륨 : "+this.volume);
			}

			public int light() {
				// TODO Auto-generated method stub
				if(this.lightness < 255 && this.lightness > 0)
					this.lightness++;
				System.out.println("밝기+");
				return this.lightness;
			}
			public int dark() {
				// TODO Auto-generated method stub
				if(this.lightness < 255 && this.lightness > 0)
					this.lightness--;
				System.out.println("밝기-");
				return this.lightness;
			}
			public int zoomin() {
				// TODO Auto-generated method stub
				if(this.zoom <= 500 && this.zoom >= -500)
					this.zoom+=50;
				System.out.println("확대");
				return this.zoom;
			}
			public int zoomout() {
				// TODO Auto-generated method stub
				if(this.zoom <= 500 && this.zoom >= -500)
					this.zoom-=50;
				System.out.println("축소");
				return this.zoom;
			}
		};
		
		RemoteControl.changeBattery();
		s1.turnOn();
		s1.light();
		s1.light();
		s1.light();
		s1.dark();
		s1.setVolume(5);
		s1.zoomin();
		s1.zoomin();
		s1.zoomout();
		s1.setMute(true);
		s1.setMute(false);
		s1.turnOff();

		
	}

}
