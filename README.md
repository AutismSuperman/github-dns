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


# update 2025-03-17 01:16:20
```
140.82.112.3                  github.com
192.0.66.2                    github.blog
140.82.112.29                 githubapp.com
140.82.113.30                 githubapp.com
140.82.113.29                 githubapp.com
140.82.114.30                 githubapp.com
140.82.112.30                 githubapp.com
140.82.114.29                 githubapp.com
140.82.113.5                  api.github.com
185.199.110.133               raw.github.com
185.199.108.133               raw.github.com
185.199.111.133               raw.github.com
185.199.109.133               raw.github.com
140.82.114.4                  gist.github.com
140.82.113.3                  octocaptcha.com
140.82.114.17                 help.github.com
140.82.114.25                 live.github.com
140.82.114.18                 github.community
185.199.110.153               githubstatus.com
185.199.109.153               githubstatus.com
185.199.108.153               githubstatus.com
185.199.111.153               githubstatus.com
185.199.108.153               pages.github.com
185.199.111.153               pages.github.com
185.199.109.153               pages.github.com
185.199.110.153               pages.github.com
140.82.113.17                 status.github.com
140.82.112.13                 uploads.github.com
140.82.114.9                  nodeload.github.com
185.199.110.153               training.github.com
185.199.108.153               training.github.com
185.199.111.153               training.github.com
185.199.109.153               training.github.com
140.82.112.9                  codeload.github.com
185.199.109.154               github.githubassets.com
185.199.108.154               github.githubassets.com
185.199.110.154               github.githubassets.com
185.199.111.154               github.githubassets.com
185.199.110.133               raw.githubusercontent.com
185.199.108.133               raw.githubusercontent.com
185.199.109.133               raw.githubusercontent.com
185.199.111.133               raw.githubusercontent.com
185.199.110.133               gist.githubusercontent.com
185.199.109.133               gist.githubusercontent.com
185.199.111.133               gist.githubusercontent.com
185.199.108.133               gist.githubusercontent.com
185.199.110.133               camo.githubusercontent.com
185.199.111.133               camo.githubusercontent.com
185.199.108.133               camo.githubusercontent.com
185.199.109.133               camo.githubusercontent.com
185.199.108.133               cloud.githubusercontent.com
185.199.111.133               cloud.githubusercontent.com
185.199.110.133               cloud.githubusercontent.com
185.199.109.133               cloud.githubusercontent.com
185.199.109.133               media.githubusercontent.com
185.199.111.133               media.githubusercontent.com
185.199.110.133               media.githubusercontent.com
185.199.108.133               media.githubusercontent.com
16.15.185.195                 github-com.s3.amazonaws.com
16.15.193.61                  github-com.s3.amazonaws.com
52.217.18.84                  github-com.s3.amazonaws.com
52.216.217.49                 github-com.s3.amazonaws.com
16.182.67.89                  github-com.s3.amazonaws.com
16.15.185.191                 github-com.s3.amazonaws.com
3.5.25.41                     github-com.s3.amazonaws.com
3.5.24.250                    github-com.s3.amazonaws.com
151.101.129.194               github.global.ssl.fastly.net
151.101.65.194                github.global.ssl.fastly.net
151.101.1.194                 github.global.ssl.fastly.net
151.101.193.194               github.global.ssl.fastly.net
185.199.108.133               desktop.githubusercontent.com
185.199.109.133               desktop.githubusercontent.com
185.199.110.133               desktop.githubusercontent.com
185.199.111.133               desktop.githubusercontent.com
3.5.29.254                    github-cloud.s3.amazonaws.com
3.5.8.106                     github-cloud.s3.amazonaws.com
16.15.200.222                 github-cloud.s3.amazonaws.com
16.182.109.201                github-cloud.s3.amazonaws.com
52.217.73.156                 github-cloud.s3.amazonaws.com
3.5.29.66                     github-cloud.s3.amazonaws.com
3.5.28.186                    github-cloud.s3.amazonaws.com
3.5.29.59                     github-cloud.s3.amazonaws.com
185.199.108.133               avatars.githubusercontent.com
185.199.111.133               avatars.githubusercontent.com
185.199.110.133               avatars.githubusercontent.com
185.199.109.133               avatars.githubusercontent.com
185.199.109.133               favicons.githubusercontent.com
185.199.108.133               favicons.githubusercontent.com
185.199.110.133               favicons.githubusercontent.com
185.199.111.133               favicons.githubusercontent.com
185.199.111.133               avatars0.githubusercontent.com
185.199.110.133               avatars0.githubusercontent.com
185.199.109.133               avatars0.githubusercontent.com
185.199.108.133               avatars0.githubusercontent.com
185.199.109.133               avatars1.githubusercontent.com
185.199.110.133               avatars1.githubusercontent.com
185.199.111.133               avatars1.githubusercontent.com
185.199.108.133               avatars1.githubusercontent.com
185.199.110.133               avatars2.githubusercontent.com
185.199.108.133               avatars2.githubusercontent.com
185.199.111.133               avatars2.githubusercontent.com
185.199.109.133               avatars2.githubusercontent.com
185.199.108.133               avatars3.githubusercontent.com
185.199.109.133               avatars3.githubusercontent.com
185.199.111.133               avatars3.githubusercontent.com
185.199.110.133               avatars3.githubusercontent.com
185.199.109.133               avatars4.githubusercontent.com
185.199.108.133               avatars4.githubusercontent.com
185.199.111.133               avatars4.githubusercontent.com
185.199.110.133               avatars4.githubusercontent.com
185.199.111.133               avatars5.githubusercontent.com
185.199.108.133               avatars5.githubusercontent.com
185.199.109.133               avatars5.githubusercontent.com
185.199.110.133               avatars5.githubusercontent.com
185.199.110.133               avatars6.githubusercontent.com
185.199.111.133               avatars6.githubusercontent.com
185.199.108.133               avatars6.githubusercontent.com
185.199.109.133               avatars6.githubusercontent.com
185.199.110.133               avatars7.githubusercontent.com
185.199.111.133               avatars7.githubusercontent.com
185.199.108.133               avatars7.githubusercontent.com
185.199.109.133               avatars7.githubusercontent.com
185.199.108.133               avatars8.githubusercontent.com
185.199.109.133               avatars8.githubusercontent.com
185.199.110.133               avatars8.githubusercontent.com
185.199.111.133               avatars8.githubusercontent.com
185.199.110.153               customer-stories-feed.github.com
185.199.108.153               customer-stories-feed.github.com
185.199.111.153               customer-stories-feed.github.com
185.199.109.153               customer-stories-feed.github.com
185.199.108.133               user-images.githubusercontent.com
185.199.110.133               user-images.githubusercontent.com
185.199.111.133               user-images.githubusercontent.com
185.199.109.133               user-images.githubusercontent.com
185.199.109.133               repository-images.githubusercontent.com
185.199.111.133               repository-images.githubusercontent.com
185.199.108.133               repository-images.githubusercontent.com
185.199.110.133               repository-images.githubusercontent.com
185.199.111.133               marketplace-screenshots.githubusercontent.com
185.199.109.133               marketplace-screenshots.githubusercontent.com
185.199.110.133               marketplace-screenshots.githubusercontent.com
185.199.108.133               marketplace-screenshots.githubusercontent.com
54.231.171.9                  github-production-user-asset-6210df.s3.amazonaws.com
54.231.225.25                 github-production-user-asset-6210df.s3.amazonaws.com
54.231.166.1                  github-production-user-asset-6210df.s3.amazonaws.com
16.15.216.14                  github-production-user-asset-6210df.s3.amazonaws.com
52.217.201.169                github-production-user-asset-6210df.s3.amazonaws.com
52.217.199.6                  github-production-user-asset-6210df.s3.amazonaws.com
3.5.25.123                    github-production-user-asset-6210df.s3.amazonaws.com
16.182.70.33                  github-production-user-asset-6210df.s3.amazonaws.com
54.231.225.25                 github-production-release-asset-2e65be.s3.amazonaws.com
52.217.201.169                github-production-release-asset-2e65be.s3.amazonaws.com
3.5.25.123                    github-production-release-asset-2e65be.s3.amazonaws.com
54.231.166.1                  github-production-release-asset-2e65be.s3.amazonaws.com
16.15.216.14                  github-production-release-asset-2e65be.s3.amazonaws.com
52.217.199.6                  github-production-release-asset-2e65be.s3.amazonaws.com
54.231.171.9                  github-production-release-asset-2e65be.s3.amazonaws.com
16.182.70.33                  github-production-release-asset-2e65be.s3.amazonaws.com
3.5.31.100                    github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.27.108                    github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.28.49                     github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.234.233                github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.31.140                    github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.20.133                    github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.235.169                github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.27.149                    github-production-repository-file-5c1aeb.s3.amazonaws.com
```