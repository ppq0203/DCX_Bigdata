package emp;

public class Jikwon {
	private String no;
	private String name;
	private String title;
	private String hobby;
	private String phone;
	public Jikwon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Jikwon(String no, String name, String title, String hobby, String phone, String comment) {
		super();
		this.no = no;
		this.name = name;
		this.title = title;
		this.hobby = hobby;
		this.phone = phone;
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "Jikwon [no=" + no + ", name=" + name + ", title=" + title + ", hobby=" + hobby + ", phone=" + phone
				+ ", comment=" + comment + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((hobby == null) ? 0 : hobby.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((no == null) ? 0 : no.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jikwon other = (Jikwon) obj;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (hobby == null) {
			if (other.hobby != null)
				return false;
		} else if (!hobby.equals(other.hobby))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (no == null) {
			if (other.no != null)
				return false;
		} else if (!no.equals(other.no))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	public String getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public String getTitle() {
		return title;
	}
	public String getHobby() {
		return hobby;
	}
	public String getPhone() {
		return phone;
	}
	public String getComment() {
		return comment;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	private String comment;
	
}
