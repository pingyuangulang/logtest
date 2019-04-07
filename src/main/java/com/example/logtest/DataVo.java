package com.example.logtest;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jib
 * @date
 */
@Data
public class DataVo {

    private static final Logger logger = LoggerFactory.getLogger(DataVo.class);

    private String name;

    private Integer age;

    private Character sex;

    @Override
    public String toString() {
        logger.debug("datavo  debug");
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"name\":\"")
                .append(name).append('\"');
        logger.info("datavo info");
        sb.append(",\"age\":")
                .append(age);
        logger.warn("datavo warn");
        sb.append(",\"sex\":")
                .append(sex);
        logger.error("datavo error");
        sb.append('}');
        return sb.toString();
    }
}
