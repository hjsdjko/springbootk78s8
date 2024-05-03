package com.entity.vo;

import com.entity.ShixibaozhangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 实习保障
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-09 16:05:17
 */
public class ShixibaozhangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 实习经费
	 */
	
	private Integer shixijingfei;
		
	/**
	 * 出行信息
	 */
	
	private String chuxingxinxi;
		
	/**
	 * 住宿信息
	 */
	
	private String zhusuxinxi;
		
	/**
	 * 申请内容
	 */
	
	private String shenqingneirong;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 院系账号
	 */
	
	private String yuanxizhanghao;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：实习经费
	 */
	 
	public void setShixijingfei(Integer shixijingfei) {
		this.shixijingfei = shixijingfei;
	}
	
	/**
	 * 获取：实习经费
	 */
	public Integer getShixijingfei() {
		return shixijingfei;
	}
				
	
	/**
	 * 设置：出行信息
	 */
	 
	public void setChuxingxinxi(String chuxingxinxi) {
		this.chuxingxinxi = chuxingxinxi;
	}
	
	/**
	 * 获取：出行信息
	 */
	public String getChuxingxinxi() {
		return chuxingxinxi;
	}
				
	
	/**
	 * 设置：住宿信息
	 */
	 
	public void setZhusuxinxi(String zhusuxinxi) {
		this.zhusuxinxi = zhusuxinxi;
	}
	
	/**
	 * 获取：住宿信息
	 */
	public String getZhusuxinxi() {
		return zhusuxinxi;
	}
				
	
	/**
	 * 设置：申请内容
	 */
	 
	public void setShenqingneirong(String shenqingneirong) {
		this.shenqingneirong = shenqingneirong;
	}
	
	/**
	 * 获取：申请内容
	 */
	public String getShenqingneirong() {
		return shenqingneirong;
	}
				
	
	/**
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
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
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
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
