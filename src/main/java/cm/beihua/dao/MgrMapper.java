package cm.beihua.dao;

import cm.beihua.model.Mgr;
import cm.beihua.model.MgrExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface MgrMapper {
    int countByExample(MgrExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Mgr record);

    int insertSelective(Mgr record);

    List<Mgr> selectByPage(Map<String, Object> map); 
  
    int selectByTotal(Map<String, Object> map);
    
    Mgr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Mgr record);

    int updateByPrimaryKey(Mgr record);

	
}