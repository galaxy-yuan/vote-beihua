package cm.beihua.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import cm.beihua.dao.MgrMapper;
import cm.beihua.model.Mgr;
import cm.beihua.service.MgrService;

@Service
public class MgeServiceImpl implements MgrService {

	Logger logger = Logger.getLogger(MgeServiceImpl.class);
	
	@Autowired
	private MgrMapper mgrMapper;
	
	@Override
	public List<Mgr> queryByPage(Map<String, Object> map) {
		
		
		List<Mgr> list = mgrMapper.selectByPage(map);
		
		return list;
	}

	
	public int queryByTotal(Map<String, Object> map) {
		
		int total=mgrMapper.selectByTotal(map);
		
		return  total;
	}


	@Override
	public int addMgrInfo(Mgr record) {
		
		int flage = mgrMapper.insert(record);
		
		return flage;
	}


	
	public int deleteMgrInfo(int id) {
		
		return mgrMapper.deleteByPrimaryKey(id);
	}

}
