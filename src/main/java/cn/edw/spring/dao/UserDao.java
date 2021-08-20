package cn.edw.spring.dao;

import cn.edw.spring.entity.UserPO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author taoxu.xu
 * @date 8/17/2021 8:23 PM
 */
@Mapper
public interface UserDao extends BaseMapper<UserPO> {

}
