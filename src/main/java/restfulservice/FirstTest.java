package restfulservice;

public class FirstTest {

	private final long ID;
	private final String content;
	
	public FirstTest(long ID, String content) {
		this.ID=ID;
		this.content=content;
		
	}

	public long getID() {
		return ID;
	}

	public String getContent() {
		return content;
	}
	
}
