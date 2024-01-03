package github.huanxin.chatgpt.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description: 角色
 * @author：H_X
 * @date: 2023-12-09
 * @Copyright： 公众号：阿新的杂记
 */
@Getter
@AllArgsConstructor
public enum Role {
    /**
     * user 用户输入的内容，role位user
     */
    user("user"),
    /**
     * 模型生成的内容，role位assistant
     */
    assistant("assistant"),

    /**
     * 系统
     */
    system("system"),

    ;
    private final String code;

}