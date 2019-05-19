package week_3_lecture;


public class Bug {
	private int position = 0;
	
	public int getPosition(){
		return position;
	}
	
	public void up(){
		position = position + 10;
		if(position >= 100){
			position = 0;
		}
	}

}

