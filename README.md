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


# update 2026-09-28 19:13:21
```
140.82.113.4                  github.com
192.0.66.2                    github.blog
140.82.112.30                 githubapp.com
140.82.113.30                 githubapp.com
140.82.112.29                 githubapp.com
140.82.114.30                 githubapp.com
140.82.114.29                 githubapp.com
140.82.113.29                 githubapp.com
140.82.114.5                  api.github.com
185.199.108.133               raw.github.com
185.199.111.133               raw.github.com
185.199.110.133               raw.github.com
185.199.109.133               raw.github.com
140.82.114.4                  gist.github.com
140.82.116.3                  octocaptcha.com
185.199.111.133               help.github.com
185.199.108.133               help.github.com
185.199.109.133               help.github.com
185.199.110.133               help.github.com
140.82.112.26                 live.github.com
140.82.112.17                 github.community
185.199.111.153               githubstatus.com
185.199.108.153               githubstatus.com
185.199.110.153               githubstatus.com
185.199.109.153               githubstatus.com
185.199.109.153               pages.github.com
185.199.110.153               pages.github.com
185.199.111.153               pages.github.com
185.199.108.153               pages.github.com
140.82.112.18                 status.github.com
140.82.113.14                 uploads.github.com
140.82.113.10                 nodeload.github.com
185.199.110.153               training.github.com
185.199.109.153               training.github.com
185.199.108.153               training.github.com
185.199.111.153               training.github.com
140.82.113.9                  codeload.github.com
185.199.110.215               github.githubassets.com
185.199.111.215               github.githubassets.com
185.199.109.215               github.githubassets.com
185.199.108.215               github.githubassets.com
185.199.111.133               raw.githubusercontent.com
185.199.108.133               raw.githubusercontent.com
185.199.110.133               raw.githubusercontent.com
185.199.109.133               raw.githubusercontent.com
185.199.111.133               gist.githubusercontent.com
185.199.108.133               gist.githubusercontent.com
185.199.109.133               gist.githubusercontent.com
185.199.110.133               gist.githubusercontent.com
185.199.109.133               camo.githubusercontent.com
185.199.110.133               camo.githubusercontent.com
185.199.111.133               camo.githubusercontent.com
185.199.108.133               camo.githubusercontent.com
185.199.110.133               cloud.githubusercontent.com
185.199.111.133               cloud.githubusercontent.com
185.199.109.133               cloud.githubusercontent.com
185.199.108.133               cloud.githubusercontent.com
185.199.109.133               media.githubusercontent.com
185.199.110.133               media.githubusercontent.com
185.199.111.133               media.githubusercontent.com
185.199.108.133               media.githubusercontent.com
16.15.212.14                  github-com.s3.amazonaws.com
16.15.245.23                  github-com.s3.amazonaws.com
16.15.215.149                 github-com.s3.amazonaws.com
16.15.207.163                 github-com.s3.amazonaws.com
52.217.141.26                 github-com.s3.amazonaws.com
52.217.121.98                 github-com.s3.amazonaws.com
16.15.255.33                  github-com.s3.amazonaws.com
52.216.56.226                 github-com.s3.amazonaws.com
151.101.1.194                 github.global.ssl.fastly.net
151.101.193.194               github.global.ssl.fastly.net
151.101.129.194               github.global.ssl.fastly.net
151.101.65.194                github.global.ssl.fastly.net
185.199.111.133               desktop.githubusercontent.com
185.199.110.133               desktop.githubusercontent.com
185.199.108.133               desktop.githubusercontent.com
185.199.109.133               desktop.githubusercontent.com
16.182.64.106                 github-cloud.s3.amazonaws.com
16.15.252.198                 github-cloud.s3.amazonaws.com
52.217.202.106                github-cloud.s3.amazonaws.com
52.217.139.178                github-cloud.s3.amazonaws.com
52.216.216.170                github-cloud.s3.amazonaws.com
52.216.95.94                  github-cloud.s3.amazonaws.com
16.182.68.138                 github-cloud.s3.amazonaws.com
16.15.162.45                  github-cloud.s3.amazonaws.com
185.199.111.133               avatars.githubusercontent.com
185.199.109.133               avatars.githubusercontent.com
185.199.108.133               avatars.githubusercontent.com
185.199.110.133               avatars.githubusercontent.com
185.199.108.133               favicons.githubusercontent.com
185.199.109.133               favicons.githubusercontent.com
185.199.110.133               favicons.githubusercontent.com
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
185.199.110.133               avatars2.githubusercontent.com
185.199.111.133               avatars2.githubusercontent.com
185.199.109.133               avatars2.githubusercontent.com
185.199.110.133               avatars3.githubusercontent.com
185.199.108.133               avatars3.githubusercontent.com
185.199.111.133               avatars3.githubusercontent.com
185.199.109.133               avatars3.githubusercontent.com
185.199.110.133               avatars4.githubusercontent.com
185.199.109.133               avatars4.githubusercontent.com
185.199.108.133               avatars4.githubusercontent.com
185.199.111.133               avatars4.githubusercontent.com
185.199.110.133               avatars5.githubusercontent.com
185.199.108.133               avatars5.githubusercontent.com
185.199.111.133               avatars5.githubusercontent.com
185.199.109.133               avatars5.githubusercontent.com
185.199.109.133               avatars6.githubusercontent.com
185.199.108.133               avatars6.githubusercontent.com
185.199.111.133               avatars6.githubusercontent.com
185.199.110.133               avatars6.githubusercontent.com
185.199.111.133               avatars7.githubusercontent.com
185.199.108.133               avatars7.githubusercontent.com
185.199.110.133               avatars7.githubusercontent.com
185.199.109.133               avatars7.githubusercontent.com
185.199.110.133               avatars8.githubusercontent.com
185.199.111.133               avatars8.githubusercontent.com
185.199.109.133               avatars8.githubusercontent.com
185.199.108.133               avatars8.githubusercontent.com
185.199.111.153               customer-stories-feed.github.com
185.199.108.153               customer-stories-feed.github.com
185.199.110.153               customer-stories-feed.github.com
185.199.109.153               customer-stories-feed.github.com
185.199.111.133               user-images.githubusercontent.com
185.199.110.133               user-images.githubusercontent.com
185.199.108.133               user-images.githubusercontent.com
185.199.109.133               user-images.githubusercontent.com
185.199.108.133               repository-images.githubusercontent.com
185.199.111.133               repository-images.githubusercontent.com
185.199.109.133               repository-images.githubusercontent.com
185.199.110.133               repository-images.githubusercontent.com
185.199.108.133               marketplace-screenshots.githubusercontent.com
185.199.109.133               marketplace-screenshots.githubusercontent.com
185.199.111.133               marketplace-screenshots.githubusercontent.com
185.199.110.133               marketplace-screenshots.githubusercontent.com
54.231.170.106                github-production-user-asset-6210df.s3.amazonaws.com
52.217.232.218                github-production-user-asset-6210df.s3.amazonaws.com
16.15.255.167                 github-production-user-asset-6210df.s3.amazonaws.com
52.217.167.210                github-production-user-asset-6210df.s3.amazonaws.com
52.217.195.18                 github-production-user-asset-6210df.s3.amazonaws.com
52.216.63.50                  github-production-user-asset-6210df.s3.amazonaws.com
16.182.16.26                  github-production-user-asset-6210df.s3.amazonaws.com
16.15.207.17                  github-production-user-asset-6210df.s3.amazonaws.com
16.15.223.165                 github-production-release-asset-2e65be.s3.amazonaws.com
16.15.199.246                 github-production-release-asset-2e65be.s3.amazonaws.com
16.15.199.247                 github-production-release-asset-2e65be.s3.amazonaws.com
52.217.171.250                github-production-release-asset-2e65be.s3.amazonaws.com
52.217.175.82                 github-production-release-asset-2e65be.s3.amazonaws.com
16.15.214.152                 github-production-release-asset-2e65be.s3.amazonaws.com
54.231.162.74                 github-production-release-asset-2e65be.s3.amazonaws.com
16.15.244.48                  github-production-release-asset-2e65be.s3.amazonaws.com
52.217.232.218                github-production-repository-file-5c1aeb.s3.amazonaws.com
52.216.63.50                  github-production-repository-file-5c1aeb.s3.amazonaws.com
16.182.16.26                  github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.207.17                  github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.195.18                 github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.255.167                 github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.167.210                github-production-repository-file-5c1aeb.s3.amazonaws.com
54.231.170.106                github-production-repository-file-5c1aeb.s3.amazonaws.com
```