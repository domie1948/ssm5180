package com.dao;

import com.entity.KeshiyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KeshiyuanVO;
import com.entity.view.KeshiyuanView;


/**
 * 科室员
 * 
 * @author 
 * @email 
 * @date 2021-03-09 10:45:47
 */
public interface KeshiyuanDao extends BaseMapper<KeshiyuanEntity> {
	
	List<KeshiyuanVO> selectListVO(@Param("ew") Wrapper<KeshiyuanEntity> wrapper);
	
	KeshiyuanVO selectVO(@Param("ew") Wrapper<KeshiyuanEntity> wrapper);
	
	List<KeshiyuanView> selectListView(@Param("ew") Wrapper<KeshiyuanEntity> wrapper);

	List<KeshiyuanView> selectListView(Pagination page,@Param("ew") Wrapper<KeshiyuanEntity> wrapper);
	
	KeshiyuanView selectView(@Param("ew") Wrapper<KeshiyuanEntity> wrapper);
	
}
