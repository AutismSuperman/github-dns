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


# update 2026-02-02 01:59:45
```
140.82.114.3                  github.com
192.0.66.2                    github.blog
140.82.113.30                 githubapp.com
140.82.114.29                 githubapp.com
140.82.112.29                 githubapp.com
140.82.114.30                 githubapp.com
140.82.113.29                 githubapp.com
140.82.112.30                 githubapp.com
140.82.113.5                  api.github.com
185.199.109.133               raw.github.com
185.199.111.133               raw.github.com
185.199.108.133               raw.github.com
185.199.110.133               raw.github.com
140.82.112.3                  gist.github.com
140.82.113.4                  octocaptcha.com
140.82.112.17                 help.github.com
140.82.112.26                 live.github.com
140.82.112.17                 github.community
185.199.111.153               githubstatus.com
185.199.108.153               githubstatus.com
185.199.110.153               githubstatus.com
185.199.109.153               githubstatus.com
185.199.111.153               pages.github.com
185.199.109.153               pages.github.com
185.199.110.153               pages.github.com
185.199.108.153               pages.github.com
140.82.114.18                 status.github.com
140.82.112.14                 uploads.github.com
140.82.112.9                  nodeload.github.com
185.199.110.153               training.github.com
185.199.111.153               training.github.com
185.199.109.153               training.github.com
185.199.108.153               training.github.com
140.82.113.9                  codeload.github.com
185.199.110.154               github.githubassets.com
185.199.108.154               github.githubassets.com
185.199.109.154               github.githubassets.com
185.199.111.154               github.githubassets.com
185.199.109.133               raw.githubusercontent.com
185.199.108.133               raw.githubusercontent.com
185.199.111.133               raw.githubusercontent.com
185.199.110.133               raw.githubusercontent.com
185.199.108.133               gist.githubusercontent.com
185.199.110.133               gist.githubusercontent.com
185.199.111.133               gist.githubusercontent.com
185.199.109.133               gist.githubusercontent.com
185.199.110.133               camo.githubusercontent.com
185.199.109.133               camo.githubusercontent.com
185.199.111.133               camo.githubusercontent.com
185.199.108.133               camo.githubusercontent.com
185.199.110.133               cloud.githubusercontent.com
185.199.111.133               cloud.githubusercontent.com
185.199.109.133               cloud.githubusercontent.com
185.199.108.133               cloud.githubusercontent.com
185.199.110.133               media.githubusercontent.com
185.199.108.133               media.githubusercontent.com
185.199.111.133               media.githubusercontent.com
185.199.109.133               media.githubusercontent.com
3.5.29.192                    github-com.s3.amazonaws.com
16.15.183.126                 github-com.s3.amazonaws.com
16.182.35.49                  github-com.s3.amazonaws.com
52.216.154.164                github-com.s3.amazonaws.com
52.217.140.65                 github-com.s3.amazonaws.com
54.231.133.217                github-com.s3.amazonaws.com
52.217.233.233                github-com.s3.amazonaws.com
16.15.199.53                  github-com.s3.amazonaws.com
151.101.1.194                 github.global.ssl.fastly.net
151.101.193.194               github.global.ssl.fastly.net
151.101.129.194               github.global.ssl.fastly.net
151.101.65.194                github.global.ssl.fastly.net
185.199.110.133               desktop.githubusercontent.com
185.199.108.133               desktop.githubusercontent.com
185.199.109.133               desktop.githubusercontent.com
185.199.111.133               desktop.githubusercontent.com
3.5.31.149                    github-cloud.s3.amazonaws.com
16.15.181.69                  github-cloud.s3.amazonaws.com
16.15.195.154                 github-cloud.s3.amazonaws.com
16.15.219.119                 github-cloud.s3.amazonaws.com
3.5.25.182                    github-cloud.s3.amazonaws.com
3.5.29.91                     github-cloud.s3.amazonaws.com
3.5.1.128                     github-cloud.s3.amazonaws.com
16.182.98.105                 github-cloud.s3.amazonaws.com
185.199.110.133               avatars.githubusercontent.com
185.199.109.133               avatars.githubusercontent.com
185.199.111.133               avatars.githubusercontent.com
185.199.108.133               avatars.githubusercontent.com
185.199.109.133               favicons.githubusercontent.com
185.199.111.133               favicons.githubusercontent.com
185.199.108.133               favicons.githubusercontent.com
185.199.110.133               favicons.githubusercontent.com
185.199.110.133               avatars0.githubusercontent.com
185.199.109.133               avatars0.githubusercontent.com
185.199.111.133               avatars0.githubusercontent.com
185.199.108.133               avatars0.githubusercontent.com
185.199.109.133               avatars1.githubusercontent.com
185.199.108.133               avatars1.githubusercontent.com
185.199.111.133               avatars1.githubusercontent.com
185.199.110.133               avatars1.githubusercontent.com
185.199.110.133               avatars2.githubusercontent.com
185.199.109.133               avatars2.githubusercontent.com
185.199.108.133               avatars2.githubusercontent.com
185.199.111.133               avatars2.githubusercontent.com
185.199.110.133               avatars3.githubusercontent.com
185.199.111.133               avatars3.githubusercontent.com
185.199.109.133               avatars3.githubusercontent.com
185.199.108.133               avatars3.githubusercontent.com
185.199.108.133               avatars4.githubusercontent.com
185.199.110.133               avatars4.githubusercontent.com
185.199.111.133               avatars4.githubusercontent.com
185.199.109.133               avatars4.githubusercontent.com
185.199.108.133               avatars5.githubusercontent.com
185.199.110.133               avatars5.githubusercontent.com
185.199.111.133               avatars5.githubusercontent.com
185.199.109.133               avatars5.githubusercontent.com
185.199.109.133               avatars6.githubusercontent.com
185.199.110.133               avatars6.githubusercontent.com
185.199.108.133               avatars6.githubusercontent.com
185.199.111.133               avatars6.githubusercontent.com
185.199.111.133               avatars7.githubusercontent.com
185.199.109.133               avatars7.githubusercontent.com
185.199.108.133               avatars7.githubusercontent.com
185.199.110.133               avatars7.githubusercontent.com
185.199.111.133               avatars8.githubusercontent.com
185.199.109.133               avatars8.githubusercontent.com
185.199.108.133               avatars8.githubusercontent.com
185.199.110.133               avatars8.githubusercontent.com
185.199.108.153               customer-stories-feed.github.com
185.199.109.153               customer-stories-feed.github.com
185.199.111.153               customer-stories-feed.github.com
185.199.110.153               customer-stories-feed.github.com
185.199.109.133               user-images.githubusercontent.com
185.199.110.133               user-images.githubusercontent.com
185.199.108.133               user-images.githubusercontent.com
185.199.111.133               user-images.githubusercontent.com
185.199.111.133               repository-images.githubusercontent.com
185.199.110.133               repository-images.githubusercontent.com
185.199.109.133               repository-images.githubusercontent.com
185.199.108.133               repository-images.githubusercontent.com
185.199.111.133               marketplace-screenshots.githubusercontent.com
185.199.108.133               marketplace-screenshots.githubusercontent.com
185.199.109.133               marketplace-screenshots.githubusercontent.com
185.199.110.133               marketplace-screenshots.githubusercontent.com
16.182.39.65                  github-production-user-asset-6210df.s3.amazonaws.com
52.217.167.9                  github-production-user-asset-6210df.s3.amazonaws.com
16.15.216.37                  github-production-user-asset-6210df.s3.amazonaws.com
16.182.66.9                   github-production-user-asset-6210df.s3.amazonaws.com
16.182.67.177                 github-production-user-asset-6210df.s3.amazonaws.com
16.182.35.81                  github-production-user-asset-6210df.s3.amazonaws.com
16.182.70.25                  github-production-user-asset-6210df.s3.amazonaws.com
16.182.71.105                 github-production-user-asset-6210df.s3.amazonaws.com
52.217.195.25                 github-production-release-asset-2e65be.s3.amazonaws.com
54.231.230.17                 github-production-release-asset-2e65be.s3.amazonaws.com
16.182.39.193                 github-production-release-asset-2e65be.s3.amazonaws.com
16.15.183.51                  github-production-release-asset-2e65be.s3.amazonaws.com
54.231.233.145                github-production-release-asset-2e65be.s3.amazonaws.com
54.231.131.17                 github-production-release-asset-2e65be.s3.amazonaws.com
3.5.29.235                    github-production-release-asset-2e65be.s3.amazonaws.com
16.15.188.51                  github-production-release-asset-2e65be.s3.amazonaws.com
3.5.30.3                      github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.1.13                      github-production-repository-file-5c1aeb.s3.amazonaws.com
16.15.223.255                 github-production-repository-file-5c1aeb.s3.amazonaws.com
54.231.192.201                github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.28.116                    github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.1.121                     github-production-repository-file-5c1aeb.s3.amazonaws.com
16.182.64.97                  github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.0.123                     github-production-repository-file-5c1aeb.s3.amazonaws.com
```