# github-dns
**使用 github action 定时解析 github 最新的 dns 解析**。

没有kx上网是真的麻烦。

**如何使用**：

把 `host` 信息对应加入到 `hosts` 文件中即可

- Linux/Mac 系统：`/etc/hosts`  
- Windows 系统：`C:\Windows\System32\drivers\etc\hosts`  
- Android（安卓）系统：`/system/etc/hosts`

**推荐工具** [SwitchHosts](https://github.com/oldj/SwitchHosts)

使用 SwitchHosts 中的 **远程功能**

网址为  `https://fastly.jsdelivr.net/gh/AutismSuperman/github-dns/hosts`

![switchhosts-remote](https://raw.githubusercontent.com/AutismSuperman/github-dns/master/image/switchhosts-remote.png)


# update 2023-11-11 18:36:42
```
20.205.243.166                github.com
192.0.66.2                    github.blog
140.82.112.29                 githubapp.com
140.82.112.30                 githubapp.com
140.82.113.29                 githubapp.com
140.82.113.30                 githubapp.com
140.82.114.29                 githubapp.com
140.82.114.30                 githubapp.com
20.205.243.168                api.github.com
185.199.109.133               raw.github.com
185.199.111.133               raw.github.com
185.199.108.133               raw.github.com
185.199.110.133               raw.github.com
37.61.54.158                  gist.github.com
20.205.243.166                octocaptcha.com
140.82.112.17                 help.github.com
140.82.114.26                 live.github.com
140.82.114.18                 github.community
185.199.110.153               githubstatus.com
185.199.108.153               githubstatus.com
185.199.109.153               githubstatus.com
185.199.111.153               githubstatus.com
185.199.108.153               pages.github.com
185.199.109.153               pages.github.com
185.199.110.153               pages.github.com
185.199.111.153               pages.github.com
140.82.112.17                 status.github.com
20.205.243.161                uploads.github.com
20.205.243.165                nodeload.github.com
185.199.108.153               training.github.com
185.199.109.153               training.github.com
185.199.110.153               training.github.com
185.199.111.153               training.github.com
20.205.243.165                codeload.github.com
185.199.108.153               assets-cdn.github.com
185.199.109.153               assets-cdn.github.com
185.199.111.153               assets-cdn.github.com
185.199.110.153               assets-cdn.github.com
185.199.108.154               github.githubassets.com
185.199.110.154               github.githubassets.com
185.199.109.154               github.githubassets.com
185.199.111.154               github.githubassets.com
185.199.110.153               documentcloud.github.com
185.199.109.153               documentcloud.github.com
185.199.108.153               documentcloud.github.com
185.199.111.153               documentcloud.github.com
185.199.110.133               raw.githubusercontent.com
185.199.109.133               raw.githubusercontent.com
185.199.108.133               raw.githubusercontent.com
185.199.111.133               raw.githubusercontent.com
185.199.108.133               gist.githubusercontent.com
185.199.109.133               gist.githubusercontent.com
185.199.110.133               gist.githubusercontent.com
185.199.111.133               gist.githubusercontent.com
185.199.111.133               camo.githubusercontent.com
185.199.109.133               camo.githubusercontent.com
185.199.110.133               camo.githubusercontent.com
185.199.108.133               camo.githubusercontent.com
185.199.110.133               cloud.githubusercontent.com
185.199.111.133               cloud.githubusercontent.com
185.199.109.133               cloud.githubusercontent.com
185.199.108.133               cloud.githubusercontent.com
185.199.111.133               media.githubusercontent.com
185.199.109.133               media.githubusercontent.com
185.199.110.133               media.githubusercontent.com
185.199.108.133               media.githubusercontent.com
3.5.25.68                     github-com.s3.amazonaws.com
52.217.123.49                 github-com.s3.amazonaws.com
52.217.170.145                github-com.s3.amazonaws.com
16.182.104.193                github-com.s3.amazonaws.com
54.231.128.113                github-com.s3.amazonaws.com
52.216.29.148                 github-com.s3.amazonaws.com
52.217.44.196                 github-com.s3.amazonaws.com
3.5.27.112                    github-com.s3.amazonaws.com
199.59.149.244                github.global.ssl.fastly.net
185.199.108.133               desktop.githubusercontent.com
185.199.109.133               desktop.githubusercontent.com
185.199.110.133               desktop.githubusercontent.com
185.199.111.133               desktop.githubusercontent.com
3.5.11.148                    github-cloud.s3.amazonaws.com
52.217.224.129                github-cloud.s3.amazonaws.com
52.217.17.228                 github-cloud.s3.amazonaws.com
52.217.75.156                 github-cloud.s3.amazonaws.com
52.216.130.203                github-cloud.s3.amazonaws.com
52.216.217.233                github-cloud.s3.amazonaws.com
52.216.109.91                 github-cloud.s3.amazonaws.com
52.217.167.129                github-cloud.s3.amazonaws.com
185.199.110.133               avatars.githubusercontent.com
185.199.111.133               avatars.githubusercontent.com
185.199.108.133               avatars.githubusercontent.com
185.199.109.133               avatars.githubusercontent.com
185.199.111.133               favicons.githubusercontent.com
185.199.110.133               favicons.githubusercontent.com
185.199.108.133               favicons.githubusercontent.com
185.199.109.133               favicons.githubusercontent.com
185.199.110.133               avatars0.githubusercontent.com
185.199.108.133               avatars0.githubusercontent.com
185.199.111.133               avatars0.githubusercontent.com
185.199.109.133               avatars0.githubusercontent.com
185.199.108.133               avatars1.githubusercontent.com
185.199.109.133               avatars1.githubusercontent.com
185.199.110.133               avatars1.githubusercontent.com
185.199.111.133               avatars1.githubusercontent.com
185.199.110.133               avatars2.githubusercontent.com
185.199.108.133               avatars2.githubusercontent.com
185.199.109.133               avatars2.githubusercontent.com
185.199.111.133               avatars2.githubusercontent.com
185.199.108.133               avatars3.githubusercontent.com
185.199.109.133               avatars3.githubusercontent.com
185.199.110.133               avatars3.githubusercontent.com
185.199.111.133               avatars3.githubusercontent.com
185.199.108.133               avatars4.githubusercontent.com
185.199.109.133               avatars4.githubusercontent.com
185.199.110.133               avatars4.githubusercontent.com
185.199.111.133               avatars4.githubusercontent.com
185.199.111.133               avatars5.githubusercontent.com
185.199.109.133               avatars5.githubusercontent.com
185.199.110.133               avatars5.githubusercontent.com
185.199.108.133               avatars5.githubusercontent.com
185.199.108.133               avatars6.githubusercontent.com
185.199.111.133               avatars6.githubusercontent.com
185.199.110.133               avatars6.githubusercontent.com
185.199.109.133               avatars6.githubusercontent.com
185.199.108.133               avatars7.githubusercontent.com
185.199.109.133               avatars7.githubusercontent.com
185.199.110.133               avatars7.githubusercontent.com
185.199.111.133               avatars7.githubusercontent.com
185.199.109.133               avatars8.githubusercontent.com
185.199.110.133               avatars8.githubusercontent.com
185.199.111.133               avatars8.githubusercontent.com
185.199.108.133               avatars8.githubusercontent.com
185.199.109.153               customer-stories-feed.github.com
185.199.110.153               customer-stories-feed.github.com
185.199.111.153               customer-stories-feed.github.com
185.199.108.153               customer-stories-feed.github.com
185.199.108.133               user-images.githubusercontent.com
185.199.109.133               user-images.githubusercontent.com
185.199.110.133               user-images.githubusercontent.com
185.199.111.133               user-images.githubusercontent.com
185.199.108.133               repository-images.githubusercontent.com
185.199.110.133               repository-images.githubusercontent.com
185.199.111.133               repository-images.githubusercontent.com
185.199.109.133               repository-images.githubusercontent.com
185.199.108.133               marketplace-screenshots.githubusercontent.com
185.199.111.133               marketplace-screenshots.githubusercontent.com
185.199.109.133               marketplace-screenshots.githubusercontent.com
185.199.110.133               marketplace-screenshots.githubusercontent.com
52.216.62.129                 github-production-user-asset-6210df.s3.amazonaws.com
16.182.33.241                 github-production-user-asset-6210df.s3.amazonaws.com
52.217.135.121                github-production-user-asset-6210df.s3.amazonaws.com
3.5.29.217                    github-production-user-asset-6210df.s3.amazonaws.com
16.182.97.73                  github-production-user-asset-6210df.s3.amazonaws.com
3.5.25.204                    github-production-user-asset-6210df.s3.amazonaws.com
52.216.48.177                 github-production-user-asset-6210df.s3.amazonaws.com
52.217.233.209                github-production-user-asset-6210df.s3.amazonaws.com
52.216.62.129                 github-production-release-asset-2e65be.s3.amazonaws.com
16.182.33.241                 github-production-release-asset-2e65be.s3.amazonaws.com
52.217.135.121                github-production-release-asset-2e65be.s3.amazonaws.com
3.5.29.217                    github-production-release-asset-2e65be.s3.amazonaws.com
16.182.97.73                  github-production-release-asset-2e65be.s3.amazonaws.com
3.5.25.204                    github-production-release-asset-2e65be.s3.amazonaws.com
52.216.48.177                 github-production-release-asset-2e65be.s3.amazonaws.com
52.217.233.209                github-production-release-asset-2e65be.s3.amazonaws.com
3.5.11.148                    github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.224.129                github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.17.228                 github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.75.156                 github-production-repository-file-5c1aeb.s3.amazonaws.com
52.216.130.203                github-production-repository-file-5c1aeb.s3.amazonaws.com
52.216.217.233                github-production-repository-file-5c1aeb.s3.amazonaws.com
52.216.109.91                 github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.167.129                github-production-repository-file-5c1aeb.s3.amazonaws.com
```