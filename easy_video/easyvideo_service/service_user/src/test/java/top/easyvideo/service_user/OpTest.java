/*------------------------------------------------------------------------------
 -  Lan Sheng  Copyright (c) 2021 https://127.0.0.1.
 -----------------------------------------------------------------------------*/

package top.easyvideo.service_user;

import top.easyvideo.service_base.utils.text.StringUtils;

public class OpTest {
    public static void main(String[] args) {
        String getToken = "https://api.weixin.qq.com/sns/oauth2/access_token?" +
                "appid={}" +
                "&secret={}" +
                "&code={}" +
                "&grant_type=authorization_code";
        String format = StringUtils.format(getToken, 1,2, 3);
        System.out.println(format);
    }
}
