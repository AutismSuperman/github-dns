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


# update 2024-10-07 01:11:50
```
140.82.112.4                  github.com
192.0.66.2                    github.blog
140.82.112.29                 githubapp.com
140.82.112.30                 githubapp.com
140.82.114.29                 githubapp.com
140.82.113.29                 githubapp.com
140.82.113.30                 githubapp.com
140.82.114.30                 githubapp.com
140.82.113.5                  api.github.com
185.199.109.133               raw.github.com
185.199.110.133               raw.github.com
185.199.108.133               raw.github.com
185.199.111.133               raw.github.com
140.82.112.3                  gist.github.com
140.82.112.4                  octocaptcha.com
140.82.112.17                 help.github.com
140.82.114.26                 live.github.com
140.82.112.17                 github.community
185.199.111.153               githubstatus.com
185.199.110.153               githubstatus.com
185.199.109.153               githubstatus.com
185.199.108.153               githubstatus.com
185.199.111.153               pages.github.com
185.199.110.153               pages.github.com
185.199.109.153               pages.github.com
185.199.108.153               pages.github.com
140.82.114.18                 status.github.com
140.82.113.13                 uploads.github.com
140.82.113.9                  nodeload.github.com
185.199.109.153               training.github.com
185.199.111.153               training.github.com
185.199.108.153               training.github.com
185.199.110.153               training.github.com
140.82.114.10                 codeload.github.com
185.199.110.153               assets-cdn.github.com
185.199.109.153               assets-cdn.github.com
185.199.111.153               assets-cdn.github.com
185.199.108.153               assets-cdn.github.com
185.199.108.154               github.githubassets.com
185.199.109.154               github.githubassets.com
185.199.110.154               github.githubassets.com
185.199.111.154               github.githubassets.com
185.199.109.153               documentcloud.github.com
185.199.108.153               documentcloud.github.com
185.199.110.153               documentcloud.github.com
185.199.111.153               documentcloud.github.com
185.199.110.133               raw.githubusercontent.com
185.199.108.133               raw.githubusercontent.com
185.199.109.133               raw.githubusercontent.com
185.199.111.133               raw.githubusercontent.com
185.199.109.133               gist.githubusercontent.com
185.199.110.133               gist.githubusercontent.com
185.199.111.133               gist.githubusercontent.com
185.199.108.133               gist.githubusercontent.com
185.199.110.133               camo.githubusercontent.com
185.199.109.133               camo.githubusercontent.com
185.199.111.133               camo.githubusercontent.com
185.199.108.133               camo.githubusercontent.com
185.199.109.133               cloud.githubusercontent.com
185.199.111.133               cloud.githubusercontent.com
185.199.108.133               cloud.githubusercontent.com
185.199.110.133               cloud.githubusercontent.com
185.199.110.133               media.githubusercontent.com
185.199.109.133               media.githubusercontent.com
185.199.108.133               media.githubusercontent.com
185.199.111.133               media.githubusercontent.com
52.217.17.204                 github-com.s3.amazonaws.com
3.5.25.62                     github-com.s3.amazonaws.com
54.231.196.161                github-com.s3.amazonaws.com
52.217.193.233                github-com.s3.amazonaws.com
54.231.166.1                  github-com.s3.amazonaws.com
16.182.65.17                  github-com.s3.amazonaws.com
52.216.244.12                 github-com.s3.amazonaws.com
3.5.16.18                     github-com.s3.amazonaws.com
151.101.1.194                 github.global.ssl.fastly.net
151.101.193.194               github.global.ssl.fastly.net
151.101.65.194                github.global.ssl.fastly.net
151.101.129.194               github.global.ssl.fastly.net
185.199.109.133               desktop.githubusercontent.com
185.199.108.133               desktop.githubusercontent.com
185.199.111.133               desktop.githubusercontent.com
185.199.110.133               desktop.githubusercontent.com
3.5.27.232                    github-cloud.s3.amazonaws.com
52.217.90.20                  github-cloud.s3.amazonaws.com
52.217.234.249                github-cloud.s3.amazonaws.com
52.216.137.180                github-cloud.s3.amazonaws.com
52.216.62.81                  github-cloud.s3.amazonaws.com
3.5.20.70                     github-cloud.s3.amazonaws.com
52.216.147.67                 github-cloud.s3.amazonaws.com
52.217.114.137                github-cloud.s3.amazonaws.com
185.199.108.133               avatars.githubusercontent.com
185.199.109.133               avatars.githubusercontent.com
185.199.110.133               avatars.githubusercontent.com
185.199.111.133               avatars.githubusercontent.com
185.199.108.133               favicons.githubusercontent.com
185.199.110.133               favicons.githubusercontent.com
185.199.109.133               favicons.githubusercontent.com
185.199.111.133               favicons.githubusercontent.com
185.199.110.133               avatars0.githubusercontent.com
185.199.111.133               avatars0.githubusercontent.com
185.199.108.133               avatars0.githubusercontent.com
185.199.109.133               avatars0.githubusercontent.com
185.199.108.133               avatars1.githubusercontent.com
185.199.110.133               avatars1.githubusercontent.com
185.199.111.133               avatars1.githubusercontent.com
185.199.109.133               avatars1.githubusercontent.com
185.199.108.133               avatars2.githubusercontent.com
185.199.111.133               avatars2.githubusercontent.com
185.199.109.133               avatars2.githubusercontent.com
185.199.110.133               avatars2.githubusercontent.com
185.199.108.133               avatars3.githubusercontent.com
185.199.109.133               avatars3.githubusercontent.com
185.199.110.133               avatars3.githubusercontent.com
185.199.111.133               avatars3.githubusercontent.com
185.199.110.133               avatars4.githubusercontent.com
185.199.109.133               avatars4.githubusercontent.com
185.199.108.133               avatars4.githubusercontent.com
185.199.111.133               avatars4.githubusercontent.com
185.199.109.133               avatars5.githubusercontent.com
185.199.111.133               avatars5.githubusercontent.com
185.199.110.133               avatars5.githubusercontent.com
185.199.108.133               avatars5.githubusercontent.com
185.199.109.133               avatars6.githubusercontent.com
185.199.111.133               avatars6.githubusercontent.com
185.199.108.133               avatars6.githubusercontent.com
185.199.110.133               avatars6.githubusercontent.com
185.199.111.133               avatars7.githubusercontent.com
185.199.108.133               avatars7.githubusercontent.com
185.199.109.133               avatars7.githubusercontent.com
185.199.110.133               avatars7.githubusercontent.com
185.199.108.133               avatars8.githubusercontent.com
185.199.110.133               avatars8.githubusercontent.com
185.199.109.133               avatars8.githubusercontent.com
185.199.111.133               avatars8.githubusercontent.com
185.199.108.153               customer-stories-feed.github.com
185.199.111.153               customer-stories-feed.github.com
185.199.110.153               customer-stories-feed.github.com
185.199.109.153               customer-stories-feed.github.com
185.199.108.133               user-images.githubusercontent.com
185.199.110.133               user-images.githubusercontent.com
185.199.109.133               user-images.githubusercontent.com
185.199.111.133               user-images.githubusercontent.com
185.199.110.133               repository-images.githubusercontent.com
185.199.109.133               repository-images.githubusercontent.com
185.199.108.133               repository-images.githubusercontent.com
185.199.111.133               repository-images.githubusercontent.com
185.199.108.133               marketplace-screenshots.githubusercontent.com
185.199.111.133               marketplace-screenshots.githubusercontent.com
185.199.110.133               marketplace-screenshots.githubusercontent.com
185.199.109.133               marketplace-screenshots.githubusercontent.com
3.5.0.160                     github-production-user-asset-6210df.s3.amazonaws.com
52.217.137.1                  github-production-user-asset-6210df.s3.amazonaws.com
3.5.25.195                    github-production-user-asset-6210df.s3.amazonaws.com
52.217.37.20                  github-production-user-asset-6210df.s3.amazonaws.com
3.5.0.227                     github-production-user-asset-6210df.s3.amazonaws.com
3.5.28.98                     github-production-user-asset-6210df.s3.amazonaws.com
54.231.132.57                 github-production-user-asset-6210df.s3.amazonaws.com
54.231.226.81                 github-production-user-asset-6210df.s3.amazonaws.com
52.217.112.33                 github-production-release-asset-2e65be.s3.amazonaws.com
3.5.2.16                      github-production-release-asset-2e65be.s3.amazonaws.com
16.15.193.36                  github-production-release-asset-2e65be.s3.amazonaws.com
52.217.224.169                github-production-release-asset-2e65be.s3.amazonaws.com
54.231.203.233                github-production-release-asset-2e65be.s3.amazonaws.com
52.216.50.193                 github-production-release-asset-2e65be.s3.amazonaws.com
3.5.28.220                    github-production-release-asset-2e65be.s3.amazonaws.com
52.217.113.49                 github-production-release-asset-2e65be.s3.amazonaws.com
3.5.7.174                     github-production-repository-file-5c1aeb.s3.amazonaws.com
52.216.32.17                  github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.28.58                     github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.16.103                    github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.29.19                     github-production-repository-file-5c1aeb.s3.amazonaws.com
54.231.132.177                github-production-repository-file-5c1aeb.s3.amazonaws.com
52.216.210.49                 github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.25.171                    github-production-repository-file-5c1aeb.s3.amazonaws.com
```