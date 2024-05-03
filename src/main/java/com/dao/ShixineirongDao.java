package com.dao;

import com.entity.ShixineirongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShixineirongVO;
import com.entity.view.ShixineirongView;


/**
 * 实习内容
 * 
 * @author 
 * @email 
 * @date 2022-05-09 16:05:17
 */
public interface ShixineirongDao extends BaseMapper<ShixineirongEntity> {
	
	List<ShixineirongVO> selectListVO(@Param("ew") Wrapper<ShixineirongEntity> wrapper);
	
	ShixineirongVO selectVO(@Param("ew") Wrapper<ShixineirongEntity> wrapper);
	
	List<ShixineirongView> selectListView(@Param("ew") Wrapper<ShixineirongEntity> wrapper);

	List<ShixineirongView> selectListView(Pagination page,@Param("ew") Wrapper<ShixineirongEntity> wrapper);
	
	ShixineirongView selectView(@Param("ew") Wrapper<ShixineirongEntity> wrapper);
	

}
