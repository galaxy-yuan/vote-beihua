package cm.beihua.model;

import java.io.Serializable;
import java.util.Date;

public class VoteTitle implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String title;

    private Date endtime;

    private Date starttime;

    private Integer isstop;

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

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Integer getIsstop() {
        return isstop;
    }

    public void setIsstop(Integer isstop) {
        this.isstop = isstop;
    }
}