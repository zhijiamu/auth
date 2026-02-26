package org.test.auth.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.util.Map;

public class JwtUtils {
    /**
     * 加密KEY
     */
    private static final String TOKEN_SECRET = "jwt-secret";

    /**
     * 生成Token
     *
     * @param uid      用户id
     * @param nickname 昵称
     * @return token
     */
    public static String getToken(@NotNull String uid, @NotNull String nickname) {
        JWTCreator.Builder builder = JWT.create();
        LocalDateTime now = LocalDateTime.now();
        return builder
                .withHeader(null) //不需要自己填写
                .withClaim("uid", uid)
                .withClaim("nickname", nickname)
                .withExpiresAt(now.plusDays(1).toInstant(ZoneOffset.of("+8"))) // 过期时间
                .sign(Algorithm.HMAC256(TOKEN_SECRET)); //加密方式
    }

    /**
     * 解析获取数据
     *
     * @param token 令牌
     * @return 数据
     */
    public static Map verifyToken(@NotNull String token) {
        DecodedJWT verify;
        JWTVerifier verifier = JWT.require(Algorithm.HMAC256(TOKEN_SECRET)).build();
        try {
            verify = verifier.verify(token);
        } catch (Exception e) {
            throw new RuntimeException("Token认证失败");
        }
        String uid = verify.getClaim("uid").toString();
        String nickname = verify.getClaim("nickname").toString();
        if (uid.isEmpty() || nickname.isEmpty()) {
            throw new RuntimeException("非法令牌");
        }
        Map param = new HashMap<>();
        param.put("uid", Long.valueOf(uid));
        param.put("nickname", nickname);
        return param;
    }
}
