package com.cl.entity.view;

import com.cl.entity.KaoshengchengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 考生成绩
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-27 14:06:10
 */
@TableName("kaoshengchengji")
public class KaoshengchengjiView  extends KaoshengchengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KaoshengchengjiView(){
	}
 
 	public KaoshengchengjiView(KaoshengchengjiEntity kaoshengchengjiEntity){
 	try {
			BeanUtils.copyProperties(this, kaoshengchengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
