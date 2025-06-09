package com.entity.view;

import com.entity.KeshiyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 科室员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-09 10:45:47
 */
@TableName("keshiyuan")
public class KeshiyuanView  extends KeshiyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KeshiyuanView(){
	}
 
 	public KeshiyuanView(KeshiyuanEntity keshiyuanEntity){
 	try {
			BeanUtils.copyProperties(this, keshiyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
