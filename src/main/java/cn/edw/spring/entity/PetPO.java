package cn.edw.spring.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author taoxu.xu
 * @date 11/5/2021 5:17 PM
 */
@TableName("pet")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PetPO {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
}
