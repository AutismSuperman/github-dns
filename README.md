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


# update 2024-07-29 12:26:30
```
140.82.112.3                  github.com
192.0.66.2                    github.blog
140.82.112.29                 githubapp.com
140.82.114.29                 githubapp.com
140.82.113.30                 githubapp.com
140.82.114.30                 githubapp.com
140.82.112.30                 githubapp.com
140.82.113.29                 githubapp.com
140.82.112.6                  api.github.com
185.199.110.133               raw.github.com
185.199.108.133               raw.github.com
185.199.109.133               raw.github.com
185.199.111.133               raw.github.com
140.82.112.3                  gist.github.com
140.82.113.4                  octocaptcha.com
140.82.113.17                 help.github.com
140.82.114.26                 live.github.com
140.82.113.18                 github.community
185.199.110.153               githubstatus.com
185.199.109.153               githubstatus.com
185.199.111.153               githubstatus.com
185.199.108.153               githubstatus.com
185.199.110.153               pages.github.com
185.199.111.153               pages.github.com
185.199.109.153               pages.github.com
185.199.108.153               pages.github.com
140.82.113.17                 status.github.com
140.82.114.14                 uploads.github.com
140.82.113.10                 nodeload.github.com
185.199.109.153               training.github.com
185.199.108.153               training.github.com
185.199.111.153               training.github.com
185.199.110.153               training.github.com
140.82.113.10                 codeload.github.com
185.199.108.153               assets-cdn.github.com
185.199.110.153               assets-cdn.github.com
185.199.109.153               assets-cdn.github.com
185.199.111.153               assets-cdn.github.com
185.199.109.154               github.githubassets.com
185.199.110.154               github.githubassets.com
185.199.108.154               github.githubassets.com
185.199.111.154               github.githubassets.com
185.199.109.153               documentcloud.github.com
185.199.111.153               documentcloud.github.com
185.199.108.153               documentcloud.github.com
185.199.110.153               documentcloud.github.com
185.199.109.133               raw.githubusercontent.com
185.199.108.133               raw.githubusercontent.com
185.199.110.133               raw.githubusercontent.com
185.199.111.133               raw.githubusercontent.com
185.199.109.133               gist.githubusercontent.com
185.199.110.133               gist.githubusercontent.com
185.199.108.133               gist.githubusercontent.com
185.199.111.133               gist.githubusercontent.com
185.199.109.133               camo.githubusercontent.com
185.199.111.133               camo.githubusercontent.com
185.199.110.133               camo.githubusercontent.com
185.199.108.133               camo.githubusercontent.com
185.199.109.133               cloud.githubusercontent.com
185.199.108.133               cloud.githubusercontent.com
185.199.111.133               cloud.githubusercontent.com
185.199.110.133               cloud.githubusercontent.com
185.199.110.133               media.githubusercontent.com
185.199.109.133               media.githubusercontent.com
185.199.108.133               media.githubusercontent.com
185.199.111.133               media.githubusercontent.com
16.182.65.241                 github-com.s3.amazonaws.com
16.182.68.73                  github-com.s3.amazonaws.com
3.5.27.41                     github-com.s3.amazonaws.com
52.217.161.57                 github-com.s3.amazonaws.com
3.5.21.141                    github-com.s3.amazonaws.com
54.231.166.169                github-com.s3.amazonaws.com
3.5.0.32                      github-com.s3.amazonaws.com
52.216.250.172                github-com.s3.amazonaws.com
151.101.1.194                 github.global.ssl.fastly.net
151.101.193.194               github.global.ssl.fastly.net
151.101.65.194                github.global.ssl.fastly.net
151.101.129.194               github.global.ssl.fastly.net
185.199.108.133               desktop.githubusercontent.com
185.199.110.133               desktop.githubusercontent.com
185.199.109.133               desktop.githubusercontent.com
185.199.111.133               desktop.githubusercontent.com
16.182.73.177                 github-cloud.s3.amazonaws.com
52.216.217.81                 github-cloud.s3.amazonaws.com
52.216.137.132                github-cloud.s3.amazonaws.com
52.216.49.49                  github-cloud.s3.amazonaws.com
16.182.100.129                github-cloud.s3.amazonaws.com
3.5.29.100                    github-cloud.s3.amazonaws.com
3.5.28.53                     github-cloud.s3.amazonaws.com
52.216.213.193                github-cloud.s3.amazonaws.com
185.199.110.133               avatars.githubusercontent.com
185.199.109.133               avatars.githubusercontent.com
185.199.108.133               avatars.githubusercontent.com
185.199.111.133               avatars.githubusercontent.com
185.199.111.133               favicons.githubusercontent.com
185.199.108.133               favicons.githubusercontent.com
185.199.110.133               favicons.githubusercontent.com
185.199.109.133               favicons.githubusercontent.com
185.199.108.133               avatars0.githubusercontent.com
185.199.109.133               avatars0.githubusercontent.com
185.199.111.133               avatars0.githubusercontent.com
185.199.110.133               avatars0.githubusercontent.com
185.199.110.133               avatars1.githubusercontent.com
185.199.111.133               avatars1.githubusercontent.com
185.199.109.133               avatars1.githubusercontent.com
185.199.108.133               avatars1.githubusercontent.com
185.199.109.133               avatars2.githubusercontent.com
185.199.110.133               avatars2.githubusercontent.com
185.199.111.133               avatars2.githubusercontent.com
185.199.108.133               avatars2.githubusercontent.com
185.199.108.133               avatars3.githubusercontent.com
185.199.111.133               avatars3.githubusercontent.com
185.199.109.133               avatars3.githubusercontent.com
185.199.110.133               avatars3.githubusercontent.com
185.199.108.133               avatars4.githubusercontent.com
185.199.111.133               avatars4.githubusercontent.com
185.199.109.133               avatars4.githubusercontent.com
185.199.110.133               avatars4.githubusercontent.com
185.199.108.133               avatars5.githubusercontent.com
185.199.110.133               avatars5.githubusercontent.com
185.199.111.133               avatars5.githubusercontent.com
185.199.109.133               avatars5.githubusercontent.com
185.199.111.133               avatars6.githubusercontent.com
185.199.109.133               avatars6.githubusercontent.com
185.199.108.133               avatars6.githubusercontent.com
185.199.110.133               avatars6.githubusercontent.com
185.199.108.133               avatars7.githubusercontent.com
185.199.111.133               avatars7.githubusercontent.com
185.199.109.133               avatars7.githubusercontent.com
185.199.110.133               avatars7.githubusercontent.com
185.199.111.133               avatars8.githubusercontent.com
185.199.109.133               avatars8.githubusercontent.com
185.199.110.133               avatars8.githubusercontent.com
185.199.108.133               avatars8.githubusercontent.com
185.199.108.153               customer-stories-feed.github.com
185.199.109.153               customer-stories-feed.github.com
185.199.111.153               customer-stories-feed.github.com
185.199.110.153               customer-stories-feed.github.com
185.199.109.133               user-images.githubusercontent.com
185.199.108.133               user-images.githubusercontent.com
185.199.110.133               user-images.githubusercontent.com
185.199.111.133               user-images.githubusercontent.com
185.199.110.133               repository-images.githubusercontent.com
185.199.108.133               repository-images.githubusercontent.com
185.199.111.133               repository-images.githubusercontent.com
185.199.109.133               repository-images.githubusercontent.com
185.199.108.133               marketplace-screenshots.githubusercontent.com
185.199.111.133               marketplace-screenshots.githubusercontent.com
185.199.110.133               marketplace-screenshots.githubusercontent.com
185.199.109.133               marketplace-screenshots.githubusercontent.com
52.216.49.49                  github-production-user-asset-6210df.s3.amazonaws.com
52.216.213.193                github-production-user-asset-6210df.s3.amazonaws.com
52.216.217.81                 github-production-user-asset-6210df.s3.amazonaws.com
3.5.29.100                    github-production-user-asset-6210df.s3.amazonaws.com
16.182.100.129                github-production-user-asset-6210df.s3.amazonaws.com
52.216.137.132                github-production-user-asset-6210df.s3.amazonaws.com
3.5.28.53                     github-production-user-asset-6210df.s3.amazonaws.com
16.182.73.177                 github-production-user-asset-6210df.s3.amazonaws.com
3.5.20.163                    github-production-release-asset-2e65be.s3.amazonaws.com
52.216.104.195                github-production-release-asset-2e65be.s3.amazonaws.com
3.5.25.133                    github-production-release-asset-2e65be.s3.amazonaws.com
54.231.197.233                github-production-release-asset-2e65be.s3.amazonaws.com
52.216.43.17                  github-production-release-asset-2e65be.s3.amazonaws.com
16.182.102.25                 github-production-release-asset-2e65be.s3.amazonaws.com
54.231.164.89                 github-production-release-asset-2e65be.s3.amazonaws.com
52.216.165.3                  github-production-release-asset-2e65be.s3.amazonaws.com
52.217.198.209                github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.168.89                 github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.125.17                 github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.122.201                github-production-repository-file-5c1aeb.s3.amazonaws.com
52.216.88.139                 github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.28.47                     github-production-repository-file-5c1aeb.s3.amazonaws.com
52.216.40.169                 github-production-repository-file-5c1aeb.s3.amazonaws.com
52.216.77.188                 github-production-repository-file-5c1aeb.s3.amazonaws.com
```