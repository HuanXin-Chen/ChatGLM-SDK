package github.huanxin.chatgpt.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @description: 对话请求结果信息
 * @author：H_X
 * @date: 2023-12-09
 * @Copyright： 公众号：阿新的杂记
 */
@Data
public class ChatCompletionResponse implements Serializable {
    private String data;
    private String meta;

    @Data
    public static class Meta {
        private String task_status;
        private Usage usage;
        private String task_id;
        private String request_id;
    }

    @Data
    public static class Usage {
        private int completion_tokens;
        private int prompt_tokens;
        private int total_tokens;
    }
}
