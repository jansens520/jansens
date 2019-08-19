package com.jansens.yare.service;

import java.util.List;

import com.jansens.yare.model.SysDept;
import com.jansens.yare.core.service.CurdService;

/**
 * 机构管理
 */
public interface SysDeptService extends CurdService<SysDept> {

	/**
	 * 查询机构树
	 * @param
	 * @return
	 */
	List<SysDept> findTree();
}
