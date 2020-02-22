package fun.chouniu.xproject.service;

import fun.chouniu.xproject.entity.SysUserEntity;

import java.util.List;

/**
 * @author chouniu
 * @version 1.0
 * @date 2020/2/22 16:37
 */
public interface SysUserService {
    /**
     * 查找所有用户
     * @return
     */
    List<SysUserEntity> findAll();
}
