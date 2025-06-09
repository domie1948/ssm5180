package com.entity.vo;

import com.entity.ShebeibaofeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 设备报废
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-09 10:45:47
 */
public class ShebeibaofeiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 报废内容
	 */
	
	private String baofeineirong;
		
	/**
	 * 报废日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date baofeiriqi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：报废内容
	 */
	 
	public void setBaofeineirong(String baofeineirong) {
		this.baofeineirong = baofeineirong;
	}
	
	/**
	 * 获取：报废内容
	 */
	public String getBaofeineirong() {
		return baofeineirong;
	}
				
	
	/**
	 * 设置：报废日期
	 */
	 
	public void setBaofeiriqi(Date baofeiriqi) {
		this.baofeiriqi = baofeiriqi;
	}
	
	/**
	 * 获取：报废日期
	 */
	public Date getBaofeiriqi() {
		return baofeiriqi;
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
