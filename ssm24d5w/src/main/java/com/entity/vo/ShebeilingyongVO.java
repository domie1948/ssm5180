package com.entity.vo;

import com.entity.ShebeilingyongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 设备领用
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-09 10:45:47
 */
public class ShebeilingyongVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 申请内容
	 */
	
	private String shenqingneirong;
		
	/**
	 * 申请日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shenqingriqi;
		
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
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：申请日期
	 */
	 
	public void setShenqingriqi(Date shenqingriqi) {
		this.shenqingriqi = shenqingriqi;
	}
	
	/**
	 * 获取：申请日期
	 */
	public Date getShenqingriqi() {
		return shenqingriqi;
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
