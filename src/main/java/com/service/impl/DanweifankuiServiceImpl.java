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


import com.dao.DanweifankuiDao;
import com.entity.DanweifankuiEntity;
import com.service.DanweifankuiService;
import com.entity.vo.DanweifankuiVO;
import com.entity.view.DanweifankuiView;

@Service("danweifankuiService")
public class DanweifankuiServiceImpl extends ServiceImpl<DanweifankuiDao, DanweifankuiEntity> implements DanweifankuiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DanweifankuiEntity> page = this.selectPage(
                new Query<DanweifankuiEntity>(params).getPage(),
                new EntityWrapper<DanweifankuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DanweifankuiEntity> wrapper) {
		  Page<DanweifankuiView> page =new Query<DanweifankuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DanweifankuiVO> selectListVO(Wrapper<DanweifankuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DanweifankuiVO selectVO(Wrapper<DanweifankuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DanweifankuiView> selectListView(Wrapper<DanweifankuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DanweifankuiView selectView(Wrapper<DanweifankuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
