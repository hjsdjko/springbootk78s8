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


import com.dao.ShixineirongDao;
import com.entity.ShixineirongEntity;
import com.service.ShixineirongService;
import com.entity.vo.ShixineirongVO;
import com.entity.view.ShixineirongView;

@Service("shixineirongService")
public class ShixineirongServiceImpl extends ServiceImpl<ShixineirongDao, ShixineirongEntity> implements ShixineirongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShixineirongEntity> page = this.selectPage(
                new Query<ShixineirongEntity>(params).getPage(),
                new EntityWrapper<ShixineirongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShixineirongEntity> wrapper) {
		  Page<ShixineirongView> page =new Query<ShixineirongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShixineirongVO> selectListVO(Wrapper<ShixineirongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShixineirongVO selectVO(Wrapper<ShixineirongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShixineirongView> selectListView(Wrapper<ShixineirongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShixineirongView selectView(Wrapper<ShixineirongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
