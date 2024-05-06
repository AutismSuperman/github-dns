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


# update 2024-05-06 00:56:42
```
140.82.114.4                  github.com
192.0.66.2                    github.blog
140.82.112.29                 githubapp.com
140.82.112.30                 githubapp.com
140.82.113.29                 githubapp.com
140.82.113.30                 githubapp.com
140.82.114.29                 githubapp.com
140.82.114.30                 githubapp.com
140.82.113.5                  api.github.com
185.199.111.133               raw.github.com
185.199.109.133               raw.github.com
185.199.110.133               raw.github.com
185.199.108.133               raw.github.com
140.82.114.4                  gist.github.com
140.82.114.4                  octocaptcha.com
140.82.114.17                 help.github.com
140.82.113.25                 live.github.com
140.82.112.18                 github.community
185.199.108.153               githubstatus.com
185.199.109.153               githubstatus.com
185.199.110.153               githubstatus.com
185.199.111.153               githubstatus.com
185.199.110.153               pages.github.com
185.199.108.153               pages.github.com
185.199.109.153               pages.github.com
185.199.111.153               pages.github.com
140.82.112.17                 status.github.com
140.82.113.13                 uploads.github.com
140.82.113.9                  nodeload.github.com
185.199.110.153               training.github.com
185.199.109.153               training.github.com
185.199.108.153               training.github.com
185.199.111.153               training.github.com
140.82.112.10                 codeload.github.com
185.199.108.153               assets-cdn.github.com
185.199.109.153               assets-cdn.github.com
185.199.110.153               assets-cdn.github.com
185.199.111.153               assets-cdn.github.com
185.199.111.154               github.githubassets.com
185.199.109.154               github.githubassets.com
185.199.108.154               github.githubassets.com
185.199.110.154               github.githubassets.com
185.199.110.153               documentcloud.github.com
185.199.108.153               documentcloud.github.com
185.199.111.153               documentcloud.github.com
185.199.109.153               documentcloud.github.com
185.199.109.133               raw.githubusercontent.com
185.199.108.133               raw.githubusercontent.com
185.199.110.133               raw.githubusercontent.com
185.199.111.133               raw.githubusercontent.com
185.199.108.133               gist.githubusercontent.com
185.199.110.133               gist.githubusercontent.com
185.199.109.133               gist.githubusercontent.com
185.199.111.133               gist.githubusercontent.com
185.199.108.133               camo.githubusercontent.com
185.199.109.133               camo.githubusercontent.com
185.199.110.133               camo.githubusercontent.com
185.199.111.133               camo.githubusercontent.com
185.199.108.133               cloud.githubusercontent.com
185.199.109.133               cloud.githubusercontent.com
185.199.110.133               cloud.githubusercontent.com
185.199.111.133               cloud.githubusercontent.com
185.199.111.133               media.githubusercontent.com
185.199.109.133               media.githubusercontent.com
185.199.108.133               media.githubusercontent.com
185.199.110.133               media.githubusercontent.com
16.182.39.249                 github-com.s3.amazonaws.com
3.5.29.222                    github-com.s3.amazonaws.com
52.217.118.17                 github-com.s3.amazonaws.com
52.216.24.68                  github-com.s3.amazonaws.com
52.216.133.123                github-com.s3.amazonaws.com
16.182.41.201                 github-com.s3.amazonaws.com
52.216.216.113                github-com.s3.amazonaws.com
16.182.103.25                 github-com.s3.amazonaws.com
151.101.1.194                 github.global.ssl.fastly.net
151.101.65.194                github.global.ssl.fastly.net
151.101.129.194               github.global.ssl.fastly.net
151.101.193.194               github.global.ssl.fastly.net
185.199.111.133               desktop.githubusercontent.com
185.199.109.133               desktop.githubusercontent.com
185.199.108.133               desktop.githubusercontent.com
185.199.110.133               desktop.githubusercontent.com
16.182.39.249                 github-cloud.s3.amazonaws.com
3.5.29.222                    github-cloud.s3.amazonaws.com
52.217.118.17                 github-cloud.s3.amazonaws.com
52.216.24.68                  github-cloud.s3.amazonaws.com
52.216.133.123                github-cloud.s3.amazonaws.com
16.182.41.201                 github-cloud.s3.amazonaws.com
52.216.216.113                github-cloud.s3.amazonaws.com
16.182.103.25                 github-cloud.s3.amazonaws.com
185.199.109.133               avatars.githubusercontent.com
185.199.111.133               avatars.githubusercontent.com
185.199.108.133               avatars.githubusercontent.com
185.199.110.133               avatars.githubusercontent.com
185.199.108.133               favicons.githubusercontent.com
185.199.109.133               favicons.githubusercontent.com
185.199.110.133               favicons.githubusercontent.com
185.199.111.133               favicons.githubusercontent.com
185.199.109.133               avatars0.githubusercontent.com
185.199.108.133               avatars0.githubusercontent.com
185.199.111.133               avatars0.githubusercontent.com
185.199.110.133               avatars0.githubusercontent.com
185.199.108.133               avatars1.githubusercontent.com
185.199.111.133               avatars1.githubusercontent.com
185.199.109.133               avatars1.githubusercontent.com
185.199.110.133               avatars1.githubusercontent.com
185.199.108.133               avatars2.githubusercontent.com
185.199.110.133               avatars2.githubusercontent.com
185.199.109.133               avatars2.githubusercontent.com
185.199.111.133               avatars2.githubusercontent.com
185.199.108.133               avatars3.githubusercontent.com
185.199.109.133               avatars3.githubusercontent.com
185.199.110.133               avatars3.githubusercontent.com
185.199.111.133               avatars3.githubusercontent.com
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
185.199.111.133               avatars8.githubusercontent.com
185.199.109.133               avatars8.githubusercontent.com
185.199.110.133               avatars8.githubusercontent.com
185.199.108.133               avatars8.githubusercontent.com
185.199.108.153               customer-stories-feed.github.com
185.199.110.153               customer-stories-feed.github.com
185.199.109.153               customer-stories-feed.github.com
185.199.111.153               customer-stories-feed.github.com
185.199.108.133               user-images.githubusercontent.com
185.199.109.133               user-images.githubusercontent.com
185.199.110.133               user-images.githubusercontent.com
185.199.111.133               user-images.githubusercontent.com
185.199.108.133               repository-images.githubusercontent.com
185.199.109.133               repository-images.githubusercontent.com
185.199.110.133               repository-images.githubusercontent.com
185.199.111.133               repository-images.githubusercontent.com
185.199.110.133               marketplace-screenshots.githubusercontent.com
185.199.109.133               marketplace-screenshots.githubusercontent.com
185.199.108.133               marketplace-screenshots.githubusercontent.com
185.199.111.133               marketplace-screenshots.githubusercontent.com
52.216.58.89                  github-production-user-asset-6210df.s3.amazonaws.com
16.182.70.201                 github-production-user-asset-6210df.s3.amazonaws.com
52.216.8.203                  github-production-user-asset-6210df.s3.amazonaws.com
16.182.74.89                  github-production-user-asset-6210df.s3.amazonaws.com
3.5.17.203                    github-production-user-asset-6210df.s3.amazonaws.com
16.182.41.217                 github-production-user-asset-6210df.s3.amazonaws.com
52.217.199.209                github-production-user-asset-6210df.s3.amazonaws.com
54.231.200.105                github-production-user-asset-6210df.s3.amazonaws.com
3.5.29.149                    github-production-release-asset-2e65be.s3.amazonaws.com
52.217.193.121                github-production-release-asset-2e65be.s3.amazonaws.com
52.216.208.73                 github-production-release-asset-2e65be.s3.amazonaws.com
3.5.1.128                     github-production-release-asset-2e65be.s3.amazonaws.com
52.217.229.121                github-production-release-asset-2e65be.s3.amazonaws.com
3.5.10.199                    github-production-release-asset-2e65be.s3.amazonaws.com
16.182.101.17                 github-production-release-asset-2e65be.s3.amazonaws.com
52.217.233.57                 github-production-release-asset-2e65be.s3.amazonaws.com
52.217.123.105                github-production-repository-file-5c1aeb.s3.amazonaws.com
52.216.186.147                github-production-repository-file-5c1aeb.s3.amazonaws.com
52.216.29.148                 github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.116.201                github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.22.179                    github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.29.186                    github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.112.49                 github-production-repository-file-5c1aeb.s3.amazonaws.com
52.216.113.219                github-production-repository-file-5c1aeb.s3.amazonaws.com
```