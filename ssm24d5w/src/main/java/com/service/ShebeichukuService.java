package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShebeichukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShebeichukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShebeichukuView;


/**
 * 设备出库
 *
 * @author 
 * @email 
 * @date 2021-03-09 10:45:47
 */
public interface ShebeichukuService extends IService<ShebeichukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeichukuVO> selectListVO(Wrapper<ShebeichukuEntity> wrapper);
   	
   	ShebeichukuVO selectVO(@Param("ew") Wrapper<ShebeichukuEntity> wrapper);
   	
   	List<ShebeichukuView> selectListView(Wrapper<ShebeichukuEntity> wrapper);
   	
   	ShebeichukuView selectView(@Param("ew") Wrapper<ShebeichukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShebeichukuEntity> wrapper);
   	
}

