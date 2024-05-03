package com.dao;

import com.entity.ShixianpaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShixianpaiVO;
import com.entity.view.ShixianpaiView;


/**
 * 实习安排
 * 
 * @author 
 * @email 
 * @date 2022-05-09 16:05:17
 */
public interface ShixianpaiDao extends BaseMapper<ShixianpaiEntity> {
	
	List<ShixianpaiVO> selectListVO(@Param("ew") Wrapper<ShixianpaiEntity> wrapper);
	
	ShixianpaiVO selectVO(@Param("ew") Wrapper<ShixianpaiEntity> wrapper);
	
	List<ShixianpaiView> selectListView(@Param("ew") Wrapper<ShixianpaiEntity> wrapper);

	List<ShixianpaiView> selectListView(Pagination page,@Param("ew") Wrapper<ShixianpaiEntity> wrapper);
	
	ShixianpaiView selectView(@Param("ew") Wrapper<ShixianpaiEntity> wrapper);
	

}
