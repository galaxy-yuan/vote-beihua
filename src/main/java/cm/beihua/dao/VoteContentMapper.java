package cm.beihua.dao;

import cm.beihua.model.VoteContent;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VoteContentMapper {
    

    int deleteByPrimaryKey(Integer id);

    int insert(VoteContent record);

    int insertSelective(VoteContent record);


    VoteContent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VoteContent record);

    int updateByPrimaryKey(VoteContent record);
}