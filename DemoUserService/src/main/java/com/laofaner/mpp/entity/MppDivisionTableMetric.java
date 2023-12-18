package com.laofaner.mpp.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 分表指标记录表
 * </p>
 *
 * @author fanyuzhuo
 * @since 2023-11-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("csp_monitor_mpp_division_table_metric")
public class MppDivisionTableMetric implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 父表ID
     */
    @TableField("parent_table_id")
    private Integer parentTableId;

    /**
     * 表名
     */
    @TableField("table_name")
    private String tableName;

    /**
     * 当日数据量
     */
    @TableField("daily_amount")
    private Integer dailyAmount;

    /**
     * 当日占用空间
     */
    @TableField("daily_space")
    private String dailySpace;

    /**
     * 是否有索引
     */
    @TableField("indexed")
    private Boolean indexed;

    /**
     * 索引是否有效
     */
    @TableField("index_valid")
    private Boolean indexValid;

    /**
     * 创建时间
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;


}
