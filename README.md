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


# update 2026-06-15 17:10:55
```
140.82.114.3                  github.com
192.0.66.2                    github.blog
140.82.114.30                 githubapp.com
140.82.112.30                 githubapp.com
140.82.113.29                 githubapp.com
140.82.114.29                 githubapp.com
140.82.112.29                 githubapp.com
140.82.113.30                 githubapp.com
140.82.114.5                  api.github.com
185.199.108.133               raw.github.com
185.199.111.133               raw.github.com
185.199.110.133               raw.github.com
185.199.109.133               raw.github.com
140.82.113.4                  gist.github.com
140.82.113.3                  octocaptcha.com
140.82.113.18                 help.github.com
140.82.112.26                 live.github.com
140.82.112.18                 github.community
185.199.109.153               githubstatus.com
185.199.111.153               githubstatus.com
185.199.110.153               githubstatus.com
185.199.108.153               githubstatus.com
185.199.111.153               pages.github.com
185.199.110.153               pages.github.com
185.199.109.153               pages.github.com
185.199.108.153               pages.github.com
140.82.112.18                 status.github.com
140.82.112.13                 uploads.github.com
140.82.112.9                  nodeload.github.com
185.199.111.153               training.github.com
185.199.110.153               training.github.com
185.199.109.153               training.github.com
185.199.108.153               training.github.com
140.82.114.10                 codeload.github.com
185.199.109.215               github.githubassets.com
185.199.110.215               github.githubassets.com
185.199.108.215               github.githubassets.com
185.199.111.215               github.githubassets.com
185.199.111.133               raw.githubusercontent.com
185.199.109.133               raw.githubusercontent.com
185.199.108.133               raw.githubusercontent.com
185.199.110.133               raw.githubusercontent.com
185.199.109.133               gist.githubusercontent.com
185.199.111.133               gist.githubusercontent.com
185.199.110.133               gist.githubusercontent.com
185.199.108.133               gist.githubusercontent.com
185.199.110.133               camo.githubusercontent.com
185.199.109.133               camo.githubusercontent.com
185.199.108.133               camo.githubusercontent.com
185.199.111.133               camo.githubusercontent.com
185.199.111.133               cloud.githubusercontent.com
185.199.109.133               cloud.githubusercontent.com
185.199.110.133               cloud.githubusercontent.com
185.199.108.133               cloud.githubusercontent.com
185.199.108.133               media.githubusercontent.com
185.199.110.133               media.githubusercontent.com
185.199.111.133               media.githubusercontent.com
185.199.109.133               media.githubusercontent.com
52.216.62.129                 github-com.s3.amazonaws.com
16.15.223.194                 github-com.s3.amazonaws.com
54.231.138.113                github-com.s3.amazonaws.com
16.182.73.121                 github-com.s3.amazonaws.com
16.15.245.223                 github-com.s3.amazonaws.com
54.231.163.1                  github-com.s3.amazonaws.com
16.182.33.241                 github-com.s3.amazonaws.com
16.182.65.113                 github-com.s3.amazonaws.com
151.101.65.194                github.global.ssl.fastly.net
151.101.129.194               github.global.ssl.fastly.net
151.101.193.194               github.global.ssl.fastly.net
151.101.1.194                 github.global.ssl.fastly.net
185.199.110.133               desktop.githubusercontent.com
185.199.109.133               desktop.githubusercontent.com
185.199.108.133               desktop.githubusercontent.com
185.199.111.133               desktop.githubusercontent.com
16.15.253.159                 github-cloud.s3.amazonaws.com
52.217.228.161                github-cloud.s3.amazonaws.com
54.231.234.249                github-cloud.s3.amazonaws.com
16.15.199.53                  github-cloud.s3.amazonaws.com
16.15.246.187                 github-cloud.s3.amazonaws.com
16.15.212.238                 github-cloud.s3.amazonaws.com
52.217.123.81                 github-cloud.s3.amazonaws.com
52.217.195.193                github-cloud.s3.amazonaws.com
185.199.111.133               avatars.githubusercontent.com
185.199.109.133               avatars.githubusercontent.com
185.199.108.133               avatars.githubusercontent.com
185.199.110.133               avatars.githubusercontent.com
185.199.108.133               favicons.githubusercontent.com
185.199.110.133               favicons.githubusercontent.com
185.199.109.133               favicons.githubusercontent.com
185.199.111.133               favicons.githubusercontent.com
185.199.108.133               avatars0.githubusercontent.com
185.199.109.133               avatars0.githubusercontent.com
185.199.111.133               avatars0.githubusercontent.com
185.199.110.133               avatars0.githubusercontent.com
185.199.109.133               avatars1.githubusercontent.com
185.199.110.133               avatars1.githubusercontent.com
185.199.111.133               avatars1.githubusercontent.com
185.199.108.133               avatars1.githubusercontent.com
185.199.109.133               avatars2.githubusercontent.com
185.199.111.133               avatars2.githubusercontent.com
185.199.108.133               avatars2.githubusercontent.com
185.199.110.133               avatars2.githubusercontent.com
185.199.109.133               avatars3.githubusercontent.com
185.199.110.133               avatars3.githubusercontent.com
185.199.111.133               avatars3.githubusercontent.com
185.199.108.133               avatars3.githubusercontent.com
185.199.110.133               avatars4.githubusercontent.com
185.199.111.133               avatars4.githubusercontent.com
185.199.108.133               avatars4.githubusercontent.com
185.199.109.133               avatars4.githubusercontent.com
185.199.108.133               avatars5.githubusercontent.com
185.199.109.133               avatars5.githubusercontent.com
185.199.111.133               avatars5.githubusercontent.com
185.199.110.133               avatars5.githubusercontent.com
185.199.110.133               avatars6.githubusercontent.com
185.199.111.133               avatars6.githubusercontent.com
185.199.109.133               avatars6.githubusercontent.com
185.199.108.133               avatars6.githubusercontent.com
185.199.108.133               avatars7.githubusercontent.com
185.199.109.133               avatars7.githubusercontent.com
185.199.110.133               avatars7.githubusercontent.com
185.199.111.133               avatars7.githubusercontent.com
185.199.110.133               avatars8.githubusercontent.com
185.199.109.133               avatars8.githubusercontent.com
185.199.111.133               avatars8.githubusercontent.com
185.199.108.133               avatars8.githubusercontent.com
185.199.108.153               customer-stories-feed.github.com
185.199.109.153               customer-stories-feed.github.com
185.199.110.153               customer-stories-feed.github.com
185.199.111.153               customer-stories-feed.github.com
185.199.108.133               user-images.githubusercontent.com
185.199.109.133               user-images.githubusercontent.com
185.199.110.133               user-images.githubusercontent.com
185.199.111.133               user-images.githubusercontent.com
185.199.109.133               repository-images.githubusercontent.com
185.199.110.133               repository-images.githubusercontent.com
185.199.108.133               repository-images.githubusercontent.com
185.199.111.133               repository-images.githubusercontent.com
185.199.108.133               marketplace-screenshots.githubusercontent.com
185.199.109.133               marketplace-screenshots.githubusercontent.com
185.199.111.133               marketplace-screenshots.githubusercontent.com
185.199.110.133               marketplace-screenshots.githubusercontent.com
52.217.230.113                github-production-user-asset-6210df.s3.amazonaws.com
16.15.183.212                 github-production-user-asset-6210df.s3.amazonaws.com
16.15.253.19                  github-production-user-asset-6210df.s3.amazonaws.com
16.15.212.167                 github-production-user-asset-6210df.s3.amazonaws.com
16.15.212.255                 github-production-user-asset-6210df.s3.amazonaws.com
16.182.33.25                  github-production-user-asset-6210df.s3.amazonaws.com
16.15.252.229                 github-production-user-asset-6210df.s3.amazonaws.com
16.15.237.118                 github-production-user-asset-6210df.s3.amazonaws.com
16.15.245.228                 github-production-release-asset-2e65be.s3.amazonaws.com
52.217.135.9                  github-production-release-asset-2e65be.s3.amazonaws.com
16.15.207.193                 github-production-release-asset-2e65be.s3.amazonaws.com
16.15.223.149                 github-production-release-asset-2e65be.s3.amazonaws.com
52.217.72.60                  github-production-release-asset-2e65be.s3.amazonaws.com
54.231.161.145                github-production-release-asset-2e65be.s3.amazonaws.com
16.15.183.170                 github-production-release-asset-2e65be.s3.amazonaws.com
52.216.56.145                 github-production-release-asset-2e65be.s3.amazonaws.com
16.15.207.63                  github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.253.166                 github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.214.248                 github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.165.9                  github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.231.217                github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.212.110                 github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.199.73                  github-production-repository-file-5c1aeb.s3.amazonaws.com
52.216.90.44                  github-production-repository-file-5c1aeb.s3.amazonaws.com
```