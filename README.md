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


# update 2026-02-23 12:59:02
```
140.82.113.4                  github.com
192.0.66.2                    github.blog
140.82.113.29                 githubapp.com
140.82.112.30                 githubapp.com
140.82.113.30                 githubapp.com
140.82.112.29                 githubapp.com
140.82.114.30                 githubapp.com
140.82.114.29                 githubapp.com
140.82.113.5                  api.github.com
185.199.109.133               raw.github.com
185.199.110.133               raw.github.com
185.199.111.133               raw.github.com
185.199.108.133               raw.github.com
140.82.112.4                  gist.github.com
140.82.112.4                  octocaptcha.com
140.82.112.17                 help.github.com
140.82.113.26                 live.github.com
140.82.112.17                 github.community
185.199.108.153               githubstatus.com
185.199.109.153               githubstatus.com
185.199.111.153               githubstatus.com
185.199.110.153               githubstatus.com
185.199.109.153               pages.github.com
185.199.108.153               pages.github.com
185.199.111.153               pages.github.com
185.199.110.153               pages.github.com
140.82.114.17                 status.github.com
140.82.113.14                 uploads.github.com
140.82.114.9                  nodeload.github.com
185.199.111.153               training.github.com
185.199.110.153               training.github.com
185.199.109.153               training.github.com
185.199.108.153               training.github.com
140.82.114.9                  codeload.github.com
185.199.108.154               github.githubassets.com
185.199.110.154               github.githubassets.com
185.199.111.154               github.githubassets.com
185.199.109.154               github.githubassets.com
185.199.109.133               raw.githubusercontent.com
185.199.108.133               raw.githubusercontent.com
185.199.110.133               raw.githubusercontent.com
185.199.111.133               raw.githubusercontent.com
185.199.109.133               gist.githubusercontent.com
185.199.111.133               gist.githubusercontent.com
185.199.110.133               gist.githubusercontent.com
185.199.108.133               gist.githubusercontent.com
185.199.108.133               camo.githubusercontent.com
185.199.109.133               camo.githubusercontent.com
185.199.110.133               camo.githubusercontent.com
185.199.111.133               camo.githubusercontent.com
185.199.111.133               cloud.githubusercontent.com
185.199.109.133               cloud.githubusercontent.com
185.199.110.133               cloud.githubusercontent.com
185.199.108.133               cloud.githubusercontent.com
185.199.108.133               media.githubusercontent.com
185.199.111.133               media.githubusercontent.com
185.199.109.133               media.githubusercontent.com
185.199.110.133               media.githubusercontent.com
16.15.183.238                 github-com.s3.amazonaws.com
16.182.97.153                 github-com.s3.amazonaws.com
3.5.19.194                    github-com.s3.amazonaws.com
16.15.199.184                 github-com.s3.amazonaws.com
3.5.6.157                     github-com.s3.amazonaws.com
3.5.22.177                    github-com.s3.amazonaws.com
3.5.10.16                     github-com.s3.amazonaws.com
151.101.1.194                 github.global.ssl.fastly.net
151.101.129.194               github.global.ssl.fastly.net
151.101.65.194                github.global.ssl.fastly.net
151.101.193.194               github.global.ssl.fastly.net
185.199.111.133               desktop.githubusercontent.com
185.199.110.133               desktop.githubusercontent.com
185.199.109.133               desktop.githubusercontent.com
185.199.108.133               desktop.githubusercontent.com
52.216.205.107                github-cloud.s3.amazonaws.com
16.15.183.9                   github-cloud.s3.amazonaws.com
52.217.235.1                  github-cloud.s3.amazonaws.com
52.217.203.25                 github-cloud.s3.amazonaws.com
52.216.42.153                 github-cloud.s3.amazonaws.com
54.231.203.169                github-cloud.s3.amazonaws.com
16.182.99.81                  github-cloud.s3.amazonaws.com
16.15.186.13                  github-cloud.s3.amazonaws.com
185.199.109.133               avatars.githubusercontent.com
185.199.111.133               avatars.githubusercontent.com
185.199.110.133               avatars.githubusercontent.com
185.199.108.133               avatars.githubusercontent.com
185.199.110.133               favicons.githubusercontent.com
185.199.108.133               favicons.githubusercontent.com
185.199.109.133               favicons.githubusercontent.com
185.199.111.133               favicons.githubusercontent.com
185.199.110.133               avatars0.githubusercontent.com
185.199.109.133               avatars0.githubusercontent.com
185.199.108.133               avatars0.githubusercontent.com
185.199.111.133               avatars0.githubusercontent.com
185.199.109.133               avatars1.githubusercontent.com
185.199.110.133               avatars1.githubusercontent.com
185.199.111.133               avatars1.githubusercontent.com
185.199.108.133               avatars1.githubusercontent.com
185.199.108.133               avatars2.githubusercontent.com
185.199.110.133               avatars2.githubusercontent.com
185.199.109.133               avatars2.githubusercontent.com
185.199.111.133               avatars2.githubusercontent.com
185.199.110.133               avatars3.githubusercontent.com
185.199.109.133               avatars3.githubusercontent.com
185.199.108.133               avatars3.githubusercontent.com
185.199.111.133               avatars3.githubusercontent.com
185.199.110.133               avatars4.githubusercontent.com
185.199.111.133               avatars4.githubusercontent.com
185.199.108.133               avatars4.githubusercontent.com
185.199.109.133               avatars4.githubusercontent.com
185.199.110.133               avatars5.githubusercontent.com
185.199.109.133               avatars5.githubusercontent.com
185.199.108.133               avatars5.githubusercontent.com
185.199.111.133               avatars5.githubusercontent.com
185.199.110.133               avatars6.githubusercontent.com
185.199.109.133               avatars6.githubusercontent.com
185.199.108.133               avatars6.githubusercontent.com
185.199.111.133               avatars6.githubusercontent.com
185.199.110.133               avatars7.githubusercontent.com
185.199.108.133               avatars7.githubusercontent.com
185.199.111.133               avatars7.githubusercontent.com
185.199.109.133               avatars7.githubusercontent.com
185.199.109.133               avatars8.githubusercontent.com
185.199.111.133               avatars8.githubusercontent.com
185.199.108.133               avatars8.githubusercontent.com
185.199.110.133               avatars8.githubusercontent.com
185.199.108.153               customer-stories-feed.github.com
185.199.109.153               customer-stories-feed.github.com
185.199.110.153               customer-stories-feed.github.com
185.199.111.153               customer-stories-feed.github.com
185.199.109.133               user-images.githubusercontent.com
185.199.108.133               user-images.githubusercontent.com
185.199.110.133               user-images.githubusercontent.com
185.199.111.133               user-images.githubusercontent.com
185.199.111.133               repository-images.githubusercontent.com
185.199.109.133               repository-images.githubusercontent.com
185.199.108.133               repository-images.githubusercontent.com
185.199.110.133               repository-images.githubusercontent.com
185.199.111.133               marketplace-screenshots.githubusercontent.com
185.199.108.133               marketplace-screenshots.githubusercontent.com
185.199.110.133               marketplace-screenshots.githubusercontent.com
185.199.109.133               marketplace-screenshots.githubusercontent.com
16.15.202.160                 github-production-user-asset-6210df.s3.amazonaws.com
16.15.179.148                 github-production-user-asset-6210df.s3.amazonaws.com
54.231.228.217                github-production-user-asset-6210df.s3.amazonaws.com
52.217.38.36                  github-production-user-asset-6210df.s3.amazonaws.com
52.217.124.233                github-production-user-asset-6210df.s3.amazonaws.com
16.15.176.176                 github-production-user-asset-6210df.s3.amazonaws.com
52.217.46.220                 github-production-user-asset-6210df.s3.amazonaws.com
16.15.199.64                  github-production-user-asset-6210df.s3.amazonaws.com
52.217.132.217                github-production-release-asset-2e65be.s3.amazonaws.com
16.15.199.74                  github-production-release-asset-2e65be.s3.amazonaws.com
52.217.72.12                  github-production-release-asset-2e65be.s3.amazonaws.com
3.5.25.133                    github-production-release-asset-2e65be.s3.amazonaws.com
54.231.169.57                 github-production-release-asset-2e65be.s3.amazonaws.com
52.217.172.233                github-production-release-asset-2e65be.s3.amazonaws.com
16.182.98.241                 github-production-release-asset-2e65be.s3.amazonaws.com
16.15.194.28                  github-production-release-asset-2e65be.s3.amazonaws.com
54.231.195.41                 github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.7.184                     github-production-repository-file-5c1aeb.s3.amazonaws.com
16.182.108.81                 github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.188.155                 github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.79.228                 github-production-repository-file-5c1aeb.s3.amazonaws.com
54.231.134.169                github-production-repository-file-5c1aeb.s3.amazonaws.com
16.182.35.65                  github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.27.164                    github-production-repository-file-5c1aeb.s3.amazonaws.com
```