package com.entity.model;

import com.entity.ShebeibaoxiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 设备报修
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-09 10:45:47
 */
public class ShebeibaoxiuModel  implements Serializable {
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
	 * 报修日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date baoxiuriqi;
		
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
	 * 设置：报修日期
	 */
	 
	public void setBaoxiuriqi(Date baoxiuriqi) {
		this.baoxiuriqi = baoxiuriqi;
	}
	
	/**
	 * 获取：报修日期
	 */
	public Date getBaoxiuriqi() {
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
			
}
