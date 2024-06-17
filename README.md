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


# update 2024-06-17 12:25:13
```
140.82.113.3                  github.com
192.0.66.2                    github.blog
140.82.113.29                 githubapp.com
140.82.114.29                 githubapp.com
140.82.112.30                 githubapp.com
140.82.112.29                 githubapp.com
140.82.114.30                 githubapp.com
140.82.113.30                 githubapp.com
140.82.112.6                  api.github.com
185.199.111.133               raw.github.com
185.199.110.133               raw.github.com
185.199.109.133               raw.github.com
185.199.108.133               raw.github.com
140.82.113.3                  gist.github.com
140.82.112.3                  octocaptcha.com
140.82.114.17                 help.github.com
140.82.113.26                 live.github.com
140.82.113.17                 github.community
185.199.111.153               githubstatus.com
185.199.110.153               githubstatus.com
185.199.108.153               githubstatus.com
185.199.109.153               githubstatus.com
185.199.109.153               pages.github.com
185.199.110.153               pages.github.com
185.199.111.153               pages.github.com
185.199.108.153               pages.github.com
140.82.112.18                 status.github.com
140.82.114.13                 uploads.github.com
140.82.113.10                 nodeload.github.com
185.199.108.153               training.github.com
185.199.109.153               training.github.com
185.199.110.153               training.github.com
185.199.111.153               training.github.com
140.82.113.10                 codeload.github.com
185.199.109.153               assets-cdn.github.com
185.199.108.153               assets-cdn.github.com
185.199.110.153               assets-cdn.github.com
185.199.111.153               assets-cdn.github.com
185.199.110.154               github.githubassets.com
185.199.111.154               github.githubassets.com
185.199.108.154               github.githubassets.com
185.199.109.154               github.githubassets.com
185.199.109.153               documentcloud.github.com
185.199.111.153               documentcloud.github.com
185.199.110.153               documentcloud.github.com
185.199.108.153               documentcloud.github.com
185.199.111.133               raw.githubusercontent.com
185.199.109.133               raw.githubusercontent.com
185.199.108.133               raw.githubusercontent.com
185.199.110.133               raw.githubusercontent.com
185.199.111.133               gist.githubusercontent.com
185.199.110.133               gist.githubusercontent.com
185.199.108.133               gist.githubusercontent.com
185.199.109.133               gist.githubusercontent.com
185.199.110.133               camo.githubusercontent.com
185.199.111.133               camo.githubusercontent.com
185.199.109.133               camo.githubusercontent.com
185.199.108.133               camo.githubusercontent.com
185.199.108.133               cloud.githubusercontent.com
185.199.111.133               cloud.githubusercontent.com
185.199.109.133               cloud.githubusercontent.com
185.199.110.133               cloud.githubusercontent.com
185.199.110.133               media.githubusercontent.com
185.199.108.133               media.githubusercontent.com
185.199.109.133               media.githubusercontent.com
185.199.111.133               media.githubusercontent.com
54.231.204.225                github-com.s3.amazonaws.com
52.216.147.11                 github-com.s3.amazonaws.com
54.231.169.49                 github-com.s3.amazonaws.com
52.217.201.81                 github-com.s3.amazonaws.com
16.182.106.137                github-com.s3.amazonaws.com
52.217.66.36                  github-com.s3.amazonaws.com
3.5.23.2                      github-com.s3.amazonaws.com
3.5.3.216                     github-com.s3.amazonaws.com
151.101.193.194               github.global.ssl.fastly.net
151.101.65.194                github.global.ssl.fastly.net
151.101.129.194               github.global.ssl.fastly.net
151.101.1.194                 github.global.ssl.fastly.net
185.199.111.133               desktop.githubusercontent.com
185.199.109.133               desktop.githubusercontent.com
185.199.110.133               desktop.githubusercontent.com
185.199.108.133               desktop.githubusercontent.com
52.217.66.36                  github-cloud.s3.amazonaws.com
52.217.201.81                 github-cloud.s3.amazonaws.com
16.182.106.137                github-cloud.s3.amazonaws.com
52.216.147.11                 github-cloud.s3.amazonaws.com
54.231.169.49                 github-cloud.s3.amazonaws.com
54.231.204.225                github-cloud.s3.amazonaws.com
3.5.3.216                     github-cloud.s3.amazonaws.com
3.5.23.2                      github-cloud.s3.amazonaws.com
185.199.108.133               avatars.githubusercontent.com
185.199.109.133               avatars.githubusercontent.com
185.199.111.133               avatars.githubusercontent.com
185.199.110.133               avatars.githubusercontent.com
185.199.111.133               favicons.githubusercontent.com
185.199.110.133               favicons.githubusercontent.com
185.199.109.133               favicons.githubusercontent.com
185.199.108.133               favicons.githubusercontent.com
185.199.109.133               avatars0.githubusercontent.com
185.199.108.133               avatars0.githubusercontent.com
185.199.110.133               avatars0.githubusercontent.com
185.199.111.133               avatars0.githubusercontent.com
185.199.110.133               avatars1.githubusercontent.com
185.199.111.133               avatars1.githubusercontent.com
185.199.109.133               avatars1.githubusercontent.com
185.199.108.133               avatars1.githubusercontent.com
185.199.111.133               avatars2.githubusercontent.com
185.199.110.133               avatars2.githubusercontent.com
185.199.109.133               avatars2.githubusercontent.com
185.199.108.133               avatars2.githubusercontent.com
185.199.110.133               avatars3.githubusercontent.com
185.199.108.133               avatars3.githubusercontent.com
185.199.111.133               avatars3.githubusercontent.com
185.199.109.133               avatars3.githubusercontent.com
185.199.109.133               avatars4.githubusercontent.com
185.199.108.133               avatars4.githubusercontent.com
185.199.111.133               avatars4.githubusercontent.com
185.199.110.133               avatars4.githubusercontent.com
185.199.110.133               avatars5.githubusercontent.com
185.199.109.133               avatars5.githubusercontent.com
185.199.111.133               avatars5.githubusercontent.com
185.199.108.133               avatars5.githubusercontent.com
185.199.109.133               avatars6.githubusercontent.com
185.199.108.133               avatars6.githubusercontent.com
185.199.111.133               avatars6.githubusercontent.com
185.199.110.133               avatars6.githubusercontent.com
185.199.111.133               avatars7.githubusercontent.com
185.199.108.133               avatars7.githubusercontent.com
185.199.109.133               avatars7.githubusercontent.com
185.199.110.133               avatars7.githubusercontent.com
185.199.109.133               avatars8.githubusercontent.com
185.199.110.133               avatars8.githubusercontent.com
185.199.108.133               avatars8.githubusercontent.com
185.199.111.133               avatars8.githubusercontent.com
185.199.109.153               customer-stories-feed.github.com
185.199.110.153               customer-stories-feed.github.com
185.199.108.153               customer-stories-feed.github.com
185.199.111.153               customer-stories-feed.github.com
185.199.110.133               user-images.githubusercontent.com
185.199.109.133               user-images.githubusercontent.com
185.199.108.133               user-images.githubusercontent.com
185.199.111.133               user-images.githubusercontent.com
185.199.109.133               repository-images.githubusercontent.com
185.199.108.133               repository-images.githubusercontent.com
185.199.110.133               repository-images.githubusercontent.com
185.199.111.133               repository-images.githubusercontent.com
185.199.110.133               marketplace-screenshots.githubusercontent.com
185.199.111.133               marketplace-screenshots.githubusercontent.com
185.199.108.133               marketplace-screenshots.githubusercontent.com
185.199.109.133               marketplace-screenshots.githubusercontent.com
3.5.11.119                    github-production-user-asset-6210df.s3.amazonaws.com
16.182.72.145                 github-production-user-asset-6210df.s3.amazonaws.com
3.5.29.98                     github-production-user-asset-6210df.s3.amazonaws.com
3.5.1.122                     github-production-user-asset-6210df.s3.amazonaws.com
52.217.141.113                github-production-user-asset-6210df.s3.amazonaws.com
52.216.111.43                 github-production-user-asset-6210df.s3.amazonaws.com
52.216.220.169                github-production-user-asset-6210df.s3.amazonaws.com
3.5.9.21                      github-production-user-asset-6210df.s3.amazonaws.com
52.217.201.81                 github-production-release-asset-2e65be.s3.amazonaws.com
3.5.23.2                      github-production-release-asset-2e65be.s3.amazonaws.com
54.231.169.49                 github-production-release-asset-2e65be.s3.amazonaws.com
52.217.66.36                  github-production-release-asset-2e65be.s3.amazonaws.com
16.182.106.137                github-production-release-asset-2e65be.s3.amazonaws.com
54.231.204.225                github-production-release-asset-2e65be.s3.amazonaws.com
52.216.147.11                 github-production-release-asset-2e65be.s3.amazonaws.com
3.5.3.216                     github-production-release-asset-2e65be.s3.amazonaws.com
3.5.29.74                     github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.22.254                    github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.30.146                    github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.29.161                    github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.28.120                    github-production-repository-file-5c1aeb.s3.amazonaws.com
52.216.216.153                github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.20.102                    github-production-repository-file-5c1aeb.s3.amazonaws.com
54.231.171.65                 github-production-repository-file-5c1aeb.s3.amazonaws.com
```