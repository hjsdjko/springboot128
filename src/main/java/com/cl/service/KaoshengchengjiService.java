package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.KaoshengchengjiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.KaoshengchengjiView;


/**
 * 考生成绩
 *
 * @author 
 * @email 
 * @date 2024-03-27 14:06:10
 */
public interface KaoshengchengjiService extends IService<KaoshengchengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaoshengchengjiView> selectListView(Wrapper<KaoshengchengjiEntity> wrapper);
   	
   	KaoshengchengjiView selectView(@Param("ew") Wrapper<KaoshengchengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaoshengchengjiEntity> wrapper);
   	
   	PageUtils queryPageGroupBy(Map<String, Object> params,Wrapper<KaoshengchengjiEntity> wrapper);

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<KaoshengchengjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<KaoshengchengjiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<KaoshengchengjiEntity> wrapper);

    List<Map<String, Object>> kaoshileixingkaoshichengjiSectionStat(Map<String, Object> params,Wrapper<KaoshengchengjiEntity> wrapper);


}

