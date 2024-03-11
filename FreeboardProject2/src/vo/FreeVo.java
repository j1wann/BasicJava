package vo;

public class FreeVo {
	private int no;
	private String title;
	private String content;
	private String type;
	private String regdate;
	private String mem_no;
	private String delyn;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getMem_no() {
		return mem_no;
	}
	public void setMem_no(String mem_no) {
		this.mem_no = mem_no;
	}
	public String getDelyn() {
		return delyn;
	}
	public void setDelyn(String delyn) {
		this.delyn = delyn;
	}
	@Override
	public String toString() {
		return "FreeVo [no=" + no + ", title=" + title + ", content=" + content + ", type=" + type + ", regdate="
				+ regdate + ", mem_no=" + mem_no + ", delyn=" + delyn + "]";
	}
	
	
}
