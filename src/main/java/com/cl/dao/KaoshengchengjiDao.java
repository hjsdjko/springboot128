package com.cl.dao;

import com.cl.entity.KaoshengchengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.KaoshengchengjiView;


/**
 * 考生成绩
 * 
 * @author 
 * @email 
 * @date 2024-03-27 14:06:10
 */
public interface KaoshengchengjiDao extends BaseMapper<KaoshengchengjiEntity> {
	
	List<KaoshengchengjiView> selectListView(@Param("ew") Wrapper<KaoshengchengjiEntity> wrapper);

	List<KaoshengchengjiView> selectListView(Pagination page,@Param("ew") Wrapper<KaoshengchengjiEntity> wrapper);
	
	KaoshengchengjiView selectView(@Param("ew") Wrapper<KaoshengchengjiEntity> wrapper);
	
	List<KaoshengchengjiView> selectGroupBy(Pagination page,@Param("ew") Wrapper<KaoshengchengjiEntity> wrapper);

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KaoshengchengjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KaoshengchengjiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KaoshengchengjiEntity> wrapper);

    List<Map<String, Object>> kaoshileixingkaoshichengjiSectionStat(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KaoshengchengjiEntity> wrapper);


}
