package cm.beihua.model;

import java.io.Serializable;
import java.util.Date;

public class Announcement implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String title;

    private Date createtime;

    private String conten;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getConten() {
        return conten;
    }

    public void setConten(String conten) {
        this.conten = conten == null ? null : conten.trim();
    }

	@Override
	public String toString() {
		return "Announcement [id=" + id + ", title=" + title + ", createtime="
				+ createtime + ", conten=" + conten + "]";
	}
    
}