package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.BaoyangyuyueDao;
import com.entity.BaoyangyuyueEntity;
import com.service.BaoyangyuyueService;
import com.entity.vo.BaoyangyuyueVO;
import com.entity.view.BaoyangyuyueView;

@Service("baoyangyuyueService")
public class BaoyangyuyueServiceImpl extends ServiceImpl<BaoyangyuyueDao, BaoyangyuyueEntity> implements BaoyangyuyueService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaoyangyuyueEntity> page = this.selectPage(
                new Query<BaoyangyuyueEntity>(params).getPage(),
                new EntityWrapper<BaoyangyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaoyangyuyueEntity> wrapper) {
		  Page<BaoyangyuyueView> page =new Query<BaoyangyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaoyangyuyueVO> selectListVO(Wrapper<BaoyangyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaoyangyuyueVO selectVO(Wrapper<BaoyangyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaoyangyuyueView> selectListView(Wrapper<BaoyangyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaoyangyuyueView selectView(Wrapper<BaoyangyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
