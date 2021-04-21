import java.util.LinkedList;

class Show {

	String title;
	double broadcastTime;
	double avgEpLength;
	boolean isSpecial;
	
	public Show(String title, double broadcastTime, double avgEpLength, boolean isSpecial)
	{
		this.title = title;
		this.broadcastTime = broadcastTime;
		this.avgEpLength = avgEpLength;
		this.isSpecial = isSpecial;
	}
	

public boolean equals(Object show) {
	Show aShow = (Show) show;
	return aShow.title.equals(this.title) && aShow.broadcastTime == this.broadcastTime ;
}	
}

