package github.huanxin.chatgpt.interceptor;

import github.huanxin.chatgpt.session.Configuration;
import github.huanxin.chatgpt.utils.BearerTokenUtils;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

/**
 * @description: 接口拦截
 * @author：H_X
 * @date: 2023-12-09
 * @Copyright： 公众号：阿新的杂记
 */
public class OpenAiHTTPInterceptor implements Interceptor {

    private final Configuration configuration;

    public OpenAiHTTPInterceptor(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public @NotNull Response intercept(Chain chain) throws IOException {
        // 1.获取原始Request
        Request original = chain.request();

        // 2.构造请求
        Request request = original.newBuilder()
                .url(original.url())
                .header("Authorization", "Bearer " + BearerTokenUtils.getToken(configuration.getApiKey(), configuration.getApiSecret()))
                .header("Content-Type", Configuration.JSON_CONTENT_TYPE)
                .header("User-Agent", Configuration.DEFAULT_USER_AGENT)
                .header("Accept", Configuration.SSE_CONTENT_TYPE)
                .method(original.method(), original.body())
                .build();

        // 3. 返回执行结果
        return chain.proceed(request);
    }
}
