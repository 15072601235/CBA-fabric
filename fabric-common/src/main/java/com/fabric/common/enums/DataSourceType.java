package com.fabric.common.enums;

/**
 * 数据源
 * 
 * @author fabric
 */
public enum DataSourceType
{
    /**
     * 主库
     */
    MASTER,

    /**
     * 从库1 qrtz
     */
    QRTZ,

    /**
     * 从库2 trace
     */
    TRACE
}
