package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.BaoyangyuyueEntity;
import com.entity.view.BaoyangyuyueView;

import com.service.BaoyangyuyueService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 保养预约
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-09 10:45:47
 */
@RestController
@RequestMapping("/baoyangyuyue")
public class BaoyangyuyueController {
    @Autowired
    private BaoyangyuyueService baoyangyuyueService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BaoyangyuyueEntity baoyangyuyue, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("keshiyuan")) {
			baoyangyuyue.setKeshiyuangonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<BaoyangyuyueEntity> ew = new EntityWrapper<BaoyangyuyueEntity>();
		PageUtils page = baoyangyuyueService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, baoyangyuyue), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BaoyangyuyueEntity baoyangyuyue, HttpServletRequest request){
        EntityWrapper<BaoyangyuyueEntity> ew = new EntityWrapper<BaoyangyuyueEntity>();
		PageUtils page = baoyangyuyueService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, baoyangyuyue), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BaoyangyuyueEntity baoyangyuyue){
       	EntityWrapper<BaoyangyuyueEntity> ew = new EntityWrapper<BaoyangyuyueEntity>();
      	ew.allEq(MPUtil.allEQMapPre( baoyangyuyue, "baoyangyuyue")); 
        return R.ok().put("data", baoyangyuyueService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BaoyangyuyueEntity baoyangyuyue){
        EntityWrapper< BaoyangyuyueEntity> ew = new EntityWrapper< BaoyangyuyueEntity>();
 		ew.allEq(MPUtil.allEQMapPre( baoyangyuyue, "baoyangyuyue")); 
		BaoyangyuyueView baoyangyuyueView =  baoyangyuyueService.selectView(ew);
		return R.ok("查询保养预约成功").put("data", baoyangyuyueView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BaoyangyuyueEntity baoyangyuyue = baoyangyuyueService.selectById(id);
        return R.ok().put("data", baoyangyuyue);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BaoyangyuyueEntity baoyangyuyue = baoyangyuyueService.selectById(id);
        return R.ok().put("data", baoyangyuyue);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BaoyangyuyueEntity baoyangyuyue, HttpServletRequest request){
    	baoyangyuyue.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(baoyangyuyue);

        baoyangyuyueService.insert(baoyangyuyue);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BaoyangyuyueEntity baoyangyuyue, HttpServletRequest request){
    	baoyangyuyue.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(baoyangyuyue);

        baoyangyuyueService.insert(baoyangyuyue);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BaoyangyuyueEntity baoyangyuyue, HttpServletRequest request){
        //ValidatorUtils.validateEntity(baoyangyuyue);
        baoyangyuyueService.updateById(baoyangyuyue);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        baoyangyuyueService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<BaoyangyuyueEntity> wrapper = new EntityWrapper<BaoyangyuyueEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("keshiyuan")) {
			wrapper.eq("keshiyuangonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = baoyangyuyueService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
