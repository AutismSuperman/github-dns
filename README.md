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


# update 2025-01-20 12:29:38
```
140.82.113.4                  github.com
192.0.66.2                    github.blog
140.82.112.30                 githubapp.com
140.82.113.30                 githubapp.com
140.82.114.29                 githubapp.com
140.82.114.30                 githubapp.com
140.82.112.29                 githubapp.com
140.82.113.29                 githubapp.com
140.82.113.6                  api.github.com
185.199.110.133               raw.github.com
185.199.108.133               raw.github.com
185.199.111.133               raw.github.com
185.199.109.133               raw.github.com
140.82.114.3                  gist.github.com
140.82.113.3                  octocaptcha.com
140.82.114.18                 help.github.com
140.82.114.26                 live.github.com
140.82.113.17                 github.community
185.199.109.153               githubstatus.com
185.199.108.153               githubstatus.com
185.199.110.153               githubstatus.com
185.199.111.153               githubstatus.com
185.199.109.153               pages.github.com
185.199.110.153               pages.github.com
185.199.108.153               pages.github.com
185.199.111.153               pages.github.com
140.82.114.17                 status.github.com
140.82.113.14                 uploads.github.com
140.82.113.9                  nodeload.github.com
185.199.110.153               training.github.com
185.199.109.153               training.github.com
185.199.111.153               training.github.com
185.199.108.153               training.github.com
140.82.114.10                 codeload.github.com
185.199.108.154               github.githubassets.com
185.199.110.154               github.githubassets.com
185.199.109.154               github.githubassets.com
185.199.111.154               github.githubassets.com
185.199.111.133               raw.githubusercontent.com
185.199.110.133               raw.githubusercontent.com
185.199.108.133               raw.githubusercontent.com
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
185.199.109.133               cloud.githubusercontent.com
185.199.108.133               cloud.githubusercontent.com
185.199.109.133               media.githubusercontent.com
185.199.108.133               media.githubusercontent.com
185.199.111.133               media.githubusercontent.com
185.199.110.133               media.githubusercontent.com
16.15.185.231                 github-com.s3.amazonaws.com
54.231.196.57                 github-com.s3.amazonaws.com
52.217.70.12                  github-com.s3.amazonaws.com
52.216.170.43                 github-com.s3.amazonaws.com
52.217.102.172                github-com.s3.amazonaws.com
3.5.27.51                     github-com.s3.amazonaws.com
3.5.16.151                    github-com.s3.amazonaws.com
3.5.2.201                     github-com.s3.amazonaws.com
151.101.193.194               github.global.ssl.fastly.net
151.101.129.194               github.global.ssl.fastly.net
151.101.65.194                github.global.ssl.fastly.net
151.101.1.194                 github.global.ssl.fastly.net
185.199.109.133               desktop.githubusercontent.com
185.199.110.133               desktop.githubusercontent.com
185.199.111.133               desktop.githubusercontent.com
185.199.108.133               desktop.githubusercontent.com
16.15.192.97                  github-cloud.s3.amazonaws.com
3.5.31.106                    github-cloud.s3.amazonaws.com
52.217.232.193                github-cloud.s3.amazonaws.com
3.5.8.185                     github-cloud.s3.amazonaws.com
3.5.29.77                     github-cloud.s3.amazonaws.com
52.216.42.81                  github-cloud.s3.amazonaws.com
3.5.27.191                    github-cloud.s3.amazonaws.com
3.5.27.112                    github-cloud.s3.amazonaws.com
185.199.109.133               avatars.githubusercontent.com
185.199.111.133               avatars.githubusercontent.com
185.199.110.133               avatars.githubusercontent.com
185.199.108.133               avatars.githubusercontent.com
185.199.110.133               favicons.githubusercontent.com
185.199.109.133               favicons.githubusercontent.com
185.199.108.133               favicons.githubusercontent.com
185.199.111.133               favicons.githubusercontent.com
185.199.111.133               avatars0.githubusercontent.com
185.199.108.133               avatars0.githubusercontent.com
185.199.110.133               avatars0.githubusercontent.com
185.199.109.133               avatars0.githubusercontent.com
185.199.111.133               avatars1.githubusercontent.com
185.199.110.133               avatars1.githubusercontent.com
185.199.108.133               avatars1.githubusercontent.com
185.199.109.133               avatars1.githubusercontent.com
185.199.108.133               avatars2.githubusercontent.com
185.199.110.133               avatars2.githubusercontent.com
185.199.111.133               avatars2.githubusercontent.com
185.199.109.133               avatars2.githubusercontent.com
185.199.108.133               avatars3.githubusercontent.com
185.199.109.133               avatars3.githubusercontent.com
185.199.111.133               avatars3.githubusercontent.com
185.199.110.133               avatars3.githubusercontent.com
185.199.109.133               avatars4.githubusercontent.com
185.199.108.133               avatars4.githubusercontent.com
185.199.110.133               avatars4.githubusercontent.com
185.199.111.133               avatars4.githubusercontent.com
185.199.108.133               avatars5.githubusercontent.com
185.199.111.133               avatars5.githubusercontent.com
185.199.110.133               avatars5.githubusercontent.com
185.199.109.133               avatars5.githubusercontent.com
185.199.108.133               avatars6.githubusercontent.com
185.199.109.133               avatars6.githubusercontent.com
185.199.110.133               avatars6.githubusercontent.com
185.199.111.133               avatars6.githubusercontent.com
185.199.108.133               avatars7.githubusercontent.com
185.199.109.133               avatars7.githubusercontent.com
185.199.111.133               avatars7.githubusercontent.com
185.199.110.133               avatars7.githubusercontent.com
185.199.111.133               avatars8.githubusercontent.com
185.199.109.133               avatars8.githubusercontent.com
185.199.108.133               avatars8.githubusercontent.com
185.199.110.133               avatars8.githubusercontent.com
185.199.111.153               customer-stories-feed.github.com
185.199.108.153               customer-stories-feed.github.com
185.199.110.153               customer-stories-feed.github.com
185.199.109.153               customer-stories-feed.github.com
185.199.108.133               user-images.githubusercontent.com
185.199.109.133               user-images.githubusercontent.com
185.199.110.133               user-images.githubusercontent.com
185.199.111.133               user-images.githubusercontent.com
185.199.111.133               repository-images.githubusercontent.com
185.199.110.133               repository-images.githubusercontent.com
185.199.108.133               repository-images.githubusercontent.com
185.199.109.133               repository-images.githubusercontent.com
185.199.109.133               marketplace-screenshots.githubusercontent.com
185.199.111.133               marketplace-screenshots.githubusercontent.com
185.199.110.133               marketplace-screenshots.githubusercontent.com
185.199.108.133               marketplace-screenshots.githubusercontent.com
3.5.11.209                    github-production-user-asset-6210df.s3.amazonaws.com
16.182.64.41                  github-production-user-asset-6210df.s3.amazonaws.com
54.231.202.137                github-production-user-asset-6210df.s3.amazonaws.com
3.5.27.104                    github-production-user-asset-6210df.s3.amazonaws.com
3.5.29.52                     github-production-user-asset-6210df.s3.amazonaws.com
3.5.28.116                    github-production-user-asset-6210df.s3.amazonaws.com
3.5.30.60                     github-production-user-asset-6210df.s3.amazonaws.com
52.217.64.20                  github-production-user-asset-6210df.s3.amazonaws.com
52.216.109.131                github-production-release-asset-2e65be.s3.amazonaws.com
52.217.200.201                github-production-release-asset-2e65be.s3.amazonaws.com
16.15.216.235                 github-production-release-asset-2e65be.s3.amazonaws.com
16.182.99.241                 github-production-release-asset-2e65be.s3.amazonaws.com
52.216.35.225                 github-production-release-asset-2e65be.s3.amazonaws.com
52.217.114.105                github-production-release-asset-2e65be.s3.amazonaws.com
52.217.13.188                 github-production-release-asset-2e65be.s3.amazonaws.com
52.216.49.249                 github-production-release-asset-2e65be.s3.amazonaws.com
3.5.2.216                     github-production-repository-file-5c1aeb.s3.amazonaws.com
16.182.67.105                 github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.36.164                 github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.29.152                    github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.177.158                 github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.27.84                     github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.112.153                github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.29.53                     github-production-repository-file-5c1aeb.s3.amazonaws.com
```