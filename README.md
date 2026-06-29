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


# update 2026-06-29 03:39:16
```
140.82.116.3                  github.com
192.0.66.2                    github.blog
140.82.112.29                 githubapp.com
140.82.113.30                 githubapp.com
140.82.113.29                 githubapp.com
140.82.114.30                 githubapp.com
140.82.112.30                 githubapp.com
140.82.114.29                 githubapp.com
140.82.116.5                  api.github.com
185.199.110.133               raw.github.com
185.199.108.133               raw.github.com
185.199.111.133               raw.github.com
185.199.109.133               raw.github.com
140.82.116.3                  gist.github.com
140.82.116.4                  octocaptcha.com
140.82.114.17                 help.github.com
140.82.113.25                 live.github.com
140.82.112.17                 github.community
185.199.108.153               githubstatus.com
185.199.110.153               githubstatus.com
185.199.111.153               githubstatus.com
185.199.109.153               githubstatus.com
185.199.111.153               pages.github.com
185.199.108.153               pages.github.com
185.199.110.153               pages.github.com
185.199.109.153               pages.github.com
140.82.113.17                 status.github.com
140.82.116.13                 uploads.github.com
140.82.116.9                  nodeload.github.com
185.199.109.153               training.github.com
185.199.111.153               training.github.com
185.199.108.153               training.github.com
185.199.110.153               training.github.com
140.82.116.9                  codeload.github.com
185.199.108.215               github.githubassets.com
185.199.110.215               github.githubassets.com
185.199.111.215               github.githubassets.com
185.199.109.215               github.githubassets.com
185.199.108.133               raw.githubusercontent.com
185.199.109.133               raw.githubusercontent.com
185.199.111.133               raw.githubusercontent.com
185.199.110.133               raw.githubusercontent.com
185.199.110.133               gist.githubusercontent.com
185.199.108.133               gist.githubusercontent.com
185.199.109.133               gist.githubusercontent.com
185.199.111.133               gist.githubusercontent.com
185.199.111.133               camo.githubusercontent.com
185.199.110.133               camo.githubusercontent.com
185.199.109.133               camo.githubusercontent.com
185.199.108.133               camo.githubusercontent.com
185.199.108.133               cloud.githubusercontent.com
185.199.109.133               cloud.githubusercontent.com
185.199.110.133               cloud.githubusercontent.com
185.199.111.133               cloud.githubusercontent.com
185.199.110.133               media.githubusercontent.com
185.199.108.133               media.githubusercontent.com
185.199.111.133               media.githubusercontent.com
185.199.109.133               media.githubusercontent.com
16.15.254.66                  github-com.s3.amazonaws.com
16.15.207.73                  github-com.s3.amazonaws.com
16.15.223.209                 github-com.s3.amazonaws.com
54.231.197.137                github-com.s3.amazonaws.com
16.15.247.105                 github-com.s3.amazonaws.com
16.15.255.220                 github-com.s3.amazonaws.com
16.15.237.120                 github-com.s3.amazonaws.com
16.15.223.92                  github-com.s3.amazonaws.com
151.101.65.194                github.global.ssl.fastly.net
151.101.129.194               github.global.ssl.fastly.net
151.101.193.194               github.global.ssl.fastly.net
151.101.1.194                 github.global.ssl.fastly.net
185.199.109.133               desktop.githubusercontent.com
185.199.111.133               desktop.githubusercontent.com
185.199.110.133               desktop.githubusercontent.com
185.199.108.133               desktop.githubusercontent.com
52.217.229.153                github-cloud.s3.amazonaws.com
16.182.103.129                github-cloud.s3.amazonaws.com
16.15.223.225                 github-cloud.s3.amazonaws.com
16.15.223.183                 github-cloud.s3.amazonaws.com
52.217.45.172                 github-cloud.s3.amazonaws.com
52.216.40.105                 github-cloud.s3.amazonaws.com
52.216.209.81                 github-cloud.s3.amazonaws.com
52.217.73.4                   github-cloud.s3.amazonaws.com
185.199.110.133               avatars.githubusercontent.com
185.199.111.133               avatars.githubusercontent.com
185.199.109.133               avatars.githubusercontent.com
185.199.108.133               avatars.githubusercontent.com
185.199.109.133               favicons.githubusercontent.com
185.199.111.133               favicons.githubusercontent.com
185.199.108.133               favicons.githubusercontent.com
185.199.110.133               favicons.githubusercontent.com
185.199.108.133               avatars0.githubusercontent.com
185.199.109.133               avatars0.githubusercontent.com
185.199.111.133               avatars0.githubusercontent.com
185.199.110.133               avatars0.githubusercontent.com
185.199.111.133               avatars1.githubusercontent.com
185.199.110.133               avatars1.githubusercontent.com
185.199.108.133               avatars1.githubusercontent.com
185.199.109.133               avatars1.githubusercontent.com
185.199.108.133               avatars2.githubusercontent.com
185.199.109.133               avatars2.githubusercontent.com
185.199.111.133               avatars2.githubusercontent.com
185.199.110.133               avatars2.githubusercontent.com
185.199.111.133               avatars3.githubusercontent.com
185.199.108.133               avatars3.githubusercontent.com
185.199.110.133               avatars3.githubusercontent.com
185.199.109.133               avatars3.githubusercontent.com
185.199.109.133               avatars4.githubusercontent.com
185.199.110.133               avatars4.githubusercontent.com
185.199.108.133               avatars4.githubusercontent.com
185.199.111.133               avatars4.githubusercontent.com
185.199.109.133               avatars5.githubusercontent.com
185.199.111.133               avatars5.githubusercontent.com
185.199.110.133               avatars5.githubusercontent.com
185.199.108.133               avatars5.githubusercontent.com
185.199.111.133               avatars6.githubusercontent.com
185.199.109.133               avatars6.githubusercontent.com
185.199.108.133               avatars6.githubusercontent.com
185.199.110.133               avatars6.githubusercontent.com
185.199.110.133               avatars7.githubusercontent.com
185.199.109.133               avatars7.githubusercontent.com
185.199.111.133               avatars7.githubusercontent.com
185.199.108.133               avatars7.githubusercontent.com
185.199.110.133               avatars8.githubusercontent.com
185.199.108.133               avatars8.githubusercontent.com
185.199.111.133               avatars8.githubusercontent.com
185.199.109.133               avatars8.githubusercontent.com
185.199.109.153               customer-stories-feed.github.com
185.199.110.153               customer-stories-feed.github.com
185.199.111.153               customer-stories-feed.github.com
185.199.108.153               customer-stories-feed.github.com
185.199.111.133               user-images.githubusercontent.com
185.199.110.133               user-images.githubusercontent.com
185.199.109.133               user-images.githubusercontent.com
185.199.108.133               user-images.githubusercontent.com
185.199.110.133               repository-images.githubusercontent.com
185.199.108.133               repository-images.githubusercontent.com
185.199.109.133               repository-images.githubusercontent.com
185.199.111.133               repository-images.githubusercontent.com
185.199.108.133               marketplace-screenshots.githubusercontent.com
185.199.110.133               marketplace-screenshots.githubusercontent.com
185.199.111.133               marketplace-screenshots.githubusercontent.com
185.199.109.133               marketplace-screenshots.githubusercontent.com
16.15.191.239                 github-production-user-asset-6210df.s3.amazonaws.com
52.217.226.121                github-production-user-asset-6210df.s3.amazonaws.com
52.217.80.100                 github-production-user-asset-6210df.s3.amazonaws.com
16.15.254.136                 github-production-user-asset-6210df.s3.amazonaws.com
16.15.212.103                 github-production-user-asset-6210df.s3.amazonaws.com
52.217.37.60                  github-production-user-asset-6210df.s3.amazonaws.com
16.15.245.173                 github-production-user-asset-6210df.s3.amazonaws.com
54.231.129.41                 github-production-user-asset-6210df.s3.amazonaws.com
54.231.136.9                  github-production-release-asset-2e65be.s3.amazonaws.com
16.182.73.233                 github-production-release-asset-2e65be.s3.amazonaws.com
16.15.199.117                 github-production-release-asset-2e65be.s3.amazonaws.com
52.217.121.57                 github-production-release-asset-2e65be.s3.amazonaws.com
52.217.122.233                github-production-release-asset-2e65be.s3.amazonaws.com
16.15.228.184                 github-production-release-asset-2e65be.s3.amazonaws.com
52.217.232.1                  github-production-release-asset-2e65be.s3.amazonaws.com
16.15.254.70                  github-production-release-asset-2e65be.s3.amazonaws.com
52.216.24.20                  github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.244.17                  github-production-repository-file-5c1aeb.s3.amazonaws.com
54.231.172.241                github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.165.105                github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.229.27                  github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.191.237                 github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.166.201                github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.129.17                 github-production-repository-file-5c1aeb.s3.amazonaws.com
```