package sec2;

public class RemoteExam5 {
	public static void main(String args[]) {
		RemoteControl r;
		r = new RemoteControl()
		{
			int volume;
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
		};
		
		RemoteControl.changeBattery();
		r.turnOn();
		r.setVolume(8);
		r.setMute(true);
		r.setMute(false);
		r.turnOff();
		
		
		//////////////////////////Screen/////////////////////
		
		r = new Screen()
		{
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
		r.turnOn();
		r.setVolume(8);
		r.setMute(true);
		r.setMute(false);
		r.turnOff();
		
		/////////////////////////// Television /////////////////////
		r = new Television();
		RemoteControl.changeBattery();
		r.turnOn();
		r.setVolume(8);
		r.setMute(true);
		r.setMute(false);
		r.turnOff();
	}
}
