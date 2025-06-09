package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShebeibaofeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShebeibaofeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShebeibaofeiView;


/**
 * 设备报废
 *
 * @author 
 * @email 
 * @date 2021-03-09 10:45:47
 */
public interface ShebeibaofeiService extends IService<ShebeibaofeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeibaofeiVO> selectListVO(Wrapper<ShebeibaofeiEntity> wrapper);
   	
   	ShebeibaofeiVO selectVO(@Param("ew") Wrapper<ShebeibaofeiEntity> wrapper);
   	
   	List<ShebeibaofeiView> selectListView(Wrapper<ShebeibaofeiEntity> wrapper);
   	
   	ShebeibaofeiView selectView(@Param("ew") Wrapper<ShebeibaofeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShebeibaofeiEntity> wrapper);
   	
}

