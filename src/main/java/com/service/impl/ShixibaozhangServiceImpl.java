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


import com.dao.ShixibaozhangDao;
import com.entity.ShixibaozhangEntity;
import com.service.ShixibaozhangService;
import com.entity.vo.ShixibaozhangVO;
import com.entity.view.ShixibaozhangView;

@Service("shixibaozhangService")
public class ShixibaozhangServiceImpl extends ServiceImpl<ShixibaozhangDao, ShixibaozhangEntity> implements ShixibaozhangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShixibaozhangEntity> page = this.selectPage(
                new Query<ShixibaozhangEntity>(params).getPage(),
                new EntityWrapper<ShixibaozhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShixibaozhangEntity> wrapper) {
		  Page<ShixibaozhangView> page =new Query<ShixibaozhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShixibaozhangVO> selectListVO(Wrapper<ShixibaozhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShixibaozhangVO selectVO(Wrapper<ShixibaozhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShixibaozhangView> selectListView(Wrapper<ShixibaozhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShixibaozhangView selectView(Wrapper<ShixibaozhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
