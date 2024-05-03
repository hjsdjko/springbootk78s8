package com.entity.view;

import com.entity.ShixineirongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 实习内容
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-09 16:05:17
 */
@TableName("shixineirong")
public class ShixineirongView  extends ShixineirongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShixineirongView(){
	}
 
 	public ShixineirongView(ShixineirongEntity shixineirongEntity){
 	try {
			BeanUtils.copyProperties(this, shixineirongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
