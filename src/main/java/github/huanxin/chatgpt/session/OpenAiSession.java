package github.huanxin.chatgpt.session;

import com.fasterxml.jackson.core.JsonProcessingException;
import github.huanxin.chatgpt.model.ChatCompletionRequest;
import okhttp3.sse.EventSource;
import okhttp3.sse.EventSourceListener;

import java.util.concurrent.CompletableFuture;

/**
 * @description: 会话服务接口
 * @author：H_X
 * @date: 2023-12-09
 * @Copyright： 公众号：阿新的杂记
 */
public interface OpenAiSession {
    EventSource completions(ChatCompletionRequest chatCompletionRequest, EventSourceListener eventSourceListener) throws JsonProcessingException;

    CompletableFuture<String> completions(ChatCompletionRequest chatCompletionRequest) throws InterruptedException;
}
