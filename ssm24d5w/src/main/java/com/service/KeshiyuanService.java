package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KeshiyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KeshiyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KeshiyuanView;


/**
 * 科室员
 *
 * @author 
 * @email 
 * @date 2021-03-09 10:45:47
 */
public interface KeshiyuanService extends IService<KeshiyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KeshiyuanVO> selectListVO(Wrapper<KeshiyuanEntity> wrapper);
   	
   	KeshiyuanVO selectVO(@Param("ew") Wrapper<KeshiyuanEntity> wrapper);
   	
   	List<KeshiyuanView> selectListView(Wrapper<KeshiyuanEntity> wrapper);
   	
   	KeshiyuanView selectView(@Param("ew") Wrapper<KeshiyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KeshiyuanEntity> wrapper);
   	
}

