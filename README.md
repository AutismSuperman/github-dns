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


# update 2026-03-30 02:13:41
```
140.82.116.3                  github.com
192.0.66.2                    github.blog
140.82.114.30                 githubapp.com
140.82.114.29                 githubapp.com
140.82.112.29                 githubapp.com
140.82.113.29                 githubapp.com
140.82.113.30                 githubapp.com
140.82.112.30                 githubapp.com
140.82.116.6                  api.github.com
185.199.109.133               raw.github.com
185.199.111.133               raw.github.com
185.199.108.133               raw.github.com
185.199.110.133               raw.github.com
140.82.116.4                  gist.github.com
140.82.116.4                  octocaptcha.com
140.82.113.17                 help.github.com
140.82.112.26                 live.github.com
140.82.112.17                 github.community
185.199.109.153               githubstatus.com
185.199.108.153               githubstatus.com
185.199.110.153               githubstatus.com
185.199.111.153               githubstatus.com
185.199.110.153               pages.github.com
185.199.111.153               pages.github.com
185.199.108.153               pages.github.com
185.199.109.153               pages.github.com
140.82.112.17                 status.github.com
140.82.116.14                 uploads.github.com
140.82.116.9                  nodeload.github.com
185.199.108.153               training.github.com
185.199.110.153               training.github.com
185.199.109.153               training.github.com
185.199.111.153               training.github.com
140.82.116.9                  codeload.github.com
185.199.109.154               github.githubassets.com
185.199.108.154               github.githubassets.com
185.199.111.154               github.githubassets.com
185.199.110.154               github.githubassets.com
185.199.108.133               raw.githubusercontent.com
185.199.110.133               raw.githubusercontent.com
185.199.109.133               raw.githubusercontent.com
185.199.111.133               raw.githubusercontent.com
185.199.109.133               gist.githubusercontent.com
185.199.110.133               gist.githubusercontent.com
185.199.108.133               gist.githubusercontent.com
185.199.111.133               gist.githubusercontent.com
185.199.110.133               camo.githubusercontent.com
185.199.111.133               camo.githubusercontent.com
185.199.109.133               camo.githubusercontent.com
185.199.108.133               camo.githubusercontent.com
185.199.110.133               cloud.githubusercontent.com
185.199.109.133               cloud.githubusercontent.com
185.199.108.133               cloud.githubusercontent.com
185.199.111.133               cloud.githubusercontent.com
185.199.108.133               media.githubusercontent.com
185.199.111.133               media.githubusercontent.com
185.199.110.133               media.githubusercontent.com
185.199.109.133               media.githubusercontent.com
3.5.28.116                    github-com.s3.amazonaws.com
52.217.163.49                 github-com.s3.amazonaws.com
52.216.38.201                 github-com.s3.amazonaws.com
16.182.33.217                 github-com.s3.amazonaws.com
3.5.16.126                    github-com.s3.amazonaws.com
16.15.183.29                  github-com.s3.amazonaws.com
16.182.32.137                 github-com.s3.amazonaws.com
3.5.30.172                    github-com.s3.amazonaws.com
151.101.65.194                github.global.ssl.fastly.net
151.101.1.194                 github.global.ssl.fastly.net
151.101.193.194               github.global.ssl.fastly.net
151.101.129.194               github.global.ssl.fastly.net
185.199.110.133               desktop.githubusercontent.com
185.199.109.133               desktop.githubusercontent.com
185.199.111.133               desktop.githubusercontent.com
185.199.108.133               desktop.githubusercontent.com
54.231.170.17                 github-cloud.s3.amazonaws.com
16.15.223.170                 github-cloud.s3.amazonaws.com
16.15.229.102                 github-cloud.s3.amazonaws.com
52.217.232.33                 github-cloud.s3.amazonaws.com
3.5.27.60                     github-cloud.s3.amazonaws.com
3.5.3.137                     github-cloud.s3.amazonaws.com
16.15.194.29                  github-cloud.s3.amazonaws.com
16.15.191.255                 github-cloud.s3.amazonaws.com
185.199.110.133               avatars.githubusercontent.com
185.199.108.133               avatars.githubusercontent.com
185.199.109.133               avatars.githubusercontent.com
185.199.111.133               avatars.githubusercontent.com
185.199.110.133               favicons.githubusercontent.com
185.199.109.133               favicons.githubusercontent.com
185.199.108.133               favicons.githubusercontent.com
185.199.111.133               favicons.githubusercontent.com
185.199.109.133               avatars0.githubusercontent.com
185.199.110.133               avatars0.githubusercontent.com
185.199.111.133               avatars0.githubusercontent.com
185.199.108.133               avatars0.githubusercontent.com
185.199.108.133               avatars1.githubusercontent.com
185.199.110.133               avatars1.githubusercontent.com
185.199.109.133               avatars1.githubusercontent.com
185.199.111.133               avatars1.githubusercontent.com
185.199.111.133               avatars2.githubusercontent.com
185.199.110.133               avatars2.githubusercontent.com
185.199.108.133               avatars2.githubusercontent.com
185.199.109.133               avatars2.githubusercontent.com
185.199.109.133               avatars3.githubusercontent.com
185.199.110.133               avatars3.githubusercontent.com
185.199.108.133               avatars3.githubusercontent.com
185.199.111.133               avatars3.githubusercontent.com
185.199.110.133               avatars4.githubusercontent.com
185.199.111.133               avatars4.githubusercontent.com
185.199.108.133               avatars4.githubusercontent.com
185.199.109.133               avatars4.githubusercontent.com
185.199.108.133               avatars5.githubusercontent.com
185.199.111.133               avatars5.githubusercontent.com
185.199.109.133               avatars5.githubusercontent.com
185.199.110.133               avatars5.githubusercontent.com
185.199.108.133               avatars6.githubusercontent.com
185.199.111.133               avatars6.githubusercontent.com
185.199.110.133               avatars6.githubusercontent.com
185.199.109.133               avatars6.githubusercontent.com
185.199.111.133               avatars7.githubusercontent.com
185.199.108.133               avatars7.githubusercontent.com
185.199.109.133               avatars7.githubusercontent.com
185.199.110.133               avatars7.githubusercontent.com
185.199.109.133               avatars8.githubusercontent.com
185.199.110.133               avatars8.githubusercontent.com
185.199.111.133               avatars8.githubusercontent.com
185.199.108.133               avatars8.githubusercontent.com
185.199.110.153               customer-stories-feed.github.com
185.199.108.153               customer-stories-feed.github.com
185.199.109.153               customer-stories-feed.github.com
185.199.111.153               customer-stories-feed.github.com
185.199.111.133               user-images.githubusercontent.com
185.199.110.133               user-images.githubusercontent.com
185.199.108.133               user-images.githubusercontent.com
185.199.109.133               user-images.githubusercontent.com
185.199.109.133               repository-images.githubusercontent.com
185.199.108.133               repository-images.githubusercontent.com
185.199.110.133               repository-images.githubusercontent.com
185.199.111.133               repository-images.githubusercontent.com
185.199.111.133               marketplace-screenshots.githubusercontent.com
185.199.109.133               marketplace-screenshots.githubusercontent.com
185.199.108.133               marketplace-screenshots.githubusercontent.com
185.199.110.133               marketplace-screenshots.githubusercontent.com
16.15.183.207                 github-production-user-asset-6210df.s3.amazonaws.com
16.15.183.79                  github-production-user-asset-6210df.s3.amazonaws.com
16.15.178.104                 github-production-user-asset-6210df.s3.amazonaws.com
16.182.74.161                 github-production-user-asset-6210df.s3.amazonaws.com
52.217.132.121                github-production-user-asset-6210df.s3.amazonaws.com
16.15.207.236                 github-production-user-asset-6210df.s3.amazonaws.com
52.216.51.145                 github-production-user-asset-6210df.s3.amazonaws.com
52.217.74.225                 github-production-user-asset-6210df.s3.amazonaws.com
54.231.171.153                github-production-release-asset-2e65be.s3.amazonaws.com
54.231.233.57                 github-production-release-asset-2e65be.s3.amazonaws.com
3.5.28.127                    github-production-release-asset-2e65be.s3.amazonaws.com
52.216.43.161                 github-production-release-asset-2e65be.s3.amazonaws.com
52.217.166.137                github-production-release-asset-2e65be.s3.amazonaws.com
3.5.29.57                     github-production-release-asset-2e65be.s3.amazonaws.com
16.15.228.240                 github-production-release-asset-2e65be.s3.amazonaws.com
16.15.183.87                  github-production-release-asset-2e65be.s3.amazonaws.com
16.15.194.29                  github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.232.33                 github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.229.102                 github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.27.60                     github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.191.255                 github-production-repository-file-5c1aeb.s3.amazonaws.com
54.231.170.17                 github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.3.137                     github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.223.170                 github-production-repository-file-5c1aeb.s3.amazonaws.com
```