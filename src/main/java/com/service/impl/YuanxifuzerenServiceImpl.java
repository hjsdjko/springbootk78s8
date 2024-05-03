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


import com.dao.YuanxifuzerenDao;
import com.entity.YuanxifuzerenEntity;
import com.service.YuanxifuzerenService;
import com.entity.vo.YuanxifuzerenVO;
import com.entity.view.YuanxifuzerenView;

@Service("yuanxifuzerenService")
public class YuanxifuzerenServiceImpl extends ServiceImpl<YuanxifuzerenDao, YuanxifuzerenEntity> implements YuanxifuzerenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuanxifuzerenEntity> page = this.selectPage(
                new Query<YuanxifuzerenEntity>(params).getPage(),
                new EntityWrapper<YuanxifuzerenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuanxifuzerenEntity> wrapper) {
		  Page<YuanxifuzerenView> page =new Query<YuanxifuzerenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuanxifuzerenVO> selectListVO(Wrapper<YuanxifuzerenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuanxifuzerenVO selectVO(Wrapper<YuanxifuzerenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuanxifuzerenView> selectListView(Wrapper<YuanxifuzerenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuanxifuzerenView selectView(Wrapper<YuanxifuzerenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
