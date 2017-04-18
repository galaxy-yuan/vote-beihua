package cm.beihua.dao;

import cm.beihua.model.Announcement;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnnouncementMapper {
    

    int deleteByPrimaryKey(Integer id);

    int insert(Announcement record);

    int insertSelective(Announcement record);

   

    Announcement selectByPrimaryKey(Integer id);

   
    int updateByPrimaryKeySelective(Announcement record);

    int updateByPrimaryKeyWithBLOBs(Announcement record);

    int updateByPrimaryKey(Announcement record);
}