package ssy.dmp.kafka.filter;

/**
 * author: huangqian
 * data: 15/9/12
 */
public interface Filter {

    /***
     * Kafka消费者过滤器
     * @param threadNum 消费者线程编号
     * @param timeStamp 消费者收到消息的时间戳（单位毫秒）
     * @param message 消息字符串
     * @param filterChain 过滤链
     */
    public void doFilter(int threadNum, long timeStamp, String message, FilterChain filterChain);
}
