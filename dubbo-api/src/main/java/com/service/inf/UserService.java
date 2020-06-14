package com.service.inf;

import com.entity.vo.UserDO;

import java.util.List;

public interface UserService {

    /**
     * 通过id查询用户
     *
     * @param id
     * @return T
     * @日期：2018年6月17日
     */
    public UserDO findById(Long id);

    /**
     * 查询用户列表
     *
     * @return List<T>
     * @日期：2018年6月17日
     */
    public List<UserDO> listUser();

}