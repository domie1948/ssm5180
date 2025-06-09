package com.entity.vo;

import com.entity.WeixiupingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 维修评价
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-09 10:45:47
 */
public class WeixiupingjiaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 设备名称
	 */
	
	private String shebeimingcheng;
		
	/**
	 * 报修内容
	 */
	
	private String baoxiuneirong;
		
	/**
	 * 科室员工号
	 */
	
	private String keshiyuangonghao;
		
	/**
	 * 科室员姓名
	 */
	
	private String keshiyuanxingming;
		
	/**
	 * 科室
	 */
	
	private String keshi;
		
	/**
	 * 维修日期
	 */
	
	private String weixiuriqi;
		
	/**
	 * 维修状态
	 */
	
	private String weixiuzhuangtai;
		
	/**
	 * 评价
	 */
	
	private String pingjia;
		
	/**
	 * 维修员工号
	 */
	
	private String weixiuyuangonghao;
		
	/**
	 * 维修员姓名
	 */
	
	private String weixiuyuanxingming;
				
	
	/**
	 * 设置：设备名称
	 */
	 
	public void setShebeimingcheng(String shebeimingcheng) {
		this.shebeimingcheng = shebeimingcheng;
	}
	
	/**
	 * 获取：设备名称
	 */
	public String getShebeimingcheng() {
		return shebeimingcheng;
	}
				
	
	/**
	 * 设置：报修内容
	 */
	 
	public void setBaoxiuneirong(String baoxiuneirong) {
		this.baoxiuneirong = baoxiuneirong;
	}
	
	/**
	 * 获取：报修内容
	 */
	public String getBaoxiuneirong() {
		return baoxiuneirong;
	}
				
	
	/**
	 * 设置：科室员工号
	 */
	 
	public void setKeshiyuangonghao(String keshiyuangonghao) {
		this.keshiyuangonghao = keshiyuangonghao;
	}
	
	/**
	 * 获取：科室员工号
	 */
	public String getKeshiyuangonghao() {
		return keshiyuangonghao;
	}
				
	
	/**
	 * 设置：科室员姓名
	 */
	 
	public void setKeshiyuanxingming(String keshiyuanxingming) {
		this.keshiyuanxingming = keshiyuanxingming;
	}
	
	/**
	 * 获取：科室员姓名
	 */
	public String getKeshiyuanxingming() {
		return keshiyuanxingming;
	}
				
	
	/**
	 * 设置：科室
	 */
	 
	public void setKeshi(String keshi) {
		this.keshi = keshi;
	}
	
	/**
	 * 获取：科室
	 */
	public String getKeshi() {
		return keshi;
	}
				
	
	/**
	 * 设置：维修日期
	 */
	 
	public void setWeixiuriqi(String weixiuriqi) {
		this.weixiuriqi = weixiuriqi;
	}
	
	/**
	 * 获取：维修日期
	 */
	public String getWeixiuriqi() {
		return weixiuriqi;
	}
				
	
	/**
	 * 设置：维修状态
	 */
	 
	public void setWeixiuzhuangtai(String weixiuzhuangtai) {
		this.weixiuzhuangtai = weixiuzhuangtai;
	}
	
	/**
	 * 获取：维修状态
	 */
	public String getWeixiuzhuangtai() {
		return weixiuzhuangtai;
	}
				
	
	/**
	 * 设置：评价
	 */
	 
	public void setPingjia(String pingjia) {
		this.pingjia = pingjia;
	}
	
	/**
	 * 获取：评价
	 */
	public String getPingjia() {
		return pingjia;
	}
				
	
	/**
	 * 设置：维修员工号
	 */
	 
	public void setWeixiuyuangonghao(String weixiuyuangonghao) {
		this.weixiuyuangonghao = weixiuyuangonghao;
	}
	
	/**
	 * 获取：维修员工号
	 */
	public String getWeixiuyuangonghao() {
		return weixiuyuangonghao;
	}
				
	
	/**
	 * 设置：维修员姓名
	 */
	 
	public void setWeixiuyuanxingming(String weixiuyuanxingming) {
		this.weixiuyuanxingming = weixiuyuanxingming;
	}
	
	/**
	 * 获取：维修员姓名
	 */
	public String getWeixiuyuanxingming() {
		return weixiuyuanxingming;
	}
			
}
