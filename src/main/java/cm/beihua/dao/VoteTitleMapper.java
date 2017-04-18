package cm.beihua.dao;

import cm.beihua.model.VoteTitle;
import cm.beihua.model.VoteTitleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VoteTitleMapper {
    int countByExample(VoteTitleExample example);

    int deleteByExample(VoteTitleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VoteTitle record);

    int insertSelective(VoteTitle record);

    List<VoteTitle> selectByExample(VoteTitleExample example);

    VoteTitle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VoteTitle record, @Param("example") VoteTitleExample example);

    int updateByExample(@Param("record") VoteTitle record, @Param("example") VoteTitleExample example);

    int updateByPrimaryKeySelective(VoteTitle record);

    int updateByPrimaryKey(VoteTitle record);
}