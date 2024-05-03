package com.entity.view;

import com.entity.ChengjipingdingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 成绩评定
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-09 16:05:17
 */
@TableName("chengjipingding")
public class ChengjipingdingView  extends ChengjipingdingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChengjipingdingView(){
	}
 
 	public ChengjipingdingView(ChengjipingdingEntity chengjipingdingEntity){
 	try {
			BeanUtils.copyProperties(this, chengjipingdingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
