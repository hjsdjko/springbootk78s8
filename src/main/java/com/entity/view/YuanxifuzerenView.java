package com.entity.view;

import com.entity.YuanxifuzerenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 院系负责人
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-09 16:05:16
 */
@TableName("yuanxifuzeren")
public class YuanxifuzerenView  extends YuanxifuzerenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuanxifuzerenView(){
	}
 
 	public YuanxifuzerenView(YuanxifuzerenEntity yuanxifuzerenEntity){
 	try {
			BeanUtils.copyProperties(this, yuanxifuzerenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
