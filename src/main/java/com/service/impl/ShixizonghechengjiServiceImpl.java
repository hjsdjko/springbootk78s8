package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShixizonghechengjiDao;
import com.entity.ShixizonghechengjiEntity;
import com.service.ShixizonghechengjiService;
import com.entity.vo.ShixizonghechengjiVO;
import com.entity.view.ShixizonghechengjiView;

@Service("shixizonghechengjiService")
public class ShixizonghechengjiServiceImpl extends ServiceImpl<ShixizonghechengjiDao, ShixizonghechengjiEntity> implements ShixizonghechengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShixizonghechengjiEntity> page = this.selectPage(
                new Query<ShixizonghechengjiEntity>(params).getPage(),
                new EntityWrapper<ShixizonghechengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShixizonghechengjiEntity> wrapper) {
		  Page<ShixizonghechengjiView> page =new Query<ShixizonghechengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShixizonghechengjiVO> selectListVO(Wrapper<ShixizonghechengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShixizonghechengjiVO selectVO(Wrapper<ShixizonghechengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShixizonghechengjiView> selectListView(Wrapper<ShixizonghechengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShixizonghechengjiView selectView(Wrapper<ShixizonghechengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
