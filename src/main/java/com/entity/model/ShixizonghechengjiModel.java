package com.entity.model;

import com.entity.ShixizonghechengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 实习综合成绩
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-09 16:05:17
 */
public class ShixizonghechengjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 实习表现成绩
	 */
	
	private Integer shixibiaoxianchengji;
		
	/**
	 * 实习报告成绩
	 */
	
	private Integer shixibaogaochengji;
		
	/**
	 * 单位评定成绩
	 */
	
	private Integer danweipingdingchengji;
		
	/**
	 * 成绩描述
	 */
	
	private String chengjimiaoshu;
		
	/**
	 * 添加日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tianjiariqi;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 院系账号
	 */
	
	private String yuanxizhanghao;
		
	/**
	 * 跨表用户id
	 */
	
	private Long crossuserid;
		
	/**
	 * 跨表主键id
	 */
	
	private Long crossrefid;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：实习表现成绩
	 */
	 
	public void setShixibiaoxianchengji(Integer shixibiaoxianchengji) {
		this.shixibiaoxianchengji = shixibiaoxianchengji;
	}
	
	/**
	 * 获取：实习表现成绩
	 */
	public Integer getShixibiaoxianchengji() {
		return shixibiaoxianchengji;
	}
				
	
	/**
	 * 设置：实习报告成绩
	 */
	 
	public void setShixibaogaochengji(Integer shixibaogaochengji) {
		this.shixibaogaochengji = shixibaogaochengji;
	}
	
	/**
	 * 获取：实习报告成绩
	 */
	public Integer getShixibaogaochengji() {
		return shixibaogaochengji;
	}
				
	
	/**
	 * 设置：单位评定成绩
	 */
	 
	public void setDanweipingdingchengji(Integer danweipingdingchengji) {
		this.danweipingdingchengji = danweipingdingchengji;
	}
	
	/**
	 * 获取：单位评定成绩
	 */
	public Integer getDanweipingdingchengji() {
		return danweipingdingchengji;
	}
				
	
	/**
	 * 设置：成绩描述
	 */
	 
	public void setChengjimiaoshu(String chengjimiaoshu) {
		this.chengjimiaoshu = chengjimiaoshu;
	}
	
	/**
	 * 获取：成绩描述
	 */
	public String getChengjimiaoshu() {
		return chengjimiaoshu;
	}
				
	
	/**
	 * 设置：添加日期
	 */
	 
	public void setTianjiariqi(Date tianjiariqi) {
		this.tianjiariqi = tianjiariqi;
	}
	
	/**
	 * 获取：添加日期
	 */
	public Date getTianjiariqi() {
		return tianjiariqi;
	}
				
	
	/**
	 * 设置：教师工号
	 */
	 
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
				
	
	/**
	 * 设置：院系账号
	 */
	 
	public void setYuanxizhanghao(String yuanxizhanghao) {
		this.yuanxizhanghao = yuanxizhanghao;
	}
	
	/**
	 * 获取：院系账号
	 */
	public String getYuanxizhanghao() {
		return yuanxizhanghao;
	}
				
	
	/**
	 * 设置：跨表用户id
	 */
	 
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
				
	
	/**
	 * 设置：跨表主键id
	 */
	 
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
