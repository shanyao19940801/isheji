package com.isheji.project.common.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.isheji.project.common.constants.SecurityConstants;
import com.isheji.project.entity.UserInfo;

import java.io.UnsupportedEncodingException;

/**
 * Created by shanyao on 2018/4/11.
 */
public class JWTUtil {
    private static final String SECRET = "XX#$%()(#*!()!KL<><MQLMNQNQJQK sdfkjsdrow32234545fdf>?N<:{LWPW";
    private static final String EXP = "exp";
    private static final String PAYLOAD = "payload";

    public static String signWithTime(UserInfo userInfo, long maxAge) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(SecurityConstants.JWT_TOKEN_KEY);
            String token = JWT.create()
                    .withIssuer("auth0") //token 的发行者
                    .withExpiresAt(DateUtils.getMillisecondLongLater(maxAge))//token有效时间
                    .withClaim("userId", userInfo.getUserId())
                    .sign(algorithm);
            return token;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 默认token有效时间24小时
     * @param userInfo
     * @return
     */
    public static String sign(UserInfo userInfo) {
       return signWithTime(userInfo, SecurityConstants.JWT_TOKEN_ACTIVEHOUR);
    }

    public static DecodedJWT verify(String token) {
        DecodedJWT jwt = null;
        try {
            Algorithm algorithm = Algorithm.HMAC256(SecurityConstants.JWT_TOKEN_KEY);
            JWTVerifier verifier = JWT.require(algorithm)
                    .withIssuer("auth0")
                    .build();
            jwt = verifier.verify(token);
            return jwt;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return jwt;
    }

    /*public static String signByKey() {

    }*/
}
