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


# update 2025-11-24 12:37:45
```
140.82.114.3                  github.com
192.0.66.2                    github.blog
140.82.113.29                 githubapp.com
140.82.114.30                 githubapp.com
140.82.112.29                 githubapp.com
140.82.112.30                 githubapp.com
140.82.113.30                 githubapp.com
140.82.114.29                 githubapp.com
140.82.113.5                  api.github.com
185.199.110.133               raw.github.com
185.199.109.133               raw.github.com
185.199.111.133               raw.github.com
185.199.108.133               raw.github.com
140.82.113.3                  gist.github.com
140.82.113.4                  octocaptcha.com
140.82.112.18                 help.github.com
140.82.112.26                 live.github.com
140.82.114.18                 github.community
185.199.108.153               githubstatus.com
185.199.110.153               githubstatus.com
185.199.111.153               githubstatus.com
185.199.109.153               githubstatus.com
185.199.109.153               pages.github.com
185.199.111.153               pages.github.com
185.199.108.153               pages.github.com
185.199.110.153               pages.github.com
140.82.114.17                 status.github.com
140.82.113.14                 uploads.github.com
140.82.113.9                  nodeload.github.com
185.199.109.153               training.github.com
185.199.108.153               training.github.com
185.199.110.153               training.github.com
185.199.111.153               training.github.com
140.82.114.10                 codeload.github.com
185.199.109.154               github.githubassets.com
185.199.111.154               github.githubassets.com
185.199.108.154               github.githubassets.com
185.199.110.154               github.githubassets.com
185.199.108.133               raw.githubusercontent.com
185.199.111.133               raw.githubusercontent.com
185.199.109.133               raw.githubusercontent.com
185.199.110.133               raw.githubusercontent.com
185.199.109.133               gist.githubusercontent.com
185.199.108.133               gist.githubusercontent.com
185.199.110.133               gist.githubusercontent.com
185.199.111.133               gist.githubusercontent.com
185.199.109.133               camo.githubusercontent.com
185.199.111.133               camo.githubusercontent.com
185.199.108.133               camo.githubusercontent.com
185.199.110.133               camo.githubusercontent.com
185.199.110.133               cloud.githubusercontent.com
185.199.108.133               cloud.githubusercontent.com
185.199.109.133               cloud.githubusercontent.com
185.199.111.133               cloud.githubusercontent.com
185.199.111.133               media.githubusercontent.com
185.199.110.133               media.githubusercontent.com
185.199.108.133               media.githubusercontent.com
185.199.109.133               media.githubusercontent.com
3.5.29.113                    github-com.s3.amazonaws.com
16.15.176.244                 github-com.s3.amazonaws.com
3.5.29.149                    github-com.s3.amazonaws.com
54.231.203.209                github-com.s3.amazonaws.com
16.182.41.73                  github-com.s3.amazonaws.com
16.15.199.190                 github-com.s3.amazonaws.com
16.182.96.129                 github-com.s3.amazonaws.com
3.5.28.210                    github-com.s3.amazonaws.com
151.101.129.194               github.global.ssl.fastly.net
151.101.1.194                 github.global.ssl.fastly.net
151.101.193.194               github.global.ssl.fastly.net
151.101.65.194                github.global.ssl.fastly.net
185.199.108.133               desktop.githubusercontent.com
185.199.111.133               desktop.githubusercontent.com
185.199.109.133               desktop.githubusercontent.com
185.199.110.133               desktop.githubusercontent.com
54.231.130.17                 github-cloud.s3.amazonaws.com
3.5.27.134                    github-cloud.s3.amazonaws.com
16.182.105.225                github-cloud.s3.amazonaws.com
16.15.199.120                 github-cloud.s3.amazonaws.com
16.15.207.59                  github-cloud.s3.amazonaws.com
3.5.30.172                    github-cloud.s3.amazonaws.com
52.216.221.57                 github-cloud.s3.amazonaws.com
3.5.19.138                    github-cloud.s3.amazonaws.com
185.199.110.133               avatars.githubusercontent.com
185.199.111.133               avatars.githubusercontent.com
185.199.109.133               avatars.githubusercontent.com
185.199.108.133               avatars.githubusercontent.com
185.199.111.133               favicons.githubusercontent.com
185.199.108.133               favicons.githubusercontent.com
185.199.110.133               favicons.githubusercontent.com
185.199.109.133               favicons.githubusercontent.com
185.199.109.133               avatars0.githubusercontent.com
185.199.111.133               avatars0.githubusercontent.com
185.199.110.133               avatars0.githubusercontent.com
185.199.108.133               avatars0.githubusercontent.com
185.199.110.133               avatars1.githubusercontent.com
185.199.109.133               avatars1.githubusercontent.com
185.199.111.133               avatars1.githubusercontent.com
185.199.108.133               avatars1.githubusercontent.com
185.199.108.133               avatars2.githubusercontent.com
185.199.110.133               avatars2.githubusercontent.com
185.199.111.133               avatars2.githubusercontent.com
185.199.109.133               avatars2.githubusercontent.com
185.199.109.133               avatars3.githubusercontent.com
185.199.110.133               avatars3.githubusercontent.com
185.199.111.133               avatars3.githubusercontent.com
185.199.108.133               avatars3.githubusercontent.com
185.199.108.133               avatars4.githubusercontent.com
185.199.109.133               avatars4.githubusercontent.com
185.199.111.133               avatars4.githubusercontent.com
185.199.110.133               avatars4.githubusercontent.com
185.199.111.133               avatars5.githubusercontent.com
185.199.109.133               avatars5.githubusercontent.com
185.199.108.133               avatars5.githubusercontent.com
185.199.110.133               avatars5.githubusercontent.com
185.199.109.133               avatars6.githubusercontent.com
185.199.108.133               avatars6.githubusercontent.com
185.199.111.133               avatars6.githubusercontent.com
185.199.110.133               avatars6.githubusercontent.com
185.199.110.133               avatars7.githubusercontent.com
185.199.111.133               avatars7.githubusercontent.com
185.199.109.133               avatars7.githubusercontent.com
185.199.108.133               avatars7.githubusercontent.com
185.199.109.133               avatars8.githubusercontent.com
185.199.108.133               avatars8.githubusercontent.com
185.199.110.133               avatars8.githubusercontent.com
185.199.111.133               avatars8.githubusercontent.com
185.199.109.153               customer-stories-feed.github.com
185.199.108.153               customer-stories-feed.github.com
185.199.110.153               customer-stories-feed.github.com
185.199.111.153               customer-stories-feed.github.com
185.199.111.133               user-images.githubusercontent.com
185.199.108.133               user-images.githubusercontent.com
185.199.110.133               user-images.githubusercontent.com
185.199.109.133               user-images.githubusercontent.com
185.199.111.133               repository-images.githubusercontent.com
185.199.109.133               repository-images.githubusercontent.com
185.199.110.133               repository-images.githubusercontent.com
185.199.108.133               repository-images.githubusercontent.com
185.199.108.133               marketplace-screenshots.githubusercontent.com
185.199.111.133               marketplace-screenshots.githubusercontent.com
185.199.109.133               marketplace-screenshots.githubusercontent.com
185.199.110.133               marketplace-screenshots.githubusercontent.com
16.182.100.113                github-production-user-asset-6210df.s3.amazonaws.com
16.182.72.153                 github-production-user-asset-6210df.s3.amazonaws.com
52.217.118.153                github-production-user-asset-6210df.s3.amazonaws.com
52.217.198.1                  github-production-user-asset-6210df.s3.amazonaws.com
52.217.126.169                github-production-user-asset-6210df.s3.amazonaws.com
52.217.141.209                github-production-user-asset-6210df.s3.amazonaws.com
52.217.233.161                github-production-user-asset-6210df.s3.amazonaws.com
16.15.180.87                  github-production-user-asset-6210df.s3.amazonaws.com
16.15.207.106                 github-production-release-asset-2e65be.s3.amazonaws.com
16.15.199.148                 github-production-release-asset-2e65be.s3.amazonaws.com
16.182.99.201                 github-production-release-asset-2e65be.s3.amazonaws.com
16.182.107.233                github-production-release-asset-2e65be.s3.amazonaws.com
54.231.169.209                github-production-release-asset-2e65be.s3.amazonaws.com
16.182.69.73                  github-production-release-asset-2e65be.s3.amazonaws.com
16.182.99.225                 github-production-release-asset-2e65be.s3.amazonaws.com
54.231.140.233                github-production-release-asset-2e65be.s3.amazonaws.com
52.217.122.209                github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.219.167                 github-production-repository-file-5c1aeb.s3.amazonaws.com
54.231.203.193                github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.134.209                github-production-repository-file-5c1aeb.s3.amazonaws.com
52.216.211.41                 github-production-repository-file-5c1aeb.s3.amazonaws.com
54.231.226.177                github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.185.60                  github-production-repository-file-5c1aeb.s3.amazonaws.com
54.231.170.161                github-production-repository-file-5c1aeb.s3.amazonaws.com
```