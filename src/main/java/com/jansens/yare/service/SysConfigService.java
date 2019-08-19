package com.jansens.yare.service;

import java.util.List;

import com.jansens.yare.model.SysConfig;
import com.jansens.yare.core.service.CurdService;

/**
 * 系统配置管理
 */
public interface SysConfigService extends CurdService<SysConfig> {

	/**
	 * 根据名称查询
	 * @param lable
	 * @return
	 */
	List<SysConfig> findByLable(String lable);
}
