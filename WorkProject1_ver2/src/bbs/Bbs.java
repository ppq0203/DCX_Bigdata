package bbs;

public class Bbs {
	private String subject;
	private String content;
	private String writer;
	
	public Bbs(String sub, String cont, String writ)
	{
		subject = sub;
		content = cont;
		writer = writ;
	}
	
	public String getSubject() {
		return subject;
	}
	public String getContent() {
		return content;
	}
	public String getWriter() {
		return writer;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
}
