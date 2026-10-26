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


# update 2026-10-26 03:09:32
```
140.82.114.3                  github.com
192.0.66.2                    github.blog
140.82.112.30                 githubapp.com
140.82.112.29                 githubapp.com
140.82.114.30                 githubapp.com
140.82.114.29                 githubapp.com
140.82.113.29                 githubapp.com
140.82.113.30                 githubapp.com
140.82.114.6                  api.github.com
185.199.108.133               raw.github.com
185.199.109.133               raw.github.com
185.199.111.133               raw.github.com
185.199.110.133               raw.github.com
140.82.113.4                  gist.github.com
140.82.114.3                  octocaptcha.com
185.199.109.133               help.github.com
185.199.111.133               help.github.com
185.199.108.133               help.github.com
185.199.110.133               help.github.com
140.82.113.25                 live.github.com
140.82.112.17                 github.community
185.199.110.153               githubstatus.com
185.199.108.153               githubstatus.com
185.199.111.153               githubstatus.com
185.199.109.153               githubstatus.com
185.199.109.153               pages.github.com
185.199.111.153               pages.github.com
185.199.110.153               pages.github.com
185.199.108.153               pages.github.com
140.82.112.18                 status.github.com
140.82.112.13                 uploads.github.com
140.82.113.9                  nodeload.github.com
185.199.110.153               training.github.com
185.199.111.153               training.github.com
185.199.108.153               training.github.com
185.199.109.153               training.github.com
140.82.113.10                 codeload.github.com
185.199.111.215               github.githubassets.com
185.199.108.215               github.githubassets.com
185.199.110.215               github.githubassets.com
185.199.109.215               github.githubassets.com
185.199.108.133               raw.githubusercontent.com
185.199.110.133               raw.githubusercontent.com
185.199.109.133               raw.githubusercontent.com
185.199.111.133               raw.githubusercontent.com
185.199.109.133               gist.githubusercontent.com
185.199.111.133               gist.githubusercontent.com
185.199.108.133               gist.githubusercontent.com
185.199.110.133               gist.githubusercontent.com
185.199.108.133               camo.githubusercontent.com
185.199.109.133               camo.githubusercontent.com
185.199.110.133               camo.githubusercontent.com
185.199.111.133               camo.githubusercontent.com
185.199.108.133               cloud.githubusercontent.com
185.199.110.133               cloud.githubusercontent.com
185.199.111.133               cloud.githubusercontent.com
185.199.109.133               cloud.githubusercontent.com
185.199.108.133               media.githubusercontent.com
185.199.109.133               media.githubusercontent.com
185.199.110.133               media.githubusercontent.com
185.199.111.133               media.githubusercontent.com
16.15.254.74                  github-com.s3.amazonaws.com
52.217.90.232                 github-com.s3.amazonaws.com
16.182.17.98                  github-com.s3.amazonaws.com
16.15.212.211                 github-com.s3.amazonaws.com
54.231.236.250                github-com.s3.amazonaws.com
16.15.244.109                 github-com.s3.amazonaws.com
52.217.172.162                github-com.s3.amazonaws.com
16.182.33.194                 github-com.s3.amazonaws.com
151.101.1.194                 github.global.ssl.fastly.net
151.101.129.194               github.global.ssl.fastly.net
151.101.65.194                github.global.ssl.fastly.net
151.101.193.194               github.global.ssl.fastly.net
185.199.110.133               desktop.githubusercontent.com
185.199.109.133               desktop.githubusercontent.com
185.199.108.133               desktop.githubusercontent.com
185.199.111.133               desktop.githubusercontent.com
54.231.164.178                github-cloud.s3.amazonaws.com
54.231.204.122                github-cloud.s3.amazonaws.com
52.217.206.74                 github-cloud.s3.amazonaws.com
16.15.252.90                  github-cloud.s3.amazonaws.com
52.216.212.154                github-cloud.s3.amazonaws.com
16.15.236.248                 github-cloud.s3.amazonaws.com
52.217.194.194                github-cloud.s3.amazonaws.com
52.217.199.194                github-cloud.s3.amazonaws.com
185.199.109.133               avatars.githubusercontent.com
185.199.111.133               avatars.githubusercontent.com
185.199.110.133               avatars.githubusercontent.com
185.199.108.133               avatars.githubusercontent.com
185.199.110.133               favicons.githubusercontent.com
185.199.111.133               favicons.githubusercontent.com
185.199.108.133               favicons.githubusercontent.com
185.199.109.133               favicons.githubusercontent.com
185.199.109.133               avatars0.githubusercontent.com
185.199.108.133               avatars0.githubusercontent.com
185.199.110.133               avatars0.githubusercontent.com
185.199.111.133               avatars0.githubusercontent.com
185.199.109.133               avatars1.githubusercontent.com
185.199.108.133               avatars1.githubusercontent.com
185.199.110.133               avatars1.githubusercontent.com
185.199.111.133               avatars1.githubusercontent.com
185.199.110.133               avatars2.githubusercontent.com
185.199.111.133               avatars2.githubusercontent.com
185.199.109.133               avatars2.githubusercontent.com
185.199.108.133               avatars2.githubusercontent.com
185.199.110.133               avatars3.githubusercontent.com
185.199.109.133               avatars3.githubusercontent.com
185.199.111.133               avatars3.githubusercontent.com
185.199.108.133               avatars3.githubusercontent.com
185.199.109.133               avatars4.githubusercontent.com
185.199.110.133               avatars4.githubusercontent.com
185.199.108.133               avatars4.githubusercontent.com
185.199.111.133               avatars4.githubusercontent.com
185.199.108.133               avatars5.githubusercontent.com
185.199.109.133               avatars5.githubusercontent.com
185.199.110.133               avatars5.githubusercontent.com
185.199.111.133               avatars5.githubusercontent.com
185.199.111.133               avatars6.githubusercontent.com
185.199.109.133               avatars6.githubusercontent.com
185.199.108.133               avatars6.githubusercontent.com
185.199.110.133               avatars6.githubusercontent.com
185.199.111.133               avatars7.githubusercontent.com
185.199.110.133               avatars7.githubusercontent.com
185.199.108.133               avatars7.githubusercontent.com
185.199.109.133               avatars7.githubusercontent.com
185.199.110.133               avatars8.githubusercontent.com
185.199.108.133               avatars8.githubusercontent.com
185.199.109.133               avatars8.githubusercontent.com
185.199.111.133               avatars8.githubusercontent.com
185.199.110.153               customer-stories-feed.github.com
185.199.109.153               customer-stories-feed.github.com
185.199.108.153               customer-stories-feed.github.com
185.199.111.153               customer-stories-feed.github.com
185.199.111.133               user-images.githubusercontent.com
185.199.108.133               user-images.githubusercontent.com
185.199.109.133               user-images.githubusercontent.com
185.199.110.133               user-images.githubusercontent.com
185.199.111.133               repository-images.githubusercontent.com
185.199.108.133               repository-images.githubusercontent.com
185.199.110.133               repository-images.githubusercontent.com
185.199.109.133               repository-images.githubusercontent.com
185.199.108.133               marketplace-screenshots.githubusercontent.com
185.199.111.133               marketplace-screenshots.githubusercontent.com
185.199.110.133               marketplace-screenshots.githubusercontent.com
185.199.109.133               marketplace-screenshots.githubusercontent.com
52.217.194.194                github-production-user-asset-6210df.s3.amazonaws.com
52.217.199.194                github-production-user-asset-6210df.s3.amazonaws.com
52.217.206.74                 github-production-user-asset-6210df.s3.amazonaws.com
16.15.236.248                 github-production-user-asset-6210df.s3.amazonaws.com
52.216.212.154                github-production-user-asset-6210df.s3.amazonaws.com
16.15.252.90                  github-production-user-asset-6210df.s3.amazonaws.com
54.231.204.122                github-production-user-asset-6210df.s3.amazonaws.com
54.231.164.178                github-production-user-asset-6210df.s3.amazonaws.com
52.216.51.194                 github-production-release-asset-2e65be.s3.amazonaws.com
16.15.246.225                 github-production-release-asset-2e65be.s3.amazonaws.com
16.15.244.10                  github-production-release-asset-2e65be.s3.amazonaws.com
54.231.167.26                 github-production-release-asset-2e65be.s3.amazonaws.com
16.15.236.18                  github-production-release-asset-2e65be.s3.amazonaws.com
16.15.161.169                 github-production-release-asset-2e65be.s3.amazonaws.com
16.182.71.82                  github-production-release-asset-2e65be.s3.amazonaws.com
16.15.214.126                 github-production-release-asset-2e65be.s3.amazonaws.com
16.182.69.34                  github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.213.206                 github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.213.216                 github-production-repository-file-5c1aeb.s3.amazonaws.com
16.182.106.82                 github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.213.41                  github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.237.86                  github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.212.14                  github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.253.223                 github-production-repository-file-5c1aeb.s3.amazonaws.com
```