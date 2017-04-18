package cm.beihua.model;

import java.io.Serializable;

public class Mgr implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String name;

    private String pwd;

    private Integer isroot;

    private Integer isstop;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public Integer getIsroot() {
        return isroot;
    }

    public void setIsroot(Integer isroot) {
        this.isroot = isroot;
    }

    public Integer getIsstop() {
        return isstop;
    }

    public void setIsstop(Integer isstop) {
        this.isstop = isstop;
    }

	@Override
	public String toString() {
		return "Mgr [id=" + id + ", name=" + name + ", pwd=" + pwd
				+ ", isroot=" + isroot + ", isstop=" + isstop + "]";
	}
    
}