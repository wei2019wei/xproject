package fun.chouniu.xproject.dao;

import fun.chouniu.xproject.entity.SysUserEntity;

import java.util.List;

/**
 * @author chouniu
 * @version 1.0
 * @date 2020/2/22 16:31
 */
public interface SysUserDao {
    /**
     * 查询全部
     * @return
     */
    List<SysUserEntity> findAll();
}
