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


# update 2026-08-24 12:42:23
```
20.29.134.23                  github.com
192.0.66.2                    github.blog
140.82.112.30                 githubapp.com
140.82.114.29                 githubapp.com
140.82.113.29                 githubapp.com
140.82.112.29                 githubapp.com
140.82.114.30                 githubapp.com
140.82.113.30                 githubapp.com
140.82.116.5                  api.github.com
185.199.109.133               raw.github.com
185.199.111.133               raw.github.com
185.199.108.133               raw.github.com
185.199.110.133               raw.github.com
140.82.116.4                  gist.github.com
140.82.116.4                  octocaptcha.com
185.199.111.133               help.github.com
185.199.108.133               help.github.com
185.199.110.133               help.github.com
185.199.109.133               help.github.com
140.82.113.25                 live.github.com
140.82.113.17                 github.community
185.199.111.153               githubstatus.com
185.199.110.153               githubstatus.com
185.199.108.153               githubstatus.com
185.199.109.153               githubstatus.com
185.199.109.153               pages.github.com
185.199.110.153               pages.github.com
185.199.111.153               pages.github.com
185.199.108.153               pages.github.com
140.82.113.17                 status.github.com
140.82.116.14                 uploads.github.com
140.82.116.10                 nodeload.github.com
185.199.111.153               training.github.com
185.199.109.153               training.github.com
185.199.108.153               training.github.com
185.199.110.153               training.github.com
140.82.116.9                  codeload.github.com
185.199.111.215               github.githubassets.com
185.199.109.215               github.githubassets.com
185.199.108.215               github.githubassets.com
185.199.110.215               github.githubassets.com
185.199.111.133               raw.githubusercontent.com
185.199.109.133               raw.githubusercontent.com
185.199.108.133               raw.githubusercontent.com
185.199.110.133               raw.githubusercontent.com
185.199.108.133               gist.githubusercontent.com
185.199.111.133               gist.githubusercontent.com
185.199.110.133               gist.githubusercontent.com
185.199.109.133               gist.githubusercontent.com
185.199.109.133               camo.githubusercontent.com
185.199.110.133               camo.githubusercontent.com
185.199.111.133               camo.githubusercontent.com
185.199.108.133               camo.githubusercontent.com
185.199.108.133               cloud.githubusercontent.com
185.199.110.133               cloud.githubusercontent.com
185.199.109.133               cloud.githubusercontent.com
185.199.111.133               cloud.githubusercontent.com
185.199.109.133               media.githubusercontent.com
185.199.111.133               media.githubusercontent.com
185.199.110.133               media.githubusercontent.com
185.199.108.133               media.githubusercontent.com
16.182.66.97                  github-com.s3.amazonaws.com
16.15.254.42                  github-com.s3.amazonaws.com
16.15.183.163                 github-com.s3.amazonaws.com
16.15.244.40                  github-com.s3.amazonaws.com
16.15.213.143                 github-com.s3.amazonaws.com
52.216.240.84                 github-com.s3.amazonaws.com
16.15.252.243                 github-com.s3.amazonaws.com
16.15.191.83                  github-com.s3.amazonaws.com
151.101.193.194               github.global.ssl.fastly.net
151.101.1.194                 github.global.ssl.fastly.net
151.101.129.194               github.global.ssl.fastly.net
151.101.65.194                github.global.ssl.fastly.net
185.199.111.133               desktop.githubusercontent.com
185.199.110.133               desktop.githubusercontent.com
185.199.108.133               desktop.githubusercontent.com
185.199.109.133               desktop.githubusercontent.com
54.231.194.201                github-cloud.s3.amazonaws.com
16.182.73.209                 github-cloud.s3.amazonaws.com
54.231.224.137                github-cloud.s3.amazonaws.com
16.15.207.19                  github-cloud.s3.amazonaws.com
52.217.206.73                 github-cloud.s3.amazonaws.com
16.182.33.201                 github-cloud.s3.amazonaws.com
16.15.230.21                  github-cloud.s3.amazonaws.com
16.15.229.9                   github-cloud.s3.amazonaws.com
185.199.109.133               avatars.githubusercontent.com
185.199.108.133               avatars.githubusercontent.com
185.199.111.133               avatars.githubusercontent.com
185.199.110.133               avatars.githubusercontent.com
185.199.111.133               favicons.githubusercontent.com
185.199.108.133               favicons.githubusercontent.com
185.199.109.133               favicons.githubusercontent.com
185.199.110.133               favicons.githubusercontent.com
185.199.111.133               avatars0.githubusercontent.com
185.199.110.133               avatars0.githubusercontent.com
185.199.109.133               avatars0.githubusercontent.com
185.199.108.133               avatars0.githubusercontent.com
185.199.108.133               avatars1.githubusercontent.com
185.199.111.133               avatars1.githubusercontent.com
185.199.110.133               avatars1.githubusercontent.com
185.199.109.133               avatars1.githubusercontent.com
185.199.110.133               avatars2.githubusercontent.com
185.199.111.133               avatars2.githubusercontent.com
185.199.108.133               avatars2.githubusercontent.com
185.199.109.133               avatars2.githubusercontent.com
185.199.111.133               avatars3.githubusercontent.com
185.199.108.133               avatars3.githubusercontent.com
185.199.109.133               avatars3.githubusercontent.com
185.199.110.133               avatars3.githubusercontent.com
185.199.111.133               avatars4.githubusercontent.com
185.199.108.133               avatars4.githubusercontent.com
185.199.109.133               avatars4.githubusercontent.com
185.199.110.133               avatars4.githubusercontent.com
185.199.110.133               avatars5.githubusercontent.com
185.199.108.133               avatars5.githubusercontent.com
185.199.111.133               avatars5.githubusercontent.com
185.199.109.133               avatars5.githubusercontent.com
185.199.110.133               avatars6.githubusercontent.com
185.199.108.133               avatars6.githubusercontent.com
185.199.109.133               avatars6.githubusercontent.com
185.199.111.133               avatars6.githubusercontent.com
185.199.108.133               avatars7.githubusercontent.com
185.199.109.133               avatars7.githubusercontent.com
185.199.111.133               avatars7.githubusercontent.com
185.199.110.133               avatars7.githubusercontent.com
185.199.108.133               avatars8.githubusercontent.com
185.199.110.133               avatars8.githubusercontent.com
185.199.109.133               avatars8.githubusercontent.com
185.199.111.133               avatars8.githubusercontent.com
185.199.111.153               customer-stories-feed.github.com
185.199.110.153               customer-stories-feed.github.com
185.199.109.153               customer-stories-feed.github.com
185.199.108.153               customer-stories-feed.github.com
185.199.111.133               user-images.githubusercontent.com
185.199.109.133               user-images.githubusercontent.com
185.199.108.133               user-images.githubusercontent.com
185.199.110.133               user-images.githubusercontent.com
185.199.111.133               repository-images.githubusercontent.com
185.199.108.133               repository-images.githubusercontent.com
185.199.109.133               repository-images.githubusercontent.com
185.199.110.133               repository-images.githubusercontent.com
185.199.108.133               marketplace-screenshots.githubusercontent.com
185.199.111.133               marketplace-screenshots.githubusercontent.com
185.199.109.133               marketplace-screenshots.githubusercontent.com
185.199.110.133               marketplace-screenshots.githubusercontent.com
16.15.246.228                 github-production-user-asset-6210df.s3.amazonaws.com
16.15.253.99                  github-production-user-asset-6210df.s3.amazonaws.com
16.15.207.92                  github-production-user-asset-6210df.s3.amazonaws.com
52.217.74.209                 github-production-user-asset-6210df.s3.amazonaws.com
16.15.214.172                 github-production-user-asset-6210df.s3.amazonaws.com
16.15.253.114                 github-production-user-asset-6210df.s3.amazonaws.com
16.15.252.154                 github-production-user-asset-6210df.s3.amazonaws.com
16.15.213.38                  github-production-user-asset-6210df.s3.amazonaws.com
16.15.191.83                  github-production-release-asset-2e65be.s3.amazonaws.com
16.15.183.163                 github-production-release-asset-2e65be.s3.amazonaws.com
16.182.66.97                  github-production-release-asset-2e65be.s3.amazonaws.com
16.15.252.243                 github-production-release-asset-2e65be.s3.amazonaws.com
16.15.254.42                  github-production-release-asset-2e65be.s3.amazonaws.com
52.216.240.84                 github-production-release-asset-2e65be.s3.amazonaws.com
16.15.213.143                 github-production-release-asset-2e65be.s3.amazonaws.com
16.15.244.40                  github-production-release-asset-2e65be.s3.amazonaws.com
16.15.191.83                  github-production-repository-file-5c1aeb.s3.amazonaws.com
16.182.66.97                  github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.213.143                 github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.183.163                 github-production-repository-file-5c1aeb.s3.amazonaws.com
52.216.240.84                 github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.244.40                  github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.254.42                  github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.252.243                 github-production-repository-file-5c1aeb.s3.amazonaws.com
```