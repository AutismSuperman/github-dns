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


# update 2026-11-02 21:23:13
```
140.82.113.3                  github.com
192.0.66.2                    github.blog
140.82.112.30                 githubapp.com
140.82.113.29                 githubapp.com
140.82.114.30                 githubapp.com
140.82.114.29                 githubapp.com
140.82.113.30                 githubapp.com
140.82.112.29                 githubapp.com
140.82.114.6                  api.github.com
185.199.108.133               raw.github.com
185.199.109.133               raw.github.com
185.199.111.133               raw.github.com
185.199.110.133               raw.github.com
140.82.112.4                  gist.github.com
140.82.114.3                  octocaptcha.com
185.199.108.133               help.github.com
185.199.109.133               help.github.com
185.199.111.133               help.github.com
185.199.110.133               help.github.com
140.82.112.25                 live.github.com
140.82.112.17                 github.community
185.199.108.153               githubstatus.com
185.199.111.153               githubstatus.com
185.199.109.153               githubstatus.com
185.199.110.153               githubstatus.com
185.199.111.153               pages.github.com
185.199.109.153               pages.github.com
185.199.110.153               pages.github.com
185.199.108.153               pages.github.com
140.82.112.18                 status.github.com
140.82.114.13                 uploads.github.com
140.82.112.10                 nodeload.github.com
185.199.111.153               training.github.com
185.199.109.153               training.github.com
185.199.108.153               training.github.com
185.199.110.153               training.github.com
140.82.113.9                  codeload.github.com
185.199.111.215               github.githubassets.com
185.199.110.215               github.githubassets.com
185.199.108.215               github.githubassets.com
185.199.109.215               github.githubassets.com
185.199.110.133               raw.githubusercontent.com
185.199.108.133               raw.githubusercontent.com
185.199.111.133               raw.githubusercontent.com
185.199.109.133               raw.githubusercontent.com
185.199.111.133               gist.githubusercontent.com
185.199.110.133               gist.githubusercontent.com
185.199.109.133               gist.githubusercontent.com
185.199.108.133               gist.githubusercontent.com
185.199.109.133               camo.githubusercontent.com
185.199.108.133               camo.githubusercontent.com
185.199.111.133               camo.githubusercontent.com
185.199.110.133               camo.githubusercontent.com
185.199.111.133               cloud.githubusercontent.com
185.199.110.133               cloud.githubusercontent.com
185.199.108.133               cloud.githubusercontent.com
185.199.109.133               cloud.githubusercontent.com
185.199.108.133               media.githubusercontent.com
185.199.109.133               media.githubusercontent.com
185.199.111.133               media.githubusercontent.com
185.199.110.133               media.githubusercontent.com
52.216.35.50                  github-com.s3.amazonaws.com
16.15.254.216                 github-com.s3.amazonaws.com
52.217.80.16                  github-com.s3.amazonaws.com
52.217.228.114                github-com.s3.amazonaws.com
16.15.173.1                   github-com.s3.amazonaws.com
16.15.213.23                  github-com.s3.amazonaws.com
16.15.214.222                 github-com.s3.amazonaws.com
16.15.163.173                 github-com.s3.amazonaws.com
151.101.193.194               github.global.ssl.fastly.net
151.101.1.194                 github.global.ssl.fastly.net
151.101.129.194               github.global.ssl.fastly.net
151.101.65.194                github.global.ssl.fastly.net
185.199.110.133               desktop.githubusercontent.com
185.199.109.133               desktop.githubusercontent.com
185.199.111.133               desktop.githubusercontent.com
185.199.108.133               desktop.githubusercontent.com
16.15.239.171                 github-cloud.s3.amazonaws.com
16.15.228.229                 github-cloud.s3.amazonaws.com
16.15.246.242                 github-cloud.s3.amazonaws.com
16.182.24.186                 github-cloud.s3.amazonaws.com
16.15.167.115                 github-cloud.s3.amazonaws.com
16.15.207.103                 github-cloud.s3.amazonaws.com
52.217.114.98                 github-cloud.s3.amazonaws.com
16.15.199.213                 github-cloud.s3.amazonaws.com
185.199.111.133               avatars.githubusercontent.com
185.199.110.133               avatars.githubusercontent.com
185.199.109.133               avatars.githubusercontent.com
185.199.108.133               avatars.githubusercontent.com
185.199.111.133               favicons.githubusercontent.com
185.199.110.133               favicons.githubusercontent.com
185.199.109.133               favicons.githubusercontent.com
185.199.108.133               favicons.githubusercontent.com
185.199.109.133               avatars0.githubusercontent.com
185.199.111.133               avatars0.githubusercontent.com
185.199.110.133               avatars0.githubusercontent.com
185.199.108.133               avatars0.githubusercontent.com
185.199.109.133               avatars1.githubusercontent.com
185.199.110.133               avatars1.githubusercontent.com
185.199.108.133               avatars1.githubusercontent.com
185.199.111.133               avatars1.githubusercontent.com
185.199.111.133               avatars2.githubusercontent.com
185.199.109.133               avatars2.githubusercontent.com
185.199.108.133               avatars2.githubusercontent.com
185.199.110.133               avatars2.githubusercontent.com
185.199.110.133               avatars3.githubusercontent.com
185.199.109.133               avatars3.githubusercontent.com
185.199.111.133               avatars3.githubusercontent.com
185.199.108.133               avatars3.githubusercontent.com
185.199.111.133               avatars4.githubusercontent.com
185.199.108.133               avatars4.githubusercontent.com
185.199.110.133               avatars4.githubusercontent.com
185.199.109.133               avatars4.githubusercontent.com
185.199.110.133               avatars5.githubusercontent.com
185.199.111.133               avatars5.githubusercontent.com
185.199.108.133               avatars5.githubusercontent.com
185.199.109.133               avatars5.githubusercontent.com
185.199.109.133               avatars6.githubusercontent.com
185.199.111.133               avatars6.githubusercontent.com
185.199.110.133               avatars6.githubusercontent.com
185.199.108.133               avatars6.githubusercontent.com
185.199.110.133               avatars7.githubusercontent.com
185.199.109.133               avatars7.githubusercontent.com
185.199.111.133               avatars7.githubusercontent.com
185.199.108.133               avatars7.githubusercontent.com
185.199.111.133               avatars8.githubusercontent.com
185.199.108.133               avatars8.githubusercontent.com
185.199.109.133               avatars8.githubusercontent.com
185.199.110.133               avatars8.githubusercontent.com
185.199.110.153               customer-stories-feed.github.com
185.199.111.153               customer-stories-feed.github.com
185.199.109.153               customer-stories-feed.github.com
185.199.108.153               customer-stories-feed.github.com
185.199.109.133               user-images.githubusercontent.com
185.199.108.133               user-images.githubusercontent.com
185.199.110.133               user-images.githubusercontent.com
185.199.111.133               user-images.githubusercontent.com
185.199.109.133               repository-images.githubusercontent.com
185.199.110.133               repository-images.githubusercontent.com
185.199.111.133               repository-images.githubusercontent.com
185.199.108.133               repository-images.githubusercontent.com
185.199.108.133               marketplace-screenshots.githubusercontent.com
185.199.109.133               marketplace-screenshots.githubusercontent.com
185.199.111.133               marketplace-screenshots.githubusercontent.com
185.199.110.133               marketplace-screenshots.githubusercontent.com
16.15.173.1                   github-production-user-asset-6210df.s3.amazonaws.com
16.15.254.216                 github-production-user-asset-6210df.s3.amazonaws.com
52.217.228.114                github-production-user-asset-6210df.s3.amazonaws.com
16.15.213.23                  github-production-user-asset-6210df.s3.amazonaws.com
52.217.80.16                  github-production-user-asset-6210df.s3.amazonaws.com
16.15.163.173                 github-production-user-asset-6210df.s3.amazonaws.com
52.216.35.50                  github-production-user-asset-6210df.s3.amazonaws.com
16.15.214.222                 github-production-user-asset-6210df.s3.amazonaws.com
16.15.245.145                 github-production-release-asset-2e65be.s3.amazonaws.com
16.15.237.242                 github-production-release-asset-2e65be.s3.amazonaws.com
16.15.207.23                  github-production-release-asset-2e65be.s3.amazonaws.com
16.15.253.237                 github-production-release-asset-2e65be.s3.amazonaws.com
16.15.166.123                 github-production-release-asset-2e65be.s3.amazonaws.com
16.15.252.217                 github-production-release-asset-2e65be.s3.amazonaws.com
16.15.207.253                 github-production-release-asset-2e65be.s3.amazonaws.com
16.15.161.41                  github-production-release-asset-2e65be.s3.amazonaws.com
16.15.207.208                 github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.199.91                  github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.229.10                  github-production-repository-file-5c1aeb.s3.amazonaws.com
16.182.71.90                  github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.252.76                  github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.169.131                 github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.198.50                 github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.183.27                  github-production-repository-file-5c1aeb.s3.amazonaws.com
```