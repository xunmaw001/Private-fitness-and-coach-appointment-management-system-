package com.controller;

import java.math.BigDecimal;
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
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JianshenxinxiEntity;
import com.entity.view.JianshenxinxiView;

import com.service.JianshenxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 健身信息
 * 后端接口
 * @author 
 * @email 
 * @date 2023-02-08 20:26:58
 */
@RestController
@RequestMapping("/jianshenxinxi")
public class JianshenxinxiController {
    @Autowired
    private JianshenxinxiService jianshenxinxiService;


    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JianshenxinxiEntity jianshenxinxi, 
		HttpServletRequest request){
    	if(!request.getSession().getAttribute("role").toString().equals("管理员")) {
    		jianshenxinxi.setUserid((Long)request.getSession().getAttribute("userId"));
    	}

        EntityWrapper<JianshenxinxiEntity> ew = new EntityWrapper<JianshenxinxiEntity>();


		PageUtils page = jianshenxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jianshenxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JianshenxinxiEntity jianshenxinxi, 
		HttpServletRequest request){
        EntityWrapper<JianshenxinxiEntity> ew = new EntityWrapper<JianshenxinxiEntity>();

		PageUtils page = jianshenxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jianshenxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JianshenxinxiEntity jianshenxinxi){
       	EntityWrapper<JianshenxinxiEntity> ew = new EntityWrapper<JianshenxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jianshenxinxi, "jianshenxinxi")); 
        return R.ok().put("data", jianshenxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JianshenxinxiEntity jianshenxinxi){
        EntityWrapper< JianshenxinxiEntity> ew = new EntityWrapper< JianshenxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jianshenxinxi, "jianshenxinxi")); 
		JianshenxinxiView jianshenxinxiView =  jianshenxinxiService.selectView(ew);
		return R.ok("查询健身信息成功").put("data", jianshenxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JianshenxinxiEntity jianshenxinxi = jianshenxinxiService.selectById(id);
        return R.ok().put("data", jianshenxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JianshenxinxiEntity jianshenxinxi = jianshenxinxiService.selectById(id);
        return R.ok().put("data", jianshenxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JianshenxinxiEntity jianshenxinxi, HttpServletRequest request){
    	jianshenxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jianshenxinxi);
    	jianshenxinxi.setUserid((Long)request.getSession().getAttribute("userId"));

        jianshenxinxiService.insert(jianshenxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JianshenxinxiEntity jianshenxinxi, HttpServletRequest request){
    	jianshenxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jianshenxinxi);

        jianshenxinxiService.insert(jianshenxinxi);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JianshenxinxiEntity jianshenxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jianshenxinxi);
        jianshenxinxiService.updateById(jianshenxinxi);//全部更新
        return R.ok();
    }
    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jianshenxinxiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<JianshenxinxiEntity> wrapper = new EntityWrapper<JianshenxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}
		if(!request.getSession().getAttribute("role").toString().equals("管理员")) {
    		wrapper.eq("userid", (Long)request.getSession().getAttribute("userId"));
    	}


		int count = jianshenxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
