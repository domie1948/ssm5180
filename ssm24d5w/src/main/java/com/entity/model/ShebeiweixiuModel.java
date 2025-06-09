package com.entity.model;

import com.entity.ShebeiweixiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 设备维修
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-09 10:45:47
 */
public class ShebeiweixiuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 报修单号
	 */
	
	private String baoxiudanhao;
		
	/**
	 * 报修内容
	 */
	
	private String baoxiuneirong;
		
	/**
	 * 报修日期
	 */
	
	private String baoxiuriqi;
		
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date weixiuriqi;
		
	/**
	 * 维修状态
	 */
	
	private String weixiuzhuangtai;
		
	/**
	 * 维修员工号
	 */
	
	private String weixiuyuangonghao;
		
	/**
	 * 维修员姓名
	 */
	
	private String weixiuyuanxingming;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：报修单号
	 */
	 
	public void setBaoxiudanhao(String baoxiudanhao) {
		this.baoxiudanhao = baoxiudanhao;
	}
	
	/**
	 * 获取：报修单号
	 */
	public String getBaoxiudanhao() {
		return baoxiudanhao;
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
	 * 设置：报修日期
	 */
	 
	public void setBaoxiuriqi(String baoxiuriqi) {
		this.baoxiuriqi = baoxiuriqi;
	}
	
	/**
	 * 获取：报修日期
	 */
	public String getBaoxiuriqi() {
		return baoxiuriqi;
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
	 
	public void setWeixiuriqi(Date weixiuriqi) {
		this.weixiuriqi = weixiuriqi;
	}
	
	/**
	 * 获取：维修日期
	 */
	public Date getWeixiuriqi() {
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
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
