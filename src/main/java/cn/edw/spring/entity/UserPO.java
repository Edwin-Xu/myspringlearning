package cn.edw.spring.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author taoxu.xu
 * @date 8/17/2021 8:26 PM
 */
@TableName("user")
@Data
public class UserPO {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private Integer age;
}
