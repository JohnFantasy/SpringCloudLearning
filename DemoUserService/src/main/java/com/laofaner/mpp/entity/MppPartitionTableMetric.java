package com.laofaner.mpp.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * MPP分区表指标记录表
 * </p>
 *
 * @author fanyuzhuo
 * @since 2023-11-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("csp_monitor_mpp_partition_table_metric")
public class MppPartitionTableMetric implements Serializable {

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
    private Integer tableName;

    /**
     * 当日数据量
     */
    @TableField("daily_amount")
    private Integer dailyAmount;

    /**
     * 表占用磁盘大小
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
