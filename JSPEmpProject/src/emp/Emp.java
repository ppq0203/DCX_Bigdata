package emp;

public class Emp {
	private String name = "", id = "", pwd = "";

	public String getName() 					{		return name;	}
	public String getId() 						{		return id;	}
	public String getPassword() 			{		return pwd;	}
	public void setName(String name) 	{		this.name = name;	}
	public void setId(String id) 			{		this.id = id;	}
	public void setPassword(String pwd) {		this.pwd = pwd;	}
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", pwd=" + pwd + "]";
	}
}
