package cn.edu.bupt.pojo.kv;

import lombok.Data;

@Data
public class BaseTsKvQuery implements TsKvQuery {

    // 属性键值名称
    private final String key;
    // 起始时间戳
    private final long startTs;
    // 终止时间戳
    private final long endTs;
    // 时间间隔
    private final long interval;
    // 单次查询最大记录数
    private final int limit;
    // 集合函数
    private final Aggregation aggregation;

    public BaseTsKvQuery(String key, long startTs, long endTs, long interval, int limit, Aggregation aggregation) {
        this.key = key;
        this.startTs = startTs;
        this.endTs = endTs;
        this.interval = interval;
        this.limit = limit;
        this.aggregation = aggregation;
    }

    public BaseTsKvQuery(String key, long startTs, long endTs, int interval, int limit) {
        this(key, startTs, endTs, interval, limit, Aggregation.COUNT);
    }



}
