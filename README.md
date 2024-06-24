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


# update 2024-06-24 01:00:43
```
140.82.113.3                  github.com
192.0.66.2                    github.blog
140.82.112.30                 githubapp.com
140.82.113.29                 githubapp.com
140.82.112.29                 githubapp.com
140.82.114.30                 githubapp.com
140.82.114.29                 githubapp.com
140.82.113.30                 githubapp.com
140.82.112.6                  api.github.com
185.199.109.133               raw.github.com
185.199.108.133               raw.github.com
185.199.111.133               raw.github.com
185.199.110.133               raw.github.com
140.82.112.3                  gist.github.com
140.82.112.4                  octocaptcha.com
140.82.113.17                 help.github.com
140.82.114.25                 live.github.com
140.82.113.18                 github.community
185.199.110.153               githubstatus.com
185.199.111.153               githubstatus.com
185.199.108.153               githubstatus.com
185.199.109.153               githubstatus.com
185.199.109.153               pages.github.com
185.199.111.153               pages.github.com
185.199.110.153               pages.github.com
185.199.108.153               pages.github.com
140.82.112.18                 status.github.com
140.82.113.13                 uploads.github.com
140.82.113.9                  nodeload.github.com
185.199.108.153               training.github.com
185.199.109.153               training.github.com
185.199.111.153               training.github.com
185.199.110.153               training.github.com
140.82.114.10                 codeload.github.com
185.199.110.153               assets-cdn.github.com
185.199.108.153               assets-cdn.github.com
185.199.111.153               assets-cdn.github.com
185.199.109.153               assets-cdn.github.com
185.199.111.154               github.githubassets.com
185.199.108.154               github.githubassets.com
185.199.110.154               github.githubassets.com
185.199.109.154               github.githubassets.com
185.199.108.153               documentcloud.github.com
185.199.111.153               documentcloud.github.com
185.199.110.153               documentcloud.github.com
185.199.109.153               documentcloud.github.com
185.199.110.133               raw.githubusercontent.com
185.199.111.133               raw.githubusercontent.com
185.199.109.133               raw.githubusercontent.com
185.199.108.133               raw.githubusercontent.com
185.199.108.133               gist.githubusercontent.com
185.199.110.133               gist.githubusercontent.com
185.199.111.133               gist.githubusercontent.com
185.199.109.133               gist.githubusercontent.com
185.199.110.133               camo.githubusercontent.com
185.199.108.133               camo.githubusercontent.com
185.199.111.133               camo.githubusercontent.com
185.199.109.133               camo.githubusercontent.com
185.199.110.133               cloud.githubusercontent.com
185.199.109.133               cloud.githubusercontent.com
185.199.108.133               cloud.githubusercontent.com
185.199.111.133               cloud.githubusercontent.com
185.199.110.133               media.githubusercontent.com
185.199.109.133               media.githubusercontent.com
185.199.108.133               media.githubusercontent.com
185.199.111.133               media.githubusercontent.com
54.231.130.17                 github-com.s3.amazonaws.com
52.217.43.36                  github-com.s3.amazonaws.com
52.217.231.201                github-com.s3.amazonaws.com
52.217.75.116                 github-com.s3.amazonaws.com
52.217.116.105                github-com.s3.amazonaws.com
3.5.30.200                    github-com.s3.amazonaws.com
52.216.25.62                  github-com.s3.amazonaws.com
52.217.161.1                  github-com.s3.amazonaws.com
151.101.1.194                 github.global.ssl.fastly.net
151.101.65.194                github.global.ssl.fastly.net
151.101.193.194               github.global.ssl.fastly.net
151.101.129.194               github.global.ssl.fastly.net
185.199.108.133               desktop.githubusercontent.com
185.199.110.133               desktop.githubusercontent.com
185.199.109.133               desktop.githubusercontent.com
185.199.111.133               desktop.githubusercontent.com
3.5.1.13                      github-cloud.s3.amazonaws.com
52.216.220.161                github-cloud.s3.amazonaws.com
3.5.30.237                    github-cloud.s3.amazonaws.com
54.231.162.225                github-cloud.s3.amazonaws.com
52.216.205.243                github-cloud.s3.amazonaws.com
52.217.94.252                 github-cloud.s3.amazonaws.com
52.217.229.241                github-cloud.s3.amazonaws.com
52.217.74.164                 github-cloud.s3.amazonaws.com
185.199.108.133               avatars.githubusercontent.com
185.199.111.133               avatars.githubusercontent.com
185.199.110.133               avatars.githubusercontent.com
185.199.109.133               avatars.githubusercontent.com
185.199.108.133               favicons.githubusercontent.com
185.199.111.133               favicons.githubusercontent.com
185.199.109.133               favicons.githubusercontent.com
185.199.110.133               favicons.githubusercontent.com
185.199.108.133               avatars0.githubusercontent.com
185.199.111.133               avatars0.githubusercontent.com
185.199.109.133               avatars0.githubusercontent.com
185.199.110.133               avatars0.githubusercontent.com
185.199.108.133               avatars1.githubusercontent.com
185.199.109.133               avatars1.githubusercontent.com
185.199.111.133               avatars1.githubusercontent.com
185.199.110.133               avatars1.githubusercontent.com
185.199.109.133               avatars2.githubusercontent.com
185.199.111.133               avatars2.githubusercontent.com
185.199.110.133               avatars2.githubusercontent.com
185.199.108.133               avatars2.githubusercontent.com
185.199.110.133               avatars3.githubusercontent.com
185.199.111.133               avatars3.githubusercontent.com
185.199.109.133               avatars3.githubusercontent.com
185.199.108.133               avatars3.githubusercontent.com
185.199.110.133               avatars4.githubusercontent.com
185.199.109.133               avatars4.githubusercontent.com
185.199.111.133               avatars4.githubusercontent.com
185.199.108.133               avatars4.githubusercontent.com
185.199.111.133               avatars5.githubusercontent.com
185.199.108.133               avatars5.githubusercontent.com
185.199.109.133               avatars5.githubusercontent.com
185.199.110.133               avatars5.githubusercontent.com
185.199.111.133               avatars6.githubusercontent.com
185.199.108.133               avatars6.githubusercontent.com
185.199.109.133               avatars6.githubusercontent.com
185.199.110.133               avatars6.githubusercontent.com
185.199.109.133               avatars7.githubusercontent.com
185.199.111.133               avatars7.githubusercontent.com
185.199.110.133               avatars7.githubusercontent.com
185.199.108.133               avatars7.githubusercontent.com
185.199.110.133               avatars8.githubusercontent.com
185.199.111.133               avatars8.githubusercontent.com
185.199.108.133               avatars8.githubusercontent.com
185.199.109.133               avatars8.githubusercontent.com
185.199.110.153               customer-stories-feed.github.com
185.199.109.153               customer-stories-feed.github.com
185.199.111.153               customer-stories-feed.github.com
185.199.108.153               customer-stories-feed.github.com
185.199.111.133               user-images.githubusercontent.com
185.199.110.133               user-images.githubusercontent.com
185.199.109.133               user-images.githubusercontent.com
185.199.108.133               user-images.githubusercontent.com
185.199.108.133               repository-images.githubusercontent.com
185.199.111.133               repository-images.githubusercontent.com
185.199.110.133               repository-images.githubusercontent.com
185.199.109.133               repository-images.githubusercontent.com
185.199.108.133               marketplace-screenshots.githubusercontent.com
185.199.111.133               marketplace-screenshots.githubusercontent.com
185.199.110.133               marketplace-screenshots.githubusercontent.com
185.199.109.133               marketplace-screenshots.githubusercontent.com
52.217.171.225                github-production-user-asset-6210df.s3.amazonaws.com
52.217.227.225                github-production-user-asset-6210df.s3.amazonaws.com
3.5.31.151                    github-production-user-asset-6210df.s3.amazonaws.com
52.217.72.228                 github-production-user-asset-6210df.s3.amazonaws.com
52.217.102.204                github-production-user-asset-6210df.s3.amazonaws.com
54.231.172.73                 github-production-user-asset-6210df.s3.amazonaws.com
52.216.48.89                  github-production-user-asset-6210df.s3.amazonaws.com
52.216.218.177                github-production-user-asset-6210df.s3.amazonaws.com
52.216.42.161                 github-production-release-asset-2e65be.s3.amazonaws.com
3.5.30.161                    github-production-release-asset-2e65be.s3.amazonaws.com
52.216.39.73                  github-production-release-asset-2e65be.s3.amazonaws.com
52.217.168.1                  github-production-release-asset-2e65be.s3.amazonaws.com
16.182.74.129                 github-production-release-asset-2e65be.s3.amazonaws.com
54.231.133.33                 github-production-release-asset-2e65be.s3.amazonaws.com
52.216.212.241                github-production-release-asset-2e65be.s3.amazonaws.com
16.182.96.121                 github-production-release-asset-2e65be.s3.amazonaws.com
16.182.40.177                 github-production-repository-file-5c1aeb.s3.amazonaws.com
16.182.100.9                  github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.30.24                     github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.29.142                    github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.22.177                    github-production-repository-file-5c1aeb.s3.amazonaws.com
16.182.71.25                  github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.10.138                    github-production-repository-file-5c1aeb.s3.amazonaws.com
52.216.40.97                  github-production-repository-file-5c1aeb.s3.amazonaws.com
```