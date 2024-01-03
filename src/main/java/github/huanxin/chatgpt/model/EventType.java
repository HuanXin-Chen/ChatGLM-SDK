package github.huanxin.chatgpt.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description: 消息类型
 * @author：H_X
 * @date: 2023-12-09
 * @Copyright： 公众号：阿新的杂记
 */
@Getter
@AllArgsConstructor
public enum EventType {
    add("add", "增量"),
    finish("finish", "结束"),
    error("error", "错误"),
    interrupted("interrupted", "中断"),

    ;
    private final String code;
    private final String info;
}
