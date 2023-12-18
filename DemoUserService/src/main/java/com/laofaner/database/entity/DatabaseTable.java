package com.laofaner.database.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 数据库表接入记录表
 * </p>
 *
 * @author fanyuzhuo
 * @since 2023-08-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("csp_monitor_database_table")
public class DatabaseTable implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 表名称
     */
    private String tableName;

    /**
     * 表类型（1-普通表；2-周期表；3-分区表）
     */
    private Integer tableType;

    /**
     * 是否有索引
     */
    private Integer indexed;

    /**
     * 索引字段
     */
    private String indexField;

    /**
     * 分区字段
     */
    private String partitionField;

    /**
     * 分区周期（1-天；2-周；3-月；4-季度；5-年）
     */
    private Integer partitionCycle;

    /**
     * 分区格式
     */
    private String partitionFormat;

    /**
     * 提前建立的分区数
     */
    private Integer preBuildPartition;

    /**
     * 分表周期（1-天，2-周，3-月，4-季度，5-年）
     */
    private Integer divisionCycle;

    /**
     * 分表格式
     */
    private String divisionFormat;

    /**
     * 提前建立的分表数
     */
    private Integer preBuildDivision;

    /**
     * 接入状态（1-已接入；2-已卸载）
     */
    private Integer accessStatus;

    /**
     * 接入时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}
