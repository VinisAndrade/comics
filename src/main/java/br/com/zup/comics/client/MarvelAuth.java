package br.com.zup.comics.client;


import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;

public class MarvelAuth implements RequestInterceptor {
    @Value("${marvel-api.publickey}")
    private String publicKey;
    @Value("${marvel-api.privatekey}")
    private String privateKey;


    @Override
    public void apply(RequestTemplate requestTemplate) {
        var ts = String.valueOf(System.currentTimeMillis());
        var md5 = DigestUtils.md5DigestAsHex((ts+privateKey+publicKey).getBytes(StandardCharsets.UTF_8));
        requestTemplate.query("ts", ts).query("apikey", publicKey).query("hash", md5);
    }
}
