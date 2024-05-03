package com.entity.vo;

import com.entity.ShixianpaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 实习安排
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-09 16:05:17
 */
public class ShixianpaiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 实习内容
	 */
	
	private String shixineirong;
		
	/**
	 * 岗位性质
	 */
	
	private String gangweixingzhi;
		
	/**
	 * 实习地点
	 */
	
	private String shixididian;
		
	/**
	 * 单位名称
	 */
	
	private String danweimingcheng;
		
	/**
	 * 联系人
	 */
	
	private String lianxiren;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 日程安排
	 */
	
	private String richenganpai;
		
	/**
	 * 实习合同
	 */
	
	private String shixihetong;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 安排日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date anpairiqi;
		
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
	 * 设置：实习内容
	 */
	 
	public void setShixineirong(String shixineirong) {
		this.shixineirong = shixineirong;
	}
	
	/**
	 * 获取：实习内容
	 */
	public String getShixineirong() {
		return shixineirong;
	}
				
	
	/**
	 * 设置：岗位性质
	 */
	 
	public void setGangweixingzhi(String gangweixingzhi) {
		this.gangweixingzhi = gangweixingzhi;
	}
	
	/**
	 * 获取：岗位性质
	 */
	public String getGangweixingzhi() {
		return gangweixingzhi;
	}
				
	
	/**
	 * 设置：实习地点
	 */
	 
	public void setShixididian(String shixididian) {
		this.shixididian = shixididian;
	}
	
	/**
	 * 获取：实习地点
	 */
	public String getShixididian() {
		return shixididian;
	}
				
	
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
	 * 设置：联系人
	 */
	 
	public void setLianxiren(String lianxiren) {
		this.lianxiren = lianxiren;
	}
	
	/**
	 * 获取：联系人
	 */
	public String getLianxiren() {
		return lianxiren;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：日程安排
	 */
	 
	public void setRichenganpai(String richenganpai) {
		this.richenganpai = richenganpai;
	}
	
	/**
	 * 获取：日程安排
	 */
	public String getRichenganpai() {
		return richenganpai;
	}
				
	
	/**
	 * 设置：实习合同
	 */
	 
	public void setShixihetong(String shixihetong) {
		this.shixihetong = shixihetong;
	}
	
	/**
	 * 获取：实习合同
	 */
	public String getShixihetong() {
		return shixihetong;
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
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：安排日期
	 */
	 
	public void setAnpairiqi(Date anpairiqi) {
		this.anpairiqi = anpairiqi;
	}
	
	/**
	 * 获取：安排日期
	 */
	public Date getAnpairiqi() {
		return anpairiqi;
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
