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


# update 2024-06-03 12:25:23
```
140.82.114.4                  github.com
192.0.66.2                    github.blog
140.82.112.29                 githubapp.com
140.82.112.30                 githubapp.com
140.82.113.29                 githubapp.com
140.82.113.30                 githubapp.com
140.82.114.29                 githubapp.com
140.82.114.30                 githubapp.com
140.82.114.6                  api.github.com
185.199.110.133               raw.github.com
185.199.111.133               raw.github.com
185.199.108.133               raw.github.com
185.199.109.133               raw.github.com
140.82.113.3                  gist.github.com
140.82.113.3                  octocaptcha.com
140.82.112.17                 help.github.com
140.82.112.25                 live.github.com
140.82.112.17                 github.community
185.199.108.153               githubstatus.com
185.199.109.153               githubstatus.com
185.199.110.153               githubstatus.com
185.199.111.153               githubstatus.com
185.199.108.153               pages.github.com
185.199.110.153               pages.github.com
185.199.109.153               pages.github.com
185.199.111.153               pages.github.com
140.82.112.17                 status.github.com
140.82.113.13                 uploads.github.com
140.82.114.10                 nodeload.github.com
185.199.108.153               training.github.com
185.199.109.153               training.github.com
185.199.110.153               training.github.com
185.199.111.153               training.github.com
140.82.114.9                  codeload.github.com
185.199.108.153               assets-cdn.github.com
185.199.109.153               assets-cdn.github.com
185.199.110.153               assets-cdn.github.com
185.199.111.153               assets-cdn.github.com
185.199.111.154               github.githubassets.com
185.199.109.154               github.githubassets.com
185.199.110.154               github.githubassets.com
185.199.108.154               github.githubassets.com
185.199.108.153               documentcloud.github.com
185.199.109.153               documentcloud.github.com
185.199.110.153               documentcloud.github.com
185.199.111.153               documentcloud.github.com
185.199.108.133               raw.githubusercontent.com
185.199.109.133               raw.githubusercontent.com
185.199.110.133               raw.githubusercontent.com
185.199.111.133               raw.githubusercontent.com
185.199.108.133               gist.githubusercontent.com
185.199.109.133               gist.githubusercontent.com
185.199.110.133               gist.githubusercontent.com
185.199.111.133               gist.githubusercontent.com
185.199.110.133               camo.githubusercontent.com
185.199.111.133               camo.githubusercontent.com
185.199.108.133               camo.githubusercontent.com
185.199.109.133               camo.githubusercontent.com
185.199.108.133               cloud.githubusercontent.com
185.199.109.133               cloud.githubusercontent.com
185.199.110.133               cloud.githubusercontent.com
185.199.111.133               cloud.githubusercontent.com
185.199.108.133               media.githubusercontent.com
185.199.109.133               media.githubusercontent.com
185.199.110.133               media.githubusercontent.com
185.199.111.133               media.githubusercontent.com
16.182.105.89                 github-com.s3.amazonaws.com
52.217.41.132                 github-com.s3.amazonaws.com
3.5.29.85                     github-com.s3.amazonaws.com
54.231.163.177                github-com.s3.amazonaws.com
52.217.123.49                 github-com.s3.amazonaws.com
52.216.216.97                 github-com.s3.amazonaws.com
3.5.22.165                    github-com.s3.amazonaws.com
54.231.164.193                github-com.s3.amazonaws.com
151.101.1.194                 github.global.ssl.fastly.net
151.101.65.194                github.global.ssl.fastly.net
151.101.129.194               github.global.ssl.fastly.net
151.101.193.194               github.global.ssl.fastly.net
185.199.108.133               desktop.githubusercontent.com
185.199.109.133               desktop.githubusercontent.com
185.199.110.133               desktop.githubusercontent.com
185.199.111.133               desktop.githubusercontent.com
54.231.194.113                github-cloud.s3.amazonaws.com
3.5.25.21                     github-cloud.s3.amazonaws.com
52.216.145.35                 github-cloud.s3.amazonaws.com
52.217.199.193                github-cloud.s3.amazonaws.com
52.217.113.33                 github-cloud.s3.amazonaws.com
52.216.113.139                github-cloud.s3.amazonaws.com
54.231.163.57                 github-cloud.s3.amazonaws.com
52.217.47.60                  github-cloud.s3.amazonaws.com
185.199.109.133               avatars.githubusercontent.com
185.199.111.133               avatars.githubusercontent.com
185.199.108.133               avatars.githubusercontent.com
185.199.110.133               avatars.githubusercontent.com
185.199.108.133               favicons.githubusercontent.com
185.199.109.133               favicons.githubusercontent.com
185.199.110.133               favicons.githubusercontent.com
185.199.111.133               favicons.githubusercontent.com
185.199.111.133               avatars0.githubusercontent.com
185.199.109.133               avatars0.githubusercontent.com
185.199.110.133               avatars0.githubusercontent.com
185.199.108.133               avatars0.githubusercontent.com
185.199.108.133               avatars1.githubusercontent.com
185.199.109.133               avatars1.githubusercontent.com
185.199.110.133               avatars1.githubusercontent.com
185.199.111.133               avatars1.githubusercontent.com
185.199.108.133               avatars2.githubusercontent.com
185.199.109.133               avatars2.githubusercontent.com
185.199.110.133               avatars2.githubusercontent.com
185.199.111.133               avatars2.githubusercontent.com
185.199.110.133               avatars3.githubusercontent.com
185.199.108.133               avatars3.githubusercontent.com
185.199.111.133               avatars3.githubusercontent.com
185.199.109.133               avatars3.githubusercontent.com
185.199.108.133               avatars4.githubusercontent.com
185.199.109.133               avatars4.githubusercontent.com
185.199.110.133               avatars4.githubusercontent.com
185.199.111.133               avatars4.githubusercontent.com
185.199.108.133               avatars5.githubusercontent.com
185.199.109.133               avatars5.githubusercontent.com
185.199.110.133               avatars5.githubusercontent.com
185.199.111.133               avatars5.githubusercontent.com
185.199.108.133               avatars6.githubusercontent.com
185.199.109.133               avatars6.githubusercontent.com
185.199.110.133               avatars6.githubusercontent.com
185.199.111.133               avatars6.githubusercontent.com
185.199.108.133               avatars7.githubusercontent.com
185.199.109.133               avatars7.githubusercontent.com
185.199.110.133               avatars7.githubusercontent.com
185.199.111.133               avatars7.githubusercontent.com
185.199.108.133               avatars8.githubusercontent.com
185.199.110.133               avatars8.githubusercontent.com
185.199.109.133               avatars8.githubusercontent.com
185.199.111.133               avatars8.githubusercontent.com
185.199.111.153               customer-stories-feed.github.com
185.199.108.153               customer-stories-feed.github.com
185.199.109.153               customer-stories-feed.github.com
185.199.110.153               customer-stories-feed.github.com
185.199.108.133               user-images.githubusercontent.com
185.199.109.133               user-images.githubusercontent.com
185.199.110.133               user-images.githubusercontent.com
185.199.111.133               user-images.githubusercontent.com
185.199.110.133               repository-images.githubusercontent.com
185.199.108.133               repository-images.githubusercontent.com
185.199.109.133               repository-images.githubusercontent.com
185.199.111.133               repository-images.githubusercontent.com
185.199.109.133               marketplace-screenshots.githubusercontent.com
185.199.108.133               marketplace-screenshots.githubusercontent.com
185.199.110.133               marketplace-screenshots.githubusercontent.com
185.199.111.133               marketplace-screenshots.githubusercontent.com
54.231.233.17                 github-production-user-asset-6210df.s3.amazonaws.com
54.231.227.121                github-production-user-asset-6210df.s3.amazonaws.com
3.5.2.219                     github-production-user-asset-6210df.s3.amazonaws.com
54.231.193.25                 github-production-user-asset-6210df.s3.amazonaws.com
54.231.128.41                 github-production-user-asset-6210df.s3.amazonaws.com
52.217.117.153                github-production-user-asset-6210df.s3.amazonaws.com
3.5.29.212                    github-production-user-asset-6210df.s3.amazonaws.com
3.5.29.240                    github-production-user-asset-6210df.s3.amazonaws.com
52.216.249.252                github-production-release-asset-2e65be.s3.amazonaws.com
52.216.39.25                  github-production-release-asset-2e65be.s3.amazonaws.com
54.231.236.1                  github-production-release-asset-2e65be.s3.amazonaws.com
52.217.72.116                 github-production-release-asset-2e65be.s3.amazonaws.com
52.216.88.83                  github-production-release-asset-2e65be.s3.amazonaws.com
3.5.28.21                     github-production-release-asset-2e65be.s3.amazonaws.com
52.216.215.81                 github-production-release-asset-2e65be.s3.amazonaws.com
52.216.169.211                github-production-release-asset-2e65be.s3.amazonaws.com
3.5.25.179                    github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.29.148                    github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.80.52                  github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.226.89                 github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.66.180                 github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.10.168                    github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.196.225                github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.162.33                 github-production-repository-file-5c1aeb.s3.amazonaws.com
```