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


# update 2024-03-25 00:54:38
```
140.82.112.4                  github.com
192.0.66.2                    github.blog
140.82.114.29                 githubapp.com
140.82.113.30                 githubapp.com
140.82.113.29                 githubapp.com
140.82.112.29                 githubapp.com
140.82.114.30                 githubapp.com
140.82.112.30                 githubapp.com
140.82.112.6                  api.github.com
185.199.109.133               raw.github.com
185.199.108.133               raw.github.com
185.199.110.133               raw.github.com
185.199.111.133               raw.github.com
140.82.113.4                  gist.github.com
140.82.113.3                  octocaptcha.com
140.82.114.18                 help.github.com
140.82.114.25                 live.github.com
140.82.112.18                 github.community
185.199.110.153               githubstatus.com
185.199.111.153               githubstatus.com
185.199.108.153               githubstatus.com
185.199.109.153               githubstatus.com
185.199.109.153               pages.github.com
185.199.111.153               pages.github.com
185.199.108.153               pages.github.com
185.199.110.153               pages.github.com
140.82.112.18                 status.github.com
140.82.113.13                 uploads.github.com
140.82.114.10                 nodeload.github.com
185.199.110.153               training.github.com
185.199.111.153               training.github.com
185.199.108.153               training.github.com
185.199.109.153               training.github.com
140.82.114.10                 codeload.github.com
185.199.108.153               assets-cdn.github.com
185.199.109.153               assets-cdn.github.com
185.199.110.153               assets-cdn.github.com
185.199.111.153               assets-cdn.github.com
185.199.108.154               github.githubassets.com
185.199.111.154               github.githubassets.com
185.199.110.154               github.githubassets.com
185.199.109.154               github.githubassets.com
185.199.110.153               documentcloud.github.com
185.199.108.153               documentcloud.github.com
185.199.111.153               documentcloud.github.com
185.199.109.153               documentcloud.github.com
185.199.108.133               raw.githubusercontent.com
185.199.109.133               raw.githubusercontent.com
185.199.110.133               raw.githubusercontent.com
185.199.111.133               raw.githubusercontent.com
185.199.108.133               gist.githubusercontent.com
185.199.109.133               gist.githubusercontent.com
185.199.110.133               gist.githubusercontent.com
185.199.111.133               gist.githubusercontent.com
185.199.108.133               camo.githubusercontent.com
185.199.109.133               camo.githubusercontent.com
185.199.110.133               camo.githubusercontent.com
185.199.111.133               camo.githubusercontent.com
185.199.108.133               cloud.githubusercontent.com
185.199.109.133               cloud.githubusercontent.com
185.199.110.133               cloud.githubusercontent.com
185.199.111.133               cloud.githubusercontent.com
185.199.108.133               media.githubusercontent.com
185.199.109.133               media.githubusercontent.com
185.199.110.133               media.githubusercontent.com
185.199.111.133               media.githubusercontent.com
3.5.28.67                     github-com.s3.amazonaws.com
16.182.35.17                  github-com.s3.amazonaws.com
54.231.167.33                 github-com.s3.amazonaws.com
52.217.201.185                github-com.s3.amazonaws.com
3.5.25.42                     github-com.s3.amazonaws.com
3.5.25.54                     github-com.s3.amazonaws.com
52.216.208.17                 github-com.s3.amazonaws.com
54.231.139.97                 github-com.s3.amazonaws.com
151.101.1.194                 github.global.ssl.fastly.net
151.101.65.194                github.global.ssl.fastly.net
151.101.129.194               github.global.ssl.fastly.net
151.101.193.194               github.global.ssl.fastly.net
185.199.108.133               desktop.githubusercontent.com
185.199.109.133               desktop.githubusercontent.com
185.199.110.133               desktop.githubusercontent.com
185.199.111.133               desktop.githubusercontent.com
52.216.43.185                 github-cloud.s3.amazonaws.com
54.231.230.73                 github-cloud.s3.amazonaws.com
3.5.8.173                     github-cloud.s3.amazonaws.com
52.216.186.163                github-cloud.s3.amazonaws.com
52.217.11.156                 github-cloud.s3.amazonaws.com
52.217.45.108                 github-cloud.s3.amazonaws.com
52.217.129.9                  github-cloud.s3.amazonaws.com
52.216.214.97                 github-cloud.s3.amazonaws.com
185.199.108.133               avatars.githubusercontent.com
185.199.109.133               avatars.githubusercontent.com
185.199.110.133               avatars.githubusercontent.com
185.199.111.133               avatars.githubusercontent.com
185.199.108.133               favicons.githubusercontent.com
185.199.111.133               favicons.githubusercontent.com
185.199.110.133               favicons.githubusercontent.com
185.199.109.133               favicons.githubusercontent.com
185.199.108.133               avatars0.githubusercontent.com
185.199.109.133               avatars0.githubusercontent.com
185.199.110.133               avatars0.githubusercontent.com
185.199.111.133               avatars0.githubusercontent.com
185.199.110.133               avatars1.githubusercontent.com
185.199.108.133               avatars1.githubusercontent.com
185.199.109.133               avatars1.githubusercontent.com
185.199.111.133               avatars1.githubusercontent.com
185.199.108.133               avatars2.githubusercontent.com
185.199.109.133               avatars2.githubusercontent.com
185.199.110.133               avatars2.githubusercontent.com
185.199.111.133               avatars2.githubusercontent.com
185.199.108.133               avatars3.githubusercontent.com
185.199.109.133               avatars3.githubusercontent.com
185.199.110.133               avatars3.githubusercontent.com
185.199.111.133               avatars3.githubusercontent.com
185.199.108.133               avatars4.githubusercontent.com
185.199.110.133               avatars4.githubusercontent.com
185.199.111.133               avatars4.githubusercontent.com
185.199.109.133               avatars4.githubusercontent.com
185.199.108.133               avatars5.githubusercontent.com
185.199.109.133               avatars5.githubusercontent.com
185.199.110.133               avatars5.githubusercontent.com
185.199.111.133               avatars5.githubusercontent.com
185.199.110.133               avatars6.githubusercontent.com
185.199.111.133               avatars6.githubusercontent.com
185.199.109.133               avatars6.githubusercontent.com
185.199.108.133               avatars6.githubusercontent.com
185.199.108.133               avatars7.githubusercontent.com
185.199.109.133               avatars7.githubusercontent.com
185.199.110.133               avatars7.githubusercontent.com
185.199.111.133               avatars7.githubusercontent.com
185.199.111.133               avatars8.githubusercontent.com
185.199.109.133               avatars8.githubusercontent.com
185.199.110.133               avatars8.githubusercontent.com
185.199.108.133               avatars8.githubusercontent.com
185.199.108.153               customer-stories-feed.github.com
185.199.109.153               customer-stories-feed.github.com
185.199.110.153               customer-stories-feed.github.com
185.199.111.153               customer-stories-feed.github.com
185.199.108.133               user-images.githubusercontent.com
185.199.109.133               user-images.githubusercontent.com
185.199.110.133               user-images.githubusercontent.com
185.199.111.133               user-images.githubusercontent.com
185.199.108.133               repository-images.githubusercontent.com
185.199.109.133               repository-images.githubusercontent.com
185.199.110.133               repository-images.githubusercontent.com
185.199.111.133               repository-images.githubusercontent.com
185.199.108.133               marketplace-screenshots.githubusercontent.com
185.199.109.133               marketplace-screenshots.githubusercontent.com
185.199.110.133               marketplace-screenshots.githubusercontent.com
185.199.111.133               marketplace-screenshots.githubusercontent.com
52.216.136.19                 github-production-user-asset-6210df.s3.amazonaws.com
52.217.225.153                github-production-user-asset-6210df.s3.amazonaws.com
54.231.165.161                github-production-user-asset-6210df.s3.amazonaws.com
52.217.138.81                 github-production-user-asset-6210df.s3.amazonaws.com
52.216.208.1                  github-production-user-asset-6210df.s3.amazonaws.com
54.231.166.201                github-production-user-asset-6210df.s3.amazonaws.com
54.231.168.177                github-production-user-asset-6210df.s3.amazonaws.com
3.5.8.131                     github-production-user-asset-6210df.s3.amazonaws.com
52.216.136.19                 github-production-release-asset-2e65be.s3.amazonaws.com
52.217.225.153                github-production-release-asset-2e65be.s3.amazonaws.com
54.231.165.161                github-production-release-asset-2e65be.s3.amazonaws.com
52.217.138.81                 github-production-release-asset-2e65be.s3.amazonaws.com
52.216.208.1                  github-production-release-asset-2e65be.s3.amazonaws.com
54.231.166.201                github-production-release-asset-2e65be.s3.amazonaws.com
54.231.168.177                github-production-release-asset-2e65be.s3.amazonaws.com
3.5.8.131                     github-production-release-asset-2e65be.s3.amazonaws.com
3.5.24.123                    github-production-repository-file-5c1aeb.s3.amazonaws.com
54.231.197.89                 github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.121.113                github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.98.52                  github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.29.205                    github-production-repository-file-5c1aeb.s3.amazonaws.com
16.182.101.49                 github-production-repository-file-5c1aeb.s3.amazonaws.com
52.216.147.11                 github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.29.156                    github-production-repository-file-5c1aeb.s3.amazonaws.com
```