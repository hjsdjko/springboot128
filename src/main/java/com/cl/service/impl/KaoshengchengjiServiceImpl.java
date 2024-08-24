package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.KaoshengchengjiDao;
import com.cl.entity.KaoshengchengjiEntity;
import com.cl.service.KaoshengchengjiService;
import com.cl.entity.view.KaoshengchengjiView;

@Service("kaoshengchengjiService")
public class KaoshengchengjiServiceImpl extends ServiceImpl<KaoshengchengjiDao, KaoshengchengjiEntity> implements KaoshengchengjiService {
	
	@Override
	public PageUtils queryPageGroupBy(Map<String, Object> params, Wrapper<KaoshengchengjiEntity> wrapper) {
		Page<KaoshengchengjiView> page =new Query<KaoshengchengjiView>(params).getPage();
        page.setRecords(baseMapper.selectGroupBy(page,wrapper));
    	PageUtils pageUtil = new PageUtils(page);
    	return pageUtil;
	}
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaoshengchengjiEntity> page = this.selectPage(
                new Query<KaoshengchengjiEntity>(params).getPage(),
                new EntityWrapper<KaoshengchengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaoshengchengjiEntity> wrapper) {
		  Page<KaoshengchengjiView> page =new Query<KaoshengchengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<KaoshengchengjiView> selectListView(Wrapper<KaoshengchengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaoshengchengjiView selectView(Wrapper<KaoshengchengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<KaoshengchengjiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<KaoshengchengjiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<KaoshengchengjiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> kaoshileixingkaoshichengjiSectionStat(Map<String, Object> params, Wrapper<KaoshengchengjiEntity> wrapper) {
        return baseMapper.kaoshileixingkaoshichengjiSectionStat(params, wrapper);
    }



}
