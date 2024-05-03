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


import com.dao.ShixiliuchengDao;
import com.entity.ShixiliuchengEntity;
import com.service.ShixiliuchengService;
import com.entity.vo.ShixiliuchengVO;
import com.entity.view.ShixiliuchengView;

@Service("shixiliuchengService")
public class ShixiliuchengServiceImpl extends ServiceImpl<ShixiliuchengDao, ShixiliuchengEntity> implements ShixiliuchengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShixiliuchengEntity> page = this.selectPage(
                new Query<ShixiliuchengEntity>(params).getPage(),
                new EntityWrapper<ShixiliuchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShixiliuchengEntity> wrapper) {
		  Page<ShixiliuchengView> page =new Query<ShixiliuchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShixiliuchengVO> selectListVO(Wrapper<ShixiliuchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShixiliuchengVO selectVO(Wrapper<ShixiliuchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShixiliuchengView> selectListView(Wrapper<ShixiliuchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShixiliuchengView selectView(Wrapper<ShixiliuchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
