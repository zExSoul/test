package com.ddd.example.common.domain.model.order;

import com.ddd.example.common.domain.model.vo.ValueObject;
import io.terminus.common.utils.JsonMapper;

/**
 * 拓展属性
 * 继承该类必须符合JavaBean规范
 *
 * @author : xuyifan
 * @since : 24/12/2018 10:25 PM
 */
public class Extra extends ValueObject {
    private static final long serialVersionUID = 1L;
    private static JsonMapper JSON_MAPPER = JsonMapper.nonEmptyMapper();

    public Extra() {
        super();
    }

    public String Json(Extra extra) {
        return JSON_MAPPER.toJson(extra);
    }
}
