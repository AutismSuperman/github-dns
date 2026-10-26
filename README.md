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


# update 2026-10-26 18:12:41
```
140.82.112.4                  github.com
192.0.66.2                    github.blog
140.82.112.29                 githubapp.com
140.82.112.30                 githubapp.com
140.82.113.29                 githubapp.com
140.82.114.29                 githubapp.com
140.82.113.30                 githubapp.com
140.82.114.30                 githubapp.com
140.82.114.5                  api.github.com
185.199.109.133               raw.github.com
185.199.108.133               raw.github.com
185.199.111.133               raw.github.com
185.199.110.133               raw.github.com
140.82.113.4                  gist.github.com
172.182.252.133               octocaptcha.com
185.199.108.133               help.github.com
185.199.109.133               help.github.com
185.199.111.133               help.github.com
185.199.110.133               help.github.com
140.82.114.25                 live.github.com
140.82.112.17                 github.community
185.199.109.153               githubstatus.com
185.199.110.153               githubstatus.com
185.199.111.153               githubstatus.com
185.199.108.153               githubstatus.com
185.199.109.153               pages.github.com
185.199.111.153               pages.github.com
185.199.108.153               pages.github.com
185.199.110.153               pages.github.com
140.82.114.18                 status.github.com
140.82.112.13                 uploads.github.com
140.82.113.9                  nodeload.github.com
185.199.111.153               training.github.com
185.199.110.153               training.github.com
185.199.109.153               training.github.com
185.199.108.153               training.github.com
140.82.112.9                  codeload.github.com
185.199.108.215               github.githubassets.com
185.199.109.215               github.githubassets.com
185.199.110.215               github.githubassets.com
185.199.111.215               github.githubassets.com
185.199.109.133               raw.githubusercontent.com
185.199.111.133               raw.githubusercontent.com
185.199.108.133               raw.githubusercontent.com
185.199.110.133               raw.githubusercontent.com
185.199.108.133               gist.githubusercontent.com
185.199.111.133               gist.githubusercontent.com
185.199.109.133               gist.githubusercontent.com
185.199.110.133               gist.githubusercontent.com
185.199.108.133               camo.githubusercontent.com
185.199.109.133               camo.githubusercontent.com
185.199.111.133               camo.githubusercontent.com
185.199.110.133               camo.githubusercontent.com
185.199.111.133               cloud.githubusercontent.com
185.199.109.133               cloud.githubusercontent.com
185.199.110.133               cloud.githubusercontent.com
185.199.108.133               cloud.githubusercontent.com
185.199.108.133               media.githubusercontent.com
185.199.109.133               media.githubusercontent.com
185.199.111.133               media.githubusercontent.com
185.199.110.133               media.githubusercontent.com
52.217.226.2                  github-com.s3.amazonaws.com
16.15.245.23                  github-com.s3.amazonaws.com
52.216.42.162                 github-com.s3.amazonaws.com
16.15.236.42                  github-com.s3.amazonaws.com
52.217.142.146                github-com.s3.amazonaws.com
16.15.228.61                  github-com.s3.amazonaws.com
52.217.196.74                 github-com.s3.amazonaws.com
52.216.49.218                 github-com.s3.amazonaws.com
151.101.129.194               github.global.ssl.fastly.net
151.101.65.194                github.global.ssl.fastly.net
151.101.193.194               github.global.ssl.fastly.net
151.101.1.194                 github.global.ssl.fastly.net
185.199.108.133               desktop.githubusercontent.com
185.199.111.133               desktop.githubusercontent.com
185.199.109.133               desktop.githubusercontent.com
185.199.110.133               desktop.githubusercontent.com
16.182.33.50                  github-cloud.s3.amazonaws.com
16.15.183.218                 github-cloud.s3.amazonaws.com
52.217.199.58                 github-cloud.s3.amazonaws.com
52.217.225.114                github-cloud.s3.amazonaws.com
52.217.78.184                 github-cloud.s3.amazonaws.com
16.15.253.59                  github-cloud.s3.amazonaws.com
16.15.212.43                  github-cloud.s3.amazonaws.com
54.231.204.210                github-cloud.s3.amazonaws.com
185.199.111.133               avatars.githubusercontent.com
185.199.110.133               avatars.githubusercontent.com
185.199.108.133               avatars.githubusercontent.com
185.199.109.133               avatars.githubusercontent.com
185.199.109.133               favicons.githubusercontent.com
185.199.110.133               favicons.githubusercontent.com
185.199.108.133               favicons.githubusercontent.com
185.199.111.133               favicons.githubusercontent.com
185.199.109.133               avatars0.githubusercontent.com
185.199.110.133               avatars0.githubusercontent.com
185.199.108.133               avatars0.githubusercontent.com
185.199.111.133               avatars0.githubusercontent.com
185.199.110.133               avatars1.githubusercontent.com
185.199.109.133               avatars1.githubusercontent.com
185.199.108.133               avatars1.githubusercontent.com
185.199.111.133               avatars1.githubusercontent.com
185.199.110.133               avatars2.githubusercontent.com
185.199.108.133               avatars2.githubusercontent.com
185.199.109.133               avatars2.githubusercontent.com
185.199.111.133               avatars2.githubusercontent.com
185.199.108.133               avatars3.githubusercontent.com
185.199.111.133               avatars3.githubusercontent.com
185.199.110.133               avatars3.githubusercontent.com
185.199.109.133               avatars3.githubusercontent.com
185.199.108.133               avatars4.githubusercontent.com
185.199.109.133               avatars4.githubusercontent.com
185.199.111.133               avatars4.githubusercontent.com
185.199.110.133               avatars4.githubusercontent.com
185.199.111.133               avatars5.githubusercontent.com
185.199.109.133               avatars5.githubusercontent.com
185.199.108.133               avatars5.githubusercontent.com
185.199.110.133               avatars5.githubusercontent.com
185.199.109.133               avatars6.githubusercontent.com
185.199.111.133               avatars6.githubusercontent.com
185.199.108.133               avatars6.githubusercontent.com
185.199.110.133               avatars6.githubusercontent.com
185.199.109.133               avatars7.githubusercontent.com
185.199.110.133               avatars7.githubusercontent.com
185.199.108.133               avatars7.githubusercontent.com
185.199.111.133               avatars7.githubusercontent.com
185.199.111.133               avatars8.githubusercontent.com
185.199.110.133               avatars8.githubusercontent.com
185.199.108.133               avatars8.githubusercontent.com
185.199.109.133               avatars8.githubusercontent.com
185.199.110.153               customer-stories-feed.github.com
185.199.109.153               customer-stories-feed.github.com
185.199.111.153               customer-stories-feed.github.com
185.199.108.153               customer-stories-feed.github.com
185.199.109.133               user-images.githubusercontent.com
185.199.110.133               user-images.githubusercontent.com
185.199.108.133               user-images.githubusercontent.com
185.199.111.133               user-images.githubusercontent.com
185.199.108.133               repository-images.githubusercontent.com
185.199.109.133               repository-images.githubusercontent.com
185.199.110.133               repository-images.githubusercontent.com
185.199.111.133               repository-images.githubusercontent.com
185.199.111.133               marketplace-screenshots.githubusercontent.com
185.199.108.133               marketplace-screenshots.githubusercontent.com
185.199.109.133               marketplace-screenshots.githubusercontent.com
185.199.110.133               marketplace-screenshots.githubusercontent.com
52.217.85.80                  github-production-user-asset-6210df.s3.amazonaws.com
16.15.255.43                  github-production-user-asset-6210df.s3.amazonaws.com
52.216.33.114                 github-production-user-asset-6210df.s3.amazonaws.com
16.182.32.162                 github-production-user-asset-6210df.s3.amazonaws.com
16.182.68.226                 github-production-user-asset-6210df.s3.amazonaws.com
52.216.216.162                github-production-user-asset-6210df.s3.amazonaws.com
16.15.247.189                 github-production-user-asset-6210df.s3.amazonaws.com
16.15.228.120                 github-production-user-asset-6210df.s3.amazonaws.com
52.216.243.72                 github-production-release-asset-2e65be.s3.amazonaws.com
16.15.253.65                  github-production-release-asset-2e65be.s3.amazonaws.com
16.182.70.194                 github-production-release-asset-2e65be.s3.amazonaws.com
54.231.171.122                github-production-release-asset-2e65be.s3.amazonaws.com
52.216.211.218                github-production-release-asset-2e65be.s3.amazonaws.com
52.217.135.82                 github-production-release-asset-2e65be.s3.amazonaws.com
52.217.227.242                github-production-release-asset-2e65be.s3.amazonaws.com
16.15.236.180                 github-production-release-asset-2e65be.s3.amazonaws.com
16.15.229.155                 github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.244.51                  github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.230.176                 github-production-repository-file-5c1aeb.s3.amazonaws.com
54.231.203.66                 github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.253.69                  github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.245.23                  github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.80.88                  github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.36.184                 github-production-repository-file-5c1aeb.s3.amazonaws.com
```