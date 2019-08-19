package com.jansens.yare.service;

import com.jansens.yare.core.service.CurdService;
import com.jansens.yare.model.SysDict;

import java.util.List;

public interface SysDictService extends CurdService<SysDict> {

    /**
     * 根据名称查询
     * @param label
     * @return
     */
    List<SysDict> findByLabel(String label);
}
