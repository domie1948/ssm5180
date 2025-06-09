package com.dao;

import com.entity.BaoyangyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaoyangyuyueVO;
import com.entity.view.BaoyangyuyueView;


/**
 * 保养预约
 * 
 * @author 
 * @email 
 * @date 2021-03-09 10:45:47
 */
public interface BaoyangyuyueDao extends BaseMapper<BaoyangyuyueEntity> {
	
	List<BaoyangyuyueVO> selectListVO(@Param("ew") Wrapper<BaoyangyuyueEntity> wrapper);
	
	BaoyangyuyueVO selectVO(@Param("ew") Wrapper<BaoyangyuyueEntity> wrapper);
	
	List<BaoyangyuyueView> selectListView(@Param("ew") Wrapper<BaoyangyuyueEntity> wrapper);

	List<BaoyangyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<BaoyangyuyueEntity> wrapper);
	
	BaoyangyuyueView selectView(@Param("ew") Wrapper<BaoyangyuyueEntity> wrapper);
	
}
