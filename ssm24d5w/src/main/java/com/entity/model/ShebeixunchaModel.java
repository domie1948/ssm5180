package com.entity.model;

import com.entity.ShebeixunchaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 设备巡查
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-09 10:45:47
 */
public class ShebeixunchaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 设备情况
	 */
	
	private String shebeiqingkuang;
		
	/**
	 * 巡查日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xunchariqi;
		
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
	 * 维修员工号
	 */
	
	private String weixiuyuangonghao;
		
	/**
	 * 维修员姓名
	 */
	
	private String weixiuyuanxingming;
				
	
	/**
	 * 设置：设备情况
	 */
	 
	public void setShebeiqingkuang(String shebeiqingkuang) {
		this.shebeiqingkuang = shebeiqingkuang;
	}
	
	/**
	 * 获取：设备情况
	 */
	public String getShebeiqingkuang() {
		return shebeiqingkuang;
	}
				
	
	/**
	 * 设置：巡查日期
	 */
	 
	public void setXunchariqi(Date xunchariqi) {
		this.xunchariqi = xunchariqi;
	}
	
	/**
	 * 获取：巡查日期
	 */
	public Date getXunchariqi() {
		return xunchariqi;
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
