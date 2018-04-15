package com.isheji.project.token;

import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.isheji.project.common.utils.JWTUtil;
import com.isheji.project.entity.UserInfo;
import io.jsonwebtoken.Claims;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

/**
 * Created by shanyao on 2018/4/15.
 */
public class JWTUtilTest {
    private UserInfo userInfo;
    @Before
    public void init(){
        userInfo = new UserInfo();
        userInfo.setUserName("shanyao");
        userInfo.setUserId(1001);
    }
    @Test
    public void signWithTime() throws Exception {
        while (true) {
            String token = JWTUtil.signWithTime(userInfo,120000);
            System.out.println(token);
            Thread.sleep(2000);
            DecodedJWT decodedJWT = JWTUtil.verify(token);
            Claim claim = decodedJWT.getClaim("userId");
            System.out.println(claim);
        }
    }

    @Test
    public void sign() throws Exception {

    }

    @Test
    public void verify() throws Exception {
        String token = "eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJhdXRoMCIsImV4cCI6MTUyMzc2OTU1NywidXNlcklkIjoxMDAxfQ.KCzoM0tC5QtvHMBlkBNbmtLopcl3Vpa5xFsfbVtR5GA";
        String token1 = "eyJhbGci1iJIUzI1NiJ9.eyJpc3MiOiJhdXRoMCIsImV4cCI6MTUyMzc2OTU1NywidXNlcklkIjoxMDAxfQ.KCzoM0tC5QtvHMBlkBNbmtLopcl3Vpa5xFsfbVtR5GA";
        DecodedJWT jwt = JWTUtil.verify(token1);
        Map<String, Claim> claims = jwt.getClaims();
        System.out.println("");
    }

}