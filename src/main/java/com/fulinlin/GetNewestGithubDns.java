package com.fulinlin;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.file.FileReader;
import cn.hutool.core.io.file.FileWriter;
import cn.hutool.core.io.resource.ResourceUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: untitled
 * @author: fulin
 * @create: 2021-03-03 17:14
 **/
@Slf4j
public class GetNewestGithubDns {

    private static List<GithubDns> initGithubDnsList() {
        List<GithubDns> list = new ArrayList<>();
        list.add(new GithubDns("github.com"));
        list.add(new GithubDns("github.githubassets.com"));
        list.add(new GithubDns("central.github.com"));
        list.add(new GithubDns("desktop.githubusercontent.com"));
        list.add(new GithubDns("assets-cdn.github.com"));
        list.add(new GithubDns("camo.githubusercontent.com"));
        list.add(new GithubDns("github.map.fastly.net"));
        list.add(new GithubDns("github.global.ssl.fastly.net"));
        list.add(new GithubDns("gist.github.com"));
        list.add(new GithubDns("github.io"));
        list.add(new GithubDns("api.github.com"));
        list.add(new GithubDns("raw.githubusercontent.com"));
        list.add(new GithubDns("user-images.githubusercontent.com"));
        list.add(new GithubDns("favicons.githubusercontent.com"));
        list.add(new GithubDns("avatars5.githubusercontent.com"));
        list.add(new GithubDns("avatars4.githubusercontent.com"));
        list.add(new GithubDns("avatars3.githubusercontent.com"));
        list.add(new GithubDns("avatars2.githubusercontent.com"));
        list.add(new GithubDns("avatars1.githubusercontent.com"));
        list.add(new GithubDns("avatars0.githubusercontent.com"));
        list.add(new GithubDns("avatars.githubusercontent.com"));
        list.add(new GithubDns("codeload.github.com"));
        list.add(new GithubDns("github-cloud.s3.amazonaws.com"));
        list.add(new GithubDns("github-com.s3.amazonaws.com"));
        list.add(new GithubDns("github-production-release-asset-2e65be.s3.amazonaws.com"));
        list.add(new GithubDns("github-production-user-asset-6210df.s3.amazonaws.com"));
        list.add(new GithubDns("github-production-repository-file-5c1aeb.s3.amazonaws.com"));
        list.add(new GithubDns("githubstatus.com"));
        list.add(new GithubDns("github.community"));
        list.add(new GithubDns("media.githubusercontent.com"));
        return list;
    }

    public static void main(String[] args) throws IOException {
        List<GithubDns> list = initGithubDnsList();
        HttpsUtil.trustEveryone();
        for (GithubDns githubDns : list) {
            log.info("=================================================================");
            log.info("抓取地址为：{} ", githubDns.getIpaddressUrl());
            Document doc = Jsoup.connect(githubDns.getIpaddressUrl()).get();
            Elements elementsByClass = doc.body().getElementsByClass("comma-separated");
            Element first = elementsByClass.first();
            String text = first.child(0).text();
            log.info("抓取dns地址是 {} , 抓取地址：{} ", text, githubDns.getIpaddressUrl());
            githubDns.setIpaddress(text);
            log.info("=================================================================");
        }
        generateGithubDnsHosts(list);
    }

    private static void generateGithubDnsHosts(List<GithubDns> list) {
        String projectPath = System.getProperty("user.dir");
        String readmePath = projectPath + File.separator + "README.md";
        File file = new File(readmePath);
        FileReader fileReader = new FileReader(file);
        String reader = fileReader.readString();
        int i = StringUtils.indexOf(reader, "# update");
        String substring = StringUtils.substring(reader, 0, i);
        FileWriter writer = new FileWriter(file);
        writer.write(substring);
        FileUtil.appendUtf8String("# update " + LocalDate.now().toString() + "\n", file);
        FileUtil.appendUtf8String("```" + "\n", file);
        list.forEach(val -> {
            FileUtil.appendUtf8String(val.getIpaddress() + "                        " + val.getHostname() + "\n", file);
        });
        FileUtil.appendUtf8String("```", file);
    }


}
