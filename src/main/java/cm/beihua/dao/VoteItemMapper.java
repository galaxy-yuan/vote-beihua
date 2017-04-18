package cm.beihua.dao;

import cm.beihua.model.VoteItem;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VoteItemMapper {
   

    int deleteByPrimaryKey(Integer id);

    int insert(VoteItem record);

    int insertSelective(VoteItem record);


    VoteItem selectByPrimaryKey(Integer id);

   
    int updateByPrimaryKeySelective(VoteItem record);

    int updateByPrimaryKey(VoteItem record);
}