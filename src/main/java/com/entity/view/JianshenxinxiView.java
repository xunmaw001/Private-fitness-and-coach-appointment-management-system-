package com.entity.view;

import com.entity.JianshenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健身信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-08 20:26:58
 */
@TableName("jianshenxinxi")
public class JianshenxinxiView  extends JianshenxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JianshenxinxiView(){
	}
 
 	public JianshenxinxiView(JianshenxinxiEntity jianshenxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, jianshenxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
