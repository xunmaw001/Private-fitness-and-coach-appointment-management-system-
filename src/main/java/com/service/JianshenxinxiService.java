package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianshenxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianshenxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianshenxinxiView;


/**
 * 健身信息
 *
 * @author 
 * @email 
 * @date 2023-02-08 20:26:58
 */
public interface JianshenxinxiService extends IService<JianshenxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianshenxinxiVO> selectListVO(Wrapper<JianshenxinxiEntity> wrapper);
   	
   	JianshenxinxiVO selectVO(@Param("ew") Wrapper<JianshenxinxiEntity> wrapper);
   	
   	List<JianshenxinxiView> selectListView(Wrapper<JianshenxinxiEntity> wrapper);
   	
   	JianshenxinxiView selectView(@Param("ew") Wrapper<JianshenxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianshenxinxiEntity> wrapper);
   	

}

