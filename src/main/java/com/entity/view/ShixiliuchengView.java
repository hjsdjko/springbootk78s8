package com.entity.view;

import com.entity.ShixiliuchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 实习流程
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-09 16:05:16
 */
@TableName("shixiliucheng")
public class ShixiliuchengView  extends ShixiliuchengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShixiliuchengView(){
	}
 
 	public ShixiliuchengView(ShixiliuchengEntity shixiliuchengEntity){
 	try {
			BeanUtils.copyProperties(this, shixiliuchengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
