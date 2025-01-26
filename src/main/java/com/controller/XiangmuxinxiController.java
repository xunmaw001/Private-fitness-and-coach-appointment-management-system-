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
import com.entity.OrdersEntity;
import com.service.OrdersService;

import com.entity.XiangmuxinxiEntity;
import com.entity.view.XiangmuxinxiView;

import com.service.XiangmuxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 项目信息
 * 后端接口
 * @author 
 * @email 
 * @date 2023-02-08 20:26:58
 */
@RestController
@RequestMapping("/xiangmuxinxi")
public class XiangmuxinxiController {
    @Autowired
    private XiangmuxinxiService xiangmuxinxiService;


    @Autowired
    private StoreupService storeupService;

    @Autowired
    private OrdersService ordersService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XiangmuxinxiEntity xiangmuxinxi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaolian")) {
			xiangmuxinxi.setGonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XiangmuxinxiEntity> ew = new EntityWrapper<XiangmuxinxiEntity>();


		PageUtils page = xiangmuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiangmuxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XiangmuxinxiEntity xiangmuxinxi, 
		HttpServletRequest request){
        EntityWrapper<XiangmuxinxiEntity> ew = new EntityWrapper<XiangmuxinxiEntity>();

		PageUtils page = xiangmuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiangmuxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XiangmuxinxiEntity xiangmuxinxi){
       	EntityWrapper<XiangmuxinxiEntity> ew = new EntityWrapper<XiangmuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xiangmuxinxi, "xiangmuxinxi")); 
        return R.ok().put("data", xiangmuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XiangmuxinxiEntity xiangmuxinxi){
        EntityWrapper< XiangmuxinxiEntity> ew = new EntityWrapper< XiangmuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xiangmuxinxi, "xiangmuxinxi")); 
		XiangmuxinxiView xiangmuxinxiView =  xiangmuxinxiService.selectView(ew);
		return R.ok("查询项目信息成功").put("data", xiangmuxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XiangmuxinxiEntity xiangmuxinxi = xiangmuxinxiService.selectById(id);
		xiangmuxinxi.setClicktime(new Date());
		xiangmuxinxiService.updateById(xiangmuxinxi);
        return R.ok().put("data", xiangmuxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XiangmuxinxiEntity xiangmuxinxi = xiangmuxinxiService.selectById(id);
		xiangmuxinxi.setClicktime(new Date());
		xiangmuxinxiService.updateById(xiangmuxinxi);
        return R.ok().put("data", xiangmuxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XiangmuxinxiEntity xiangmuxinxi, HttpServletRequest request){
    	xiangmuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xiangmuxinxi);

        xiangmuxinxiService.insert(xiangmuxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XiangmuxinxiEntity xiangmuxinxi, HttpServletRequest request){
    	xiangmuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xiangmuxinxi);

        xiangmuxinxiService.insert(xiangmuxinxi);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XiangmuxinxiEntity xiangmuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xiangmuxinxi);
        xiangmuxinxiService.updateById(xiangmuxinxi);//全部更新
        return R.ok();
    }
    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xiangmuxinxiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<XiangmuxinxiEntity> wrapper = new EntityWrapper<XiangmuxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaolian")) {
			wrapper.eq("gonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = xiangmuxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,XiangmuxinxiEntity xiangmuxinxi, HttpServletRequest request,String pre){
        EntityWrapper<XiangmuxinxiEntity> ew = new EntityWrapper<XiangmuxinxiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicktime");
        
        params.put("order", "desc");
		PageUtils page = xiangmuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiangmuxinxi), params), params));
        return R.ok().put("data", page);
    }


	/**
     * 协同算法（按用户购买推荐）
     */
    @RequestMapping("/autoSort2")
    public R autoSort2(@RequestParam Map<String, Object> params,XiangmuxinxiEntity xiangmuxinxi, HttpServletRequest request){
    	String userId = request.getSession().getAttribute("userId").toString();
    	String goodtypeColumn = "xiangmufenlei";
    	List<OrdersEntity> orders = ordersService.selectList(new EntityWrapper<OrdersEntity>().eq("userid", userId).eq("tablename", "xiangmuxinxi").orderBy("addtime", false));
        List<String> goodtypes = new ArrayList<String>();
    	Integer limit = params.get("limit")==null?10:Integer.parseInt(params.get("limit").toString());
    	List<XiangmuxinxiEntity> xiangmuxinxiList = new ArrayList<XiangmuxinxiEntity>();
	//去重
    	List<OrdersEntity> ordersDist = new ArrayList<OrdersEntity>();
    	for(OrdersEntity o1 : orders) {
    		boolean addFlag = true;
    		for(OrdersEntity o2 : ordersDist) {
    			if(o1.getGoodid()==o2.getGoodid() || o1.getGoodtype().equals(o2.getGoodtype())) {
    				addFlag = false;
    				break;
    			}
    		}
    		if(addFlag) ordersDist.add(o1);
    	}
        if(ordersDist!=null && ordersDist.size()>0) {
        	for(OrdersEntity o : ordersDist) {
        		xiangmuxinxiList.addAll(xiangmuxinxiService.selectList(new EntityWrapper<XiangmuxinxiEntity>().eq(goodtypeColumn, o.getGoodtype())));
        	}
        }
    	EntityWrapper<XiangmuxinxiEntity> ew = new EntityWrapper<XiangmuxinxiEntity>();
        params.put("sort", "id");
        params.put("order", "desc");
        PageUtils page = xiangmuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiangmuxinxi), params), params));
        List<XiangmuxinxiEntity> pageList = (List<XiangmuxinxiEntity>)page.getList();
        if(xiangmuxinxiList.size()<limit) {
        	int toAddNum = (limit-xiangmuxinxiList.size())<=pageList.size()?(limit-xiangmuxinxiList.size()):pageList.size();
            for(XiangmuxinxiEntity o1 : pageList) {
                boolean addFlag = true;
                for(XiangmuxinxiEntity o2 : xiangmuxinxiList) {
                    if(o1.getId().intValue()==o2.getId().intValue()) {
                        addFlag = false;
                        break;
                    }
                }
                if(addFlag) {
                    xiangmuxinxiList.add(o1);
                    if(--toAddNum==0) break;
                }
            }
        } else if(xiangmuxinxiList.size()>limit) {
            xiangmuxinxiList = xiangmuxinxiList.subList(0, limit);
        }
        page.setList(xiangmuxinxiList);
	return R.ok().put("data", page);
    }







}
