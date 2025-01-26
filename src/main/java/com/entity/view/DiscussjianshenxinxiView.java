package com.entity.view;

import com.entity.DiscussjianshenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健身信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-08 20:26:59
 */
@TableName("discussjianshenxinxi")
public class DiscussjianshenxinxiView  extends DiscussjianshenxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjianshenxinxiView(){
	}
 
 	public DiscussjianshenxinxiView(DiscussjianshenxinxiEntity discussjianshenxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussjianshenxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
