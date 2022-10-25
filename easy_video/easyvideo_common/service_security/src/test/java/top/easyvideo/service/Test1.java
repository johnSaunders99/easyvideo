/*------------------------------------------------------------------------------
 -  Lan Sheng  Copyright (c) 2021 https://127.0.0.1.
 -----------------------------------------------------------------------------*/

package top.easyvideo.service;

import org.junit.Test;
import top.easyvideo.common_utils.utils.MD5;
import top.easyvideo.service_security.security.TokenManager;

/**
 * @program: easyvideo_video
 * @ClassName: Test1
 * @create: 2021-10-03 15:04
 * @author: Lan Sheng
 * @since： JDK1.8
 * @Test1: $
 **/


public class Test1 {

    @Test
    public void t () {

        final TokenManager manager = new TokenManager();
        final String token = manager.createToken("杨不易");
        System.out.println(token);
        /*-----------------------------------*/
        final String user = manager.getUserFromToken(token);
        System.out.println(user);

        String encrypt = MD5.encrypt("111111");
        System.out.println(encrypt);

    }

}
