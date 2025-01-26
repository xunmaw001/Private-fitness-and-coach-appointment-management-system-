package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjianshenxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjianshenxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjianshenxinxiView;


/**
 * 健身信息评论表
 *
 * @author 
 * @email 
 * @date 2023-02-08 20:26:59
 */
public interface DiscussjianshenxinxiService extends IService<DiscussjianshenxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjianshenxinxiVO> selectListVO(Wrapper<DiscussjianshenxinxiEntity> wrapper);
   	
   	DiscussjianshenxinxiVO selectVO(@Param("ew") Wrapper<DiscussjianshenxinxiEntity> wrapper);
   	
   	List<DiscussjianshenxinxiView> selectListView(Wrapper<DiscussjianshenxinxiEntity> wrapper);
   	
   	DiscussjianshenxinxiView selectView(@Param("ew") Wrapper<DiscussjianshenxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjianshenxinxiEntity> wrapper);
   	

}

