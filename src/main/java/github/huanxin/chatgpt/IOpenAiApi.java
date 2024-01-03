package github.huanxin.chatgpt;

import github.huanxin.chatgpt.model.ChatCompletionRequest;
import github.huanxin.chatgpt.model.ChatCompletionResponse;
import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * @description:
 * @author：H_X
 * @date: 2023-12-09
 * @Copyright： 公众号：阿新的杂记
 */
public interface IOpenAiApi {
    String v3_completions = "api/paas/v3/model-api/{model}/sse-invoke";

    @POST(v3_completions)
    Single<ChatCompletionResponse> completions(@Path("model") String model, @Body ChatCompletionRequest chatCompletionRequest);

}
