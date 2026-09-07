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


# update 2026-09-07 02:50:47
```
140.82.114.3                  github.com
192.0.66.2                    github.blog
140.82.113.30                 githubapp.com
140.82.114.29                 githubapp.com
140.82.114.30                 githubapp.com
140.82.113.29                 githubapp.com
140.82.112.30                 githubapp.com
140.82.112.29                 githubapp.com
140.82.112.5                  api.github.com
185.199.111.133               raw.github.com
185.199.109.133               raw.github.com
185.199.110.133               raw.github.com
185.199.108.133               raw.github.com
140.82.113.3                  gist.github.com
140.82.114.3                  octocaptcha.com
185.199.111.133               help.github.com
185.199.110.133               help.github.com
185.199.109.133               help.github.com
185.199.108.133               help.github.com
140.82.113.25                 live.github.com
140.82.112.17                 github.community
185.199.108.153               githubstatus.com
185.199.110.153               githubstatus.com
185.199.111.153               githubstatus.com
185.199.109.153               githubstatus.com
185.199.110.153               pages.github.com
185.199.108.153               pages.github.com
185.199.109.153               pages.github.com
185.199.111.153               pages.github.com
140.82.112.18                 status.github.com
140.82.114.14                 uploads.github.com
140.82.113.9                  nodeload.github.com
185.199.108.153               training.github.com
185.199.111.153               training.github.com
185.199.109.153               training.github.com
185.199.110.153               training.github.com
140.82.113.9                  codeload.github.com
185.199.110.215               github.githubassets.com
185.199.108.215               github.githubassets.com
185.199.109.215               github.githubassets.com
185.199.111.215               github.githubassets.com
185.199.111.133               raw.githubusercontent.com
185.199.109.133               raw.githubusercontent.com
185.199.110.133               raw.githubusercontent.com
185.199.108.133               raw.githubusercontent.com
185.199.108.133               gist.githubusercontent.com
185.199.110.133               gist.githubusercontent.com
185.199.109.133               gist.githubusercontent.com
185.199.111.133               gist.githubusercontent.com
185.199.111.133               camo.githubusercontent.com
185.199.110.133               camo.githubusercontent.com
185.199.109.133               camo.githubusercontent.com
185.199.108.133               camo.githubusercontent.com
185.199.108.133               cloud.githubusercontent.com
185.199.111.133               cloud.githubusercontent.com
185.199.110.133               cloud.githubusercontent.com
185.199.109.133               cloud.githubusercontent.com
185.199.108.133               media.githubusercontent.com
185.199.110.133               media.githubusercontent.com
185.199.109.133               media.githubusercontent.com
185.199.111.133               media.githubusercontent.com
16.15.228.171                 github-com.s3.amazonaws.com
16.15.214.151                 github-com.s3.amazonaws.com
16.15.253.0                   github-com.s3.amazonaws.com
16.15.228.240                 github-com.s3.amazonaws.com
16.15.254.93                  github-com.s3.amazonaws.com
16.15.213.243                 github-com.s3.amazonaws.com
52.217.81.36                  github-com.s3.amazonaws.com
16.15.229.241                 github-com.s3.amazonaws.com
151.101.193.194               github.global.ssl.fastly.net
151.101.129.194               github.global.ssl.fastly.net
151.101.1.194                 github.global.ssl.fastly.net
151.101.65.194                github.global.ssl.fastly.net
185.199.111.133               desktop.githubusercontent.com
185.199.109.133               desktop.githubusercontent.com
185.199.108.133               desktop.githubusercontent.com
185.199.110.133               desktop.githubusercontent.com
16.15.254.111                 github-cloud.s3.amazonaws.com
16.15.252.126                 github-cloud.s3.amazonaws.com
16.15.244.2                   github-cloud.s3.amazonaws.com
16.15.207.135                 github-cloud.s3.amazonaws.com
16.15.236.60                  github-cloud.s3.amazonaws.com
16.182.106.201                github-cloud.s3.amazonaws.com
16.15.236.118                 github-cloud.s3.amazonaws.com
54.231.170.161                github-cloud.s3.amazonaws.com
185.199.108.133               avatars.githubusercontent.com
185.199.109.133               avatars.githubusercontent.com
185.199.111.133               avatars.githubusercontent.com
185.199.110.133               avatars.githubusercontent.com
185.199.110.133               favicons.githubusercontent.com
185.199.108.133               favicons.githubusercontent.com
185.199.111.133               favicons.githubusercontent.com
185.199.109.133               favicons.githubusercontent.com
185.199.108.133               avatars0.githubusercontent.com
185.199.109.133               avatars0.githubusercontent.com
185.199.110.133               avatars0.githubusercontent.com
185.199.111.133               avatars0.githubusercontent.com
185.199.109.133               avatars1.githubusercontent.com
185.199.108.133               avatars1.githubusercontent.com
185.199.110.133               avatars1.githubusercontent.com
185.199.111.133               avatars1.githubusercontent.com
185.199.111.133               avatars2.githubusercontent.com
185.199.108.133               avatars2.githubusercontent.com
185.199.110.133               avatars2.githubusercontent.com
185.199.109.133               avatars2.githubusercontent.com
185.199.108.133               avatars3.githubusercontent.com
185.199.109.133               avatars3.githubusercontent.com
185.199.111.133               avatars3.githubusercontent.com
185.199.110.133               avatars3.githubusercontent.com
185.199.108.133               avatars4.githubusercontent.com
185.199.109.133               avatars4.githubusercontent.com
185.199.110.133               avatars4.githubusercontent.com
185.199.111.133               avatars4.githubusercontent.com
185.199.111.133               avatars5.githubusercontent.com
185.199.110.133               avatars5.githubusercontent.com
185.199.109.133               avatars5.githubusercontent.com
185.199.108.133               avatars5.githubusercontent.com
185.199.109.133               avatars6.githubusercontent.com
185.199.111.133               avatars6.githubusercontent.com
185.199.108.133               avatars6.githubusercontent.com
185.199.110.133               avatars6.githubusercontent.com
185.199.109.133               avatars7.githubusercontent.com
185.199.108.133               avatars7.githubusercontent.com
185.199.111.133               avatars7.githubusercontent.com
185.199.110.133               avatars7.githubusercontent.com
185.199.110.133               avatars8.githubusercontent.com
185.199.109.133               avatars8.githubusercontent.com
185.199.108.133               avatars8.githubusercontent.com
185.199.111.133               avatars8.githubusercontent.com
185.199.109.153               customer-stories-feed.github.com
185.199.108.153               customer-stories-feed.github.com
185.199.111.153               customer-stories-feed.github.com
185.199.110.153               customer-stories-feed.github.com
185.199.108.133               user-images.githubusercontent.com
185.199.110.133               user-images.githubusercontent.com
185.199.109.133               user-images.githubusercontent.com
185.199.111.133               user-images.githubusercontent.com
185.199.108.133               repository-images.githubusercontent.com
185.199.111.133               repository-images.githubusercontent.com
185.199.109.133               repository-images.githubusercontent.com
185.199.110.133               repository-images.githubusercontent.com
185.199.110.133               marketplace-screenshots.githubusercontent.com
185.199.109.133               marketplace-screenshots.githubusercontent.com
185.199.111.133               marketplace-screenshots.githubusercontent.com
185.199.108.133               marketplace-screenshots.githubusercontent.com
52.216.50.177                 github-production-user-asset-6210df.s3.amazonaws.com
16.182.42.241                 github-production-user-asset-6210df.s3.amazonaws.com
54.231.129.201                github-production-user-asset-6210df.s3.amazonaws.com
16.15.207.170                 github-production-user-asset-6210df.s3.amazonaws.com
52.217.114.121                github-production-user-asset-6210df.s3.amazonaws.com
16.15.212.223                 github-production-user-asset-6210df.s3.amazonaws.com
52.216.54.201                 github-production-user-asset-6210df.s3.amazonaws.com
16.15.245.58                  github-production-user-asset-6210df.s3.amazonaws.com
16.15.223.67                  github-production-release-asset-2e65be.s3.amazonaws.com
52.217.192.89                 github-production-release-asset-2e65be.s3.amazonaws.com
52.217.175.121                github-production-release-asset-2e65be.s3.amazonaws.com
16.15.199.2                   github-production-release-asset-2e65be.s3.amazonaws.com
52.217.164.73                 github-production-release-asset-2e65be.s3.amazonaws.com
16.15.199.68                  github-production-release-asset-2e65be.s3.amazonaws.com
16.15.213.88                  github-production-release-asset-2e65be.s3.amazonaws.com
52.217.123.225                github-production-release-asset-2e65be.s3.amazonaws.com
16.15.191.84                  github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.198.65                 github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.67.212                 github-production-repository-file-5c1aeb.s3.amazonaws.com
54.231.171.57                 github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.245.225                 github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.199.99                  github-production-repository-file-5c1aeb.s3.amazonaws.com
16.182.35.89                  github-production-repository-file-5c1aeb.s3.amazonaws.com
52.216.220.225                github-production-repository-file-5c1aeb.s3.amazonaws.com
```