

import java.io.Serializable;

public class SaveFile implements Serializable{
	private Polyline pl;
	
	public SaveFile(Polyline pl) {
		this.pl = pl;
	}
	
	public Polyline getPl() {
		return pl;
	}
	
	public void setPl(Polyline pl) {
		this.pl = pl;
	}
	
}
