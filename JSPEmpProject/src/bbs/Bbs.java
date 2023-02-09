package bbs;

public class Bbs {
	private String subject = "제목";
	private String content = "내용";
	private String writer = "작성자";
	public Bbs() {		super();	}
	public Bbs(Bbs bbs) {
		subject = bbs.getSubject();
		content = bbs.getContent();
		writer = bbs.getWriter();
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
	@Override
	public String toString() {
		return "Bbs [subject=" + subject + ", content=" + content + ", writer=" + writer + "]";
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
}
