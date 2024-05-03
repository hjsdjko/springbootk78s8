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


import com.dao.ChengjipingdingDao;
import com.entity.ChengjipingdingEntity;
import com.service.ChengjipingdingService;
import com.entity.vo.ChengjipingdingVO;
import com.entity.view.ChengjipingdingView;

@Service("chengjipingdingService")
public class ChengjipingdingServiceImpl extends ServiceImpl<ChengjipingdingDao, ChengjipingdingEntity> implements ChengjipingdingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChengjipingdingEntity> page = this.selectPage(
                new Query<ChengjipingdingEntity>(params).getPage(),
                new EntityWrapper<ChengjipingdingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChengjipingdingEntity> wrapper) {
		  Page<ChengjipingdingView> page =new Query<ChengjipingdingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChengjipingdingVO> selectListVO(Wrapper<ChengjipingdingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChengjipingdingVO selectVO(Wrapper<ChengjipingdingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChengjipingdingView> selectListView(Wrapper<ChengjipingdingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChengjipingdingView selectView(Wrapper<ChengjipingdingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
