package com.dao;

import com.entity.ShebeichukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShebeichukuVO;
import com.entity.view.ShebeichukuView;


/**
 * 设备出库
 * 
 * @author 
 * @email 
 * @date 2021-03-09 10:45:47
 */
public interface ShebeichukuDao extends BaseMapper<ShebeichukuEntity> {
	
	List<ShebeichukuVO> selectListVO(@Param("ew") Wrapper<ShebeichukuEntity> wrapper);
	
	ShebeichukuVO selectVO(@Param("ew") Wrapper<ShebeichukuEntity> wrapper);
	
	List<ShebeichukuView> selectListView(@Param("ew") Wrapper<ShebeichukuEntity> wrapper);

	List<ShebeichukuView> selectListView(Pagination page,@Param("ew") Wrapper<ShebeichukuEntity> wrapper);
	
	ShebeichukuView selectView(@Param("ew") Wrapper<ShebeichukuEntity> wrapper);
	
}
