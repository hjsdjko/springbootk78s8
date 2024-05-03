package com.dao;

import com.entity.ChengjipingdingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChengjipingdingVO;
import com.entity.view.ChengjipingdingView;


/**
 * 成绩评定
 * 
 * @author 
 * @email 
 * @date 2022-05-09 16:05:17
 */
public interface ChengjipingdingDao extends BaseMapper<ChengjipingdingEntity> {
	
	List<ChengjipingdingVO> selectListVO(@Param("ew") Wrapper<ChengjipingdingEntity> wrapper);
	
	ChengjipingdingVO selectVO(@Param("ew") Wrapper<ChengjipingdingEntity> wrapper);
	
	List<ChengjipingdingView> selectListView(@Param("ew") Wrapper<ChengjipingdingEntity> wrapper);

	List<ChengjipingdingView> selectListView(Pagination page,@Param("ew") Wrapper<ChengjipingdingEntity> wrapper);
	
	ChengjipingdingView selectView(@Param("ew") Wrapper<ChengjipingdingEntity> wrapper);
	

}
