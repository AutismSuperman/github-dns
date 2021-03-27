package com.fulinlin;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.internal.StringUtil;

/**
 * @program: untitled
 * @author: fulin
 * @create: 2021-03-03 17:29
 **/
@Data
public class GithubDns {

    private String hostname;

    private String ipaddressUrl;

    private String ipaddress;


    public String getIpaddressUrl() {
        if (StringUtils.isNotBlank(hostname)) {
            this.ipaddressUrl = "https://" + hostname + ".ipaddress.com";
        }
        return ipaddressUrl;
    }

    public GithubDns() {
    }

    public GithubDns(String hostname) {
        this.hostname = hostname;
    }

}
