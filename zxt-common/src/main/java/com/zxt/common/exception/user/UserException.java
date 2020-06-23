package com.zxt.common.exception.user;

import com.zxt.common.exception.base.BaseException;

/**
 * 用户信息异常类
 * 
 * @author zxt
 */
public class UserException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
