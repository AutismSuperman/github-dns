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


# update 2024-02-05 00:54:21
```
192.30.255.112                github.com
192.0.66.2                    github.blog
140.82.113.29                 githubapp.com
140.82.112.30                 githubapp.com
140.82.112.29                 githubapp.com
140.82.113.30                 githubapp.com
140.82.114.29                 githubapp.com
140.82.114.30                 githubapp.com
192.30.255.117                api.github.com
185.199.108.133               raw.github.com
185.199.109.133               raw.github.com
185.199.110.133               raw.github.com
185.199.111.133               raw.github.com
192.30.255.112                gist.github.com
192.30.255.113                octocaptcha.com
140.82.112.17                 help.github.com
140.82.113.25                 live.github.com
140.82.112.17                 github.community
185.199.108.153               githubstatus.com
185.199.109.153               githubstatus.com
185.199.110.153               githubstatus.com
185.199.111.153               githubstatus.com
185.199.108.153               pages.github.com
185.199.109.153               pages.github.com
185.199.110.153               pages.github.com
185.199.111.153               pages.github.com
140.82.112.18                 status.github.com
192.30.255.98                 uploads.github.com
192.30.255.121                nodeload.github.com
185.199.108.153               training.github.com
185.199.109.153               training.github.com
185.199.110.153               training.github.com
185.199.111.153               training.github.com
192.30.255.121                codeload.github.com
185.199.108.153               assets-cdn.github.com
185.199.109.153               assets-cdn.github.com
185.199.110.153               assets-cdn.github.com
185.199.111.153               assets-cdn.github.com
185.199.111.154               github.githubassets.com
185.199.110.154               github.githubassets.com
185.199.109.154               github.githubassets.com
185.199.108.154               github.githubassets.com
185.199.111.153               documentcloud.github.com
185.199.109.153               documentcloud.github.com
185.199.108.153               documentcloud.github.com
185.199.110.153               documentcloud.github.com
185.199.108.133               raw.githubusercontent.com
185.199.109.133               raw.githubusercontent.com
185.199.110.133               raw.githubusercontent.com
185.199.111.133               raw.githubusercontent.com
185.199.110.133               gist.githubusercontent.com
185.199.111.133               gist.githubusercontent.com
185.199.108.133               gist.githubusercontent.com
185.199.109.133               gist.githubusercontent.com
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
3.5.29.59                     github-com.s3.amazonaws.com
54.231.134.113                github-com.s3.amazonaws.com
16.182.64.161                 github-com.s3.amazonaws.com
3.5.20.136                    github-com.s3.amazonaws.com
54.231.233.185                github-com.s3.amazonaws.com
3.5.11.149                    github-com.s3.amazonaws.com
54.231.129.241                github-com.s3.amazonaws.com
54.231.140.241                github-com.s3.amazonaws.com
151.101.1.194                 github.global.ssl.fastly.net
151.101.65.194                github.global.ssl.fastly.net
151.101.129.194               github.global.ssl.fastly.net
151.101.193.194               github.global.ssl.fastly.net
185.199.108.133               desktop.githubusercontent.com
185.199.109.133               desktop.githubusercontent.com
185.199.110.133               desktop.githubusercontent.com
185.199.111.133               desktop.githubusercontent.com
52.217.86.228                 github-cloud.s3.amazonaws.com
54.231.129.177                github-cloud.s3.amazonaws.com
3.5.29.149                    github-cloud.s3.amazonaws.com
16.182.39.1                   github-cloud.s3.amazonaws.com
52.216.48.185                 github-cloud.s3.amazonaws.com
54.231.194.65                 github-cloud.s3.amazonaws.com
52.216.48.89                  github-cloud.s3.amazonaws.com
54.231.226.209                github-cloud.s3.amazonaws.com
185.199.108.133               avatars.githubusercontent.com
185.199.109.133               avatars.githubusercontent.com
185.199.110.133               avatars.githubusercontent.com
185.199.111.133               avatars.githubusercontent.com
185.199.108.133               favicons.githubusercontent.com
185.199.109.133               favicons.githubusercontent.com
185.199.110.133               favicons.githubusercontent.com
185.199.111.133               favicons.githubusercontent.com
185.199.108.133               avatars0.githubusercontent.com
185.199.109.133               avatars0.githubusercontent.com
185.199.110.133               avatars0.githubusercontent.com
185.199.111.133               avatars0.githubusercontent.com
185.199.108.133               avatars1.githubusercontent.com
185.199.109.133               avatars1.githubusercontent.com
185.199.110.133               avatars1.githubusercontent.com
185.199.111.133               avatars1.githubusercontent.com
185.199.108.133               avatars2.githubusercontent.com
185.199.109.133               avatars2.githubusercontent.com
185.199.110.133               avatars2.githubusercontent.com
185.199.111.133               avatars2.githubusercontent.com
185.199.110.133               avatars3.githubusercontent.com
185.199.108.133               avatars3.githubusercontent.com
185.199.109.133               avatars3.githubusercontent.com
185.199.111.133               avatars3.githubusercontent.com
185.199.111.133               avatars4.githubusercontent.com
185.199.108.133               avatars4.githubusercontent.com
185.199.110.133               avatars4.githubusercontent.com
185.199.109.133               avatars4.githubusercontent.com
185.199.108.133               avatars5.githubusercontent.com
185.199.109.133               avatars5.githubusercontent.com
185.199.110.133               avatars5.githubusercontent.com
185.199.111.133               avatars5.githubusercontent.com
185.199.110.133               avatars6.githubusercontent.com
185.199.109.133               avatars6.githubusercontent.com
185.199.108.133               avatars6.githubusercontent.com
185.199.111.133               avatars6.githubusercontent.com
185.199.109.133               avatars7.githubusercontent.com
185.199.111.133               avatars7.githubusercontent.com
185.199.108.133               avatars7.githubusercontent.com
185.199.110.133               avatars7.githubusercontent.com
185.199.108.133               avatars8.githubusercontent.com
185.199.109.133               avatars8.githubusercontent.com
185.199.110.133               avatars8.githubusercontent.com
185.199.111.133               avatars8.githubusercontent.com
185.199.108.153               customer-stories-feed.github.com
185.199.109.153               customer-stories-feed.github.com
185.199.110.153               customer-stories-feed.github.com
185.199.111.153               customer-stories-feed.github.com
185.199.110.133               user-images.githubusercontent.com
185.199.109.133               user-images.githubusercontent.com
185.199.111.133               user-images.githubusercontent.com
185.199.108.133               user-images.githubusercontent.com
185.199.110.133               repository-images.githubusercontent.com
185.199.108.133               repository-images.githubusercontent.com
185.199.109.133               repository-images.githubusercontent.com
185.199.111.133               repository-images.githubusercontent.com
185.199.108.133               marketplace-screenshots.githubusercontent.com
185.199.109.133               marketplace-screenshots.githubusercontent.com
185.199.110.133               marketplace-screenshots.githubusercontent.com
185.199.111.133               marketplace-screenshots.githubusercontent.com
52.217.160.97                 github-production-user-asset-6210df.s3.amazonaws.com
3.5.27.168                    github-production-user-asset-6210df.s3.amazonaws.com
52.217.165.81                 github-production-user-asset-6210df.s3.amazonaws.com
54.231.228.161                github-production-user-asset-6210df.s3.amazonaws.com
3.5.28.193                    github-production-user-asset-6210df.s3.amazonaws.com
3.5.0.128                     github-production-user-asset-6210df.s3.amazonaws.com
54.231.196.9                  github-production-user-asset-6210df.s3.amazonaws.com
52.216.48.113                 github-production-user-asset-6210df.s3.amazonaws.com
52.216.178.131                github-production-release-asset-2e65be.s3.amazonaws.com
3.5.28.139                    github-production-release-asset-2e65be.s3.amazonaws.com
52.217.94.244                 github-production-release-asset-2e65be.s3.amazonaws.com
3.5.29.214                    github-production-release-asset-2e65be.s3.amazonaws.com
3.5.25.188                    github-production-release-asset-2e65be.s3.amazonaws.com
52.216.33.49                  github-production-release-asset-2e65be.s3.amazonaws.com
52.216.205.227                github-production-release-asset-2e65be.s3.amazonaws.com
54.231.193.193                github-production-release-asset-2e65be.s3.amazonaws.com
52.217.229.89                 github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.75.52                  github-production-repository-file-5c1aeb.s3.amazonaws.com
16.182.99.89                  github-production-repository-file-5c1aeb.s3.amazonaws.com
52.216.211.81                 github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.29.135                    github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.29.191                    github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.102.148                github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.84.212                 github-production-repository-file-5c1aeb.s3.amazonaws.com
```