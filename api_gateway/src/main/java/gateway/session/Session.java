package gateway.session;

import core.pojo.user.po.User;
import core.util.RedisUtils;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class Session {
    private final long refreshTokenExpiredTime = 60 * 60 * 24 * 7 * 2L;

    private final long accessTokenExpiredTime = 60 * 60 * 24L;

    @Autowired
    private RedisUtils redisUtils;

    // 不需要

    public void login(String refreshToken, String accessToken, User user) {

        redisUtils.setHash(String.format("refresh:token:%s", refreshToken), new HashMap<Object, Object>() {{
            put("access_token", accessToken);
            put("user", user);
        }}, refreshTokenExpiredTime);

        redisUtils.set(String.format("access:token:%s", accessToken), new HashMap<Object, Object>() {{
            put("refresh_token", refreshToken);
            put("user", user);
        }}, accessTokenExpiredTime);

    }

    // 不需要
    public void refresh(String newRefreshToken, String oldRefreshToken, String newAccessToken) {

        String access_token = (String) redisUtils.getHash(String.format("refresh:token:%s", oldRefreshToken), "access_token");
        User user = (User) redisUtils.getHash(String.format("refresh:token:%s", oldRefreshToken), "user");

        logout(oldRefreshToken, access_token);
    }

    public User get(String token) {
        return (User) redisUtils.get(token);
    }

    public void logout(String accessToken) {

        String refreshToken = (String) redisUtils.getHash(accessToken, "refresh_token");

        redisUtils.expire(String.format("refresh:token:%s", accessToken), 0);
        redisUtils.expire(String.format("refresh:token:%s", refreshToken), 0);
    }

    public void logout(String refreshToken, String accessToken) {

        redisUtils.expire(String.format("refresh:token:%s", accessToken), 0);
        redisUtils.expire(String.format("refresh:token:%s", refreshToken), 0);
    }
}
