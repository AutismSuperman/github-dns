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


# update 2025-05-19 12:36:07
```
140.82.112.4                  github.com
192.0.66.2                    github.blog
140.82.112.30                 githubapp.com
140.82.113.30                 githubapp.com
140.82.114.29                 githubapp.com
140.82.112.29                 githubapp.com
140.82.114.30                 githubapp.com
140.82.113.29                 githubapp.com
140.82.113.5                  api.github.com
185.199.108.133               raw.github.com
185.199.111.133               raw.github.com
185.199.110.133               raw.github.com
185.199.109.133               raw.github.com
140.82.112.4                  gist.github.com
140.82.112.3                  octocaptcha.com
140.82.113.18                 help.github.com
140.82.112.25                 live.github.com
140.82.113.18                 github.community
185.199.110.153               githubstatus.com
185.199.109.153               githubstatus.com
185.199.108.153               githubstatus.com
185.199.111.153               githubstatus.com
185.199.108.153               pages.github.com
185.199.109.153               pages.github.com
185.199.111.153               pages.github.com
185.199.110.153               pages.github.com
140.82.113.18                 status.github.com
140.82.113.14                 uploads.github.com
140.82.114.9                  nodeload.github.com
185.199.111.153               training.github.com
185.199.109.153               training.github.com
185.199.110.153               training.github.com
185.199.108.153               training.github.com
140.82.112.9                  codeload.github.com
185.199.109.154               github.githubassets.com
185.199.110.154               github.githubassets.com
185.199.108.154               github.githubassets.com
185.199.111.154               github.githubassets.com
185.199.108.133               raw.githubusercontent.com
185.199.110.133               raw.githubusercontent.com
185.199.109.133               raw.githubusercontent.com
185.199.111.133               raw.githubusercontent.com
185.199.108.133               gist.githubusercontent.com
185.199.111.133               gist.githubusercontent.com
185.199.110.133               gist.githubusercontent.com
185.199.109.133               gist.githubusercontent.com
185.199.110.133               camo.githubusercontent.com
185.199.108.133               camo.githubusercontent.com
185.199.111.133               camo.githubusercontent.com
185.199.109.133               camo.githubusercontent.com
185.199.110.133               cloud.githubusercontent.com
185.199.108.133               cloud.githubusercontent.com
185.199.109.133               cloud.githubusercontent.com
185.199.111.133               cloud.githubusercontent.com
185.199.109.133               media.githubusercontent.com
185.199.111.133               media.githubusercontent.com
185.199.110.133               media.githubusercontent.com
185.199.108.133               media.githubusercontent.com
3.5.3.165                     github-com.s3.amazonaws.com
52.217.205.137                github-com.s3.amazonaws.com
52.216.41.81                  github-com.s3.amazonaws.com
52.217.12.220                 github-com.s3.amazonaws.com
52.217.199.57                 github-com.s3.amazonaws.com
52.217.107.116                github-com.s3.amazonaws.com
54.231.163.57                 github-com.s3.amazonaws.com
3.5.29.222                    github-com.s3.amazonaws.com
151.101.129.194               github.global.ssl.fastly.net
151.101.65.194                github.global.ssl.fastly.net
151.101.193.194               github.global.ssl.fastly.net
151.101.1.194                 github.global.ssl.fastly.net
185.199.111.133               desktop.githubusercontent.com
185.199.109.133               desktop.githubusercontent.com
185.199.110.133               desktop.githubusercontent.com
185.199.108.133               desktop.githubusercontent.com
52.217.231.177                github-cloud.s3.amazonaws.com
3.5.29.121                    github-cloud.s3.amazonaws.com
3.5.21.127                    github-cloud.s3.amazonaws.com
52.217.203.209                github-cloud.s3.amazonaws.com
52.216.60.233                 github-cloud.s3.amazonaws.com
54.231.164.169                github-cloud.s3.amazonaws.com
54.231.138.137                github-cloud.s3.amazonaws.com
3.5.25.188                    github-cloud.s3.amazonaws.com
185.199.111.133               avatars.githubusercontent.com
185.199.110.133               avatars.githubusercontent.com
185.199.108.133               avatars.githubusercontent.com
185.199.109.133               avatars.githubusercontent.com
185.199.108.133               favicons.githubusercontent.com
185.199.111.133               favicons.githubusercontent.com
185.199.110.133               favicons.githubusercontent.com
185.199.109.133               favicons.githubusercontent.com
185.199.108.133               avatars0.githubusercontent.com
185.199.109.133               avatars0.githubusercontent.com
185.199.111.133               avatars0.githubusercontent.com
185.199.110.133               avatars0.githubusercontent.com
185.199.110.133               avatars1.githubusercontent.com
185.199.108.133               avatars1.githubusercontent.com
185.199.109.133               avatars1.githubusercontent.com
185.199.111.133               avatars1.githubusercontent.com
185.199.110.133               avatars2.githubusercontent.com
185.199.111.133               avatars2.githubusercontent.com
185.199.109.133               avatars2.githubusercontent.com
185.199.108.133               avatars2.githubusercontent.com
185.199.110.133               avatars3.githubusercontent.com
185.199.108.133               avatars3.githubusercontent.com
185.199.109.133               avatars3.githubusercontent.com
185.199.111.133               avatars3.githubusercontent.com
185.199.111.133               avatars4.githubusercontent.com
185.199.110.133               avatars4.githubusercontent.com
185.199.109.133               avatars4.githubusercontent.com
185.199.108.133               avatars4.githubusercontent.com
185.199.109.133               avatars5.githubusercontent.com
185.199.110.133               avatars5.githubusercontent.com
185.199.111.133               avatars5.githubusercontent.com
185.199.108.133               avatars5.githubusercontent.com
185.199.109.133               avatars6.githubusercontent.com
185.199.108.133               avatars6.githubusercontent.com
185.199.110.133               avatars6.githubusercontent.com
185.199.111.133               avatars6.githubusercontent.com
185.199.109.133               avatars7.githubusercontent.com
185.199.110.133               avatars7.githubusercontent.com
185.199.111.133               avatars7.githubusercontent.com
185.199.108.133               avatars7.githubusercontent.com
185.199.109.133               avatars8.githubusercontent.com
185.199.110.133               avatars8.githubusercontent.com
185.199.108.133               avatars8.githubusercontent.com
185.199.111.133               avatars8.githubusercontent.com
185.199.109.153               customer-stories-feed.github.com
185.199.110.153               customer-stories-feed.github.com
185.199.111.153               customer-stories-feed.github.com
185.199.108.153               customer-stories-feed.github.com
185.199.109.133               user-images.githubusercontent.com
185.199.110.133               user-images.githubusercontent.com
185.199.108.133               user-images.githubusercontent.com
185.199.111.133               user-images.githubusercontent.com
185.199.111.133               repository-images.githubusercontent.com
185.199.109.133               repository-images.githubusercontent.com
185.199.110.133               repository-images.githubusercontent.com
185.199.108.133               repository-images.githubusercontent.com
185.199.108.133               marketplace-screenshots.githubusercontent.com
185.199.111.133               marketplace-screenshots.githubusercontent.com
185.199.110.133               marketplace-screenshots.githubusercontent.com
185.199.109.133               marketplace-screenshots.githubusercontent.com
54.231.130.137                github-production-user-asset-6210df.s3.amazonaws.com
52.217.171.233                github-production-user-asset-6210df.s3.amazonaws.com
54.231.202.137                github-production-user-asset-6210df.s3.amazonaws.com
16.182.74.57                  github-production-user-asset-6210df.s3.amazonaws.com
3.5.7.192                     github-production-user-asset-6210df.s3.amazonaws.com
3.5.24.206                    github-production-user-asset-6210df.s3.amazonaws.com
54.231.165.153                github-production-user-asset-6210df.s3.amazonaws.com
54.231.201.49                 github-production-user-asset-6210df.s3.amazonaws.com
54.231.202.137                github-production-release-asset-2e65be.s3.amazonaws.com
54.231.130.137                github-production-release-asset-2e65be.s3.amazonaws.com
52.217.171.233                github-production-release-asset-2e65be.s3.amazonaws.com
3.5.7.192                     github-production-release-asset-2e65be.s3.amazonaws.com
54.231.165.153                github-production-release-asset-2e65be.s3.amazonaws.com
16.182.74.57                  github-production-release-asset-2e65be.s3.amazonaws.com
3.5.24.206                    github-production-release-asset-2e65be.s3.amazonaws.com
54.231.201.49                 github-production-release-asset-2e65be.s3.amazonaws.com
52.216.60.233                 github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.231.177                github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.21.127                    github-production-repository-file-5c1aeb.s3.amazonaws.com
54.231.138.137                github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.25.188                    github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.29.121                    github-production-repository-file-5c1aeb.s3.amazonaws.com
54.231.164.169                github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.203.209                github-production-repository-file-5c1aeb.s3.amazonaws.com
```