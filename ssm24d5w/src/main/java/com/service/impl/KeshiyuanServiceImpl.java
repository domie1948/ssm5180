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


import com.dao.KeshiyuanDao;
import com.entity.KeshiyuanEntity;
import com.service.KeshiyuanService;
import com.entity.vo.KeshiyuanVO;
import com.entity.view.KeshiyuanView;

@Service("keshiyuanService")
public class KeshiyuanServiceImpl extends ServiceImpl<KeshiyuanDao, KeshiyuanEntity> implements KeshiyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KeshiyuanEntity> page = this.selectPage(
                new Query<KeshiyuanEntity>(params).getPage(),
                new EntityWrapper<KeshiyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KeshiyuanEntity> wrapper) {
		  Page<KeshiyuanView> page =new Query<KeshiyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KeshiyuanVO> selectListVO(Wrapper<KeshiyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KeshiyuanVO selectVO(Wrapper<KeshiyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KeshiyuanView> selectListView(Wrapper<KeshiyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KeshiyuanView selectView(Wrapper<KeshiyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
