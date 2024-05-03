package com.entity.vo;

import com.entity.XueshengfankuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 学生反馈
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-09 16:05:17
 */
public class XueshengfankuiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 单位名称
	 */
	
	private String danweimingcheng;
		
	/**
	 * 实习日志
	 */
	
	private String shixirizhi;
		
	/**
	 * 实习报告
	 */
	
	private String shixibaogao;
		
	/**
	 * 内容反馈
	 */
	
	private String neirongfankui;
		
	/**
	 * 反馈日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fankuiriqi;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：单位名称
	 */
	 
	public void setDanweimingcheng(String danweimingcheng) {
		this.danweimingcheng = danweimingcheng;
	}
	
	/**
	 * 获取：单位名称
	 */
	public String getDanweimingcheng() {
		return danweimingcheng;
	}
				
	
	/**
	 * 设置：实习日志
	 */
	 
	public void setShixirizhi(String shixirizhi) {
		this.shixirizhi = shixirizhi;
	}
	
	/**
	 * 获取：实习日志
	 */
	public String getShixirizhi() {
		return shixirizhi;
	}
				
	
	/**
	 * 设置：实习报告
	 */
	 
	public void setShixibaogao(String shixibaogao) {
		this.shixibaogao = shixibaogao;
	}
	
	/**
	 * 获取：实习报告
	 */
	public String getShixibaogao() {
		return shixibaogao;
	}
				
	
	/**
	 * 设置：内容反馈
	 */
	 
	public void setNeirongfankui(String neirongfankui) {
		this.neirongfankui = neirongfankui;
	}
	
	/**
	 * 获取：内容反馈
	 */
	public String getNeirongfankui() {
		return neirongfankui;
	}
				
	
	/**
	 * 设置：反馈日期
	 */
	 
	public void setFankuiriqi(Date fankuiriqi) {
		this.fankuiriqi = fankuiriqi;
	}
	
	/**
	 * 获取：反馈日期
	 */
	public Date getFankuiriqi() {
		return fankuiriqi;
	}
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
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
