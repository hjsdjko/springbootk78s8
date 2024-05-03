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


import com.dao.ShixianpaiDao;
import com.entity.ShixianpaiEntity;
import com.service.ShixianpaiService;
import com.entity.vo.ShixianpaiVO;
import com.entity.view.ShixianpaiView;

@Service("shixianpaiService")
public class ShixianpaiServiceImpl extends ServiceImpl<ShixianpaiDao, ShixianpaiEntity> implements ShixianpaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShixianpaiEntity> page = this.selectPage(
                new Query<ShixianpaiEntity>(params).getPage(),
                new EntityWrapper<ShixianpaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShixianpaiEntity> wrapper) {
		  Page<ShixianpaiView> page =new Query<ShixianpaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShixianpaiVO> selectListVO(Wrapper<ShixianpaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShixianpaiVO selectVO(Wrapper<ShixianpaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShixianpaiView> selectListView(Wrapper<ShixianpaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShixianpaiView selectView(Wrapper<ShixianpaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
