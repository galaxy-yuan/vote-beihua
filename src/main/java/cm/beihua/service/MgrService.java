package cm.beihua.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import cm.beihua.model.Mgr;

public interface MgrService {

    List<Mgr> queryByPage(Map<String, Object> map);
	
	int queryByTotal(Map<String, Object> map);
	
	int addMgrInfo(Mgr record);
	
	int deleteMgrInfo(int id);
}
